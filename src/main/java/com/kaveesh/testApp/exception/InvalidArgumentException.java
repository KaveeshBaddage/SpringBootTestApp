package com.kaveesh.testApp.exception;

import lombok.Getter;

public class InvalidArgumentException extends RuntimeException {

    @Getter
    private String errorCode;

    @Getter
    private String errorAttributes;

    public InvalidArgumentException(String message){
        super(message);
    }
    public InvalidArgumentException(String message, String errorAttributes){
        super(message);
        this.errorCode = "Error001";
        this.errorAttributes = errorAttributes;
    }

}
