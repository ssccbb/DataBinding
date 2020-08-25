package com.sung.databinding;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.sung.databinding.baseobservable.AutoSampleActivity;
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
                startActivity(new Intent(this, SampleActivity.class));
                break;
            case R.id.btn_auto:
                startActivity(new Intent(this, AutoSampleActivity.class));
                break;
            case R.id.btn_auto_field:
                break;
            case R.id.btn_auto_collection:
                break;
            default:
                break;
        }
    }
}