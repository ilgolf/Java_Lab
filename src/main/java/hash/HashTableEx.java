package hash;

import java.util.Hashtable;

public class HashTableEx {

    public static void main(String[] args) {
        Hashtable<String, String> hashtable = new Hashtable<>();

        hashtable.put("1", "kim1");
        hashtable.put("2", "kim2");
        hashtable.put("3", "kim3");
        hashtable.put("4", "kim4");

        for (String key : hashtable.keySet()) {
            System.out.println(hashtable.get(key));
        }
    }
}
