package com.sung.databinding.model;

import com.sung.databinding.BR;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

public class ObsUser extends BaseObservable {
    // 单个字段需要自动刷新ui添加@Bindable注解
    // public 修饰直接加在变量上
    // private 修饰加载public的get方法上
    private String user;
    private int age;
    private String grade;
    @Bindable
    public String sex;

    public ObsUser() {
        setUser("张三");
        setAge(20);
        setSex("男");
        setGrade(10);
    }

    @Bindable
    public String getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = "level:" + grade;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
        // 单独更新
        notifyPropertyChanged(BR.sex);
    }

    @Bindable
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        // 更新全部
        notifyChange();
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
