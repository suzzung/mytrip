package com.project.mytrip.member.controller;

import com.project.mytrip.member.domain.dto.MemberRequest;
import com.project.mytrip.member.domain.dto.MemberResponse;
import com.project.mytrip.member.domain.entity.Member;
import com.project.mytrip.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RestController
public class MemberController {
    @Autowired
    private MemberService memberService;

    @GetMapping(value = "/member/search/all")
    public List<Member> findAllMember() {
        return memberService.findAllMember();
    }
    @GetMapping(value = "/member/search/{idx}")
    public Optional<Member> findTestMember(@PathVariable long idx) {
        return memberService.findMember(idx);
    }
    @PutMapping(value = "/member/join")
    public MemberResponse joinMember(@RequestBody MemberRequest memberRequest) {
        return memberService.joinMember(memberRequest);
    }

}
