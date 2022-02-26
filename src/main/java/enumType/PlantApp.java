package enumType;

import java.util.HashSet;
import java.util.Set;

public class PlantApp {

    public static void main(String[] args) {
        @SuppressWarnings("unchecked")
        Set<Plant>[] plantLifeCycle = (Set<Plant>[]) new Set[Plant.LifeCycle.values().length];
        Plant[] garden = {new Plant("tree", Plant.LifeCycle.ANNUL),
                new Plant("flower", Plant.LifeCycle.BIENNIAL), new Plant("grass", Plant.LifeCycle.PERENNIAL)};

        for (int i = 0; i < plantLifeCycle.length; i++) {
            plantLifeCycle[i] = new HashSet<>();
        }

        for (Plant p : garden) {
            plantLifeCycle[p.lifeCycle.ordinal()].add(p);
        }

        for (int i = 0; i < plantLifeCycle.length; i++) {
            System.out.printf("%s : %s%n", Plant.LifeCycle.values()[i], plantLifeCycle[i]);
        }
    }
}
