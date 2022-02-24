package generic.food;

import java.util.ArrayList;
import java.util.List;

public class FoodStackApp {

    public static void main(String[] args) {
        List<Food> foods = new ArrayList<>();
        FoodStack<Food> foodStack = new FoodStack<>();

        for (int i = 0; i < 5; i++) {
            foods.add(new Food("음식 " + (i + 1), (i + 1) + " 만큼 맛있음"));
        }

        foodStack.pushAll(foods);

        List<Fruit> fruits = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            fruits.add(new Fruit("과일 " + (i + 1), (i + 1) + " 만큼 맛있음"));
        }

        foodStack.pushAll(fruits);
    }
}
