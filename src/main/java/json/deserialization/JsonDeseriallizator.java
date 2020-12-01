package json.deserialization;

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

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JsonDeseriallizator {
    private static volatile Object measurement;

    private static String jsonPath = "/Users/tiger/IdeaProjects/protobuf/src/main/java/json/out/data.json";

    private static byte[] dtoSer;

    static {
        try {
            dtoSer = Files.readAllBytes(Paths.get(jsonPath));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    public void setDeserializationTime() throws IOException {
        measurement = new ObjectMapper().readValue(dtoSer, DTO.class);
    }

    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    public void setDeserializationThroughput() throws IOException {
        measurement = new ObjectMapper().readValue(dtoSer, DTO.class);
    }

    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder()
                .include(JsonDeseriallizator.class.getSimpleName())
                .threads(6)
                .warmupIterations(5)
                .measurementIterations(5)
                .forks(1)
                .build();

        new Runner(opt).run();
    }
}
