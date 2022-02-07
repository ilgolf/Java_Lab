package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class StreamCreate {

    public static void main(String[] args) {
        // 기본 적인 생성
        Stream<String> stream = Stream.of("Spring", "JPA", "Kafka", "WebFlux", "Kotlin");

        // Array 배열을 복사하여 생성 및 부분 배열만 복사하여 생성
        String[] strArr = {"Spring", "JPA", "Kafka", "WebFlux", "Kotlin"};
        Stream<String> streamFull = Arrays.stream(strArr);
        Stream<String> streamPart = Arrays.stream(strArr, 1, 3);

        // List 배열 복사하여 생성 (Collection 도 가능하다.)
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Spring", "JPA", "Kafka", "WebFlux", "Kotlin"));
        Stream<String> streamOfArrayList = list.stream();

        // 비어있는 Stream도 생성할 수 있다.
        Stream<String> emptyStream = Stream.empty();

        // builder를 사용해 직접 원하는 값을 넣는다.
        Stream<String> buildStream = Stream.<String>builder()
                .add("Spring")
                .add("KafKa")
                .add("WebFlux").build();

        // Stream을 연결해 새로운 스트림을 생성
        Stream<String> stream1 = Stream.of("A", "B", "C");
        Stream<String> stream2 = Stream.of("D", "E", "F");
        Stream<String> concat = Stream.concat(stream1, stream2);

        // 개발자가 직접 Stream의 크기를 제한할 수 있다.
        Stream<String> generate = Stream.generate(() -> "element").limit(10);

        // 기존 stream에 parallel()을 이용하여 병렬처리를 할 수 있다.
        Arrays.stream(strArr).parallel().forEach(System.out::println);
    }
}
