package atomicTest;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicCal {

    public static void main(String[] args) {
        AtomicInteger cnt = new AtomicInteger(4);

        cnt.incrementAndGet();

        System.out.println(cnt.get());
    }
}
