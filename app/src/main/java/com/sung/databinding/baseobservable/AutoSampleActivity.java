package com.sung.databinding.baseobservable;

import android.os.Bundle;
import android.view.View;
import com.sung.databinding.AutoSampleActivityBinding;
import com.sung.databinding.R;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

/**
 * @desc DataBinding自动更新使用范例
 * @notice 使用BaseObservable
 */
public class AutoSampleActivity extends AppCompatActivity implements View.OnClickListener {
    private AutoSampleActivityBinding mBinder;
    private AutoUser mUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinder = DataBindingUtil.setContentView(this, R.layout.activity_auto_sample);
        mUser = new AutoUser();
        mBinder.setUser(mUser);
        mBinder.setListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_sex_refresh:
                mUser.setSex(mUser.getSex().equals("男") ? "女" : "男");
                break;
            case R.id.btn_both_refresh:
                mUser.setGrade((int) ((Math.random() * 100) + 1));
                mUser.setAge((int) ((Math.random() * 100) + 1));
                break;
            default:
                break;
        }
    }
}