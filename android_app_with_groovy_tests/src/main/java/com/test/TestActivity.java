package com.test;

import android.app.Activity;
import android.util.Log;
import android.os.Bundle;

//import com.test.Hello;

public class TestActivity extends Activity {

    private static final String LOG_TAG = TestActivity.class.getSimpleName();

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        //Hello hello = new Hello();
        //Log.d(LOG_TAG, ">>>>: " + hello.hi());
    }
}
