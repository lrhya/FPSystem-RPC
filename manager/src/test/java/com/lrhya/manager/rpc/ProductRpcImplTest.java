package com.lrhya.manager.rpc;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class ProductRpcImplTest {


//    @Autowired
    ProductRpcImpl productRpcImpl = new ProductRpcImpl();

    @Test
    public void query() {
    }

    @Test
    public void findOne() {
        productRpcImpl.findOne("001");
    }
}