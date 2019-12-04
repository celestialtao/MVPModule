package com.example.mvptest.model;

import com.example.mvptest.contract.LoginContract;
import com.example.mvptest.presenter.LoginPresenter;

public class LoginModel implements LoginContract.Model {
    @Override
    public void login(String name, String psw, LoginPresenter loginPresenter) {
        /**
         *  对数据做一个简单的判断
         */
        if(name.isEmpty() || psw.isEmpty()){
            loginPresenter.onFail("账号密码不能为空");
        }else if(name.equals("root") && psw.equals("1234")){
            loginPresenter.onSuccess();
        }else{
            loginPresenter.onFail("账号密码错误");
        }
    }
}
