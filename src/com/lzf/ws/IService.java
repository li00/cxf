package com.lzf.ws;

import com.lzf.ws.dto.Users;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Created by Administrator on 2017/5/3.
 */
@WebService
public interface IService {
    @WebMethod
    public String sya(@WebParam String name);

    @WebMethod
    public Users getUser(@WebParam String name,@WebParam String age);
}
