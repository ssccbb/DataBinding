package com.sung.databinding.model;

import com.sung.databinding.BR;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

/**
 * Create by sung at 2020/8/27
 *
 * @desc:
 * @notice:åœ
 */
public class Image extends BaseObservable {
    private String url;

    public Image(String url) {
        setUrl(url);
    }

    @Bindable
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
        notifyPropertyChanged(BR.url);
    }
}
