package com.example.a65667.wechat.personal;

import android.content.Context;

public class PersonalPresenter implements PersonalContract.Presenter {

    private Context context;
    private PersonalContract.View personalView;

    public PersonalPresenter(Context context, PersonalContract.View personalView) {
        this.context = context;
        this.personalView = personalView;
        personalView.setPresenter(this);
    }

    @Override
    public void start() {

    }
}
