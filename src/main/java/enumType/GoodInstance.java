package enumType;

public enum GoodInstance {

    SOLO(1), DUET(2), TRIO(3), QUARTET(4),
    QUINTET(5), SEXTET(6), SEPTET(7),
    OCTET(8), NONET(9), DECTET(10);

    private final int numberOfMusicians;

    GoodInstance(int numberOfMusicians) {
        this.numberOfMusicians = numberOfMusicians;
    }

    public int numberOfMusicians() { return numberOfMusicians; }
}
