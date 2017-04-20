package com.example.lee.myapplication.presenters;

import com.example.lee.myapplication.bean.GetUserData;
import com.example.lee.myapplication.bean.UserData;

import javax.inject.Inject;

/**
 * Created by lee on 17-4-19.
 */

public class DataPrensernter implements Presenter {


	private GetUserData mGetUserData;

	IUser mIUser;

	public void setIUser(IUser IUser) {
		mIUser = IUser;
	}

	@Inject
	public DataPrensernter(GetUserData getUserData) {
		mGetUserData = getUserData;
	}

	public void getUser() {
		UserData userData = mGetUserData.getUser();
		mIUser.setName(userData.getName());
	}


	public static interface IUser {
		void setName(String name);
	}

	@Override
	public void onResume() {

	}

	@Override
	public void onPause() {

	}

	@Override
	public void onDestroy() {

	}
}
