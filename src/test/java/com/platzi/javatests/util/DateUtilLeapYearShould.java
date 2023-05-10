package com.platzi.javatests.util;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class DateUtilLeapYearShould {
/*
    Todos los años divisibles por 400 son bisiestos (1600, 2000, 2400)
    Todos los años divisibles por 100 pero NO por 400 NO son bisiestos (1700, 1800, 1900)
    Todos los años divisibles por 4 son bisiestos (1996, 2004, 2012)
    Todos los años que NO son divisibles por 4 NO son bisiestos (2017, 2018, 2019)
*/

    @Test
    public void returnTrueWhenYearIsDivisibleBy400() {
        assertThat(DateUtil.isLeapYear(1600),is(true));
        assertThat(DateUtil.isLeapYear(2000),is(true));
        assertThat(DateUtil.isLeapYear(2400),is(true));
    }

    @Test
    public void returnFalseWhenYearIsDivisibleBy100ButNotBy400() {
        assertThat(DateUtil.isLeapYear(1700),is(false));
        assertThat(DateUtil.isLeapYear(1800),is(false));
        assertThat(DateUtil.isLeapYear(1900),is(false));
    }

    @Test
    public void returnTrueWhenYearIsDivisibleBy4ButNotBY100() {
        assertThat(DateUtil.isLeapYear(1996),is(true));
        assertThat(DateUtil.isLeapYear(2004),is(true));
        assertThat(DateUtil.isLeapYear(2008),is(true));
    }

    @Test
    public void returnFalseWhenYearIsNotDivisibleBy4() {
        assertThat(DateUtil.isLeapYear(2017),is(false));
        assertThat(DateUtil.isLeapYear(2019),is(false));
        assertThat(DateUtil.isLeapYear(2018),is(false));
    }
}