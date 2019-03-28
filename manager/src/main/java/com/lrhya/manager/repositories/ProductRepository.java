package com.lrhya.manager.repositories;


import com.lrhya.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * 产品管理
 */

public interface ProductRepository extends PagingAndSortingRepository<Product, String>, JpaRepository<Product, String>, JpaSpecificationExecutor<Product> {
}


