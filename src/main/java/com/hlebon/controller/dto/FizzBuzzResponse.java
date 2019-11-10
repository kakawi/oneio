package com.hlebon.controller.dto;

public class FizzBuzzResponse {

    private String result;
    private ErrorResponse error;

    public FizzBuzzResponse setResult(final String result) {
        this.result = result;
        return this;
    }

    public FizzBuzzResponse setError(final ErrorResponse error) {
        this.error = error;
        return this;
    }

    public String getResult() {
        return result;
    }

    public ErrorResponse getError() {
        return error;
    }
}
