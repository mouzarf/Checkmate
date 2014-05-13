package com.example.checkmate;

import android.app.Activity;
import android.os.Bundle;

public class ExpectedPosition extends Activity
{
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.expected_position);
		getActionBar().hide();
	}
}
