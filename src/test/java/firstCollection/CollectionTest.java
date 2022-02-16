package firstCollection;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.*;

public class CollectionTest {

    @Test
    @DisplayName("final도 값의 변경이 가능하다.")
    void finalCollectionTest() {
        // given
        final Map<String, Boolean> collection = new HashMap<>();

        // when
        collection.put("1", true);
        collection.put("2", true);
        collection.put("3", true);
        collection.put("4", true);

        // then
        assertThat(collection.size()).isEqualTo(4);
    }
}
