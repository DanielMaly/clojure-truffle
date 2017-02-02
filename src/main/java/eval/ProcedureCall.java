package eval;

import java.util.LinkedList;
import java.util.List;

public class ProcedureCall implements SchemeExpression {

    private SchemeExpression operator;
    private List<SchemeExpression> operands;

    @Override
    public SchemeValue eval(Environment environment) throws SchemeException {
        SchemeValue operatorVal = operator.eval(environment);
        if(!(operatorVal instanceof Function)) {
            throw new SchemeException("Expected Function as a result of " + operatorVal);
        }
        Function opFunc = (Function) operatorVal;

        ConsCell arguments = new ConsCell();
        ConsCell argHead = arguments;
        for(SchemeExpression operand : operands) {
            if(!arguments.getCar().equals(NilValue.NIL)) {
                ConsCell newCell = new ConsCell();
                arguments.setCdr(newCell);
                arguments = newCell;
            }
            arguments.setCar(operand.eval(environment));
        }

        return opFunc.call(argHead);
    }
}
