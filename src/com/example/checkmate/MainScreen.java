package com.example.checkmate;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;

public class MainScreen extends Activity
{
	ListView myListView;
	TextView myEditText;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_menu);
		getActionBar().hide();
		
		ListView myListView = (ListView)findViewById(R.id.menuList);
		TextView myEditText = (TextView)findViewById(R.id.menuText);

		ArrayList<String> menuItems = new ArrayList<String>();
		ArrayAdapter<String> aa = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,menuItems);
		myListView.setAdapter(aa);
		
		menuItems.add("Next Opponent");
		menuItems.add("Results");
		menuItems.add("Ratings");
		menuItems.add("Expected Position in the Tournament");
		menuItems.add("My Statistics");
		menuItems.add("Edit my Details");
		aa.notifyDataSetChanged();
		
		myListView.setOnItemClickListener(new OnItemClickListener() 
		{

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) 
			{
				if(position==2)
				{
					Intent intent = new Intent(MainScreen.this, Ratings.class);
					startActivity(intent);
				}
			}
		
		});
		
		
	}
	
}
