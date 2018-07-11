package com.bdqn.sbproject.service.impl;

import com.bdqn.sbproject.dao.RecruitmentDao;
import com.bdqn.sbproject.pojo.Recruitment;
import com.bdqn.sbproject.service.RecruitmentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service("recruitmentService")
public class RecruitmentServiceImpl implements RecruitmentService {
    @Resource
    private RecruitmentDao recruitmentDao;

    @Override
    public void insertRecruitment(Recruitment recruitment) {
            this.recruitmentDao.insertRecruitment(recruitment);
    }

    @Override
    public void updateRecruitment(Recruitment recruitment) {
            this.recruitmentDao.updateRecruitment(recruitment);
    }

    @Override
    public void deleteRecruitment(Integer id) {
            this.recruitmentDao.deleteRecruitment(id);
    }

    @Override
    public Recruitment selectRecruitmentById(Integer id) {
        return  this.recruitmentDao.selectRecruitmentById(id);
    }


    @Override
    public List<Recruitment> selectRecruitmentAll() {
        return this.recruitmentDao.selectRecruitmentAll();
    }
}
