package stream;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class NullSafeStream {

    public static <T> Stream<T> collectionToStream(Collection<T> collection) {
        return Optional
                .ofNullable(collection).stream()
                .flatMap(Collection::stream);
    }

    public static void main(String[] args) {
        List<Integer> list = null;
        collectionToStream(list)
                .forEach(System.out::println);
    }
}
