package com.example3.demo;

import android.support.v7.app.ActionBarActivity;
import android.database.Cursor;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;

public class TestActivity extends ActionBarActivity {

	GestureDetector mgesturedetector;
	RadioGroup group01,group02,group03,group04,group05;
	RadioGroup group06,group07,group08,group09,group10;
	RadioButton rbtn11,rbtn12,rbtn13,rbtn14;
	RadioButton rbtn21,rbtn22,rbtn23,rbtn24;
	RadioButton rbtn31,rbtn32,rbtn33,rbtn34;
	RadioButton rbtn41,rbtn42,rbtn43,rbtn44;
	RadioButton rbtn51,rbtn52,rbtn53,rbtn54;
	RadioButton rbtn61,rbtn62,rbtn63,rbtn64;
	RadioButton rbtn71,rbtn72,rbtn73,rbtn74;
	RadioButton rbtn81,rbtn82,rbtn83,rbtn84;
	RadioButton rbtn91,rbtn92,rbtn93,rbtn94;
	RadioButton rbtn101,rbtn102,rbtn103,rbtn104;
	TextView question01,question02,question03,question04,
	question05,question06,question07,question08,question09,question10;
	TextView tv;
	Button submit;
	ScrollView sview;
	DBAdapter dba;
	DBAdapter2 dba2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_test);	
		
		tv = (TextView)findViewById(R.id.TV);
		group01 = (RadioGroup)findViewById(R.id.group01);
		group02 = (RadioGroup)findViewById(R.id.group02);
		group03 = (RadioGroup)findViewById(R.id.group03);
		group04 = (RadioGroup)findViewById(R.id.group04);
		group05 = (RadioGroup)findViewById(R.id.group05);
		group06 = (RadioGroup)findViewById(R.id.group06);
		group07 = (RadioGroup)findViewById(R.id.group07);
		group08 = (RadioGroup)findViewById(R.id.group08);
		group09 = (RadioGroup)findViewById(R.id.group09);
		group10 = (RadioGroup)findViewById(R.id.group10);
		rbtn11 = (RadioButton)findViewById(R.id.rbtn11);
		rbtn12 = (RadioButton)findViewById(R.id.rbtn12);
		rbtn13 = (RadioButton)findViewById(R.id.rbtn13);
		rbtn14 = (RadioButton)findViewById(R.id.rbtn14);
		rbtn21 = (RadioButton)findViewById(R.id.rbtn21);
		rbtn22 = (RadioButton)findViewById(R.id.rbtn22);
		rbtn23 = (RadioButton)findViewById(R.id.rbtn23);
		rbtn24 = (RadioButton)findViewById(R.id.rbtn24);
		rbtn31 = (RadioButton)findViewById(R.id.rbtn31);
		rbtn32 = (RadioButton)findViewById(R.id.rbtn32);
		rbtn33 = (RadioButton)findViewById(R.id.rbtn33);
		rbtn34 = (RadioButton)findViewById(R.id.rbtn34);
		rbtn41 = (RadioButton)findViewById(R.id.rbtn41);
		rbtn42 = (RadioButton)findViewById(R.id.rbtn42);
		rbtn43 = (RadioButton)findViewById(R.id.rbtn43);
		rbtn44 = (RadioButton)findViewById(R.id.rbtn44);
		rbtn51 = (RadioButton)findViewById(R.id.rbtn51);
		rbtn52 = (RadioButton)findViewById(R.id.rbtn52);
		rbtn53 = (RadioButton)findViewById(R.id.rbtn53);
		rbtn54 = (RadioButton)findViewById(R.id.rbtn54);
		rbtn61 = (RadioButton)findViewById(R.id.rbtn61);
		rbtn62 = (RadioButton)findViewById(R.id.rbtn62);
		rbtn63 = (RadioButton)findViewById(R.id.rbtn63);
		rbtn64 = (RadioButton)findViewById(R.id.rbtn64);
		rbtn71 = (RadioButton)findViewById(R.id.rbtn71);
		rbtn72 = (RadioButton)findViewById(R.id.rbtn72);
		rbtn73 = (RadioButton)findViewById(R.id.rbtn73);
		rbtn74 = (RadioButton)findViewById(R.id.rbtn74);
		rbtn81 = (RadioButton)findViewById(R.id.rbtn81);
		rbtn82 = (RadioButton)findViewById(R.id.rbtn82);
		rbtn83 = (RadioButton)findViewById(R.id.rbtn83);
		rbtn84 = (RadioButton)findViewById(R.id.rbtn84);
		rbtn91 = (RadioButton)findViewById(R.id.rbtn91);
		rbtn92 = (RadioButton)findViewById(R.id.rbtn92);
		rbtn93 = (RadioButton)findViewById(R.id.rbtn93);
		rbtn94 = (RadioButton)findViewById(R.id.rbtn94);
		rbtn101 = (RadioButton)findViewById(R.id.rbtn101);
		rbtn102 = (RadioButton)findViewById(R.id.rbtn102);
		rbtn103 = (RadioButton)findViewById(R.id.rbtn103);
		rbtn104 = (RadioButton)findViewById(R.id.rbtn104);
		question01 = (TextView)findViewById(R.id.question01);
		question02 = (TextView)findViewById(R.id.question02);
		question03 = (TextView)findViewById(R.id.question03);
		question04 = (TextView)findViewById(R.id.question04);
		question05 = (TextView)findViewById(R.id.question05);
		question06 = (TextView)findViewById(R.id.question06);
		question07 = (TextView)findViewById(R.id.question07);
		question08 = (TextView)findViewById(R.id.question08);
		question09 = (TextView)findViewById(R.id.question09);
		question10 = (TextView)findViewById(R.id.question10);

		dba = new DBAdapter(this);
	    dba.open();
		Cursor cs = dba.getAContent();
		int i = 1;
		cs.moveToFirst();
		while(!cs.isAfterLast()){
			if(i == 1)
				question01.setText(cs.getString(1));
			else if(i == 2)
				question02.setText(cs.getString(1));
			else if(i == 3)
				question03.setText(cs.getString(1));
			else if(i == 4)
				question04.setText(cs.getString(1));
			else if(i == 5)
				question05.setText(cs.getString(1));
			else if(i == 6)
				question06.setText(cs.getString(1));
			else if(i == 7)
				question07.setText(cs.getString(1));
			else if(i == 8)
				question08.setText(cs.getString(1));
			else if(i == 9)
				question09.setText(cs.getString(1));
			else if(i == 10)
				question10.setText(cs.getString(1));
			i++;
			cs.moveToNext();
		}
		cs.close();
		dba.close();
		dba2 = new DBAdapter2(this);
		dba2.open();
		Cursor cs2 = dba2.getAContent();
		cs2.moveToFirst();
		int j = 1;
		while(!cs2.isAfterLast()){
			if(j == 1){
				rbtn11.setText(cs2.getString(1));
				rbtn12.setText(cs2.getString(2));
				rbtn13.setText(cs2.getString(3));
				rbtn14.setText(cs2.getString(4));
			}
			else if(j ==2){
				rbtn21.setText(cs2.getString(1));
				rbtn22.setText(cs2.getString(2));
				rbtn23.setText(cs2.getString(3));
				rbtn24.setText(cs2.getString(4));
			}
			else if(j == 3){
				rbtn31.setText(cs2.getString(1));
				rbtn32.setText(cs2.getString(2));
				rbtn33.setText(cs2.getString(3));
				rbtn34.setText(cs2.getString(4));
			}
			else if(j == 4){
				rbtn41.setText(cs2.getString(1));
				rbtn42.setText(cs2.getString(2));
				rbtn43.setText(cs2.getString(3));
				rbtn44.setText(cs2.getString(4));
			}
			else if(j == 5){
				rbtn51.setText(cs2.getString(1));
				rbtn52.setText(cs2.getString(2));
				rbtn53.setText(cs2.getString(3));
				rbtn54.setText(cs2.getString(4));
			}
			else if(j == 6){
				rbtn61.setText(cs2.getString(1));
				rbtn62.setText(cs2.getString(2));
				rbtn63.setText(cs2.getString(3));
				rbtn64.setText(cs2.getString(4));
			}
			else if(j == 7){
				rbtn71.setText(cs2.getString(1));
				rbtn72.setText(cs2.getString(2));
				rbtn73.setText(cs2.getString(3));
				rbtn74.setText(cs2.getString(4));
			}
			else if(j == 8){
				rbtn81.setText(cs2.getString(1));
				rbtn82.setText(cs2.getString(2));
				rbtn83.setText(cs2.getString(3));
				rbtn84.setText(cs2.getString(4));
			}
			else if(j == 9){
				rbtn91.setText(cs2.getString(1));
				rbtn92.setText(cs2.getString(2));
				rbtn93.setText(cs2.getString(3));
				rbtn94.setText(cs2.getString(4));
			}
			else if(j == 10){
				rbtn101.setText(cs2.getString(1));
				rbtn102.setText(cs2.getString(2));
				rbtn103.setText(cs2.getString(3));
				rbtn104.setText(cs2.getString(4));
			}
			j++;
			cs2.moveToNext();
		}
		cs2.close();
		dba2.close();
		final int k[] = new int[11];
		group01.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				if(checkedId == rbtn11.getId())
					k[0] = k[0]+1;
				else if(checkedId == rbtn12.getId())
					k[0] = k[0]+2;
				else if(checkedId == rbtn13.getId())
					k[0] = k[0]+3;
				else 
					k[0] = k[0]+4;
			}
		});
		group02.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				if(checkedId == rbtn21.getId())
					k[1] = k[1]+1;
				else if(checkedId == rbtn22.getId())
					k[1] = k[1]+2;
				else if(checkedId == rbtn23.getId())
					k[1] = k[1]+3;
				else 
					k[1] = k[1]+4;
			}
		});
		group03.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				if(checkedId == rbtn31.getId())
					k[2] = k[2]+1;
				else if(checkedId == rbtn32.getId())
					k[2] = k[2]+2;
				else if(checkedId == rbtn33.getId())
					k[2] = k[2]+3;
				else 
					k[2] = k[2]+4;
			}
		});
		group04.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				if(checkedId == rbtn41.getId())
					k[3] = k[3]+1;
				else if(checkedId == rbtn42.getId())
					k[3] = k[3]+2;
				else if(checkedId == rbtn43.getId())
					k[3] = k[3]+3;
				else 
					k[3] = k[3]+4;
			}
		});
		group05.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				if(checkedId == rbtn41.getId())
					k[4] = 1;
				else if(checkedId == rbtn42.getId())
					k[4] = 2;
				else if(checkedId == rbtn43.getId())
					k[4] = 3;
				else 
					k[4] = 4;
			}
		});
		group06.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				if(checkedId == rbtn61.getId())
					k[5] = k[5]+1;
				else if(checkedId == rbtn62.getId())
					k[5] = k[5]+2;
				else if(checkedId == rbtn63.getId())
					k[5] = k[5]+3;
				else 
					k[5] = k[5]+4;
			}
		});
		group07.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				if(checkedId == rbtn71.getId())
					k[6] = k[6]+1;
				else if(checkedId == rbtn72.getId())
					k[6] = k[6]+2;
				else if(checkedId == rbtn73.getId())
					k[6] = k[6]+3;
				else 
					k[6] = k[6]+4;
			}
		});
		group08.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				if(checkedId == rbtn81.getId())
					k[7] = k[7]+1;
				else if(checkedId == rbtn82.getId())
					k[7] = k[7]+2;
				else if(checkedId == rbtn83.getId())
					k[7] = k[7]+3;
				else 
					k[7] = k[7]+4;
			}
		});
		group09.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				if(checkedId == rbtn91.getId())
					k[8] = k[8] + 1;
				else if(checkedId == rbtn92.getId())
					k[8] = k[8] + 2;
				else if(checkedId == rbtn93.getId())
					k[8] = k[8] + 3;
				else
					k[8] = k[8] + 4;
			}
		});
		group10.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				if(checkedId == rbtn101.getId())
					k[9] = k[9] + 1;
				else if(checkedId == rbtn102.getId())
					k[9] = k[9] + 2;
				else if(checkedId == rbtn103.getId())
					k[9] = k[9] + 3;
				else 
					k[9] = k[9] + 4;
			}
		});
		/*int sum = 0;
		final int summ;
		int[] a = new int[1];
		a[0]=0;
		checklistener cl = new checklistener(a,rbtn11,rbtn12,rbtn13,rbtn14);
		group01.setOnCheckedChangeListener(cl);
		sum = sum +a[0];
		checklistener c2 = new checklistener(a,rbtn21,rbtn22,rbtn23,rbtn24);
		group02.setOnCheckedChangeListener(c2);
		sum = sum +a[0];
		checklistener c3 = new checklistener(a,rbtn31,rbtn32,rbtn33,rbtn34);
		group03.setOnCheckedChangeListener(c3);
		sum = sum +a[0];
		checklistener c4 = new checklistener(a,rbtn41,rbtn42,rbtn43,rbtn44);
		group04.setOnCheckedChangeListener(c4);
		sum = sum +a[0];
		summ = sum;*/
		submit = (Button)findViewById(R.id.submit);	
		sview = (ScrollView)findViewById(R.id.ScrollView);
		submit.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				for(int m = 0;m < 10; m++)
					k[10] = k[10] + k[m];
				if(k[10]<11)
					tv.setText("  你是一个非常活泼开朗外向的人，并且人际关系非常好，没有自闭的倾向");
				else if(k[10] < 21)
					tv.setText("  你是一个活泼开朗的人，比较善于处理人与人之间的关系，没有自闭的倾向");
				else if(k[10] < 31)
					tv.setText("  你有轻微的自闭倾向，但是情况并不严重，只要多跟人交流沟通，这种倾向就会消失");
				else
					tv.setText("  你可能有较严重的自闭倾向，建议你去咨询一下心理医生");
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
/*class checklistener implements RadioGroup.OnCheckedChangeListener{
	int[] a;
	RadioButton rbtn1,rbtn2,rbtn3,rbtn4;
	public checklistener(int a[],RadioButton rbtn11,RadioButton rbtn12,RadioButton rbtn13,RadioButton rbtn14){
		this.a = a;
		this.rbtn1 = rbtn11;
		this.rbtn2 = rbtn12;
		this.rbtn3 = rbtn13;
		this.rbtn4 = rbtn14;
	}
	@Override
	public void onCheckedChanged(RadioGroup group, int checkedId) {
		// TODO Auto-generated method stub
		if(checkedId == rbtn1.getId())
			a[0] = a[0]+1;
		else if(checkedId == rbtn2.getId())
			a[0] = a[0]+2;
		else if(checkedId == rbtn3.getId())
			a[0] = a[0]+3;
		else 
			a[0] = a[0]+4;
	}
}*/