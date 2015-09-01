package com.bappi.gitreference;

import android.os.Bundle;
import android.app.Activity;
import android.widget.ListView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		ListView mListView = (ListView) findViewById(R.id.git_all_command_list);
		mListView.setAdapter(new CustomListView(getApplicationContext()));
		
	}

}
