package com.project.mytrip.member.repository;

import com.project.mytrip.member.domain.TestMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MemberRepository extends JpaRepository<TestMember, Long> {
}
