package com.project.mytrip.exception;

import lombok.Setter;

public class ExceptionResponse {
    private final int status;
    private final String message;
    @Setter
    private String detail;

    public ExceptionResponse(ErrorCode errorCode) {
        this.status = errorCode.getStatus();
        this.message = errorCode.getMessage();
        this.detail = errorCode.getDetail();
    }

    public static ExceptionResponse of(ErrorCode errorCode) {
        return new ExceptionResponse(errorCode);
    }

    public void printExceptionMessage() {
        System.out.println("******** Exception ********");
        System.out.println("status : "+status);
        System.out.println("message : "+message);
    }
}
