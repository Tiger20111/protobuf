package protobuf.serialization;

import classes.dto.DTOProto;
import com.googlecode.protobuf.format.XmlFormat;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.ArrayList;
import java.util.Arrays;

public class ProtobufSerializator {
    private static final DTOProto.Weather.Builder weatherBuilder = DTOProto.Weather.newBuilder()
            .setData("12.12.2020")
            .setTemperature(36.6f);

    private static DTOProto.Weather weather = weatherBuilder.build();

    private static DTOProto.DTO.Builder dtoBuilder = DTOProto.DTO.newBuilder()
            .setId(1)
            .setName("dto")
            .setWeather(weather)
            .addAllWeatherStatistics(new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4)));
    public static DTOProto.DTO dto = dtoBuilder.build();

    private static volatile Object measurement;

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    public void setSerializationTime() {
        measurement = XmlFormat.printToString(dto);
    }

    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    public void setSerializationThroughput() {
        measurement = XmlFormat.printToString(dto);
    }

    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder()
                .include(ProtobufSerializator.class.getSimpleName())
                .threads(6)
                .warmupIterations(5)
                .measurementIterations(5)
                .forks(1)
                .build();

        new Runner(opt).run();
    }
}
