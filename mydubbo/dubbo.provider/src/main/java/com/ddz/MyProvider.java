package com.ddz;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableDubbo // 开始dubbo通信
@EnableHystrix // 熔断
public class MyProvider {
    public static void main(String[] args) {
        SpringApplication.run(MyProvider.class, args);
    }
}
