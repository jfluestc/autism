package com.example3.demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

public class Proverb extends ActionBarActivity{

	Button btn_all,btn_motivational,btn_career;
	Button btn_life,btn_time,btn_love;
	Button btn_sf,btn_study,btn_morality;
	Button btn_science,btn_youth,btn_friendship;
	Button btn_team,btn_confidence,btn_struggle;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.proverb);
		btn_all = (Button)findViewById(R.id.btn_all);
		btn_motivational = (Button)findViewById(R.id.btn_motivational);
		btn_life = (Button)findViewById(R.id.btn_life);
		btn_career = (Button)findViewById(R.id.btn_career);
		btn_time = (Button)findViewById(R.id.btn_time);
		btn_love = (Button)findViewById(R.id.btn_love);
		btn_sf = (Button)findViewById(R.id.btn_sf);
		btn_study = (Button)findViewById(R.id.btn_study);
		btn_morality = (Button)findViewById(R.id.btn_morality);
		btn_science = (Button)findViewById(R.id.btn_science);
		btn_youth = (Button)findViewById(R.id.btn_youth);
		btn_friendship = (Button)findViewById(R.id.btn_friendship);
		btn_team = (Button)findViewById(R.id.btn_team);
		btn_confidence = (Button)findViewById(R.id.btn_confidence);
		btn_struggle = (Button)findViewById(R.id.btn_struggle);
		
		btn_all.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Proverb.this,Allproverb.class);
				startActivity(intent);
			}
		});
		btn_motivational.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Proverb.this,Subproverb.class);
				Bundle bundle = new Bundle();
				bundle.putInt("code", 1);
				intent.putExtras(bundle);
				startActivity(intent);
			}
		});
		btn_life.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Proverb.this,Subproverb.class);
				Bundle bundle = new Bundle();
				bundle.putInt("code", 2);
				intent.putExtras(bundle);
				startActivity(intent);
			}
			
		});
		btn_career.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Proverb.this,Subproverb.class);
				Bundle bundle = new Bundle();
				bundle.putInt("code", 3);
				intent.putExtras(bundle);
				startActivity(intent);
			}
			
		});
		btn_time.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Proverb.this,Subproverb.class);
				Bundle bundle = new Bundle();
				bundle.putInt("code", 4);
				intent.putExtras(bundle);
				startActivity(intent);
			}
		});
		btn_love.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Proverb.this,Subproverb.class);
				Bundle bundle = new Bundle();
				bundle.putInt("code", 5);
				intent.putExtras(bundle);
				startActivity(intent);
			}
			
		});
		btn_sf.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Proverb.this,Subproverb.class);
				Bundle bundle = new Bundle();
				bundle.putInt("code", 6);
				intent.putExtras(bundle);
				startActivity(intent);
			}
			
		});
		btn_study.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Proverb.this,Subproverb.class);
				Bundle bundle = new Bundle();
				bundle.putInt("code", 7);
				intent.putExtras(bundle);
				startActivity(intent);
			}
		});
		btn_morality.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Proverb.this,Subproverb.class);
				Bundle bundle = new Bundle();
				bundle.putInt("code", 8);
				intent.putExtras(bundle);
				startActivity(intent);
			}
			
		});
		btn_science.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Proverb.this,Subproverb.class);
				Bundle bundle = new Bundle();
				bundle.putInt("code", 9);
				intent.putExtras(bundle);
				startActivity(intent);
			}
			
		});
		btn_youth.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Proverb.this,Subproverb.class);
				Bundle bundle = new Bundle();
				bundle.putInt("code", 10);
				intent.putExtras(bundle);
				startActivity(intent);
			}
		});
		btn_friendship.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Proverb.this,Subproverb.class);
				Bundle bundle = new Bundle();
				bundle.putInt("code", 11);
				intent.putExtras(bundle);
				startActivity(intent);
			}
			
		});
		btn_team.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Proverb.this,Subproverb.class);
				Bundle bundle = new Bundle();
				bundle.putInt("code", 12);
				intent.putExtras(bundle);
				startActivity(intent);
			}
			
		});
		btn_confidence.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Proverb.this,Subproverb.class);
				Bundle bundle = new Bundle();
				bundle.putInt("code", 13);
				intent.putExtras(bundle);
				startActivity(intent);
			}
			
		});
		btn_struggle.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Proverb.this,Subproverb.class);
				Bundle bundle = new Bundle();
				bundle.putInt("code", 14);
				intent.putExtras(bundle);
				startActivity(intent);
			}
			
		});
		
	}
}

