package com.lzf.ws.dto;

/**
 * Created by Administrator on 2017/5/3.
 */
public class Users {
    private String name;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Users(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public Users() {
    }
}
