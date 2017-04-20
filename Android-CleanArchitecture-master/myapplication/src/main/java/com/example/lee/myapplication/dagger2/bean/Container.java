package com.example.lee.myapplication.dagger2.bean;

import javax.inject.Inject;

/**
 * Created by lee on 17-4-19.
 */

public class Container {
	@Inject
	Fruit f;


	public Container() {
		init();
	}

	public Fruit getF() {
		return f;
	}

	public void setF(Fruit f) {
		this.f = f;
	}

	public void init(){
//		DaggerFruitComponent.create().inject(this);
	}

}
