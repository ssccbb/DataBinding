package com.sung.databinding.sample;

public class User {
    public String user;
    public int age;

    public User() {
        setUser("张三");
        setAge(20);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
