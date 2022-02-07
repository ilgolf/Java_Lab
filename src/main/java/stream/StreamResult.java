package stream;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamResult {

    public static void main(String[] args) {
        // 결과를 만들어 내는 메서드 accumulator, identity, combiner를 인자로 받을 수 있다
        OptionalInt reduce1 = IntStream.range(1, 10)
                .reduce((a, b) -> a + b); // 45

        int reduce2 = IntStream.range(1, 10)
                .reduce(10, Integer::sum); // 55

        int reduce3 = Stream.of(1, 2, 3)
                .parallel().reduce(10, Integer::sum, (a, b) -> a + b); // 36

        // 필요한 요소를 수집하여 새로운 Collection으로 반환한다.
        List<String> list = Stream.of("a", "b", "c").filter(ele -> ele.contains("b"))
                .collect(Collectors.toList());

        // sum(), count() 같은 메서드를 사용하여 연산결과를 반환 시킨다.
        List<Integer> nums = Arrays.asList(1, 3, 5, 7, 9);
        int sum = nums.stream().mapToInt(i -> i).sum();

        nums = Arrays.asList(1, 3, 3, 3, 4, 5, 6);
        long count = nums.stream().filter(i -> i == 3).count();

        // Stream에서 찾고자 하는 객체가 존재하는 지 탐색하고 boolean 타입을 리턴한다.
        List<String> strList = Arrays.asList("A", "B", "C", "D");

        // 하나라도 조건에 부합해야함
        boolean anyMatch = strList.stream()
                .anyMatch(s -> s.contains("A")); // true

        // 모두가 조건에 일치 해야함
        boolean allMatch = strList.stream()
                .allMatch(s -> s.contains("A")); // false

        // 조건에 맞는 객체 없음
        boolean noneMatch = strList.stream()
                .noneMatch(s -> s.contains("A")); // false

        // 요소를 순회하며 실행(최종 작업이 된다.)
        nums.forEach(System.out::println);

        IntStream.range(1, 10).parallel().forEach(System.out::println);

        // 병렬 처리 시 순서를 보장할 때 사용
        IntStream.range(1, 10).parallel().forEachOrdered(System.out::println);
    }
}
