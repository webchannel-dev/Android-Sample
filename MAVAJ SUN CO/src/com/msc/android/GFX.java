package com.msc.android;

import android.app.Activity;
import android.os.Bundle;

public class GFX extends Activity {

	MyBringBack ourView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// Define our customze
		ourView = new MyBringBack(this);
		setContentView(ourView);
	}
}
