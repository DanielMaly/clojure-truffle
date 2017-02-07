package net.danielmaly.scheme.benchmarks;

import bb.util.Benchmark;
import net.danielmaly.scheme.Interpreter;

import java.io.InputStream;

public class BenchmarkTest {

    protected Benchmark benchmark(String sourceFile) throws Exception {
        Benchmark.Params params = new Benchmark.Params();
        params.setNumberMeasurements(10);
        return benchmark(sourceFile, params);
    }

    protected Benchmark benchmark(String sourceFile, Benchmark.Params params) throws Exception {
        final InputStream sourceStream = getClass().getResourceAsStream(sourceFile);
        /*final SchemeProgram program = Interpreter.constructProgram(sourceStream);

        return new Benchmark(new Runnable() {
            @Override
            public void run() {
                try {
                    program.clone().execute();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }, params);*/
        return null;
    }
}
