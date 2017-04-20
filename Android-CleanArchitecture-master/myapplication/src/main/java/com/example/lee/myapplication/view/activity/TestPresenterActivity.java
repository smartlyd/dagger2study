package com.example.lee.myapplication.view.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.lee.myapplication.R;
import com.example.lee.myapplication.base.BaseActivity;
import com.example.lee.myapplication.dagger2.components.ActivityComponent;
import com.example.lee.myapplication.dagger2.components.DaggerActivityComponent;
import com.example.lee.myapplication.presenters.DataPrensernter;

import javax.inject.Inject;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class TestPresenterActivity extends BaseActivity implements DataPrensernter.IUser {
	private static final String INTENT_EXTRA_PARAM_USER_ID = "org.android10.INTENT_PARAM_USER_ID";
	private static final String INSTANCE_STATE_PARAM_USER_ID = "org.android10.STATE_PARAM_USER_ID";


	private ActivityComponent mActivityComponent;


	@Inject
	DataPrensernter mDataPrensernter;


	@Bind(R.id.button)
	Button mButton;


	public static Intent getCallingIntent(Context context) {
		return new Intent(context, TestPresenterActivity.class);
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_test_presenter);
		ButterKnife.bind(this);
		this.initializeInjector();
	}

	private void initializeInjector() {
		DaggerActivityComponent
				.builder()
				.activityModule(getActivityModule())
				.build().inject(this);
//		mActivityComponent.

//		DaggerTestPreComponent.builder().testPreModule(new TestPreModule()).build().inject(this);
		mDataPrensernter.setIUser(this);
	}


	@OnClick(R.id.button)
	void dosth() {
		mDataPrensernter.getUser();
	}

	@Override
	public void setName(String name) {
		((TextView) findViewById(R.id.textname)).setText(name);
	}
}
