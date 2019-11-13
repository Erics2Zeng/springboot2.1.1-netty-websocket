package com.sjs.storage;


import com.sjs.storage.netty.NettyServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StorageApplication {
    public static void main(String[] args) {
        SpringApplication.run(StorageApplication.class, args);
        try {
            System.out.println("http://127.0.0.1:12345/ws/index");
            new NettyServer(12345).start();
        }catch(Exception e) {
            System.out.println("NettyServerError:"+e.getMessage());
        }
    }
}
