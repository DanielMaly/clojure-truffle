package net.danielmaly.scheme.benchmarks;

import bb.util.Benchmark;
import com.oracle.truffle.api.nodes.DirectCallNode;
import net.danielmaly.scheme.Interpreter;
import net.danielmaly.scheme.eval.SchemeContext;

import java.io.InputStream;

public class BenchmarkTest {

    protected Benchmark benchmark(String sourceFile) throws Exception {
        Benchmark.Params params = new Benchmark.Params();
        params.setNumberMeasurements(10);
        return benchmark(sourceFile, params);
    }

    protected Benchmark benchmark(String sourceFile, Benchmark.Params params) throws Exception {
        final InputStream sourceStream = getClass().getResourceAsStream(sourceFile);
        final SchemeContext schemeContext = new SchemeContext();
        final DirectCallNode directCallNode = Interpreter.constructFromInputStream(sourceStream, schemeContext);

        return new Benchmark(() -> {
            try {
                Interpreter.execute(directCallNode, schemeContext);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }, params);
    }
}
