package com.example.lee.myapplication.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.lee.myapplication.dagger2.components.MyApplicaitonComponent;
import com.example.lee.myapplication.dagger2.modules.ActivityModule;
import com.example.lee.myapplication.navigator.Navigator;

import javax.inject.Inject;


public abstract class BaseActivity extends AppCompatActivity {


	@Inject
	public
	Navigator mNavigator;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.getApplicationComponent().inject(this);
	}

	protected MyApplicaitonComponent getApplicationComponent() {
		return ((MyApplication) getApplication()).getMyApplicaitonComponent();
	}

	protected ActivityModule getActivityModule() {
		return new ActivityModule(this);
	}


}
