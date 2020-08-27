package com.sung.databinding;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.sung.databinding.sample.BindingAdapterSampleActivity;
import com.sung.databinding.sample.MutualSampleActivity;
import com.sung.databinding.sample.ObsSampleActivity;
import com.sung.databinding.sample.CollectionSampleActivity;
import com.sung.databinding.sample.FieldSampleActivity;
import com.sung.databinding.sample.SampleActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_sample:
                // 基础使用示例
                startActivity(new Intent(this, SampleActivity.class));
                break;
            case R.id.btn_auto:
                // 自动订阅使用示例
                startActivity(new Intent(this, ObsSampleActivity.class));
                break;
            case R.id.btn_auto_field:
                // 基于ObservableField的自动订阅使用示例
                startActivity(new Intent(this, FieldSampleActivity.class));
                break;
            case R.id.btn_auto_collection:
                // 基于ObservableCollection的自动订阅使用示例
                startActivity(new Intent(this, CollectionSampleActivity.class));
                break;
            case R.id.btn_mutual:
                // 双向绑定示例
                startActivity(new Intent(this, MutualSampleActivity.class));
                break;
                case R.id.btn_binding_adapter:
                // BindingAdapter示例
                startActivity(new Intent(this, BindingAdapterSampleActivity.class));
                break;
            default:
                break;
        }
    }
}