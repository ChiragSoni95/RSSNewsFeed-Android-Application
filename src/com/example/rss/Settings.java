package com.example.rss;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;



import android.os.Bundle;
import android.os.Environment;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.RadioGroup.OnCheckedChangeListener;

public class Settings extends Activity {
	String g="";
	Button b1;
	RadioGroup rg;
	RadioButton rb1, rb2, rb3, rb4;
String str;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_settings);
		b1=(Button)findViewById(R.id.b1);
		 rg = (RadioGroup) findViewById(R.id.rg);
				

	}
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.settings, menu);
		return true;
	}
	public boolean onOptionsItemSelected(MenuItem item){
    	switch(item.getItemId()){
    	
    	case R.id.homepage:
    		Intent i = new Intent(getBaseContext() , Act2.class);
			i.putExtra("home", true);
			startActivity(i);
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

		
		
		
		public void savecont(View v){
	
			int id;
			id=rg.getCheckedRadioButtonId();
			if(id==R.id.rb1)
			g="Sports";
			if(id==R.id.rb2)
			g="Entertainment";
			if(id==R.id.rb3)
			g="Politics";
			if(id==R.id.rb4)
			g="Technology";
			
			if(g.equals(""))
			 Toast.makeText(getBaseContext(),"choose one option",Toast.LENGTH_SHORT).show();
			else
				Toast.makeText(getBaseContext(),"filesaved",Toast.LENGTH_SHORT).show();
						
			try{
				
			FileOutputStream fOut = openFileOutput("textfile1.txt", MODE_PRIVATE); // File creation mode: allow all other applications to have read access to the created file.
			        OutputStreamWriter osw = new OutputStreamWriter(fOut);
		        
			   		  osw.write(g);
		
	         osw.close();
	         
}
			catch(Exception e){}

		
	}
  
		
	}
   
