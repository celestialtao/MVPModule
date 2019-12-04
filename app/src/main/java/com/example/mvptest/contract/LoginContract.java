package com.example.mvptest.contract;

import com.example.mvptest.presenter.LoginPresenter;

public interface LoginContract {
    interface Model {

//    模型 处理数据
        void login(String name, String psw, LoginPresenter loginPresenter);
    }

//    试图 显示界面
    interface View {
//        登录失败
        void onFail(String msg);
//        登录成功
        void onSuccess();
//        获取账号
        String getName();

//         获取密码
    String getPassWord();
    }

    //展示器 或者说 主持人 进行逻辑处理
    interface Presenter {
//        登录成功
        void onSuccess();
//        登录失败
        void onFail(String msg);
    }
}
