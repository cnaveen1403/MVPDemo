package com.sample.mvpdemo.ui.base;

/**
 * Created by MYPC on 9/4/2017.
 */

public interface MvpPresenter<V extends MvpView> {
    void onAttach (V mvpView);
}
