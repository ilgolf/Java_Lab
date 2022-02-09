package stream;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class ParallelStream01 {

    public static void main(String[] args) {
        Random ran = new Random();

        int[] arr = new int[100000];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = ran.nextInt(100) + 1;
        }

        long startTime = System.nanoTime();

        int reduce = Arrays.stream(arr)
                .reduce(Integer.MIN_VALUE, Math::max);

        long endTime = System.nanoTime();

        long convert = TimeUnit.MILLISECONDS.convert((endTime - startTime), TimeUnit.NANOSECONDS);

        System.out.println("convert = " + convert);
    }
}
