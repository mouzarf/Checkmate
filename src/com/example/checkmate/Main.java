package com.example.checkmate;
import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class Main extends Activity 
{

	static Button logIn;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		getActionBar().hide();
			//gulpia
		if (savedInstanceState == null) {
			getFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}
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
	

	@Override
	public void onWindowFocusChanged(boolean hasFocus) {
		// TODO Auto-generated method stub
		super.onWindowFocusChanged(hasFocus);
		scaleContents();
		
	}
	private void scaleContents(View rootView, View container) 
	 { 
	 // Compute the scaling ratio 
		float xScale = (float)container.getWidth() / rootView.getWidth(); 
		float yScale = (float)container.getHeight() / rootView.getHeight(); 
		float scale = Math.min(xScale, yScale); 

		// Scale our contents 
		scaleViewAndChildren(rootView, scale); 
	 } 

	// Scale the given view, its contents, and all of its children by the given factor. 
	public static void scaleViewAndChildren(View root, float scale) 
	{ 
		// Retrieve the view's layout information 
		ViewGroup.LayoutParams layoutParams = root.getLayoutParams(); 

		// Scale the view itself 
		if (layoutParams.width != ViewGroup.LayoutParams.FILL_PARENT && 
				layoutParams.width != ViewGroup.LayoutParams.WRAP_CONTENT) 
		{ 
			layoutParams.width *= scale; 
		} 
		if (layoutParams.height != ViewGroup.LayoutParams.FILL_PARENT && 
				layoutParams.height != ViewGroup.LayoutParams.WRAP_CONTENT) 
		{ 
			layoutParams.height *= scale; 
		} 

		// If this view has margins, scale those too 
		if (layoutParams instanceof ViewGroup.MarginLayoutParams) 
		{ 
			ViewGroup.MarginLayoutParams marginParams = 
					(ViewGroup.MarginLayoutParams)layoutParams; 
			marginParams.leftMargin *= scale; 
			marginParams.rightMargin *= scale; 
			marginParams.topMargin *= scale; 
			marginParams.bottomMargin *= scale; 
		} 

		// Set the layout information back into the view 
		root.setLayoutParams(layoutParams); 
		// Scale the view's padding 
		root.setPadding( 
				(int)(root.getPaddingLeft() * scale), 
				(int)(root.getPaddingTop() * scale), 
				(int)(root.getPaddingRight() * scale), 
				(int)(root.getPaddingBottom() * scale)); 

		// If the root view is a TextView, scale the size of its text 
		if (root instanceof TextView) 
		{ 
			TextView textView = (TextView)root; 
			textView.setTextSize(textView.getTextSize() * scale); 
		} 

		// If the root view is a ViewGroup, scale all of its children recursively 
		if (root instanceof ViewGroup) 
		{ 
			ViewGroup groupView = (ViewGroup)root; 
			for (int cnt = 0; cnt < groupView.getChildCount(); ++cnt) 
				scaleViewAndChildren(groupView.getChildAt(cnt), scale); 
		} 
	} 



	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_main, container,
					false);
			logIn = (Button)rootView.findViewById(R.id.logIn);

			logIn.setOnClickListener(new View.OnClickListener() 
			{

				@Override
				public void onClick(View v) 
				{
					Intent intent = new Intent(getActivity(), MainScreen.class);
					startActivity(intent);
				}								
				
			});
			
			return rootView;
		}
		
	}
	

}
