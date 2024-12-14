package com.project.mytrip.member.service;

import com.project.mytrip.member.domain.dto.MemberModifyRequest;
import com.project.mytrip.member.domain.dto.MemberRequest;
import com.project.mytrip.member.domain.dto.MemberResponse;
import com.project.mytrip.member.domain.entity.Member;
import com.project.mytrip.member.repository.MemberRepository;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class MemberService {
    @Autowired
    MemberRepository memberRepository;

    //회원 전체 조회
    public List<MemberResponse> findAllMember() {
        List<Member> memberList = memberRepository.findAll();
        return memberList.stream()
                    .map(MemberResponse::toDto)
                    .collect(Collectors.toList());
    }

    //회원번호 조회
    public MemberResponse findMember(long idx){
        Member findMember = memberRepository.findById(idx)
                                .orElseThrow(NoSuchElementException::new);
        return MemberResponse.toDto(findMember);
    }

    //회원정보 수정
    @Transactional
    public MemberResponse modifyMember(MemberModifyRequest request) {
        Member member = memberRepository.findById(request.getIdx())
                            .orElseThrow(NoSuchElementException::new);

        member.changeMember(request);
        return MemberResponse.toDto(member);
    }

    //회원 가입
    public MemberResponse joinMember(MemberRequest memberRequest) {
        Member joinMember = memberRepository.save(MemberRequest.toEntity(memberRequest));
        return MemberResponse.toDto(joinMember);
    }
}
