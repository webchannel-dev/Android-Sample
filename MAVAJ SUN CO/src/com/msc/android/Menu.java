package com.msc.android;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Menu extends ListActivity {

	String myClassList[] = { "Counter", "Menu", "Splash", "Text", "Email",
			"Camera", "Data", "GFX", "Calculator" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// FullScreen
		// requestWindowFeature(Window.FEATURE_NO_TITLE);
		// getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
		// WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setListAdapter(new ArrayAdapter<String>(Menu.this,
				android.R.layout.simple_list_item_1, myClassList));
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		super.onListItemClick(l, v, position, id);
		Class myClass;
		try {
			myClass = Class.forName("com.msc.android." + myClassList[position]);
			Intent myIntent = new Intent(Menu.this, myClass);
			startActivity(myIntent);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		MenuInflater blowUp = getMenuInflater();
		blowUp.inflate(R.menu.layout_cool_menu, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.aboutus:
			Intent i = new Intent("com.msc.android.About");
			startActivity(i);
			break;

		case R.id.preferences:
			Intent i2 = new Intent("com.msc.android.Prefes");
			startActivity(i2);

			break;

		case R.id.exit:
			finish();
			break;
		}
		return false;
	}

}
