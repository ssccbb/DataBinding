package com.sung.databinding.sample;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;

import com.sung.databinding.MutualSampleActivityBinder;
import com.sung.databinding.R;
import com.sung.databinding.model.MutualUser;

import java.util.Random;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

public class MutualSampleActivity extends AppCompatActivity implements TextWatcher {
    private MutualSampleActivityBinder mBinder;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinder = DataBindingUtil.setContentView(this, R.layout.activity_sample_mutual);
        mBinder.setUser(new MutualUser());
        mBinder.etContent.addTextChangedListener(this);
        mBinder.tvName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mBinder.getUser().user = "sung" + new Random().nextInt(100);
                mBinder.getUser().notifyChange();
            }
        });
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        // onTextChanged在Observable通知更新之前
        // 如在此处调用mBinder.getUser().user获取到的是前一个值
    }

    @Override
    public void afterTextChanged(Editable s) {
        mBinder.tvContent.setText("Bean.user = " + mBinder.getUser().user);
    }
}
