package com.msc.android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Splash extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// Here we are going to setup link to our layout
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_splash);
		
		Thread timer = new Thread() {
			public void run() {
                 try{
                	 sleep(1000);
                 }catch(InterruptedException e){
                	 e.printStackTrace();
                 }finally{
                	 Intent intent=new Intent("com.msc.android.Menu");
             		 startActivity(intent);
                 }
			}

		};
		timer.start();
	}
}
