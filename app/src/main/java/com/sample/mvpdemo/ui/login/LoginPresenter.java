package com.sample.mvpdemo.ui.login;

import com.sample.mvpdemo.data.DataManager;
import com.sample.mvpdemo.ui.base.BasePresenter;
import com.sample.mvpdemo.ui.login.LoginMvpPresenter;
import com.sample.mvpdemo.ui.login.LoginMvpView;

/**
 * Created by MYPC on 9/5/2017.
 */

public class LoginPresenter<V extends LoginMvpView> extends BasePresenter<V> implements LoginMvpPresenter<V> {
    public LoginPresenter(DataManager dataManager){
        super(dataManager);
    }

    @Override
    public void startLogin(String emailId){
        getDataManager().saveEmailId(emailId);
        getDataManager().setLoggedIn();
        getMvpView().openMainActivity();
    }
}
