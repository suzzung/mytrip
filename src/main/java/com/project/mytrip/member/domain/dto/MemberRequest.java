package com.project.mytrip.member.domain.dto;

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

}
