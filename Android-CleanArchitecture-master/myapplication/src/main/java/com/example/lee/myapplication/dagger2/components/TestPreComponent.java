package com.example.lee.myapplication.dagger2.components;

import com.example.lee.myapplication.dagger2.PerActivity;
import com.example.lee.myapplication.dagger2.modules.TestPreModule;
import com.example.lee.myapplication.view.activity.TestPresenterActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by lee on 17-4-20.
 */
@Singleton
@PerActivity
@Component(modules = TestPreModule.class)
public interface TestPreComponent {

	void inject(TestPresenterActivity testPresenterActivity);

}
