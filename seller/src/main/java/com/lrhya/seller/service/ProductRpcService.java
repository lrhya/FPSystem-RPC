package com.lrhya.seller.service;


import com.lrhya.api.ProductRpc;
import com.lrhya.api.domain.ProductRpcReq;
import com.lrhya.entity.Product;
import com.lrhya.entity.enums.ProductStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * 产品相关服务
 */
@Service
@ComponentScan(basePackages = {"com.lrhya.api"})
public class ProductRpcService {

    private static Logger LOG = LoggerFactory.getLogger(ProductRpcService.class);


    @Autowired
    ProductRpc productRpc;


    /**
     * 查询全部产品
     *
     * @return
     */
    public List<Product> findAll() {
        ProductRpcReq req = new ProductRpcReq();
        List<String> status = new ArrayList<>();
        status.add(ProductStatus.IN_SELL.name());
        //  Pageable pageable = (Pageable) PageRequest.of(0, 1000, Sort.Direction.DESC, "rewardRate");
//        Pageable pageable = (Pageable) new PageRequest(0,1000, Sort.Direction.DESC,"rewardRate");
        req.setStatusList(status);
      /*  req.setPag(0);
        req.setPageSize(1000);
        req.setDirection(Sort.Direction.DESC);
        req.setOrderBy("rewardRate");*/
        LOG.info("rpc查询全部产品，请求：{}", req);
        if (productRpc == null) {
            System.out.println(222);
        }
        List<Product> result = productRpc.query(req);
        LOG.info("rpc查询全部产品，结果：{}", req);
        return result;
    }

    public Product findOne(String id) {
        LOG.info("rpc查询全部产品，请求：{}", id);
        Product result = productRpc.findOne(id);
        LOG.info("rpc查询全部产品，结果：{}", result);
        return result;
    }

    @PostConstruct
    public void init(){
        findOne("001");
    }
}
