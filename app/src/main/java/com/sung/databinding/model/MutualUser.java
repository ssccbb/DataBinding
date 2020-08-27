package com.sung.databinding.model;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

/**
 * Create by sung at 2020/8/27
 *
 * @desc:
 * @notice:
 */
public class MutualUser extends BaseObservable {
    @Bindable
    public String user;

    public MutualUser() {
        this.user = "张三";
    }
}
