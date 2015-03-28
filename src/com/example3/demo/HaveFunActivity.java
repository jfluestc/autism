package com.example3.demo;

import android.app.ActivityGroup;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;


@SuppressWarnings("deprecation")
public class HaveFunActivity extends ActivityGroup {

	TabHost tab;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_havefun);
		tab = (TabHost)findViewById(R.id.tabhost2);
		tab.setBackgroundColor(Color.GRAY);
		
		tab.setup(getLocalActivityManager());
		
		TabHost.TabSpec spec = tab.newTabSpec("tab04");
		spec.setContent(new Intent(HaveFunActivity.this,Joke.class));
		spec.setIndicator("笑话锦集");
		tab.addTab(spec);

		
		spec = tab.newTabSpec("tab05");
		spec.setContent(new Intent(HaveFunActivity.this,Proverb.class));
		spec.setIndicator("心灵鸡汤");
		tab.addTab(spec);
		
		spec = tab.newTabSpec("tab06");
		spec.setContent(new Intent(HaveFunActivity.this,Game.class));
		spec.setIndicator("小游戏");
		tab.addTab(spec);
		
		tab.setCurrentTab(1);
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
