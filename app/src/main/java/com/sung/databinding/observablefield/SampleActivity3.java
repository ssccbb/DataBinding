package com.sung.databinding.observablefield;

import android.os.Bundle;
import android.view.View;

import com.sung.databinding.AutoSampleActivityBinding3;
import com.sung.databinding.R;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

public class SampleActivity3 extends AppCompatActivity implements View.OnClickListener {
    private AutoSampleActivityBinding3 mBinder;
    private User3 mUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinder = DataBindingUtil.setContentView(this, R.layout.activity_sample3);
        mUser = new User3();
        mBinder.setUser(mUser);
        mBinder.setListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_both_refresh:
                mUser.setSex(mUser.getSex().equals("男") ? "女" : "男");
                mUser.setGrade((int) ((Math.random() * 100) + 1));
                mUser.setAge((int) ((Math.random() * 100) + 1));
                break;
            default:
                break;
        }
    }
}