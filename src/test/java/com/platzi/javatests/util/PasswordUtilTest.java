package com.platzi.javatests.util;

import org.junit.Test;

import static com.platzi.javatests.util.PasswordUtil.SecurityLevel.*;
import static org.junit.Assert.*;

public class PasswordUtilTest {

    @Test
    public void weakPasswordHasLessThan8Letter() {
        assertEquals(WEAK,PasswordUtil.assessPassword("123aa!"));
    }
    @Test
    public void weakWhenHasOnlyLetters() {
        assertEquals(WEAK,PasswordUtil.assessPassword("abcdefgh"));
    }
    @Test
    public void mediumWhenHasLettersAndNumbers() {
        assertEquals(MEDIUM,PasswordUtil.assessPassword("abcd1234"));
    }

    @Test
    public void strongWhenHasLettersNumbersAndSymbols() {
        assertEquals(STRONG,PasswordUtil.assessPassword("abcd1234!"));
    }
}