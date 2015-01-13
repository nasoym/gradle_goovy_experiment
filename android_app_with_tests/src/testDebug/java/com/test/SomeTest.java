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

@Config(emulateSdk = 18) 
@RunWith(RobolectricTestRunner.class)
public class SomeTest {

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
