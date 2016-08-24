package com.ilyamur.topaz.aspectj.entity;

import static org.junit.Assert.assertEquals;

import com.ilyamur.topaz.aspectj.UserGetNameCounter;

import org.junit.Test;

public class UserTest {

    @Test
    public void test() {
        User user = new User();

        assertEquals(0, UserGetNameCounter.INSTANCE.value());

        user.getName();

        assertEquals(1, UserGetNameCounter.INSTANCE.value());
    }
}
