package com.example.activity_life;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends Activity {

	public static final String TGA = "MainActivity";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		Log.d(TGA, "onCreate");
		setContentView(R.layout.activity_main);
		if (savedInstanceState != null) {
			String tempData = savedInstanceState.getString("data_type");
			Log.d(TGA, tempData);
		}
		Button startNormal = (Button) findViewById(R.id.start_normal_activity);
		Button startDialog = (Button) findViewById(R.id.start_dialog_activity);
		startNormal.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this, Normal.class);
				startActivity(intent);
			}
		});
		startDialog.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this, Dialog.class);
				startActivity(intent);
			}
		});
	}

	@Override
	protected void onStart() {
		super.onStart();
		Log.d(TGA, "onStart");
	}

	@Override
	protected void onResume() {
		super.onResume();
		Log.d(TGA, "onResume");
	}

	@Override
	protected void onPause() {
		super.onPause();
		Log.d(TGA, "onPause");
	}

	@Override
	protected void onStop() {
		super.onStop();
		Log.d(TGA, "onStop");
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		Log.d(TGA, "onDestroy");
	}

	@Override
	protected void onRestart() {
		super.onRestart();
		Log.d(TGA, "onRestart");
	}

	@Override
	protected void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		String tempData = "Something you just typed";
		outState.putString("data_key", tempData);
	};

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
