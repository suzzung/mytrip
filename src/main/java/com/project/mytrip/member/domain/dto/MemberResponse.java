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

    public static MemberResponse toDto(Member member){
        return MemberResponse.builder()
                .userId(member.getId())
                .build();
    }
}
