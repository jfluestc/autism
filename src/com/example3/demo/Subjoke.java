package com.example3.demo;

import java.util.ArrayList;
import java.util.List;

import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Subjoke extends ActionBarActivity{

	ListView listview;
	TextView sub02;
	DBAdapter4 dba;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.subjoke);
		
		sub02 = (TextView)findViewById(R.id.sub02);
		listview =(ListView)findViewById(R.id.listview);
		listview.setChoiceMode(1);
		Bundle bundle = this.getIntent().getExtras();
		int code = bundle.getInt("code");
		List<String> list = new ArrayList<String>();
		dba = new DBAdapter4(this);
		dba.open();
		Cursor cs;
		
		if(code==1){
			cs = dba.selectContent(168);
			int i=169;
			cs.moveToFirst();
			while(!cs.isLast()){
				list.add(cs.getString(2));
				cs.moveToNext();
				i++;
				if(i==179)
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
		else if(code==2){
			cs = dba.selectContent(178);
			int i=179;
			cs.moveToFirst();
			while(!cs.isLast()){
				list.add(cs.getString(2));
				cs.moveToNext();
				i++;
				if(i==189)
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
		else if(code==3){
			cs = dba.selectContent(188);
			int i=189;
			cs.moveToFirst();
			while(!cs.isLast()){
				list.add(cs.getString(2));
				cs.moveToNext();
				i++;
				if(i==199)
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
		else if(code==4){
			cs = dba.selectContent(198);
			int i=199;
			cs.moveToFirst();
			while(!cs.isLast()){
				list.add(cs.getString(2));
				cs.moveToNext();
				i++;
				if(i==209)
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
		else if(code==5){
			cs = dba.selectContent(208);
			int i=209;
			cs.moveToFirst();
			while(!cs.isLast()){
				list.add(cs.getString(2));
				cs.moveToNext();
				i++;
				if(i==219)
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
	
}
