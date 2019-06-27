package com.websocket.cn;

import com.websocket.cn.server.XjfcNettyServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class XjfcApplication {

    public static void main(String[] args) {
        SpringApplication.run(XjfcApplication.class, args);
        try {
            //启动器中需要new一个NettyServer，并显式调用启动netty
            new XjfcNettyServer(12345).start();
            System.out.println("https://blog.csdn.net/moshowgame");
            System.out.println("http://127.0.0.1:6688/netty-websocket/index");
        }catch(Exception e) {
            System.out.println("NettyServerError:"+e.getMessage());
        }
    }

}
