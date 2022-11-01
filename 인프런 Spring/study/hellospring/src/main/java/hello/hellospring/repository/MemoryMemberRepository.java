package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.sql.Array;
import java.util.*;

public class MemoryMemberRepository implements MemberRepository{

    private static Map<Long, Member> store = new HashMap<>();
    private static long sequence = 0L;

    @Override
    public Member save(Member member) {
        member.setId(++sequence);
        store.put(member.getId(), member);
        return member;
    }

    @Override
    public Optional<Member> findById(Long id) {
        return Optional.ofNullable(store.get(id));
    }

    @Override
    public Optional<Member> findByName(String name) {
        return store.values().stream()
                .filter(member-> member.getName().equals(name))
                .findAny(); // 아무거나 찾는다
    }

    @Override
    public List<Member> findAll() {
        return new ArrayList<>(store.values());
    }

    public void storeClear(){
        store.clear();
    }
}
