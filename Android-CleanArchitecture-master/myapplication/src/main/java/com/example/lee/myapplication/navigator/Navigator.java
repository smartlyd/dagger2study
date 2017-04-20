package com.example.lee.myapplication.navigator;

import android.content.Context;
import android.content.Intent;

import com.example.lee.myapplication.view.activity.TestPresenterActivity;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by lee on 17-4-20.
 */

@Singleton
public class Navigator {
	@Inject
	public Navigator() {

	}

	public void goToActivity(Context context) {
		if (context != null) {
			Intent intentToLaunch = TestPresenterActivity.getCallingIntent(context);
			context.startActivity(intentToLaunch);
		}
	}

}
