package com.imikasa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author mikasa
 * @date 2022-11-12
 *
 * 一个SpringBoot 的 HelloWorld 入门程序；加入如何全局统一返回
 *
 */

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
