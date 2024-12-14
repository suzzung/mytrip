package com.project.mytrip.member.service;

import com.project.mytrip.member.domain.TestMember;
import com.project.mytrip.member.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MemberService {
    @Autowired
    MemberRepository memberRepository;

    public List<TestMember> findAllMember() {
        return memberRepository.findAll();
    }
}
