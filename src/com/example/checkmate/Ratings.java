package com.example.checkmate;
import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Ratings extends Activity
{
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ratings);
		getActionBar().hide();
		
		ListView myListView = (ListView)findViewById(R.id.ratingsList);
		TextView myEditText = (TextView)findViewById(R.id.ratingsText);
		
		ArrayList<String> menuItems = new ArrayList<String>();
		ArrayAdapter<String> aa = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,menuItems);
		myListView.setAdapter(aa);
		
		for(int i = 1; i<=10; i++)
		{
			menuItems.add("Player" + i + "                                                   2800");
		}
		
		
		aa.notifyDataSetChanged();
	}
	
}
