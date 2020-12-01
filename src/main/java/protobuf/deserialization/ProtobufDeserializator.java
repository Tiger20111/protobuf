package protobuf.deserialization;

import classes.basic.DTO;
import classes.dto.DTOProto;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import protobuf.serialization.ProtobufSerializator;

import java.io.IOException;

public class ProtobufDeserializator {

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    public void setDeserializationTime() throws IOException {
        DTOProto.DTO.parseFrom(ProtobufSerializator.dto.toByteArray());
    }

    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    public void setDeserializationThroughput() throws IOException {
        DTOProto.DTO.parseFrom(ProtobufSerializator.dto.toByteArray());
    }

    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder()
                .include(ProtobufDeserializator.class.getSimpleName())
                .threads(6)
                .warmupIterations(5)
                .measurementIterations(5)
                .forks(1)
                .build();

        new Runner(opt).run();
    }
}
