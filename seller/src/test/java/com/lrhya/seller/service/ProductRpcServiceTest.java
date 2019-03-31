package com.lrhya.seller.service;

import com.lrhya.api.ProductRpc;
import com.lrhya.manager.rpc.ProductRpcImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class ProductRpcServiceTest {



    //@Autowired
    ProductRpcService productRpcService = new ProductRpcService();
    ProductRpc productRpc = new ProductRpcImpl();
    @Test
    public void testfindAll() {
     productRpcService.findAll();
    }


    @Test
    public void findOne(){
        productRpc.findOne("1");
    }



}