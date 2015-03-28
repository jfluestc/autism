package com.example3.demo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TabHost;

public class ShiftTanHost extends TabHost {
	
	private Animation LeftIn;
	private Animation LeftOut;
	private Animation RightIn;
	private Animation RightOut;
	private int tabcount;

	public ShiftTanHost(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
		//从左边开始滑入
		LeftIn = AnimationUtils.loadAnimation(context, R.layout.left_in);
		//从左边开始滑出
		LeftOut = AnimationUtils.loadAnimation(context, R.layout.left_out);
		//从右边开始滑入
		RightIn = AnimationUtils.loadAnimation(context, R.layout.right_in);
		//从右边开始滑出
		RightOut = AnimationUtils.loadAnimation(context, R.layout.right_out);		
	}
	public int getTabCount(){
		return tabcount;
	}
	@Override
	public void addTab(TabSpec tabSpec) {
		// TODO Auto-generated method stub
		tabcount++;
		super.addTab(tabSpec);
	}
	@Override
	public void setCurrentTab(int index) {
		// TODO Auto-generated method stub
		//index为要切换到页的索引
		super.setCurrentTab(index);
		int currentTab = getCurrentTab();
		if(getCurrentView()!= null){
			if(currentTab == (tabcount-1) && index==0){
				getCurrentView().startAnimation(LeftOut);
			}
			else if(currentTab == 0 && index == (tabcount-1)){
				getCurrentView().startAnimation(RightOut);
			}
			else if(index > currentTab)
				getCurrentView().startAnimation(LeftOut);
			else if(index < currentTab)
				getCurrentView().startAnimation(RightOut);
		}
		
		super.setCurrentTab(index);
		
			if(currentTab == (tabcount-1) && index==0){
				getCurrentView().startAnimation(LeftIn);
			}
			else if(currentTab == 0 && index == (tabcount-1)){
				getCurrentView().startAnimation(RightIn);
			}
			else if(index > currentTab)
				getCurrentView().startAnimation(LeftIn);
			else if(index < currentTab)
				getCurrentView().startAnimation(RightIn);
	}
}
