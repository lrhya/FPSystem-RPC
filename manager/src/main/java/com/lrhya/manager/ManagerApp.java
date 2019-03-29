package com.lrhya.manager;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import static org.springframework.boot.SpringApplication.run;


@SpringBootApplication
@EntityScan(basePackages = {"com.lrhya.entity"})
public class ManagerApp {

    public static void main(String[] args) {
      run(ManagerApp.class,args);
    }
}
