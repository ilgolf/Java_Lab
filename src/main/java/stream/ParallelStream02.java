package stream;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class ParallelStream02 {

    public static void main(String[] args) {
        Random ran = new Random();

        int[] arr = new int[10000];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = ran.nextInt(100) + 1;
        }

        long startTimeParallel = System.nanoTime();

        int parallel = Arrays.stream(arr).parallel()
                .reduce(Integer.MIN_VALUE, Math::max);

        long endTimeParallel = System.nanoTime();

        long convertParallel = TimeUnit.MILLISECONDS.convert((endTimeParallel - startTimeParallel), TimeUnit.NANOSECONDS);

        System.out.println("convertParallel = " + convertParallel);
    }
}
