package com.lzf.ws.client.test;

import com.lzf.ws.client.IService;
import com.lzf.ws.client.ServiceImpService;
import com.lzf.ws.client.Users;

/**
 * Created by Administrator on 2017/5/3.
 */
public class TestClient {
    public static void main(String[] args) {

        ServiceImpService service = new ServiceImpService();
        IService i = service.getServiceImpPort();

        /*String say = i.sya("张三");*/

        Users u = i.getUser("张三","22");

        System.out.println(u.toString());

    }
}
