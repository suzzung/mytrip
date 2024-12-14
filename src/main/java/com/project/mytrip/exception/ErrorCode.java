package com.project.mytrip.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ErrorCode {
    BAD_REQUEST(1001, "잘못된 입력값입니다."),
    NO_CONTENT(1002, "응답 결과가 없습니다.");

    private int status;
    private String message;
    private String detail;

    ErrorCode(int status, String message) {
        this.status = status;
        this.message = message;
    }
}
