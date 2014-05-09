package com.oneironautgames.ribbit;

import android.app.Application;

import com.parse.Parse;

public class RibbitApplication extends Application {
	@Override
	public void onCreate() {
		super.onCreate();
		Parse.initialize(this, "Ribbit Application ID", "Client Key");
	}
}
