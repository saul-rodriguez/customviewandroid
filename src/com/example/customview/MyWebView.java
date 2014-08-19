package com.example.customview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.WebView;

public class MyWebView extends WebView{
	
	Context mcontext;
	Paint paint;
	
	public MyWebView(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
		mcontext = context;
	}

	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		super.onDraw(canvas);
		
		 //paint = new Paint();
		 //paint.setColor(Color.parseColor("#CD5C5C"));	        
	     //canvas.drawRect(50, 50, 200, 200, paint);
	}

	/*
	@Override
	public boolean onTouchEvent(MotionEvent event) {

	    // do your stuff here... the below call will make sure the touch also goes to the webview.
		//MotionEvent aux;
		
		//aux = event;
		
		float eventX = event.getX();
	    float eventY = event.getY();

	    switch (event.getAction()) {
	    	case MotionEvent.ACTION_DOWN:
	    					//path.moveTo(eventX, eventY);
	    		 			break;
	    	case MotionEvent.ACTION_MOVE:
	    					//path.lineTo(eventX, eventY);
	    					break;
	    	case MotionEvent.ACTION_UP:
	    		// nothing to do
	    					break;
	    	default:
	    			return false;
	    }
	    
	    //this.invalidate();
	    //return true;
	    return super.onTouchEvent(event);
	   
	}
	*/

}
