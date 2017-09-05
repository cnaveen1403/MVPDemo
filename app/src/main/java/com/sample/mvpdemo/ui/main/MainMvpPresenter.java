package com.sample.mvpdemo.ui.main;

import com.sample.mvpdemo.ui.base.MvpPresenter;
import com.sample.mvpdemo.ui.main.MainMvpView;
import com.sample.mvpdemo.ui.base.MvpView;

/**
 * Created by MYPC on 9/5/2017.
 */

public interface MainMvpPresenter<V extends MainMvpView & MvpView> extends MvpPresenter<V> {
    String getEmailId();
    void setUserLoggedOut();
}
