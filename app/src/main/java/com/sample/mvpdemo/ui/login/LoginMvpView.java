package com.sample.mvpdemo.ui.login;

import com.sample.mvpdemo.ui.base.MvpView;

/**
 * Created by MYPC on 9/5/2017.
 */

public interface LoginMvpView extends MvpView {
    void openMainActivity();
    void onLoginButtonClick();
}
