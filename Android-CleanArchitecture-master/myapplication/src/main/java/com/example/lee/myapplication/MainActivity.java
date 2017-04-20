package com.example.lee.myapplication;

import android.os.Bundle;
import android.widget.Button;

import com.example.lee.myapplication.base.BaseActivity;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {


	@Bind(R.id.btn)
	Button btn;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ButterKnife.bind(this);
	}

	@OnClick(R.id.btn)
	void gotoTest(){
		this.mNavigator.goToActivity(this);

//		Intent intentToLaunch = TestPresenterActivity.getCallingIntent(this);
//		startActivity(intentToLaunch);


	}

}
