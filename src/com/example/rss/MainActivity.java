package com.example.rss;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;


public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		// Create Thread that will sleep for 5 seconds
		 Thread background = new Thread() {  
	            public void run() {
	                 
	                try {
	                    // Thread will sleep for 5 seconds
	                    sleep(5*1000);
	                     
	                    // After 5 seconds redirect to another intent
	                    Intent i=new Intent(getBaseContext(),Act2.class);
	                    startActivity(i);
	                    	                     
	                    //Remove activity
	                    finish();
	                     
	                } catch (Exception e) {
	                 
	                }
	            }
	        };
	         
	        //start thread
	    background.start();
	}

	 protected void onDestroy() {
         
	        super.onDestroy();
	         
	    }

}
