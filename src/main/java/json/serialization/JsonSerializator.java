package json.serialization;

import classes.basic.DTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.io.File;
import java.io.IOException;

public class JsonSerializator {
    private static DTO dto = new DTO();
    private static String path = "/Users/tiger/IdeaProjects/protobuf/src/main/java/json/out/data.json";

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    public void setSerializationTime() throws IOException {
        new ObjectMapper().writeValue(new File(path), dto);
    }

    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    public void setSerializationThroughput() throws IOException {
        new ObjectMapper().writeValue(new File(path), dto);
    }

    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder()
                .include(JsonSerializator.class.getSimpleName())
                .threads(6)
                .warmupIterations(5)
                .measurementIterations(5)
                .forks(1)
                .build();

        new Runner(opt).run();
    }
}
