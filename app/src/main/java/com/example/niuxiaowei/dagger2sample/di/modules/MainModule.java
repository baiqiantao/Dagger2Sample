package com.example.niuxiaowei.dagger2sample.di.modules;

import com.example.niuxiaowei.dagger2sample.data.GetUserData;

import dagger.Module;
import dagger.Provides;

@Module
public class MainModule {
	
	@Provides
	public GetUserData provideUserData() {
		return new GetUserData();
	}
	
}
