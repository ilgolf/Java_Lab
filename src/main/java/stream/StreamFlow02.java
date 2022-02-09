package stream;

import java.util.stream.Stream;

public class StreamFlow02 {

    public static void main(String[] args) {
        boolean anyMatch = Stream.of("1", "3", "5", "6", "8")
                .map(s -> {
                    System.out.println("map : " + s);
                    return Integer.parseInt(s);
                })
                .anyMatch(s -> {
                    System.out.println("anyMatch : " + s);
                    return s == 3;
                });
    }
}
