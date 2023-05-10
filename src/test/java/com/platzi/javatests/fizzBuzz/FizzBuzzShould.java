package com.platzi.javatests.fizzBuzz;

import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzShould {
/*
    Si el número es divisible por 3, retorna “Fizz”
    Si el número es divisible por 5, retorna “Buzz”
    Si el número es divisible por 3 y por 5, retorna “FizzBuzz”
    En otro caso, retorna el mismo número
*/

    @Test
    public void numberIsOnlyDivisibleBy3() {
        assertEquals("Fizz",FizzBuzz.fizzBuzz(3));
        assertEquals("Fizz",FizzBuzz.fizzBuzz(6));
    }

    @Test
    public void numberIsOnlyDivisibleBy5() {
        assertEquals("Buzz",FizzBuzz.fizzBuzz(5));
        assertEquals("Buzz",FizzBuzz.fizzBuzz(10));
    }

    @Test
    public void numberIsDivisibleBy3And5() {
        assertEquals("FizzBuzz",FizzBuzz.fizzBuzz(15));
        assertEquals("FizzBuzz",FizzBuzz.fizzBuzz(30));
    }

    @Test
    public void numberIsNotDivisibleBy3Or5() {
        FizzBuzz.fizzBuzz(2);
        FizzBuzz.fizzBuzz(16);
    }



}