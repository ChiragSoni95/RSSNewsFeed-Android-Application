package com.example.rss;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;

public class Sports extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		 requestWindowFeature(Window.FEATURE_ACTION_BAR);
		setContentView(R.layout.activity_sports);
	}
	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.sports, menu);
		return true;
	}
	public boolean onOptionsItemSelected(MenuItem item){
    	switch(item.getItemId()){
    	case R.id.homepage:
    		Intent i = new Intent(getBaseContext() , Act2.class);
			i.putExtra("home", true);
			startActivity(i);
			return true;
    	case R.id.settings:
    		Intent enter=new Intent(Sports.this,Settings.class); 
			startActivity(enter);
			return true;
    	
			
    	case R.id.exit:
    		Intent i4=new Intent(getBaseContext(),Act2.class); 
    		i4.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); 
    		i4.putExtra("exit", true); 
    		startActivity(i4);
    		return true;	
			
			
    	default:
    		return false; 
    	}
 }
public void sports1(View v){
	
		
		Intent d= new Intent(Sports.this,D1.class);
		startActivity(d);
		}
	
	
public void sports2(View v){
	
	Intent d= new Intent(this,D2.class);
	startActivity(d);
		}



}
