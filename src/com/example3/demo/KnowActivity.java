package com.example3.demo;

import android.support.v7.app.ActionBarActivity;
import android.database.Cursor;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;


public class KnowActivity extends ActionBarActivity {

	Button introduce,reason,express;
	TextView introview,reasonview,exprview;
	ScrollView sv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_know);	
		introduce = (Button)findViewById(R.id.button05);
		reason = (Button)findViewById(R.id.button06);
		express = (Button)findViewById(R.id.button07);
		introview = (TextView)findViewById(R.id.textview04);
		reasonview = (TextView)findViewById(R.id.textview05);
		sv = (ScrollView)findViewById(R.id.ScrollView);
		
		DBAdapter3 dba = new DBAdapter3(this);
		dba.open();
		Cursor cs,cs1,cs2,cs3;
		cs = dba.getContent(1);	
		cs1 = dba.getContent(2);
		cs2 = dba.getContent(3);
		cs3 = dba.getContent(4);
		cs.moveToFirst();
		final String content = cs.getString(1);
		cs.close();
		cs1.moveToFirst();
		final String content1 = cs1.getString(1);
		cs1.close();
		cs2.moveToFirst();
		final String content2 = cs2.getString(1);
		cs2.close();
		cs3.moveToFirst();
		final String content3 = cs3.getString(1);
		cs3.close();
		dba.close();
				
		introduce.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				introview.setText(content);
				reasonview.setText(content1);
				// TODO Auto-generated method stub
			}
		});
		reason.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				introview.setText(content2);
				reasonview.setText("");
			}
		});
		express.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				introview.setText(content3);
				reasonview.setText("");
			}
		});
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
