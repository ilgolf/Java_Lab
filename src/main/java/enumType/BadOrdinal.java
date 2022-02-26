package enumType;

public enum BadOrdinal {

    SOLO, DUET, TRIO, QUARTET, QUINTET, SEXTET,
    SEPTET, OCTET, NONET, DECTET;

    public int numberOfMusician() { return ordinal() + 1; }
}
