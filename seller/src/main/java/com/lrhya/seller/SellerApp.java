package com.lrhya.seller;


import com.lrhya.api.ProductRpc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


/**
 * 销售端启动类
 */
@SpringBootApplication
//@EnableCaching
//@EnableScheduling
//@EntityScan("com.lrhya.entity")
@ComponentScan(basePackageClasses = {ProductRpc.class})
public class SellerApp {
    public static void main(String[] args) {

        SpringApplication.run(SellerApp.class);
    }
}

