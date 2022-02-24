package generic.toy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ToyList<E> {

    private final List<E> toys;

    public ToyList(Collection<? extends E> toys) {
        this.toys = addAll(toys);
    }

    public List<E> addAll(Collection<? extends E> collection) {

        return new ArrayList<>(collection);
    }

    public void print() {
        for (E toy : toys) {
            System.out.println(toy);
        }
    }
}
