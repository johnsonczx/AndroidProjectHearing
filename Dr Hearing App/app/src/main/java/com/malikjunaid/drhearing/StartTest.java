package com.malikjunaid.drhearing;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * A class used to create layout for calibration screen
 * and contains intent to create next activity
 */
public class StartTest extends Activity {
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.calibration_info);
	}	
	
  	public void startTest(View v) 
  	{
  	    Intent intent = new Intent(this, HearingTestActivity.class);
  	    startActivity(intent);
  	}
  	
}
