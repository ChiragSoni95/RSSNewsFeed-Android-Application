package com.example.rss;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Toast;

public class Act2 extends Activity {

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_ACTION_BAR);

		setContentView(R.layout.activity_act2);
	
		boolean value = getIntent().getBooleanExtra("exit", false);
		boolean home = getIntent().getBooleanExtra("home", false);
		
	if(value)
	{
		moveTaskToBack(true);
		finish();
	}
	else if(home)
		Toast.makeText(getApplicationContext(), "Homepage", Toast.LENGTH_SHORT).show();
	else
	{
		File f = getBaseContext().getFileStreamPath("textfile1.txt");

		if(f.exists())
		{
		try
		{
		FileInputStream fis= openFileInput("textfile1.txt");
		int c;
		String temp = "";
		while((c = fis.read()) >0)
		{
		temp += Character.toString((char)c);
		}

		Intent i;
		if(temp.equals("Sports"))
		{
		i = new Intent(Act2.this, Sports.class);
		startActivity(i);
		}

		if(temp.equals("Entertainment"))
		{
			i = new Intent(Act2.this, Ent.class);
			startActivity(i);
		}
		
		if(temp.equals("Politics"))
		{
			i = new Intent(Act2.this , Pol.class);
			startActivity(i);
		}
		
		if(temp.equals("Technology"))
		{
		i = new Intent(Act2.this, Tech.class);
		startActivity(i);
		}

		
		}
			
		catch (FileNotFoundException e) 
		{
		e.printStackTrace();
		} 
		catch (IOException e)
		{
		e.printStackTrace();
		}
		}
	}
				
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.act2, menu);
		return true;
	}

	public boolean onOptionsItemSelected(MenuItem item){
    	switch(item.getItemId()){
    	case R.id.sports:
    		Intent i= new Intent(this,Sports.class);
    		startActivity(i);
    		return true;
    		
    		
    	case R.id.entertainment:
    		Intent ii= new Intent(this,Ent.class);
    		startActivity(ii);
    		return true;
    		
    	case R.id.politics:
    		Intent iii= new Intent(this,Pol.class);
    		startActivity(iii);
    		return true;
    		
    	case R.id.technology:
    		Intent vi= new Intent(this,Tech.class);
    		startActivity(vi);
    		return true;
           
    	case R.id.settings:
    		Intent v= new Intent(this,Settings.class);
    		startActivity(v);
    		return true;
    	
    		
    	case R.id.exit:
    		Intent iv=new Intent(getBaseContext(),Act2.class); 
    		iv.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); 
    		iv.putExtra("exit", true); 
    		startActivity(iv); 
    		return true;	
    	default:
    		return false; 
    	}

	
	
	}
	

	
	public void sports1(View v){
		
		Intent d= new Intent(this,D1.class);
		startActivity(d);
		
	}
	
	
	
public void sports2(View v){
		
		Intent d= new Intent(this,D2.class);
		startActivity(d);
		
	}


public void ent1(View v){
	
	Intent d= new Intent(this,D3.class);
	startActivity(d);
	
}
public void ent2(View v){
	
	Intent d= new Intent(this,D4.class);
	startActivity(d);
	
}

public void pol1(View v){
	
	Intent d= new Intent(this,D5.class);
	startActivity(d);
	
}
public void pol2(View v){
	
	Intent d= new Intent(this,D6.class);
	startActivity(d);
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

