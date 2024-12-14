package com.project.mytrip.member.service;

import com.project.mytrip.member.domain.dto.MemberRequest;
import com.project.mytrip.member.domain.dto.MemberResponse;
import com.project.mytrip.member.domain.entity.Member;
import com.project.mytrip.member.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class MemberService {
    @Autowired
    MemberRepository memberRepository;

    public List<Member> findAllMember() {
        return memberRepository.findAll();
    }
    public Optional<Member> findMember(long idx){
        return memberRepository.findById(idx);
    }
    public MemberResponse joinMember(MemberRequest memberRequest) {
        Member member = memberRepository.save(MemberRequest.toEntity(memberRequest));
        return MemberResponse.toDto(member);
    }
}
