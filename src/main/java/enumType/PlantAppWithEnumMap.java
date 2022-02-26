package enumType;

import java.util.*;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toSet;

public class PlantAppWithEnumMap {

    public static void main(String[] args) {
        Plant[] garden = {new Plant("tree", Plant.LifeCycle.ANNUL),
                new Plant("flower", Plant.LifeCycle.BIENNIAL),
                new Plant("grass", Plant.LifeCycle.PERENNIAL)};

        System.out.println(Arrays.stream(garden)
                .collect(groupingBy(p -> p.lifeCycle,
                        () -> new EnumMap<>(Plant.LifeCycle.class), toSet())));
    }
}
