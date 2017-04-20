package com.example.lee.myapplication.dagger2.bean;

import javax.inject.Inject;

/**
 * Created by lee on 17-4-19.
 */

public class Fruit {

	private int mColor;
	private int mSize;

	@Inject
	public Fruit(int color, int size) {
		mColor = color;
		mSize = size;
	}

	public int getColor() {
		return mColor;
	}

	public void setColor(int color) {
		mColor = color;
	}

	public int getSize() {
		return mSize;
	}

	public void setSize(int size) {
		mSize = size;
	}
}
