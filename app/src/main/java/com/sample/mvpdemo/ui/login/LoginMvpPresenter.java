package com.sample.mvpdemo.ui.login;

import com.sample.mvpdemo.ui.base.MvpPresenter;

/**
 * Created by MYPC on 9/5/2017.
 */

public interface LoginMvpPresenter<V extends LoginMvpView> extends MvpPresenter<V> {
    void startLogin (String emailId);
}
