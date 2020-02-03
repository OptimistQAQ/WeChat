package com.example.a65667.wechat.contracts;

import android.content.Context;
import android.provider.ContactsContract;

public class ContractsPresenter implements ContractsContract.Presenter {

    private Context context;
    private ContractsContract.View contractsView;

    public ContractsPresenter(Context context, ContractsContract.View contactsView) {
        this.context = context;
        this.contractsView = contactsView;
        contactsView.setPresenter(this);
    }

    @Override
    public void start() {

    }
}
