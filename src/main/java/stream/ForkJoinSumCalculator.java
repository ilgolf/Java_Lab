package stream;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

public class ForkJoinSumCalculator extends RecursiveTask<Long> {

    private final long[] numbers;
    private final int start;
    private final int end;
    public static final long THRESHOLD = 1000;

    public ForkJoinSumCalculator(long[] numbers) {
        this(numbers, 0, numbers.length);
    }

    private ForkJoinSumCalculator(long[] numbers, int start, int end) {
        this.numbers = numbers;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Long compute() {
        int len = end - start; // 서브 테스크의 배열 길이

        // 정해진 기준 값 이하로 배열의 길이가 줄어들 경우 결과를 반환
        if (len <= THRESHOLD) {
            return computeSequentially();
        }

        // 왼쪽 절반으로 분할
        ForkJoinSumCalculator left = new ForkJoinSumCalculator(numbers, start, start + len / 2);
        left.fork(); // ForkJoinPool의 다른 스레드로 새로 생성한 테스크를 비동기로 실행

        // 나머지 절반을 분할
        ForkJoinSumCalculator right = new ForkJoinSumCalculator(numbers, start + len / 2, end);
        Long rightRet = right.compute(); // 두 번째 서브 테스크를 동기로 실행한다.
        Long leftRet = left.join(); // 첫 번째 서브 테스크의 결과를 읽거나, 아직 결과가 나오지 않았다면 대기

        return leftRet + rightRet; // 두 서브 테스크의 결과를 합해 반환한
    }

    private long computeSequentially() {
        long sum = 0;
        for (int i = start; i < end; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        long[] numbers = new long[1000];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (long) (Math.random()*100);
        }


        ForkJoinTask<Long> task = new ForkJoinSumCalculator(numbers);
        Long ret = new ForkJoinPool().invoke(task); // 결과 반환

        System.out.println(ret);
    }
}
