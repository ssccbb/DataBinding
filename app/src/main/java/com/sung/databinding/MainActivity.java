package com.sung.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // init binding
        MainActivityBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        // init user
        UserModel user = new UserModel("张三", 20);
        // set viewmodel
        binding.setUser(user);

        // get view
        binding.tvAge.setText("11");
        binding.tvName.setText("11");
    }
}