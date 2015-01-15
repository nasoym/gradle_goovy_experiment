package com.test;

import android.app.Activity;
import android.util.Log;

import java.util.*;

import org.junit.*;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;

import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
import org.robolectric.Robolectric;
import org.robolectric.shadows.ShadowLog;

@Config(emulateSdk = 18) 
@RunWith(RobolectricTestRunner.class)
public class AnotherJavaTest {

    private static final String LOG_TAG = AnotherJavaTest.class.getSimpleName();

    @BeforeClass
    public static void setupLogging() {
        System.setProperty("robolectric.logging", "stdout");
        ShadowLog.setupLogging();
    }

    @Test
    public void helloWorld() {
        Log.d(LOG_TAG, "helloWorld");
    }

}
