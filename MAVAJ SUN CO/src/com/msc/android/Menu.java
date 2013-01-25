package com.msc.android;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Menu extends ListActivity {

	String myClassList[] = { "Counter", "Menu", "Splash", "Text", "Email",
			"Camera" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
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

}
