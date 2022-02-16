package firstCollection;

import java.util.List;

public class Member {

    private final List<Follower> followerList;

    public Member(List<Follower> followerList) {
        this.followerList = followerList;
    }

    public long countFollower() {
        return followerList.size();
    }

    public long countByAge(int age) {
        return followerList.stream()
                .filter(follower -> follower.getAge() == age)
                .count();
    }

    public List<Follower> getFollowerList() {
        return followerList;
    }
}
