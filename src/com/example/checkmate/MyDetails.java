package com.example.checkmate;

import android.app.Activity;
import android.os.Bundle;

public class MyDetails extends Activity
{
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.my_details);
		getActionBar().hide();
	}
}
