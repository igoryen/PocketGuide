package com.igoryen.pocketguide;

//import android.app.ActionBar;
import android.app.Activity;
import android.app.ListActivity;
//import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;;


public class SecondActivity extends ListActivity{
	
	String[] terminology;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.secondactivity);
		
		terminology = getResources().getStringArray(R.array.terminology_array);
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_dropdown_item_1line, terminology);
	    
		AutoCompleteTextView textView = (AutoCompleteTextView)findViewById(R.id.terms);

        /*
		//---------------------------------------------------
		//setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, terminology));
		setListAdapter(adapter);
		ListView list = getListView();
		list.setTextFilterEnabled(true);
		list.setOnItemClickListener(new OnItemClickListener(){ 

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
				Toast.makeText(getApplicationContext(), ((TextView)arg1).getText(), Toast.LENGTH_LONG).show();
			}
			
		});
		//-------------------------------------------------
		 * 
		 */
        textView.setThreshold(3);
        textView.setAdapter(adapter);

	}
	
	private void DisplayToast(String msg){
    	Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
    }
}
