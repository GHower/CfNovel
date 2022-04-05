package com.gh.home;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author ghower
 * @date 2022/3/26 22:24
 */
@SpringBootApplication
public class HomeApplication {
    public static void main(String[] args) {
        SpringApplication.run(HomeApplication.class,args);
        System.out.println("\n\n-----Home SUCCESS-----\n\n");
    }
}
