package com.project.mytrip.member.domain.entity;

import com.project.mytrip.member.domain.dto.MemberModifyRequest;
import com.project.mytrip.member.domain.dto.MemberRequest;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@DynamicUpdate
public class Member {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idx;

    @Column (length = 20, nullable = false)
    private String id;

    @Column (length = 20, nullable = false)
    private String pw;

    @Column (length = 20, nullable = false)
    private String name;

    @Column (length = 50, nullable = false)
    private  String email;

    @CreationTimestamp
    private LocalDateTime createDate;

    @UpdateTimestamp
    private LocalDateTime updateDate;

    public void changeMember(MemberModifyRequest request) {
        this.name = request.getName();
        this.email = request.getEmail();

        checkMember(this);
    }

    public void checkMember(Member member) {
        if (member.getName().isEmpty()) {
            throw new IllegalArgumentException("Name Empty");
        }

        if (member.getEmail().isEmpty()) {
            throw new IllegalArgumentException("Email Empty");
        }
    }
}
