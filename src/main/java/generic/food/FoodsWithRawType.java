package generic.food;

import java.util.ArrayList;
import java.util.List;

public class FoodsWithRawType {

    private List foods = new ArrayList();

    public void addFood(Object obj) {
        foods.add(obj);
    }

    public void print() {
        for (Object food : foods) {
            Food f = (Food) food;

            System.out.println("이름 : " + f.getName());
            System.out.println("맛 : " + f.getTaste());
        }
    }
}
