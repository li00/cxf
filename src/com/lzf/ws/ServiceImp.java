package com.lzf.ws;

import com.lzf.ws.dto.Users;

import javax.jws.WebService;

/**
 * Created by Administrator on 2017/5/3.
 */
@WebService
public class ServiceImp implements IService {
    @Override
    public String sya(String name) {
        return "你好"+name;
    }

    @Override
    public Users getUser(String name, String age) {
        Users user=new Users(name,age);
        return user;
    }
}
