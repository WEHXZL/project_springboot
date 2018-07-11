package com.bdqn.sbproject.service.impl;

import com.bdqn.sbproject.dao.ProductDao;
import com.bdqn.sbproject.pojo.Product;
import com.bdqn.sbproject.service.ProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service("productService")
public class ProductServiceImpl implements ProductService {
    @Resource
    private ProductDao productDao;
    @Override
    public void insertProduct(Product product) {
        this.productDao.insertProduct(product);
    }

    @Override
    public void updateProduct(Product product) {
        this.productDao.updateProduct(product);
    }

    @Override
    public void deleteProduce(Integer id) {
        this.productDao.deleteProduce(id);
    }

    @Override
    public Product selectProductById(Integer id) {
        return this.productDao.selectProductById(id);
    }

    @Override
    public List<Product> selectProductAll() {
        return this.productDao.selectProductAll();
    }
}
