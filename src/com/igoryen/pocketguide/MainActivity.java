package com.igoryen.pocketguide;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
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
		
		
        Button bT = (Button) findViewById(R.id.term);
        final Intent i2 = new Intent("com.igoryen.pocketguide.SecondActivity");
        bT.setOnClickListener(new View.OnClickListener() {
        	public void onClick(View v) {
            	startActivity(i2);
        	}
    	});
        
        Button bW = (Button) findViewById(R.id.web);
        final Intent i3 = new Intent("com.igoryen.pocketguide.ThirdActivity");
        bW.setOnClickListener(new View.OnClickListener() {
        	public void onClick(View v) {
            	startActivity(i3);
        	}
    	});

		
		DisplayToast("In MainActivity/OnCreate()");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		//getMenuInflater().inflate(R.menu.main, menu);
		super.onCreateOptionsMenu(menu);
		CreateMenu(menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item){
		return MenuChoice(item);
	}
	
	private void CreateMenu(Menu menu){
        MenuItem help = menu.add(0, 0, 0, "Help");
        {         
            help.setShowAsAction(
            	MenuItem.SHOW_AS_ACTION_IF_ROOM |
                MenuItem.SHOW_AS_ACTION_WITH_TEXT);
        }
        MenuItem about = menu.add(0, 1, 1, "About");
        {            
            about.setShowAsAction(
            	MenuItem.SHOW_AS_ACTION_IF_ROOM |
                MenuItem.SHOW_AS_ACTION_WITH_TEXT);
        }
    }
 
    private boolean MenuChoice(MenuItem item){        
        switch (item.getItemId()) {
        case  android.R.id.home:
        	DisplayToast("You clicked on the Application icon");

            Intent i = new Intent(this, MainActivity.class);
            i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(i);

            return true;
        case 0:
        	DisplayToast("Terminology: Android words\nWebsites: Android dev websites\nLearning log: words you have viewed");
        	return true;
        case 1:
            DisplayToast("Made by: Igor Entaltsev, CPAC");
            return true;      
        }
        return false;
    }   

    private void DisplayToast(String msg){
    	Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
    }

}
