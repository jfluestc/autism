package com.example3.demo;

import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ScrollView;
import android.widget.TextView;

public class Allproverb extends ActionBarActivity{
	
	TextView all;
	ScrollView scrollview;
	DBAdapter4 dba;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.allproverb);
		
		all = (TextView)findViewById(R.id.all);
		scrollview = (ScrollView)findViewById(R.id.scrolview03);
		String[] cont = new String[168];
		int i = 0;
		dba = new DBAdapter4(this);
		dba.open();
		Cursor cs = dba.findall();
		cs.moveToFirst();
		do{
			cont[i]= cs.getString(2)+"¡ª¡ª"+cs.getString(1);
			i++;
			if(i==168)
				break;
		}while(cs.moveToNext());
		cs.close();
		dba.close();
		for(int j = 0;j<cont.length;j++){
			all.append(cont[j]);
			all.append("\n");
		}
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
