package springpractice.practiceSpring.repository;

import org.springframework.stereotype.Repository;
import springpractice.practiceSpring.domain.Member;

import java.util.List;
import java.util.Optional;
@Repository
public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long id); // Optional -> 없으면 NULL 반환
    Optional<Member> findByName(String name);
    List<Member> findAll();
}
