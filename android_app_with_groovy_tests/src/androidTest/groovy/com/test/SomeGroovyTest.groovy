/*
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
import groovy.util.GroovyTestCase;

class SomeGroovyTest extends GroovyTestCase {
    void testSomething() {
        assert 1 == 1
    }

}
*/

import org.junit.Test
import static org.junit.Assert.assertTrue


class SomeGroovyTest {
    @Test
    void someTest() {
        assertTrue(true)
    }
}
//println "hello world from SomeGroovyTest"
