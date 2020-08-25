package com.sung.databinding;

/**
 * Create by sung at 2020/8/24
 *
 * @desc:
 * @notice:
 */
public class User {
    public String user;
    public int age;

    public User(String user, int age) {
        this.user = user;
        this.age = age;
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
