package com.example.lee.myapplication.dagger2.modules;

import android.app.Activity;

import com.example.lee.myapplication.dagger2.PerActivity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by lee on 17-4-20.
 */

@Module
public class ActivityModule {

	private final Activity mActivity;

	public ActivityModule(Activity activity) {
		mActivity = activity;
	}

	@Provides
	@PerActivity
	Activity provideActivity() {
		return this.mActivity;
	}

//	@Provides
//	GetUserData getUser() {
//		return new GetUserData();
//	}


}
