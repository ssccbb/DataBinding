package com.sung.databinding.model;

import androidx.databinding.ObservableField;
import androidx.databinding.ObservableInt;

public class FieldUser {
    public String user;
    public ObservableInt age;
    public ObservableField<String> grade;
    public ObservableField<String> sex;

    public FieldUser() {
        this.user = "张三";
        this.age = new ObservableInt(20);
        this.grade = new ObservableField<>("level:20");
        this.sex = new ObservableField<>("男");
    }
}
