package com.lrhya.api;

import com.googlecode.jsonrpc4j.JsonRpcService;
import com.lrhya.api.domain.ParamInf;
import com.lrhya.entity.Product;

import java.util.List;

/**
 * 产品相关的rpc服务
 */

@JsonRpcService("rpc/product") //这里不能以/开始例如 /products这是错误的
public interface ProductRpc {
    /**
     * 查询多个产品
     *
     * @param req
     * @return
     */
    List<Product> query(ParamInf req);

    /**
     * 查询单个产品
     *
     * @param id
     * @return
     */
    Product findOne(String id);


}
