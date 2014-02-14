package com.igoryen.pocketguide;

//import android.app.ActionBar;
//import android.app.Activity;
import android.app.ListActivity;
//import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;
import android.widget.ListView;


public class ThirdActivity extends ListActivity{// ListActivity! NOT Activity
	
	String[] websites;
	

	String[] terminology;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.thirdactivity);

		ListView lstView = (ListView)findViewById(android.R.id.list); 
		lstView.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);        
        lstView.setTextFilterEnabled(true);

        websites = getResources().getStringArray(R.array.websites_array);
        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, websites));

		DisplayToast("In ThirdActivity/OnCreate()");
	}

	public void onListItemClick(
		ListView parent, View v, int position, long id){
			Toast.makeText(this, "You have selected " + websites[position], Toast.LENGTH_SHORT).show();
	 	}

		    public void onClick(View view) {
		    	ListView lstView = getListView();

		    	String itemsSelected = "Selected items: \n";
		    	for (int i=0; i<lstView.getCount(); i++) {
		    		if (lstView.isItemChecked(i)) {
		    			itemsSelected += lstView.getItemAtPosition(i) + "\n";
		    		}
		    	}
		    	Toast.makeText(this, itemsSelected, Toast.LENGTH_LONG).show();
		    }

	private void DisplayToast(String msg){
    	Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
    }
}
		
      

      
		    
	

