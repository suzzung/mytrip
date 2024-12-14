package com.project.mytrip.member.domain.dto;

import com.project.mytrip.member.domain.entity.Member;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class MemberRequest {
    private String id;
    private String pw;
    private String name;
    private String email;

    public static Member toEntity(MemberRequest memberRequest){
        return Member.builder()
                .id(memberRequest.getId())
                .pw(memberRequest.getPw())
                .name(memberRequest.getName())
                .email(memberRequest.getEmail())
                .build();
    }
}
