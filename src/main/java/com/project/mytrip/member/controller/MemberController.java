package com.project.mytrip.member.controller;

import com.project.mytrip.member.domain.TestMember;
import com.project.mytrip.member.service.MemberService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MemberController {
    private MemberService memberService;

    @GetMapping(value = "/test/member")
    public List<TestMember> findTestMember() {
        return memberService.findAllMember();
    }
}
