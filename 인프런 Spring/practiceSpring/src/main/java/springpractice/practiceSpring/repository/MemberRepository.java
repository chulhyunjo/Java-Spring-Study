package springpractice.practiceSpring.repository;

import springpractice.practiceSpring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long id); // Optional -> 없으면 NULL 반환
    Optional<Member> findByName(String name);
    List<Member> findAll();
}
