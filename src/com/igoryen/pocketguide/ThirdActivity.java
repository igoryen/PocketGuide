package com.igoryen.pocketguide;

//import android.app.ActionBar;
//import android.app.Activity;
import android.app.ListActivity;
//import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.TextView;
import android.widget.ArrayAdapter;
import android.widget.Toast;
import android.widget.ListView;


public class ThirdActivity extends ListActivity{// ListActivity! NOT Activity
	
	String[] websites;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.thirdactivity);
		/*
		//===============================================

		ListView lstView = (ListView)findViewById(android.R.id.list); 
		lstView.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);        
        lstView.setTextFilterEnabled(true);

        websites = getResources().getStringArray(R.array.websites_array);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_dropdown_item_1line, websites);
        setListAdapter(adapter);
    	//---------------------------------------------------
		ListView list = getListView();
		list.setTextFilterEnabled(true);
		list.setOnItemClickListener(new OnItemClickListener(){ 
			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
				//Log.d(tag, msg))//
				Toast.makeText(getApplicationContext(), ((TextView) arg1).getText(), Toast.LENGTH_LONG).show();
			}
		});
		//------------------------------------------------
		//DisplayToast("In ThirdActivity/OnCreate()");
		//=================================================
		*/
        ListView lstView = getListView();
		lstView.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);        
        lstView.setTextFilterEnabled(true);

        websites = getResources().getStringArray(R.array.websites_array);

        setListAdapter(new ArrayAdapter<String>(this,
            android.R.layout.simple_list_item_1, websites));
        
		Log.d("Log", "Third: Third activity is loaded");
    }
	//==================


	//==================
    	
    public void onListItemClick(ListView parent, View v, int position, long id){
    	switch(position){
    	case 0: // developer android
        	Log.d("Log", "Third: List item 1 was clicked");
        	DisplayToast("The official google android development website");
        	return;
    	case 1: // vogella
        	Log.d("Log", "Third: List item 2 was clicked");
        	DisplayToast("Expert Android and Eclipse development knowledge");
        	return;
    	case 2:// <item>www.mylifewithandroid.blogspot.ca</item>
        	Log.d("Log", "Third: List item 3 was clicked");
        	DisplayToast("A personal blog by Gabor Paller (Hungary)");
        	return;
    	case 3: // <item>www.technotalkative.com</item>
        	Log.d("Log", "Third: List item 4 was clicked");
        	DisplayToast("Lots of Tutorials");
        	return;
    	case 4: //     <item>www.thenewboston.org</item>
        	Log.d("Log", "Third: List item 5 was clicked");
        	DisplayToast("Another guy");
        	return;
    	case 5://     <item>www.thenewcircle.com</item>
        	Log.d("Log", "Third: List item 6 was clicked");
        	DisplayToast("Dev support and more");
        	return;
    	case 6: //     <item>www.androidcentral.com</item>
        	Log.d("Log", "Third: List item 7 was clicked");
        	DisplayToast("The center of the Android Universe - featuring news, reviews, help & tips");
        	return;
    	case 7: //    <item>www.lynda.com</item>
        	Log.d("Log", "Third: List item 8 was clicked");
        	DisplayToast("Learn software, creative, and business skills to achieve your personal and professional goals.");
        	return;
    	case 8://     <item>www.androidtapp.com</item>
        	Log.d("Log", "Third: List item 9 was clicked");
        	DisplayToast("Android App Recommendations from Experts");
        	return;
    	case 9://     <item>www.androidzoom.com</item>
        	Log.d("Log", "Third: List item 10 was clicked");
        	DisplayToast("People who are open to new suggestions and ideas, and willing to fix any bug");
        	return;
    	case 10: //    <item>www.androidandme.com</item>
        	Log.d("Log", "Third: List item 11 was clicked");
    		DisplayToast("Covers all the latest Android news, phone launches, app reviews, software updates, Android hacks, and phone accessories.");
        	return;
    	case 11: // android.authority
        	Log.d("Log", "Third: List item 12 was clicked");
    		DisplayToast("Android News blog dedicated to providing expert tips, news, reviews");
    		return;
        }
    }
    
	
	private void DisplayToast(String msg){
    	Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
    	Log.d("Log", "Third: Toast fired");
    }
}
		
      

      
		    
	

