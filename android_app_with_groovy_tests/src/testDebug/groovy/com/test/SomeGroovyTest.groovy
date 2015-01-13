package com.test;

import org.junit.*;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;

import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

@Config(emulateSdk = 18) 
@RunWith(RobolectricTestRunner.class)
public class SomeGroovyTest {

    @Test
    public void test() {
        assertTrue(true);
    }

}

