package enumType;

public class OperationMain {

    public static void main(String[] args) {
        double x = 2.00;
        double y = 4.00;
        for (Operation op : Operation.values()) {
            System.out.printf("%f %s %f = %f%n", x, op, y, op.apply(x, y));
            System.out.println();
        }
    }
}
