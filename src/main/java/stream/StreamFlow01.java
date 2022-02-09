package stream;

import java.util.stream.Stream;

public class StreamFlow01 {

    public static void main(String[] args) {
        Stream.of(1, 3, 5, 6, 8)
                .filter(i -> {
                    System.out.println("filter" + i);
                    return  true;
                })
                .forEach(i -> System.out.println("forEach" + i));
    }
}
