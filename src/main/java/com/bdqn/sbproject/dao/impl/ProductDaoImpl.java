package com.bdqn.sbproject.dao.impl;

import com.bdqn.sbproject.dao.ProductDao;
import com.bdqn.sbproject.pojo.Product;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;
@Repository("productDao")
public class ProductDaoImpl implements ProductDao {
    @Resource
    private MongoTemplate mongoTemplate;
    @Override
    public void insertProduct(Product product) {
        this.mongoTemplate.insert(product);
    }

    @Override
    public void updateProduct(Product product) {
        this.mongoTemplate.save(product);
    }

    @Override
    public void deleteProduce(Integer id) {
        Query query = new Query();
        query.addCriteria(Criteria.where("id").is(id));
        this.mongoTemplate.remove(query, Product.class);
    }

    @Override
    public Product selectProductById(Integer id) {
        return this.mongoTemplate.findById(id,Product.class);
    }

    @Override
    public List<Product> selectProductAll() {
        return this.mongoTemplate.findAll(Product.class);
    }
}
