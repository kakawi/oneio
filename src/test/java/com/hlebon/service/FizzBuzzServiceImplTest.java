package com.hlebon.service;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@RunWith(BlockJUnit4ClassRunner.class)
public class FizzBuzzServiceImplTest {

    private FizzBuzzService service = new FizzBuzzServiceImpl();

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void handle_number() throws ServiceException {
        // prerequisites
        int number = 26;

        // test
        final String actual = service.handle(number);

        // asserts
        assertEquals("26", actual);
    }

    @Test
    public void handle_dividedBy3() throws ServiceException {
        // prerequisites
        int number = 27;

        // test
        final String actual = service.handle(number);

        // asserts
        assertEquals("Fizz", actual);
    }

    @Test
    public void handle_dividedBy5() throws ServiceException {
        // prerequisites
        int number = 25;

        // test
        final String actual = service.handle(number);

        // asserts
        assertEquals("Buzz", actual);
    }

    @Test
    public void handle_dividedBy3And5() throws ServiceException {
        // prerequisites
        int number = 30;

        // test
        final String actual = service.handle(number);

        // asserts
        assertEquals("FizzBuzz", actual);
    }

    @Test
    public void handle_zero() throws ServiceException {
        // prerequisites
        int number = 0;

        // expected
        thrown.expect(ServiceException.class);
        thrown.expectMessage("Can't handle negative or zero number");

        // test
        service.handle(number);
    }

    @Test
    public void handle_negative() throws ServiceException {
        // prerequisites
        int number = -130;

        // expected
        thrown.expect(ServiceException.class);
        thrown.expectMessage("Can't handle negative or zero number");

        // test
        service.handle(number);
    }
}
