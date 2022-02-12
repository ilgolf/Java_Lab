package stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCode {

    public static void main(String[] args) {

        // Stream
        List<Integer> collectWithStream =
                Stream.of(1, 16, 16, 7, 18, 19, 10, 11, 23, 45)
                        .sorted(Comparator.reverseOrder())
                        .filter(i -> i > 10)
                        .filter(i -> {
                            System.out.println("filter % 2 : " + i);
                            return i % 2 == 1;
                        })
                        .collect(Collectors.toList());


        // for-loop
        int[] arr = {1, 16, 16, 7, 18, 19, 10, 11, 23, 45};

        List<Integer> collectWithFor = new ArrayList<>();

        Arrays.sort(arr);

        for (int i : arr) {
            if (i > 10 && i % 2 == 1) {
                collectWithFor.add(i);
            }
        }
    }
}
