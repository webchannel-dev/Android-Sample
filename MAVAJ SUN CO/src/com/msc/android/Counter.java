package com.msc.android;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Counter extends Activity {

	int count;
	Button add;
	Button sub;
	TextView tD;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_counter);

		count = 0;
		add = (Button) findViewById(R.id.addB);
		sub = (Button) findViewById(R.id.subB);
		tD = (TextView) findViewById(R.id.tvD);

		add.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				count++;
				tD.setText("Total :" + count);
			}
		});

		sub.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				count--;
				tD.setText("Total :" + count);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.layout_cool_menu, menu);
		return true;
	}
}
