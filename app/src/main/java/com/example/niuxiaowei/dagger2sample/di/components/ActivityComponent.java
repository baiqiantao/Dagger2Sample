package com.example.niuxiaowei.dagger2sample.di.components;

import android.app.Activity;

import com.example.niuxiaowei.dagger2sample.di.modules.ActivityModule;
import com.example.niuxiaowei.dagger2sample.di.scopes.PerActivity;

import dagger.Component;

@PerActivity
@Component(modules = {ActivityModule.class})
public interface ActivityComponent {
	
	Activity getActivity();
}
