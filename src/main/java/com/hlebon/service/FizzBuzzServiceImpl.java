package com.hlebon.service;

public class FizzBuzzServiceImpl implements FizzBuzzService {

    @Override
    public String handle(final int number) throws ServiceException {
        validate(number);
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(number);
    }

    private void validate(final int number) throws ServiceException {
        if (number <= 0) {
            throw new ServiceException("Can't handle negative or zero number");
        }
    }
}
