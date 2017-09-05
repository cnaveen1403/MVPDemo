package com.sample.mvpdemo.ui.splash;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.sample.mvpdemo.ui.login.LoginActivity;
import com.sample.mvpdemo.ui.main.MainActivity;
import com.sample.mvpdemo.R;
import com.sample.mvpdemo.app.MvpApp;
import com.sample.mvpdemo.data.DataManager;
import com.sample.mvpdemo.ui.base.BaseActivity;

/**
 * Created by MYPC on 9/4/2017.
 */

public class SplashActivity extends BaseActivity implements SplashMvpView {
    SplashPresenter mSplashPresenter;

    public static Intent getStartIntent (Context context){
        Intent intent = new Intent(context, SplashActivity.class);
        return  intent;
    }

    @Override
    protected void onCreate (@Nullable Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_splash);

        DataManager dataManager = ((MvpApp) getApplication()).getDataManager ();
        mSplashPresenter = new SplashPresenter(dataManager);
        mSplashPresenter.onAttach(this);
        mSplashPresenter.decideNextActivity();
    }

    @Override
    public void openMainActivity() {
        Intent intent = MainActivity.getStartIntent (this);
        startActivity(intent);
        finish();
    }

    @Override
    public void openLoginActivity() {
        Intent intent = LoginActivity.getStartIntent (this);
        startActivity(intent);
        finish ();
    }
}
