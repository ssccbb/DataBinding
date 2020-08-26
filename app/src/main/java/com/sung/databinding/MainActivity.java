package com.sung.databinding;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.sung.databinding.baseobservable.SampleActivity1;
import com.sung.databinding.observablecollection.SampleActivity2;
import com.sung.databinding.observablefield.SampleActivity3;
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
                startActivity(new Intent(this, SampleActivity1.class));
                break;
            case R.id.btn_auto_field:
                startActivity(new Intent(this, SampleActivity3.class));
                break;
            case R.id.btn_auto_collection:
                startActivity(new Intent(this, SampleActivity2.class));
                break;
            default:
                break;
        }
    }
}