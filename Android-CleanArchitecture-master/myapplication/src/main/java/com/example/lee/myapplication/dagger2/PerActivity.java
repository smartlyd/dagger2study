package com.example.lee.myapplication.dagger2;

import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by lee on 17-4-18.
 */

@Scope
@Retention(RUNTIME)

public @interface PerActivity {
}
