package com.teamtreehouse.ribbit;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseInstallation;
import com.parse.ParseUser;
import com.parse.PushService;
import com.teamtreehouse.ribbit.ui.MainActivity;
import com.teamtreehouse.ribbit.utils.ParseConstants;

public class RibbitApplication extends Application {
	
	@Override
	public void onCreate() { 
		super.onCreate();
	    Parse.initialize(this, 
	    	"YFLfZ1hzfZ9ELmNjObxnRgwbmtHOvEe5KbHTlq5i", 
	    	"4Kypk3Rm7bcvDQ6PiMV6wqMt1Uojxr857yNBQSrQ");
	    
	    //PushService.setDefaultPushCallback(this, MainActivity.class);
	    PushService.setDefaultPushCallback(this, MainActivity.class,
	    		R.drawable.ic_stat_ic_launcher);
		ParseInstallation.getCurrentInstallation().saveInBackground();
	}
	
	public static void updateParseInstallation(ParseUser user) {
		ParseInstallation installation = ParseInstallation.getCurrentInstallation();
		installation.put(ParseConstants.KEY_USER_ID, user.getObjectId());
		installation.saveInBackground();
	}
}
