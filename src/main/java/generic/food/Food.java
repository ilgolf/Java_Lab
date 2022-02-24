package generic.food;

public class Food {

    private final String name;
    private final String taste;

    public Food(String name, String taste) {
        this.name = name;
        this.taste = taste;
    }

    public String getName() {
        return name;
    }

    public String getTaste() {
        return taste;
    }
}
