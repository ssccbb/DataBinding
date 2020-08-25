package com.sung.databinding;

import android.util.Log;

/**
 * Create by sung at 2020/8/24
 *
 * @desc:
 * @notice:
 */
public class UserModel {
    public String user;
    public int age;

    public UserModel(String user, int age) {
        this.user = user;
        this.age = age;
    }

    public void onClick(){
        Log.d(UserModel.class.getSimpleName(),"onClick");
    }
}
