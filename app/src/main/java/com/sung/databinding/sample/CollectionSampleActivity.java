package com.sung.databinding.sample;

import android.os.Bundle;
import android.view.View;

import com.sung.databinding.AutoSampleActivityBinding2;
import com.sung.databinding.R;

import java.util.Random;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableArrayMap;

public class CollectionSampleActivity extends AppCompatActivity implements View.OnClickListener {
    private AutoSampleActivityBinding2 mBinder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinder = DataBindingUtil.setContentView(this, R.layout.activity_sample_collection);
        mBinder.setListener(this);

        ObservableArrayMap<String,String> mMap = new ObservableArrayMap<>();
        mMap.put("name", "sung");
        mMap.put("age", "22");
        mMap.put("grade", "level12");
        mBinder.setMap(mMap);
        ObservableArrayList<String> mList = new ObservableArrayList<>();
        mList.add("aaa");
        mList.add("bbb");
        mList.add("ccc");
        mBinder.setList(mList);

        //绑定展示map的key
        mBinder.setKey("name");
        //绑定展示list的index
        mBinder.setIndex(0);
    }

    @Override
    public void onClick(View view) {
        mBinder.getMap().put("name", "sung" + new Random().nextInt(100));
        mBinder.getList().add(0,"xxx" + new Random().nextInt(100));
    }
}