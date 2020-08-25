package com.sung.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;

/**
 * DataBinding简单使用范例
 */
public class SampleActivity extends AppCompatActivity {
    private SampleActivityBinding mBinder;
    private User mUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 初始化binding（必须）
        mBinder = DataBindingUtil.setContentView(this, R.layout.activity_sample);
        // 生成user数据
        mUser = new User("张三", 20);
        // 设置user数据
        mBinder.setUser(mUser);

        // 展示范例view用法
//        mBinder.tvAge.setText("11");
        // 获取user用法
//        User data = binding.getUser();
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_refresh:
                // 默认方式需要重新set才会更新
                mUser.setAge((int) ((Math.random() * 100) + 1));
                mBinder.setUser(mUser);
                break;
            default:
                break;
        }
    }
}