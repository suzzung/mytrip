package com.project.mytrip.member.domain.dto;


import com.project.mytrip.member.domain.entity.Member;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class MemberResponse {
    private String userId;
    private String name;
    private String email;

    public static MemberResponse toDto(Member member){
        return MemberResponse.builder()
                .userId(member.getId())
                .name(member.getName())
                .email(member.getEmail())
                .build();
    }
}
