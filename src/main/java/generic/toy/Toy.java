package generic.toy;

public class Toy {

    private final String name;
    private final String type;

    public Toy(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
