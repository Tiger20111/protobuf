package protobuf;

import classes.dto.DTOProto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ProtobufSerializator {
    private static final DTOProto.Weather.Builder weatherBuilder = DTOProto.Weather.newBuilder()
            .setData("12.12.2020")
            .setTemperature(36.6f);

    private static DTOProto.Weather weather = weatherBuilder.build();

    private static DTOProto.DTO.Builder dtoBuilder = DTOProto.DTO.newBuilder()
            .setId(1)
            .setName("dto")
            .setWeather(weather)
            .setWeatherStatistics(new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4)));
}
