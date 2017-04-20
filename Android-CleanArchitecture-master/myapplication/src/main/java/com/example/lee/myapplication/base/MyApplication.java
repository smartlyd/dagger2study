package com.example.lee.myapplication.base;

import android.app.Application;

import com.example.lee.myapplication.dagger2.components.DaggerMyApplicaitonComponent;
import com.example.lee.myapplication.dagger2.components.MyApplicaitonComponent;
import com.example.lee.myapplication.dagger2.modules.MyApplicationModule;

/**
 * Created by lee on 17-4-18.
 */

public class MyApplication extends Application {


	private MyApplicaitonComponent mMyApplicaitonComponent;

	@Override
	public void onCreate() {
		super.onCreate();

		this.initializeInjcetore();
	}

	protected void initializeInjcetore() {
		mMyApplicaitonComponent = DaggerMyApplicaitonComponent.builder()
				.myApplicationModule(new MyApplicationModule(this))
				.build();
	}

	public MyApplicaitonComponent getMyApplicaitonComponent() {
		return this.mMyApplicaitonComponent;
	}


}
