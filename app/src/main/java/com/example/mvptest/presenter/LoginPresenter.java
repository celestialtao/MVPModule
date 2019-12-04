package com.example.mvptest.presenter;

import com.example.mvptest.Activity.LoginActivity;
import com.example.mvptest.contract.LoginContract;
import com.example.mvptest.model.LoginModel;

public class LoginPresenter implements LoginContract.Presenter {

    private LoginContract.View view;
    private LoginModel loginModel;

    public LoginPresenter(LoginContract.View view) {
            this.view = view;
            loginModel = new LoginModel();
    }

    @Override
    public void onSuccess() {
        //通知视图
        view.onSuccess();
    }

    @Override
    public void onFail(String msg) {
        //通知视图
        view.onFail(msg);
    }

    public void login() {
        //将view中的参数获取出来。
        String name = view.getName();
        String psw = view.getPassWord();

        // 调用一下业务处理model层的登陆方法
        loginModel.login(name,psw,this);

    }
}
