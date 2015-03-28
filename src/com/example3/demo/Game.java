package com.example3.demo;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;

public class Game extends ActionBarActivity{

	TextView tv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.game);
		tv = (TextView)findViewById(R.id.tv01);
		tv.setText("这是小游戏板块  正在建设中...");
	}

}
