package atomicTest;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.jupiter.api.Assertions.*;

public class SharedState {

    @Test
    void sharedState() {
        final ExecutorService executorService = Executors.newCachedThreadPool();
        final AtomicCounter counter = new AtomicCounter();

        executorService.execute(new CounterSetter(counter));

        final int value = counter.getNumber().incrementAndGet();
        assertEquals(1, value);
    }

    static class CounterSetter implements Runnable {
        private final AtomicCounter counter;

        public CounterSetter(AtomicCounter counter) {
            this.counter = counter;
        }

        @Override
        public void run() {
            while (true) {
                counter.getNumber().set(0);
            }
        }
    }
}

class AtomicCounter {
    private final AtomicInteger number = new AtomicInteger(0);

    public AtomicInteger getNumber() {
        return number;
    }
}
