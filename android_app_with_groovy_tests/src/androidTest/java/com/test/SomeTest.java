package com.test;

import android.app.Activity;
import android.util.Log;

import java.util.*;

import org.junit.*;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;

import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
import org.robolectric.util.ActivityController;
import org.robolectric.Robolectric;
import org.robolectric.shadows.ShadowLog;

@Config(emulateSdk = 18) 
@RunWith(RobolectricTestRunner.class)
public class SomeTest {

    private static final String LOG_TAG = SomeTest.class.getSimpleName();

    @BeforeClass
    public static void setupLogging() {
        System.setProperty("robolectric.logging", "stdout");
        ShadowLog.setupLogging();
    }

    @Test
    public void helloWorld() {
        Log.d(LOG_TAG, "helloWorld");
    }

    @Test
    public void test() {
        ActivityController<TestActivity> activityController = ActivityController.of(new TestActivity());
        Activity activity = activityController
            .attach()
            .create()
            .start()
            .resume()
            .visible()
            .get();
        assertNotNull(activity);
    }
}
