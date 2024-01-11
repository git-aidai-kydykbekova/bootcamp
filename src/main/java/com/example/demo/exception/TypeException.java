package com.example.demo.exception;

import com.example.demo.enums.Type;
import org.springframework.http.HttpStatus;

public class TypeException {
    private final String message;
    private final HttpStatus httpStatus;

    public TypeException(String message, HttpStatus httpStatus) {
        this.message = message;
        this.httpStatus = httpStatus;
    }

}
