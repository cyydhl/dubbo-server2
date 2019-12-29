package com.gupao.dubbo;

import com.alibaba.dubbo.container.Main;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by Administrator on 2019/6/9.
 */
public class BootStrap {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("dubbo-server.xml");
        context.start();
        System.in.read();//阻塞当前进程
    }

}
