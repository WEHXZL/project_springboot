package com.bdqn.sbproject.dao.impl;

import com.bdqn.sbproject.dao.AboutDao;
import com.bdqn.sbproject.pojo.About;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;
@Repository("aboutDao")
public class AboutDaoImpl implements AboutDao {

    @Resource
    private MongoTemplate mongoTemplate;
    @Override
    public void insertAbout(About about) {
        this.mongoTemplate.insert(about);
    }

    @Override
    public void updateAbout(About about) {
        this.mongoTemplate.save(about);
    }

    @Override
    public void deleteAbout(Integer id) {
        Query qurey = new Query();
        qurey.addCriteria(Criteria.where("id").is(id));
        this.mongoTemplate.remove(qurey,About.class);
    }

    @Override
    public About selectAboutById(Integer id) {
        return this.mongoTemplate.findById(id,About.class);
    }

    @Override
    public List<About> selectAboutAll() {
        return this.mongoTemplate.findAll(About.class);
    }
}
