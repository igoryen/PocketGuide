package com.igoryen.pocketguide;

//import android.app.ActionBar;
import android.app.Activity;
//import android.app.ListActivity;
//import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;
//import android.widget.ListView;


public class SecondActivity extends Activity{
	
	String[] terminology;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.secondactivity);
		
		terminology = getResources().getStringArray(R.array.terminology_array);
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_dropdown_item_1line, terminology);

	    AutoCompleteTextView textView = (AutoCompleteTextView)findViewById(R.id.terms);

	        textView.setThreshold(3);
	        textView.setAdapter(adapter);
	}
	
	private void DisplayToast(String msg){
    	Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
    }
}
