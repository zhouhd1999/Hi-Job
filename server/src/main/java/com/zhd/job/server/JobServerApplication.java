package com.zhd.job.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.zhd"})
public class JobServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(JobServerApplication.class);
    }
}
