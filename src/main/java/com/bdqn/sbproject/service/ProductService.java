package com.bdqn.sbproject.service;

import com.bdqn.sbproject.pojo.Product;

import java.util.List;

public interface ProductService {
    void insertProduct(Product product);
    void updateProduct(Product product);
    void deleteProduce(Integer id);
    Product selectProductById(Integer id);
    List<Product> selectProductAll();
}
