package com.example.lee.myapplication.bean;

import javax.inject.Inject;

/**
 * Created by lee on 17-4-20.
 */

public class GetUserData {

	@Inject
	public GetUserData() {
	}

	public UserData getUser() {
		UserData userData = new UserData();
		userData.setName("lee from dagger2 ");
		return userData;
	}
}
