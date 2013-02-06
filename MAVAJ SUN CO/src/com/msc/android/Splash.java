package com.msc.android;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.preference.PreferenceManager;

public class Splash extends Activity {
	MediaPlayer splashSound;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// Here we are going to setup link to our layout
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_splash);
		splashSound = MediaPlayer.create(Splash.this, R.raw.splash);
		SharedPreferences getPrefs = PreferenceManager
				.getDefaultSharedPreferences(getBaseContext());
		boolean music = getPrefs.getBoolean("checkbox", true);
		if (music == true) {
			splashSound.start();
		}
		Thread timer = new Thread() {
			public void run() {
				try {
					sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				} finally {
					Intent intent = new Intent("com.msc.android.Menu");
					startActivity(intent);
				}
			}

		};
		timer.start();
	}

	@Override
	protected void onPause() {
		super.onPause();
		splashSound.release();
		finish();
	}
}
