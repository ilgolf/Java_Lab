package firstCollection;

public class Follower {

    private int preference;
    private String name;
    private int age;

    public Follower(int preference, String name, int age) {
        this.preference = preference;
        this.name = name;
        this.age = age;
    }

    public int getPreference() {
        return preference;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
