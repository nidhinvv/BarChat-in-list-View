package com.example.barchartlistview;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {
	
	ListView lvChartlist;
	String[] values;
	CustomSuggestionActivity customsuggestion;
	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		lvChartlist = (ListView) findViewById(R.id.listviewChart);
		values = new String[] { "Android List View", 
                "Adapter implementation",
                "Simple List View In Android",
                "Create List View Android", 
                "Android Example", 
                "List View Source Code", 
                "Create List View Android", 
                "Android Example", 
                "List View Source Code", 
                "Create List View Android", 
                "Android Example", 
                "List View Source Code", 
                "List View Array Adapter", 
                "Android Example List View" 
               };
		   /*ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
		              android.R.layout.simple_list_item_1, android.R.id.text1, values);*/
		   customsuggestion = new CustomSuggestionActivity(
				   MainActivity.this, values);
		   
		   lvChartlist.setAdapter(customsuggestion); 
		  

	}
}