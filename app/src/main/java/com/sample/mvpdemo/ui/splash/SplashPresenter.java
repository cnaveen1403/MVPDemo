package com.sample.mvpdemo.ui.splash;

import com.sample.mvpdemo.data.DataManager;
import com.sample.mvpdemo.ui.base.BasePresenter;

/**
 * Created by MYPC on 9/5/2017.
 */

public class SplashPresenter<V extends SplashMvpView> extends BasePresenter<V> implements SplashMvpPresenter<V> {

    public SplashPresenter(DataManager dataManager) {
        super(dataManager);
    }

    @Override
    public void decideNextActivity() {
        if (getDataManager().getLoggedInMode()) {
            getMvpView().openMainActivity();
        } else {
            getMvpView().openLoginActivity();
        }
    }
}
