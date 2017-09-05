package com.sample.mvpdemo.app;

import android.app.Application;

import com.sample.mvpdemo.data.DataManager;
import com.sample.mvpdemo.data.SharedPrefsHelper;

/**
 * Created by MYPC on 9/5/2017.
 */

public class MvpApp extends Application {
    DataManager dataManager;

    @Override
    public void onCreate() {
        super.onCreate();

        SharedPrefsHelper sharedPrefsHelper = new SharedPrefsHelper(getApplicationContext());
        dataManager = new DataManager(sharedPrefsHelper);
    }

    public DataManager getDataManager (){
        return dataManager;
    }
}
