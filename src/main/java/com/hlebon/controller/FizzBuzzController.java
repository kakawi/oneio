package com.hlebon.controller;

import com.hlebon.controller.dto.BatchFizzBuzzRequest;
import com.hlebon.controller.dto.BatchFizzBuzzResponse;
import com.hlebon.controller.dto.ErrorResponse;
import com.hlebon.controller.dto.FizzBuzzResponse;
import com.hlebon.service.FizzBuzzService;
import com.hlebon.service.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController("/")
public class FizzBuzzController {

    private final FizzBuzzService fizzBuzzService;

    @Autowired
    public FizzBuzzController(final FizzBuzzService fizzBuzzService) {
        this.fizzBuzzService = fizzBuzzService;
    }

    @PostMapping("handle")
    public BatchFizzBuzzResponse handle(@RequestBody BatchFizzBuzzRequest request) {
        final List<Integer> numbers = request.getNumbers();
        List<FizzBuzzResponse> responses = new ArrayList<>();
        for (final Integer number : numbers) {
            final FizzBuzzResponse fizzBuzzResponse = new FizzBuzzResponse();
            try {
                final String result = fizzBuzzService.handle(number);
                fizzBuzzResponse.setResult(result);
            } catch (final ServiceException e) {
                fizzBuzzResponse.setError(new ErrorResponse(e.getMessage()));
            }
            responses.add(fizzBuzzResponse);
        }
        return new BatchFizzBuzzResponse(responses);
    }
}
