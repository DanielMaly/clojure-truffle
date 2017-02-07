package net.danielmaly.scheme.eval;

import com.oracle.truffle.api.CallTarget;
import com.oracle.truffle.api.TruffleLanguage;
import com.oracle.truffle.api.frame.MaterializedFrame;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.source.Source;

@TruffleLanguage.Registration(name = "Scheme", version = "1.0.0",
        mimeType = SchemeLanguage.MIME_TYPE)
public class SchemeLanguage extends TruffleLanguage<Object> {
    public static final String MIME_TYPE = "application/x-scm";

    public static final SchemeLanguage INSTANCE = new SchemeLanguage();

    private SchemeLanguage() {}

    @Override
    protected Object createContext(Env env) {
        return new SchemeContext();
    }

    @Override
    protected CallTarget parse(Source source, Node node, String... strings) throws Exception {
        //TODO: Implement
        return null;
    }

    @Override
    protected Object findExportedSymbol(Object o, String s, boolean b) {
        return null;
    }

    @Override
    protected Object getLanguageGlobal(Object o) {
        return null;
    }

    @Override
    protected boolean isObjectOfLanguage(Object o) {
        return false;
    }

    @Override
    protected Object evalInContext(Source source, Node node, MaterializedFrame materializedFrame) throws Exception {
        throw new IllegalStateException("evalInContext not supported");
    }
}
