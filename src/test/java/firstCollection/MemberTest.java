package firstCollection;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class MemberTest {

    @Test
    @DisplayName("일반 컬렉션일 땐 중복코드가 발생한다.")
    void originCollection() {
        // given
        List<Follower> followerList =
                List.of(new Follower(10, "김동빈", 23),
                        new Follower(20, "신길석", 24),
                        new Follower(30, "조예빈", 25),
                        new Follower(25, "김기석", 24));

        // when
        Long followerFilterByAge = followerList.stream()
                .filter(follower -> follower.getAge() == 24)
                .count();

        // then
        assertThat(followerFilterByAge).isEqualTo(2L);
    }

    @Test
    @DisplayName("일급 컬렉션은 내부 메서드를 통해 이 문제를 해결한다.")
    void firstCollection() {
        // given
        List<Follower> followerList =
                List.of(new Follower(10, "김동빈", 23),
                        new Follower(20, "신길석", 24),
                        new Follower(30, "조예빈", 25),
                        new Follower(25, "김기석", 24));

        Member member = new Member(followerList);

        // when
        long followerFilterByAge = member.countByAge(24);

        // then
        assertThat(followerFilterByAge).isEqualTo(2L);
    }
}