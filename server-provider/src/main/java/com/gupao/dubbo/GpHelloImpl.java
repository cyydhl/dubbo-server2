package com.gupao.dubbo;

/**
 * Created by Administrator on 2019/6/9.
 */
public class GpHelloImpl implements IGpHello {
    @Override
    public String sayHello(String msg) {
        return "Hello:" + msg;
    }
}
