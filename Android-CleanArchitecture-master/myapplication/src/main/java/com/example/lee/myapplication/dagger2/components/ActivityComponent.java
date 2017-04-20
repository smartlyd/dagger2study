package com.example.lee.myapplication.dagger2.components;

import android.app.Activity;

import com.example.lee.myapplication.dagger2.PerActivity;
import com.example.lee.myapplication.dagger2.modules.ActivityModule;
import com.example.lee.myapplication.view.activity.TestPresenterActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by lee on 17-4-20.
 */
@Singleton
@PerActivity
@Component(modules = ActivityModule.class)
public interface ActivityComponent {

	void inject(TestPresenterActivity testPresenterActivity);

	Activity activity();


}
