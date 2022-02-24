package generic.food;

import java.util.Collection;
import java.util.Stack;

public class FoodStack<E> {

    private Stack<E> foodStack = new Stack<>();

    public void pushAll(Iterable<? extends E> elements) {
        for (E e : elements) {
            push(e);
        }
    }

    public void popAll(Collection<? super E> elements) {
        while (!elements.isEmpty()) {
            elements.add(pop());
        }
    }

    private void push(E e) {
        foodStack.push(e);
    }

    private E pop() {
        return foodStack.pop();
    }
}
