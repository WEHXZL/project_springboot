package com.bdqn.sbproject.dao;

import com.bdqn.sbproject.pojo.Recruitment;

import java.util.List;

public interface RecruitmentDao {
        void insertRecruitment(Recruitment recruitment);
        void updateRecruitment(Recruitment recruitment);
        void deleteRecruitment(Integer id);
        Recruitment selectRecruitmentById(Integer id);
        List<Recruitment> selectRecruitmentAll();


}
