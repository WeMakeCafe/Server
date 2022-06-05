package com.wmcserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@EnableJpaAuditing
public class WmcServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(WmcServerApplication.class, args);

    }
}
