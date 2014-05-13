package com.example.checkmate;

import java.util.ArrayList;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class Results extends Activity
{
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.results);
		getActionBar().hide();
		
		ListView myListView = (ListView)findViewById(R.id.resultsList);
		TextView myEditText = (TextView)findViewById(R.id.resultsText);
		Button addGame = (Button)findViewById(R.id.addGame);
		
		ArrayList<String> results = new ArrayList<String>();
		ArrayAdapter<String> aa = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,results);
		myListView.setAdapter(aa);
		
		for(int i = 1; i<=10; i++)
		{
			results.add("Player 1 - Player 2   1:0   black");
		}	
		
		aa.notifyDataSetChanged();
		
		addGame.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) 
			{
				Intent intent = new Intent(Results.this, PlayedGame.class);
				startActivity(intent);
			}
		});
	}
}
