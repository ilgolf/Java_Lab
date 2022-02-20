package generic;

import java.util.ArrayList;
import java.util.List;

public class FoodsWithGeneric {

    private final List<Food> foods = new ArrayList<>();

    public void addFood(Food obj) {
        foods.add(obj);
    }

     public void print() {
        for (Food food : foods) {
            System.out.println("이름 : " + food.getName());
            System.out.println("맛 : " + food.getTaste());
        }
    }
}
