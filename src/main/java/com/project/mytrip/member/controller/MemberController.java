package com.project.mytrip.member.controller;

import com.project.mytrip.member.domain.dto.MemberRequest;
import com.project.mytrip.member.domain.dto.MemberResponse;
import com.project.mytrip.member.domain.entity.Member;
import com.project.mytrip.member.service.MemberService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MemberController {
    private MemberService memberService;

    @GetMapping(value = "/member")
    public List<Member> findTestMember() {
        return memberService.findAllMember();
    }

    @PutMapping(value = "/member/join")
    public MemberResponse joinMember(@RequestBody MemberRequest memberRequest) {
        return memberService.joinMember(memberRequest);
    }
}
