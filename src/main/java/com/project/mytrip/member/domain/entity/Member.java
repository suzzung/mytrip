package com.project.mytrip.member.domain.entity;

import jakarta.persistence.*;
import lombok.Getter;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
@Getter
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

    public Member(int idx, String id, String pw, String name) {
        this.idx = idx;
        this.id = id;
        this.pw = pw;
        this.name = name;
    }
}
