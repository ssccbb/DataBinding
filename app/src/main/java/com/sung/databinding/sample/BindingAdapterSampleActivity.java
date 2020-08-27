package com.sung.databinding.sample;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.sung.databinding.BindingAdapterSampleActivityBinder;
import com.sung.databinding.R;
import com.sung.databinding.model.Image;

import java.util.Random;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.BindingAdapter;
import androidx.databinding.DataBindingUtil;

public class BindingAdapterSampleActivity extends AppCompatActivity implements View.OnClickListener {
    private BindingAdapterSampleActivityBinder mBinder;
    private String[] imgs = {"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1598511355814&di=c75613350069928e71ca6b2bff281d81&imgtype=0&src=http%3A%2F%2Fgss0.baidu.com%2F94o3dSag_xI4khGko9WTAnF6hhy%2Fzhidao%2Fpic%2Fitem%2F3ac79f3df8dcd100729a38a1748b4710b9122f28.jpg",
            "https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=3817680383,144625441&fm=26&gp=0.jpg",
            "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1598511355813&di=db7dfc022df55e15a93df31a3b0bbbf8&imgtype=0&src=http%3A%2F%2Fb-ssl.duitang.com%2Fuploads%2Fitem%2F201902%2F21%2F20190221223924_cpibd.thumb.400_0.png",
            "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1598511355813&di=c4519f55eb59e7f09474e91106cbb8c9&imgtype=0&src=http%3A%2F%2Fgss0.baidu.com%2F7Po3dSag_xI4khGko9WTAnF6hhy%2Fzhidao%2Fwh%253D450%252C600%2Fsign%3D77ab8a3431adcbef01617602999f02eb%2F8b13632762d0f7033686262c08fa513d2697c50e.jpg",
            "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1598511355812&di=85c293cb58d0af1e6fcccd99e6e449c2&imgtype=0&src=http%3A%2F%2Fimg1.gamersky.com%2Fimage2015%2F06%2F20150618hzy_2%2Fgamersky_024small_048_20156181224C4E.jpg"};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinder = DataBindingUtil.setContentView(this, R.layout.activity_sample_binding_adapter);
        mBinder.setImage(new Image(imgs[0]));
        mBinder.setListener(this);
    }

    @Override
    public void onClick(View v) {
        mBinder.getImage().setUrl(imgs[new Random().nextInt(4)]);
    }

    // 所绑定的方法必须为静态方法
    @BindingAdapter("url")
    public static void loadImage(ImageView view, String url) {
        Glide.with(view.getContext()).load(url).into(view);
    }
}
