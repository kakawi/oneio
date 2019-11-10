package com.hlebon.controller.dto;

import java.util.List;

public class BatchFizzBuzzRequest {

    private List<Integer> numbers;

    public List<Integer> getNumbers() {
        return numbers;
    }

    public BatchFizzBuzzRequest setNumbers(final List<Integer> numbers) {
        this.numbers = numbers;
        return this;
    }
}
