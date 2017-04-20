package com.example.lee.myapplication.dagger2.modules;

import android.content.Context;

import com.example.lee.myapplication.base.MyApplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by lee on 17-4-20.
 */


@Singleton
@Module
public class MyApplicationModule {

	private final MyApplication mMyApplication;

	public MyApplicationModule(MyApplication myApplication) {
		mMyApplication = myApplication;
	}

	@Provides
	@Singleton
	Context provideApplicationContext() {
		return this.mMyApplication;
	}

}
