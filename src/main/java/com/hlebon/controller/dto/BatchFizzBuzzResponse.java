package com.hlebon.controller.dto;

import java.util.List;

public class BatchFizzBuzzResponse {

    private final List<FizzBuzzResponse> handledNumbers;

    public BatchFizzBuzzResponse(final List<FizzBuzzResponse> result) {
        this.handledNumbers = result;
    }

    public List<FizzBuzzResponse> getHandledNumbers() {
        return handledNumbers;
    }
}
