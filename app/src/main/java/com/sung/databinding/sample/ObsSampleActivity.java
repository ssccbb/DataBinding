package com.sung.databinding.sample;

import android.os.Bundle;
import android.view.View;
import com.sung.databinding.AutoSampleActivityBinding1;
import com.sung.databinding.R;
import com.sung.databinding.model.ObsUser;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

/**
 * @desc DataBinding自动更新使用范例
 * @notice 使用BaseObservable
 */
public class ObsSampleActivity extends AppCompatActivity implements View.OnClickListener {
    private AutoSampleActivityBinding1 mBinder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinder = DataBindingUtil.setContentView(this, R.layout.activity_sample_obs);
        mBinder.setUser(new ObsUser());
        mBinder.setListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_sex_refresh:
                mBinder.getUser().setSex(mBinder.getUser().getSex().equals("男") ? "女" : "男");
                break;
            case R.id.btn_both_refresh:
                mBinder.getUser().setGrade((int) ((Math.random() * 100) + 1));
                mBinder.getUser().setAge((int) ((Math.random() * 100) + 1));
                break;
            default:
                break;
        }
    }
}