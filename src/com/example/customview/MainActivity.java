package com.example.customview;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebViewClient;

public class MainActivity extends ActionBarActivity {

	MyWebView wv;
	double lat;
	double lon;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		lat = 4.7;
		lon = -75.5;
		String url = String.format("http://skyvector.com/?ll=%f,%f&chart=301&zoom=6",lat,lon);
		
		
		
		wv = (MyWebView)findViewById(R.id.myWebView);
		
		wv.setWebViewClient(new WebViewClient());
	    WebSettings webSettings = wv.getSettings();        
	    webSettings.setJavaScriptEnabled(true);
	    wv.loadUrl(url);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	public void onPanMap(View view) 
	{
				
		// Obtain MotionEvent object
		long downTime = SystemClock.uptimeMillis();
		long eventTime = SystemClock.uptimeMillis() + 0;
		float x = 100.0f;
		float y = 100.0f;
		// List of meta states found here: developer.android.com/reference/android/view/KeyEvent.html#getMetaState()
		int metaState = 0;
		MotionEvent motionEvent = MotionEvent.obtain(
		    downTime, 
		    eventTime, 
		    MotionEvent.ACTION_DOWN, 
		    x, 
		    y, 
		    metaState
		);

		// Dispatch touch event to view
		wv.dispatchTouchEvent(motionEvent);
		
		x = 105;
		eventTime += 20;
		MotionEvent motionEvent2 = MotionEvent.obtain(
			    downTime, 
			    eventTime, 
			    MotionEvent.ACTION_MOVE, 
			    x, 
			    y, 
			    metaState
			);
		
		wv.dispatchTouchEvent(motionEvent2);
		

		x = 110;
		eventTime += 20;
		MotionEvent motionEvent3 = MotionEvent.obtain(
			    downTime, 
			    eventTime, 
			    MotionEvent.ACTION_MOVE, 
			    x, 
			    y, 
			    metaState
			);
		wv.dispatchTouchEvent(motionEvent3);
		
		x = 115;
		eventTime += 20;
		MotionEvent motionEvent4 = MotionEvent.obtain(
			    downTime, 
			    eventTime, 
			    MotionEvent.ACTION_UP, 
			    x, 
			    y, 
			    metaState
			);
		wv.dispatchTouchEvent(motionEvent4);
	}
}
