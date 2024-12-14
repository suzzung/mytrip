package com.project.mytrip.member.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Member {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idx;

    @Column (length = 20,nullable = false)
    private String id;

    @Column (length = 20,nullable = false)
    private String pw;

    @Column (length = 20,nullable = false)
    private String name;

    @Column (length = 50,nullable = false)
    private  String email;

}
