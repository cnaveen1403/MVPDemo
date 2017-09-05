package com.sample.mvpdemo.ui.splash;

import com.sample.mvpdemo.ui.base.MvpPresenter;
import com.sample.mvpdemo.ui.splash.SplashMvpView;

/**
 * Created by MYPC on 9/5/2017.
 */

public interface SplashMvpPresenter <V extends SplashMvpView> extends MvpPresenter<V> {
    void decideNextActivity();
}
