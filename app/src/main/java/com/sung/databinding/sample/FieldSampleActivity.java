package com.sung.databinding.sample;

import android.os.Bundle;
import android.view.View;

import com.sung.databinding.SampleActivityBinding3;
import com.sung.databinding.R;
import com.sung.databinding.model.FieldUser;

import java.util.Random;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

public class FieldSampleActivity extends AppCompatActivity implements View.OnClickListener {
    private SampleActivityBinding3 mBinder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinder = DataBindingUtil.setContentView(this, R.layout.activity_sample_field);
        mBinder.setUser(new FieldUser());
        mBinder.setListener(this);
    }

    @Override
    public void onClick(View view) {
        mBinder.getUser().sex.set(mBinder.getUser().sex.get().equals("男") ? "女" : "男");
        mBinder.getUser().grade.set("level:" + new Random().nextInt(100));
        mBinder.getUser().age.set(new Random().nextInt(100));
    }
}