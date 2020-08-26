package com.sung.databinding.observablecollection;

import android.os.Bundle;
import android.view.View;

import com.sung.databinding.AutoSampleActivityBinding2;
import com.sung.databinding.R;

import java.util.Random;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableArrayMap;
import androidx.databinding.ObservableList;
import androidx.databinding.ObservableMap;

public class SampleActivity2 extends AppCompatActivity implements View.OnClickListener {
    private AutoSampleActivityBinding2 mBinder;
    private ObservableList<String> mList;
    private ObservableMap<String, String> mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinder = DataBindingUtil.setContentView(this, R.layout.activity_sample2);
        mBinder.setListener(this);

        mMap = new ObservableArrayMap<>();
        mMap.put("name", "sung");
        mMap.put("age", "22");
        mMap.put("grade", "level12");
        mBinder.setMap(mMap);
        mList = new ObservableArrayList<>();
        mList.add("aaa");
        mList.add("bbb");
        mList.add("ccc");
        mBinder.setList(mList);

        //绑定展示map的key
        mBinder.setKey("name");
        //绑定展示list的index
        mBinder.setIndex(mList.size() - 1);
    }

    @Override
    public void onClick(View view) {
        mMap.put("name", "sung" + new Random().nextInt(100));
        mList.add("xxx" + new Random().nextInt(100));
    }
}