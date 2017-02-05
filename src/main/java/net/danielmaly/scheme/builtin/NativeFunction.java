package net.danielmaly.scheme.builtin;


import net.danielmaly.scheme.eval.*;

import java.util.List;

public abstract class NativeFunction extends Function {

    public NativeFunction(Environment environment, List<String> arguments) {
        FunctionArguments functionArguments = new FunctionArguments(arguments, null);
        Body body = new BodyNative() {
            @Override
            protected SchemeValue execute(Environment environment) throws SchemeException {
                return callNative(environment);
            }
        };
        setClosure(environment);
        setFormals(functionArguments);
        setBody(body);
    }

    abstract SchemeValue callNative(Environment environment) throws SchemeException;

    abstract static class BodyNative extends Body {

        BodyNative() {
            super(null, null);
        }

        protected abstract SchemeValue execute(Environment environment) throws SchemeException;

        @Override
        public SchemeValue eval(Environment environment) throws SchemeException {
            return execute(environment);
        }
    }
}
