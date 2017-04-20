package com.example.lee.myapplication.dagger2.components;

import com.example.lee.myapplication.base.BaseActivity;
import com.example.lee.myapplication.dagger2.modules.MyApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by lee on 17-4-20.
 */


@Singleton
@Component(modules = MyApplicationModule.class)
public interface MyApplicaitonComponent {

	void inject(BaseActivity baseActivity);

}
