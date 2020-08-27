package com.sung.databinding.observablefield;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.sung.databinding.BR;
import com.sung.databinding.SampleActivityBinding3;
import com.sung.databinding.R;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.Observable;

public class SampleActivity3 extends AppCompatActivity implements View.OnClickListener {
    private SampleActivityBinding3 mBinder;
    private User3 mUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinder = DataBindingUtil.setContentView(this, R.layout.activity_sample3);
        mUser = new User3();
        mBinder.setUser(mUser);
        mBinder.setListener(this);

        mBinder.addOnPropertyChangedCallback(new Observable.OnPropertyChangedCallback() {
            @Override
            public void onPropertyChanged(Observable sender, int propertyId) {
                if (propertyId == BR.user) {
                    Log.d(SampleActivity3.class.getSimpleName(), "BR.user");
                }
                if (propertyId == BR.grade) {
                    Log.d(SampleActivity3.class.getSimpleName(), "BR.grade");
                }
                if (propertyId == BR.age) {
                    Log.d(SampleActivity3.class.getSimpleName(), "BR.age");
                }
                if (propertyId == BR.sex) {
                    Log.d(SampleActivity3.class.getSimpleName(), "BR.sex");
                }
            }
        });
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