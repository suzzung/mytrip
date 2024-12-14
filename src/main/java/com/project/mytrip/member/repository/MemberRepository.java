package com.project.mytrip.member.repository;

import com.project.mytrip.member.domain.dto.MemberRequest;
import com.project.mytrip.member.domain.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
    Member save(MemberRequest memberRequest);
    Optional<Member> findById(long idx);
}
