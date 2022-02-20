package generic;

public class FoodAppWithGenericType {

    public static void main(String[] args) {
        FoodsWithGeneric foodsRaw = new FoodsWithGeneric();

        Food steak = new Food("스테이크", "맛있음");
        Food chicken = new Food("치킨", "짜면서 맛있음");
        Food bread = new Food("빵", "맛있음");
        Toy gunDam = new Toy("건담", "로봇");

        foodsRaw.addFood(steak);
        foodsRaw.addFood(chicken);
        foodsRaw.addFood(bread);
//      foodsRaw.addFood(gunDam); // 컴파일 오류

        foodsRaw.print();
    }
}
