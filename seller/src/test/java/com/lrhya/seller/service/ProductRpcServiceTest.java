package com.lrhya.seller.service;

import com.lrhya.api.ProductRpc;
import com.lrhya.api.domain.ProductRpcReq;
import com.lrhya.entity.Product;
import com.lrhya.entity.enums.ProductStatus;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductRpcServiceTest {

    private static Logger LOG = LoggerFactory.getLogger(ProductRpcServiceTest.class);



    @Autowired
    ProductRpc productRpc;

    @Test
    public void findOne() {
        Product product = productRpc.findOne("001");
        Assert.assertNotNull(product);
        System.out.println(product.toString());
    }


    @Test
    public void findAll() {
        ProductRpcReq req = new ProductRpcReq();
        List<String> status = new ArrayList<>();
        status.add(ProductStatus.IN_SELL.name());
        req.setStatusList(status);
        LOG.info("rpc查询全部产品，请求：{}", req);
        if (productRpc == null) {
            System.out.println("============ NULL ===============");
        }
        List<Product> result = productRpc.query(req);
        LOG.info("rpc查询全部产品，结果：{}", req);
        System.out.println("============ NULL ===============");
        result.forEach((e) -> System.out.println(e));

    }

    @Test
    public void testFindAll() {
    }
}