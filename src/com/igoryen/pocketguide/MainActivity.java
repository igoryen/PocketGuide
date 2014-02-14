package com.igoryen.pocketguide;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
//import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;
import android.view.View;

@SuppressLint("NewApi")
public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		ActionBar actionBar = getActionBar();
		actionBar.setDisplayHomeAsUpEnabled(true);
		
		
        Button TermButton = (Button) findViewById(R.id.term);
        final Intent i2 = new Intent("com.igoryen.pocketguide.SecondActivity");
        TermButton.setOnClickListener(new View.OnClickListener() {
        	public void onClick(View v) {
            	startActivity(i2);
            	Log.d("Log", "Main: Terminology Button called SecondActivity");
        	}
    	});
        
        Button WebButton = (Button) findViewById(R.id.web);
        final Intent i3 = new Intent("com.igoryen.pocketguide.ThirdActivity");
        WebButton.setOnClickListener(new View.OnClickListener() {
        	public void onClick(View v) {
            	startActivity(i3);
            	Log.d("Log", "Main: Websites Button called ThirdActivity");
        	}
    	});

        Button LogButton = (Button) findViewById(R.id.log);
        LogButton.setOnClickListener(new View.OnClickListener() {
        	public void onClick(View v) {
            	Log.d("Log", "Main: Learning Log Button was clicked");
        		DisplayToast("UNDER CONSTRUCTION");
        	}
    	});

		Log.d("Log", "Main: Main activity is loaded");
		//DisplayToast("In MainActivity/OnCreate()");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		//getMenuInflater().inflate(R.menu.main, menu);
		super.onCreateOptionsMenu(menu);
		CreateMenu(menu);
    	Log.d("Log", "Main: Menu is created");
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item){
		return MenuChoice(item);
	}
	
	private void CreateMenu(Menu menu){
        MenuItem help = menu.add(5, 5, 5, "Help");
        {         
            help.setShowAsAction(
            	MenuItem.SHOW_AS_ACTION_NEVER |
                MenuItem.SHOW_AS_ACTION_WITH_TEXT);
            Log.d("Main", "'Help' menu is set up");
        }
        MenuItem about = menu.add(6, 6, 6, "About");
        {            
            about.setShowAsAction(
            	MenuItem.SHOW_AS_ACTION_NEVER |
                MenuItem.SHOW_AS_ACTION_WITH_TEXT);
            Log.d("Main", "'About' menu is set up");
        }
    	Log.d("Log", "Main: Action Bar menu is created");
    }
 
    private boolean MenuChoice(MenuItem item){        
        switch (item.getItemId()) {
        case  android.R.id.home:
        	Log.d("Log", "Main: Action Bar menu is clicked");
        	DisplayToast("You clicked on the Application icon");
           // Intent i = new Intent(this, MainActivity.class);
           // i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
           // startActivity(i);

            return true;
        case 5:
        	Log.d("Log", "Main: Action Bar Help menu is clicked");
        	DisplayToast("Terminology: Android words\nWebsites: Android dev websites\nLearning log: words you have viewed");
        	return true;
        case 6:
            Log.d("Log", "Main: Action Bar About menu is clicked");
            DisplayToast("Made by: Igor Entaltsev, CPAC");
            return true;      
        }
        return false;
    }   

    private void DisplayToast(String msg){
    	Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
    	Log.d("Log", "Main: Toast fired");
    }

}
