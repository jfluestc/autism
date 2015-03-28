package com.example3.demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

public class Joke extends ActionBarActivity{

	Button btn_school,btn_family,btn_animal,btn_children,btn_work;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.joke);
		btn_school = (Button)findViewById(R.id.btn_school);
		btn_children = (Button)findViewById(R.id.btn_children);
		btn_animal = (Button)findViewById(R.id.btn_animal);
		btn_family = (Button)findViewById(R.id.btn_family);
		btn_work = (Button)findViewById(R.id.btn_work);
		
		btn_school.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Joke.this,Subjoke.class);
				Bundle bundle = new Bundle();
				bundle.putInt("code", 1);
				intent.putExtras(bundle);
				startActivity(intent);
			}
			
		});
		btn_children.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Joke.this,Subjoke.class);
				Bundle bundle = new Bundle();
				bundle.putInt("code", 2);
				intent.putExtras(bundle);
				startActivity(intent);
			}
		});
		btn_animal.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Joke.this,Subjoke.class);
				Bundle bundle = new Bundle();
				bundle.putInt("code", 3);
				intent.putExtras(bundle);
				startActivity(intent);
			}
		});
		btn_family.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Joke.this,Subjoke.class);
				Bundle bundle = new Bundle();
				bundle.putInt("code",4);
				intent.putExtras(bundle);
				startActivity(intent);
			}
			
		});
		btn_work.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Joke.this,Subjoke.class);
				Bundle bundle = new Bundle();
				bundle.putInt("code",5);
				intent.putExtras(bundle);
				startActivity(intent);
			}
		});
	}

}
