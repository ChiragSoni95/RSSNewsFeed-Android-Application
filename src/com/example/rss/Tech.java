package com.example.rss;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Tech extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tech);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tech, menu);
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
    		Intent v= new Intent(this,Settings.class);
    		startActivity(v);
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
	public void tech1(View v){
		
		Intent d= new Intent(this,D7.class);
		startActivity(d);
		
		
	}
	
	public void tech2(View v){
		
		Intent d= new Intent(this,D8.class);
		startActivity(d);
		
	}

	}
