package com.test;

import android.app.Activity;
import android.os.Bundle;

public class TestActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    public void hello() {
        float hello = 9;
        hello += 4;
    }

}
