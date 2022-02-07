package stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamProcess {

    public static void main(String[] args) {
        // 특정 요소와 동일한 요소를 걸러낸다.
        List<String> list = Arrays.asList("A", "B", "C", "D");
        Stream<String> stream = list.stream().filter(s -> s.equals("A")); // [A]

        // 최대 size 까지 Stream을 리턴한다. generate()와 같이 사용
        Stream<String> limit = Stream.generate(() -> "ele").limit(2); // [ele, ele]

        // n개의 요소를 제외한 Stream 리턴
        List<Integer> integers = Arrays.asList(5, 7, 3, 1, 2, 6, 1, 9, 0);
        Stream<Integer> streamSort = integers.stream()
                .sorted(Comparator.reverseOrder())
                .skip(4); // [3, 2, 1, 1, 0]

        // 중복요소를 제거한 Stream을 리턴한다.
        List<String> duplicates = Arrays.asList("A", "B", "B", "B", "C", "C", "C", "A");
        Stream<String> StreamDistinct = duplicates.stream().distinct(); // [A, B, C]

        // 문자열을 소문자로 바꿔준다.
        Stream<String> StreamMap = list.stream().map(String::toLowerCase); // [a, b, c, d]

        // int형으로 바꿔준다.
        List<String> nums = Arrays.asList("1", "2", "3", "4");
        IntStream toIntStream = list.stream().mapToInt(Integer::parseInt); // [1, 2, 3, 4]

        // 중첩 구조를 한 단계 제거하고 단일 컬렉션으로 만들어준다.
        List<List<String>> doubleList = Arrays.asList(List.of("a"), List.of("b"));
        List<String> collect = doubleList.stream().flatMap(Collection::stream).collect(Collectors.toList());

        // 정렬을 해주는 메서드
        Stream<Integer> sorted = integers.stream().sorted(); // 오름차순
        Stream<Integer> reverseSorted = integers.stream().sorted(Comparator.reverseOrder()); // 내림차순

        // 수행결과에 영향을 미치진 않는다. 중간에 결과를 확인할 때 사용할 수 있다.
        Stream<Integer> peekStream = integers.stream()
                .peek(System.out::println)
                .sorted(Comparator.reverseOrder());
    }
}
