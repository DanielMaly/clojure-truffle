package net.danielmaly.scheme.benchmarks;

import bb.util.Benchmark;
import org.junit.Test;

public class BasicBenchmarks extends BenchmarkTest {

    @Test
    public void benchmarkBottles() throws Exception {
        //Benchmark benchmark = benchmark("/bottles.scm");
        //System.out.println(benchmark.toString());

        Benchmark benchmark = benchmark("/bench-fib.scm");
        System.out.println(benchmark);
    }
}
