package lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter {

    Lock lock = new ReentrantLock();
    private int count = 0;

    public int inc() {
        lock.lock();
        int newCount = count ++;
        lock.unlock();
        return newCount;
    }
}
