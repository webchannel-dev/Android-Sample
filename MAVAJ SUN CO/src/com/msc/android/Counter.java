package com.msc.android;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Counter extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_counter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.layout_counter, menu);
        return true;
    }
}
