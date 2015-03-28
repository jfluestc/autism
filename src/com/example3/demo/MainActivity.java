package com.example3.demo;

import android.app.TabActivity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.GestureDetector.OnGestureListener;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.TabHost;


@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity implements OnGestureListener{

	TabHost tabs;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		tabs = getTabHost();
		tabs.setBackgroundColor(Color.GRAY);
		
		TabHost.TabSpec spec = tabs.newTabSpec("tab1");
		spec.setContent(new Intent(MainActivity.this,KnowActivity.class));       //设置页面要显示的内容
		spec.setIndicator("自闭我知道");    //设置标签上显示的文字
		tabs.addTab(spec);                //把标签加到TabHost容器中
		
		TabHost.TabSpec spec2 = tabs.newTabSpec("tab2");
		spec2 = tabs.newTabSpec("tab2");
		spec2.setContent(new Intent(MainActivity.this,TestActivity.class));
		spec2.setIndicator("自闭我自查");
		tabs.addTab(spec2);
		
		TabHost.TabSpec spec3 = tabs.newTabSpec("tab3");
		spec3 = tabs.newTabSpec("tab3");
		spec3.setContent(new Intent(MainActivity.this,PreventActivity.class));     //设置页面要显示的内容
		spec3.setIndicator("自闭我预防");       //设置标签上显示的文字
		tabs.addTab(spec3);              //把标签加到TabHost容器中
		
		TabHost.TabSpec spec4 = tabs.newTabSpec("tab4");
		spec4 = tabs.newTabSpec("tab4");
		spec4.setContent(new Intent(MainActivity.this,HaveFunActivity.class));
		spec4.setIndicator("开心一刻");
		
		tabs.addTab(spec4);
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
	@Override
	public boolean onDown(MotionEvent e) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void onShowPress(MotionEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean onSingleTapUp(MotionEvent e) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX,
			float distanceY) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void onLongPress(MotionEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX,
			float velocityY) {
		// TODO Auto-generated method stub
		final int min_Distance = 50;
		final int min_VelocityX= 10;
		int currentId = tabs.getCurrentTab();
		if(currentId != 0 && currentId != 3){
			if((e2.getX()-e1.getX()) > min_Distance &&  velocityX > min_VelocityX){
				currentId = currentId+1;
				tabs.setCurrentTab(currentId);				
			}
			else if((e1.getX()-e2.getX())>min_Distance &&  velocityX > min_VelocityX){
				currentId = currentId-1;
				tabs.setCurrentTab(currentId);
			}
		}
		else if( currentId == 0){
			if((e2.getX()-e1.getX()) > min_Distance &&  velocityX > min_VelocityX){
				currentId = currentId+1;
				tabs.setCurrentTab(currentId);
			}	
		}
		else{
			if((e1.getX()-e2.getX())>min_Distance &&  velocityX > min_VelocityX){
				currentId = currentId-1;
				tabs.setCurrentTab(currentId);
			}
		}
		return false;
	}
}