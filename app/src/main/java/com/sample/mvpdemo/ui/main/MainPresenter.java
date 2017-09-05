package com.sample.mvpdemo.ui.main;

import com.sample.mvpdemo.data.DataManager;
import com.sample.mvpdemo.ui.base.BasePresenter;
import com.sample.mvpdemo.ui.base.MvpView;

/**
 * Created by MYPC on 9/5/2017.
 */

public class MainPresenter<V extends MainMvpView & MvpView> extends BasePresenter<V> implements MainMvpPresenter<V> {
    public MainPresenter(DataManager dataManager){
        super(dataManager);
    }

    @Override
    public String getEmailId() {
        return getDataManager().getEmailId();
    }

    @Override
    public void setUserLoggedOut() {
        getDataManager().clear();
        getMvpView().openSplashActivity();
    }
}
