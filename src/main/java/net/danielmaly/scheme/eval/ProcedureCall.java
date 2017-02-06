package net.danielmaly.scheme.eval;

import java.util.List;

public class ProcedureCall extends SchemeExpression {

    private SchemeExpression operator;
    private List<SchemeExpression> operands;

    public ProcedureCall(SchemeExpression operator, List<SchemeExpression> operands) {
        this.operator = operator;
        this.operands = operands;
    }

    @Override
    public SchemeValue eval(Environment environment) throws SchemeException {
        SchemeValue operatorVal = operator.eval(environment);
        if(!(operatorVal instanceof SchemeFunction)) {
            throw new SchemeException("Expected SchemeFunction as a result of " + operatorVal);
        }
        SchemeFunction opFunc = (SchemeFunction) operatorVal;

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
