package com.project.mytrip.member.domain;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class TestMember {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idx;

    @Column (length = 20)
    private String id;

    @Column (length = 20)
    private String pw;

    @Column (length = 20)
    private String name;

    public TestMember(int idx, String id, String pw, String name) {
        this.idx = idx;
        this.id = id;
        this.pw = pw;
        this.name = name;
    }
}
