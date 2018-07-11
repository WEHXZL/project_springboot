package com.bdqn.sbproject.dao.impl;

import com.bdqn.sbproject.dao.NewsDao;
import com.bdqn.sbproject.pojo.News;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository("newsDao")
public class NewsDaoImpl implements NewsDao{
    @Resource
    private MongoTemplate mongoTemplate;

    @Override
    public void insertNews(News news) {
        this.mongoTemplate.insert(news);
    }

    @Override
    public void updateNews(News news) {
        this.mongoTemplate.save(news);
    }

    @Override
    public void deleteNews(Integer id) {
        Query query = new Query();
        query.addCriteria(Criteria.where("id").is(id));
        this.mongoTemplate.remove(query,News.class);
    }

    @Override
    public News selectNewsById(Integer id) {
        return this.mongoTemplate.findById(id,News.class);
    }

    @Override
    public List<News> selectNewsAll() {
        return this.mongoTemplate.findAll(News.class);
    }
}
