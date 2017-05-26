package com.mjmw365.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by yupeng on 2017/5/24.
 */
@SpringBootApplication
@EnableConfigServer

public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}