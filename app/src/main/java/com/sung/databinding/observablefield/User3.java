package com.sung.databinding.observablefield;

import androidx.databinding.ObservableField;
import androidx.databinding.ObservableInt;

public class User3 {
    private String user;
    private ObservableInt age;
    private ObservableField<String> grade;
    private ObservableField<String> sex;

    public User3() {
        setUser("张三");
        setAge(20);
        setSex("男");
        setGrade(10);
    }

    public String getGrade() {
        return grade.get();
    }

    public void setGrade(int grade) {
        if (this.grade == null){
            this.grade = new ObservableField<>("level:" + grade);
            return;
        }
        this.grade.set("level:" + grade);
        this.grade.notifyChange();
    }

    public String getSex() {
        return sex.get();
    }

    public void setSex(String sex) {
        if (this.sex == null){
            this.sex = new ObservableField<>(sex);
            return;
        }
        this.sex.set(sex);
        this.sex.notifyChange();
    }

    public int getAge() {
        return age.get();
    }

    public void setAge(int age) {
        if (this.age == null){
            this.age = new ObservableInt(age);
            return;
        }
        this.age.set(age);
        this.age.notifyChange();
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
