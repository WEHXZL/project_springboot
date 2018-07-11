package com.bdqn.sbproject.dao.impl;

import com.bdqn.sbproject.dao.RecruitmentDao;
import com.bdqn.sbproject.pojo.Recruitment;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository("recruitmentDao")
public class RecruitmentDaoImpl implements RecruitmentDao {

    @Resource
    private MongoTemplate mongoTemplate;

    @Override
    public void insertRecruitment(Recruitment recruitment) {
        this.mongoTemplate.insert(recruitment);
    }

    @Override
    public void updateRecruitment(Recruitment recruitment) {
        this.mongoTemplate.save(recruitment);
    }

    @Override
    public void deleteRecruitment(Integer id) {
        Query query = new Query();
        query.addCriteria(Criteria.where("id").is(id));
        this.mongoTemplate.remove(query, Recruitment.class);
    }

    @Override
    public Recruitment selectRecruitmentById(Integer id) {
        return this.mongoTemplate.findById(id, Recruitment.class);
    }

    @Override
    public List<Recruitment> selectRecruitmentAll() {
        return this.mongoTemplate.findAll(Recruitment.class);
    }
}
