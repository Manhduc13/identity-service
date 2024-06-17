package com.example.identityservice.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;

@Getter
public enum ErrorCode {

    UNCATEGORIZED_EXCEPTION(9999, HttpStatus.INTERNAL_SERVER_ERROR,"Uncategorized error"),
    ENUMKEY_INVALID(1000, HttpStatus.BAD_REQUEST,"Invalid validator annotation"),
    USERNAME_EXISTED(1001, HttpStatus.BAD_REQUEST,"Username has been taken"),
    USERNAME_INVALID(1002, HttpStatus.BAD_REQUEST,"Username must be at least 3 characters"),
    PASSWORD_INVALID(1003, HttpStatus.BAD_REQUEST,"Password must be at least 6 characters."),
    USER_NOT_FOUND(1004, HttpStatus.NOT_FOUND,"User not found!"),
    UNAUTHENTICATED(1005, HttpStatus.UNAUTHORIZED,"Unauthenticated"),
    UNAUTHORIZED(1006, HttpStatus.FORBIDDEN,"You do not have permission"),
    DOB_INVALID(1007, HttpStatus.BAD_REQUEST,"You are not old enough")
    ;

    private int code;
    private HttpStatusCode statusCode;
    private String message;

    ErrorCode(int code,HttpStatusCode statusCode, String message) {
        this.code = code;
        this.statusCode = statusCode;
        this.message = message;
    }

}
