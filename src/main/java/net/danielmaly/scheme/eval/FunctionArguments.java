package net.danielmaly.scheme.eval;

import net.danielmaly.scheme.types.ConsCell;

import java.util.Iterator;
import java.util.List;

public class FunctionArguments {

    private List<String> identifiers;
    private String afterDot;

    public FunctionArguments(List<String> identifiers, String afterDot) {
        this.identifiers = identifiers;
        this.afterDot = afterDot;
    }

    public void apply(Environment environment, ConsCell values) throws SchemeException {
        Iterator<String> iterator = identifiers.iterator();
        SchemeValue currentValue = values;
        while(currentValue instanceof ConsCell && iterator.hasNext()) {

            String identifier = iterator.next();
            ConsCell cell = (ConsCell) currentValue;
            SchemeValue value = cell.getCar();
            currentValue = cell.getCdr();
            environment.putValue(identifier, value);

        }

        if(iterator.hasNext()) {
            // Too few arguments
            throw new SchemeException("Too few arguments");
        }
        else if(currentValue instanceof ConsCell && afterDot != null) {
            environment.putValue(afterDot, currentValue);
        }

    }
}
