package com.teamtreehouse.ribbit;

import android.app.Application;

import com.parse.Parse;

public class RibbitApplication extends Application {
	
	@Override
	public void onCreate() { 
		super.onCreate();
	    Parse.initialize(this, "YFLfZ1hzfZ9ELmNjObxnRgwbmtHOvEe5KbHTlq5i", "4Kypk3Rm7bcvDQ6PiMV6wqMt1Uojxr857yNBQSrQ");
	}
}
