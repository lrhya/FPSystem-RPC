package com.lrhya.manager.rpc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ProductRpcImplTest {


    @Autowired
    ProductRpcImpl productRpcImpl;

    @Test
    public void query() {
    }

    @Test
    public void findOne() {
        productRpcImpl.findOne("T001");
    }


}