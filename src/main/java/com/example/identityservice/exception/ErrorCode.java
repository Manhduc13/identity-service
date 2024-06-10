package com.example.identityservice.exception;

public enum ErrorCode {

    UNCATEGORIZED_EXCEPTION(9999,"Uncategorized error"),
    ENUMKEY_INVALID(1000,"Invalid enum key"),
    USERNAME_EXISTED(1001,"Username has been taken"),
    USERNAME_INVALID(1002,"Username must be at least 3 characters"),
    PASSWORD_INVALID(1003,"Password must be at least 6 characters."),
    USER_NOT_FOUND(1004,"User not found!"),
    UNAUTHENTICATED(1005, "Unauthenticated")
    ;
    private int code;
    private String message;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
