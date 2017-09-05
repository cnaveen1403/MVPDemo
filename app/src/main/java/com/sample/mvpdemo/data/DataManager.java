package com.sample.mvpdemo.data;

/**
 * Created by MYPC on 9/4/2017.
 */

public class DataManager {

    SharedPrefsHelper mSharedPrefsHelper;

    public DataManager (SharedPrefsHelper sharedPrefsHelper){
        this.mSharedPrefsHelper = sharedPrefsHelper;
    }

    public void clear (){
        mSharedPrefsHelper.clear();
    }

    public void saveEmailId (String email){
        mSharedPrefsHelper.putEmail(email);
    }

    public String getEmailId (){
        return mSharedPrefsHelper.getEmail();
    }

    public void setLoggedIn (){
        mSharedPrefsHelper.setLoggedInMode(true);
    }

    public boolean getLoggedInMode (){
        return mSharedPrefsHelper.getLoggedInMode();
    }
}
