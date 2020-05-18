package com.can;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class GitStudyApplication {

    public static void main(String[] args) {
        log.info("application starting ...");
        SpringApplication.run(GitStudyApplication.class, args);
    }

}
