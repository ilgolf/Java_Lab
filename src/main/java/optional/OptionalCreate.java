package optional;

import java.util.Optional;

public class OptionalCreate {

    public static void main(String[] args) {
        // 빈 Optional 생성
        Optional<Integer> opInt = Optional.empty();

        // null이 아닌 Optional 생성
        String str = "Hello";
        Optional<String> notNull = Optional.of(str);

        // null인 값으로 Optional 생성
        String nullStr = null;
        Optional<String> opNull = Optional.ofNullable(nullStr);
    }
}
