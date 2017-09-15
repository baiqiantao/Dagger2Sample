package com.example.niuxiaowei.dagger2sample.di.components;

import com.example.niuxiaowei.dagger2sample.di.scopes.PerActivity;
import com.example.niuxiaowei.dagger2sample.view.MainFragment;

import dagger.Subcomponent;

@PerActivity
@Subcomponent
public interface MainFragmentComponent {
	
	void inject(MainFragment mainFragment);
}
