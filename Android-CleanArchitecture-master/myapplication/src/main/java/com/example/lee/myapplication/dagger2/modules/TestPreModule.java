package com.example.lee.myapplication.dagger2.modules;

import com.example.lee.myapplication.bean.GetUserData;

import dagger.Module;
import dagger.Provides;

/**
 * Created by lee on 17-4-20.
 */

@Module
public class TestPreModule {

	@Provides
	GetUserData getUser() {
		return new GetUserData();
	}


}
