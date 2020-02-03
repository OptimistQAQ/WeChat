package com.example.a65667.wechat.find;

import android.content.Context;

public class FindPresenter implements FindContract.Presenter {

    private Context context;
    private FindContract.View findView;

    public FindPresenter(Context context, FindContract.View findView){
        this.context = context;
        this.findView = findView;
        findView.setPresenter(this);
    }

    @Override
    public void start() {

    }
}
