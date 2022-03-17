package atomicTest;

public class VolatileEx {

    volatile long cnt;

    synchronized long getCount() {
        return cnt;
    }

    synchronized void withdraw(int num) {
        if (cnt >= num) {
            cnt -= num;
        }
    }
}
