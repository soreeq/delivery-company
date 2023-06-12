package com.d3vshub.exception;

import java.util.Date;

public class ErrorResponse {
    private String message;
    private String errorcode;

    public ErrorResponse(String errorCode, String message) {
        this.errorcode = errorCode;
        this.message = message;
    }

    public ErrorResponse() {

    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getErrorcode() {
        return errorcode;
    }

    public void setErrorcode(String errorcode) {
        this.errorcode = errorcode;
    }

}
