package com.example3.demo;


import java.util.ArrayList;
import java.util.List;

import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Subproverb extends ActionBarActivity{
	
	TextView sub01;
	ListView listview;
	DBAdapter4 dba;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.subproverb);
		
		sub01 = (TextView)findViewById(R.id.sub01);
		listview = (ListView)findViewById(R.id.listview);
		listview.setChoiceMode(1);
		Bundle bundle = this.getIntent().getExtras();
		
		List<String> list = new ArrayList<String>();
	    dba = new DBAdapter4(this);
		dba.open();
		int code = bundle.getInt("code");
		Cursor cs;
/*		
		switch(code){
		
		case 1:
			sub01 = (TextView)findViewById(R.id.all);
			sub01.setText("励志版块正在建设中...");
		}
		case 2:
			sub01 = (TextView)findViewById(R.id.all);
			sub01.setText("事业版块正在建设中...");*/
		if(code == 1){
			cs = dba.selectContent(1);
			int i=1;
			cs.moveToFirst();
			while(!cs.isLast()){
				list.add(cs.getString(2));
				cs.moveToNext();
				i++;
				if(i==12)
					break;
			}
			cs.close();
			dba.close();
			ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list);
			listview.setAdapter(adapter);
			
			listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {

				@Override
				public void onItemClick(AdapterView<?> parent, View view,
						int position, long id) {
					// TODO Auto-generated method stub
				}
			});
		}
		else if(code == 2){
			cs = dba.selectContent(13);
			cs.moveToFirst();
			int i=13;
			while(!cs.isLast()){
				list.add(cs.getString(2));
				cs.moveToNext();
				i++;
				if(i==24)
					break;
			}
			cs.close();
			dba.close();
			ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list);
			listview.setAdapter(adapter);
			
			listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {

				@Override
				public void onItemClick(AdapterView<?> parent, View view,
						int position, long id) {
					// TODO Auto-generated method stub
					
				}
			});
		}
		else if(code == 3){
			cs = dba.selectContent(25);
			cs.moveToFirst();
			int i=25;
			while(!cs.isLast()){
				list.add(cs.getString(2));
				cs.moveToNext();
				i++;
				if(i==36)
					break;
			}
			cs.close();
			dba.close();
			ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list);
			listview.setAdapter(adapter);
			
			listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {

				@Override
				public void onItemClick(AdapterView<?> parent, View view,
						int position, long id) {
					// TODO Auto-generated method stub
					
				}
			});
		}
		else if(code == 4){
			cs = dba.selectContent(37);
			cs.moveToFirst();
			int i=37;
			while(!cs.isLast()){
				list.add(cs.getString(2));
				cs.moveToNext();
				i++;
				if(i==48)
					break;
			}
			cs.close();
			dba.close();
			ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list);
			listview.setAdapter(adapter);
			
			listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {

				@Override
				public void onItemClick(AdapterView<?> parent, View view,
						int position, long id) {
					// TODO Auto-generated method stub
					
				}
			});
		}
		else if(code == 5){
			cs = dba.selectContent(49);
			cs.moveToFirst();
			int i=49;
			while(!cs.isLast()){
				list.add(cs.getString(2));
				cs.moveToNext();
				i++;
				if(i==60)
					break;
			}
			cs.close();
			dba.close();
			ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list);
			listview.setAdapter(adapter);
			
			listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {

				@Override
				public void onItemClick(AdapterView<?> parent, View view,
						int position, long id) {
					// TODO Auto-generated method stub
					
				}
			});
		}
		else if(code == 6){
			cs = dba.selectContent(61);
			cs.moveToFirst();
			int i=61;
			while(!cs.isLast()){
				list.add(cs.getString(2));
				cs.moveToNext();
				i++;
				if(i==72)
					break;
			}
			cs.close();
			dba.close();
			ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list);
			listview.setAdapter(adapter);
			
			listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {

				@Override
				public void onItemClick(AdapterView<?> parent, View view,
						int position, long id) {
					// TODO Auto-generated method stub
					
				}
			});
		}
		else if(code == 7){
			cs = dba.selectContent(73);
			cs.moveToFirst();
			int i=73;
			while(!cs.isLast()){
				list.add(cs.getString(2));
				cs.moveToNext();
				i++;
				if(i==84)
					break;
			}
			cs.close();
			dba.close();
			ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list);
			listview.setAdapter(adapter);
			
			listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {

				@Override
				public void onItemClick(AdapterView<?> parent, View view,
						int position, long id) {
					// TODO Auto-generated method stub
					
				}
			});
		}
		else if(code == 8){
			cs = dba.selectContent(85);
			cs.moveToFirst();
			int i=85;
			while(!cs.isLast()){
				list.add(cs.getString(2));
				cs.moveToNext();
				i++;
				if(i==96)
					break;
			}
			cs.close();
			dba.close();
			ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list);
			listview.setAdapter(adapter);
			
			listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {

				@Override
				public void onItemClick(AdapterView<?> parent, View view,
						int position, long id) {
					// TODO Auto-generated method stub
					
				}
			});
		}
		else if(code == 9){
			cs = dba.selectContent(97);
			cs.moveToFirst();
			int i=97;
			while(!cs.isLast()){
				list.add(cs.getString(2));
				cs.moveToNext();
				i++;
				if(i==108)
					break;
			}
			cs.close();
			dba.close();
			ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list);
			listview.setAdapter(adapter);
			
			listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {

				@Override
				public void onItemClick(AdapterView<?> parent, View view,
						int position, long id) {
					// TODO Auto-generated method stub
					
				}
			});
		}
		else if(code == 10){
			cs = dba.selectContent(109);
			cs.moveToFirst();
			int i=109;
			while(!cs.isLast()){
				list.add(cs.getString(2));
				cs.moveToNext();
				i++;
				if(i==120)
					break;
			}
			cs.close();
			dba.close();
			ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list);
			listview.setAdapter(adapter);
			
			listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {

				@Override
				public void onItemClick(AdapterView<?> parent, View view,
						int position, long id) {
					// TODO Auto-generated method stub
					
				}
			});
		}
		else if(code == 11){
			cs = dba.selectContent(121);
			cs.moveToFirst();
			int i=121;
			while(!cs.isLast()){
				list.add(cs.getString(2));
				cs.moveToNext();
				i++;
				if(i==132)
					break;
			}
			cs.close();
			dba.close();
			ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list);
			listview.setAdapter(adapter);
			
			listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {

				@Override
				public void onItemClick(AdapterView<?> parent, View view,
						int position, long id) {
					// TODO Auto-generated method stub
					
				}
			});
		}
		else if(code == 12){
			cs = dba.selectContent(133);
			cs.moveToFirst();
			int i=133;
			while(!cs.isLast()){
				list.add(cs.getString(2));
				cs.moveToNext();
				i++;
				if(i==144)
					break;
			}
			cs.close();
			dba.close();
			ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list);
			listview.setAdapter(adapter);
			
			listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {

				@Override
				public void onItemClick(AdapterView<?> parent, View view,
						int position, long id) {
					// TODO Auto-generated method stub
					
				}
			});
		}
		else if(code == 13){
			cs = dba.selectContent(145);
			cs.moveToFirst();
			int i=145;
			while(!cs.isLast()){
				list.add(cs.getString(2));
				cs.moveToNext();
				i++;
				if(i==156)
					break;
			}
			cs.close();
			dba.close();
			ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list);
			listview.setAdapter(adapter);
			
			listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {

				@Override
				public void onItemClick(AdapterView<?> parent, View view,
						int position, long id) {
					// TODO Auto-generated method stub
					
				}
			});
		}
		else if(code == 14){
			cs = dba.selectContent(157);
			cs.moveToFirst();
			int i=157;
			while(!cs.isLast()){
				list.add(cs.getString(2));
				cs.moveToNext();
				i++;
				if(i==164)
					break;
			}
			cs.close();
			dba.close();
			ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list);
			listview.setAdapter(adapter);
			
			listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {

				@Override
				public void onItemClick(AdapterView<?> parent, View view,
						int position, long id) {
					// TODO Auto-generated method stub
					
				}
			});
		}
		else if(code == 15){
			cs = dba.selectContent(165);
			cs.moveToFirst();
			int i=165;
			while(!cs.isLast()){
				list.add(cs.getString(2));
				cs.moveToNext();
				i++;
				if(i==168)
					break;
			}
			cs.close();
			dba.close();
			ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list);
			listview.setAdapter(adapter);
			
			listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {

				@Override
				public void onItemClick(AdapterView<?> parent, View view,
						int position, long id) {
					// TODO Auto-generated method stub
					
				}
			});
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
