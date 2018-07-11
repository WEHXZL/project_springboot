package com.bdqn.sbproject.service;

import com.bdqn.sbproject.pojo.Recruitment;

import java.util.List;

public interface RecruitmentService {
    void insertRecruitment(Recruitment recruitment);
    void updateRecruitment(Recruitment recruitment);
    void deleteRecruitment(Integer id);
    Recruitment selectRecruitmentById(Integer id);
    List<Recruitment> selectRecruitmentAll();
}
