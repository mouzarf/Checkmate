package com.example.checkmate;

import android.app.Activity;
import android.os.Bundle;

public class PlayedGame extends Activity
{
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.played_game);
		getActionBar().hide();
	}
	
}
