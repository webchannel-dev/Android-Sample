package com.msc.android;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Calculator extends Activity implements OnClickListener {

	Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bc, br, bp, bs, bd, bm;
	TextView tvr, tvin;
	private double sum = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.calculator);

		b1 = (Button) findViewById(R.id.bn01);
		b2 = (Button) findViewById(R.id.bn02);
		b3 = (Button) findViewById(R.id.bn03);
		b4 = (Button) findViewById(R.id.bn04);
		b5 = (Button) findViewById(R.id.bn05);
		b6 = (Button) findViewById(R.id.bn06);
		b7 = (Button) findViewById(R.id.bn07);
		b8 = (Button) findViewById(R.id.bn08);
		b9 = (Button) findViewById(R.id.bn09);
		b0 = (Button) findViewById(R.id.bn00);
		bc = (Button) findViewById(R.id.bnC);
		br = (Button) findViewById(R.id.bnR);
		bp = (Button) findViewById(R.id.bnP);
		bs = (Button) findViewById(R.id.bnS);
		bd = (Button) findViewById(R.id.bnD);
		bm = (Button) findViewById(R.id.bnM);
		tvin = (TextView) findViewById(R.id.CalInput);
		tvr = (TextView) findViewById(R.id.result);

		b1.setOnClickListener(this);
		b2.setOnClickListener(this);
		b3.setOnClickListener(this);
		b4.setOnClickListener(this);
		b5.setOnClickListener(this);
		b6.setOnClickListener(this);
		b7.setOnClickListener(this);
		b8.setOnClickListener(this);
		b9.setOnClickListener(this);
		b0.setOnClickListener(this);
		bc.setOnClickListener(this);
		br.setOnClickListener(this);
		bp.setOnClickListener(this);
		bs.setOnClickListener(this);
		bd.setOnClickListener(this);
		bm.setOnClickListener(this);
		tvin.setOnClickListener(this);
		tvr.setOnClickListener(this);

	}

	public void onClick(View v) {

		switch (v.getId()) {
		case R.id.bn01:
			if (tvin.getText().equals("0")) {
				tvin.setText("1");
			} else {
				tvin.setText(tvin.getText() + "1");
			}
			break;
		case R.id.bn02:
			if (tvin.getText().equals("0")) {
				tvin.setText("2");
			} else {
				tvin.setText(tvin.getText() + "2");
			}
			break;
		case R.id.bn03:
			if (tvin.getText().equals("0")) {
				tvin.setText("3");
			} else {
				tvin.setText(tvin.getText() + "3");
			}
			break;
		case R.id.bn04:
			if (tvin.getText().equals("0")) {
				tvin.setText("4");
			} else {
				tvin.setText(tvin.getText() + "4");
			}
			break;
		case R.id.bn05:
			if (tvin.getText().equals("0")) {
				tvin.setText("5");
			} else {
				tvin.setText(tvin.getText() + "5");
			}
			break;
		case R.id.bn06:
			if (tvin.getText().equals("0")) {
				tvin.setText("6");
			} else {
				tvin.setText(tvin.getText() + "6");
			}
			break;
		case R.id.bn07:
			if (tvin.getText().equals("0")) {
				tvin.setText("7");
			} else {
				tvin.setText(tvin.getText() + "7");
			}
			break;
		case R.id.bn08:
			if (tvin.getText().equals("0")) {
				tvin.setText("8");
			} else {
				tvin.setText(tvin.getText() + "8");
			}
			break;
		case R.id.bn09:
			if (tvin.getText().equals("0")) {
				tvin.setText("9");
			} else {
				tvin.setText(tvin.getText() + "9");
			}
			break;
		case R.id.bn00:
			if (tvin.getText().equals("0")) {
				tvin.setText("0");
			} else {
				tvin.setText(tvin.getText() + "0");
			}
			break;
		case R.id.bnC:
			tvin.setText("0");
			tvr.setText("");
			sum = 0;
			break;
		case R.id.bnR:
			tvin.setText(Double.toString(sum));
			tvr.setText("Result ");
			break;

		case R.id.bnP:

			sum = sum + Double.parseDouble(tvin.getText().toString());
			tvr.setText(Double.toString(sum) + " +");
			tvin.setText("");
			break;
		case R.id.bnS:
			sum = sum - Double.parseDouble(tvin.getText().toString());
			tvr.setText(Double.toString(sum) + " -");
			tvin.setText("");
			break;
		case R.id.bnD:
			sum = sum / Double.parseDouble(tvin.getText().toString());
			tvr.setText(Double.toString(sum) + " /");
			tvin.setText("");
			break;
		case R.id.bnM:
			sum = sum * Double.parseDouble(tvin.getText().toString());
			tvr.setText(Double.toString(sum) + " X");
			tvin.setText("");
			break;

		default:
			break;
		}

	}

}
