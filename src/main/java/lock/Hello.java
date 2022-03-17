package lock;

public class Hello implements Runnable {

    @Override
    public synchronized void run() {
        String str = "hello";
        System.out.println(str);
    }

    public static void main(String[] args) {
        Hello hello = new Hello();

        hello.run();
    }
}