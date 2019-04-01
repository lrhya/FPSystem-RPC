package com.lrhya.manager.service;

import com.lrhya.entity.Product;
import com.lrhya.manager.repositories.ProductRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ProductServiceTest {


    @Autowired
    private ProductRepository repository;


    @Test
    public void addProduct() {
    }

    @Test
    public void findOne() {

        Product product = repository.findById("001").orElse(null);

        System.out.println(product.toString());
    }

    @Test
    public void query() {

    }
}