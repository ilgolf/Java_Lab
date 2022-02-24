package generic.toy;

import java.util.HashSet;
import java.util.Set;

public class ToyApp {

    public static void main(String[] args) {
        Set<Doll> dollStack = new HashSet<>();

        dollStack.add(new Doll("인형 1", "바비인형"));
        dollStack.add(new Doll("인형 2", "곰인형"));
        dollStack.add(new Doll("인형 3", "카카오프렌즈"));
        dollStack.add(new Doll("인형 4", "라인프렌즈"));

        ToyList<Toy> toyList = new ToyList<>(dollStack);

        toyList.print();
    }
}
