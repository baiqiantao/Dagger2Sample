package com.example.niuxiaowei.dagger2sample.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.niuxiaowei.dagger2sample.App;
import com.example.niuxiaowei.dagger2sample.di.components.AppComponent;

public class BaseActivity extends AppCompatActivity {
	
	public AppComponent getAppComponent() {
		return ((App) getApplication()).getAppComponent();
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}
}
