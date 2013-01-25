package com.msc.android;

import java.io.InputStream;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Camera extends Activity implements View.OnClickListener {

	ImageButton ib;
	Button b;
	ImageView iv;
	Bitmap bmp;

	Intent i;
	final static int cameraResults = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.photo);
		initialize();
		InputStream is = getResources().openRawResource(R.drawable.splash);
		bmp = BitmapFactory.decodeStream(is);
	}

	private void initialize() {
		iv = (ImageView) findViewById(R.id.ivReturnedPic);
		ib = (ImageButton) findViewById(R.id.ibTakePic);
		b = (Button) findViewById(R.id.bSetWall);
		b.setOnClickListener(this);
		ib.setOnClickListener(this);
	}

	@SuppressWarnings("deprecation")
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.bSetWall:
			try {
				getApplicationContext().setWallpaper(bmp);
			} catch (Exception e) {

			}
			break;

		case R.id.ibTakePic:
			i = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
			startActivityForResult(i, cameraResults);
			break;
		}
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		super.onActivityResult(requestCode, resultCode, data);
		if (resultCode == RESULT_OK) {
			Bundle extras = data.getExtras();
			bmp = (Bitmap) extras.get("data");
			iv.setImageBitmap(bmp);
		}
	}

}
