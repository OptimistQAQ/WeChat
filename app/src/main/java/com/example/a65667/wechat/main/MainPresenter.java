package com.example.a65667.wechat.main;

import android.content.Context;

public class MainPresenter implements MainContract.Presenter {

    private Context context;
    private MainContract.View mainView;

    public MainPresenter(Context context, MainContract.View mainView) {
        this.context = context;
        this.mainView = mainView;
        mainView.setPresenter(this);
    }

    @Override
    public void start() {

    }
}
