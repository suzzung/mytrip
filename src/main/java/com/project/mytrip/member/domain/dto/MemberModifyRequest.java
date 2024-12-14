package com.project.mytrip.member.domain.dto;

import com.project.mytrip.member.domain.entity.Member;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class MemberModifyRequest {
    private Long idx;
    private String pw;
    private String name;
    private String email;

    public static Member toEntity(MemberModifyRequest request){
        return Member.builder()
                .idx(request.getIdx())
                .pw(request.getPw())
                .name(request.getName())
                .email(request.getEmail())
                .build();
    }
}
