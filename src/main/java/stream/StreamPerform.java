package stream;

import java.util.stream.Stream;

public class StreamPerform {

    public static void main(String[] args) {
        Stream.of("a", "b", "c", "d", "e")
                .filter(s -> {
                    System.out.println("filter : " + s);
                    return s.startsWith("a");
                })
                .map(s -> {
                    System.out.println("map : " + s);
                    return s.toUpperCase();
                })
                .forEach(s -> System.out.println("forEach : " + s));
    }
}
