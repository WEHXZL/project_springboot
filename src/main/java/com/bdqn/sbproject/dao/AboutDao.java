package com.bdqn.sbproject.dao;

import com.bdqn.sbproject.pojo.About;

import java.util.List;

public interface AboutDao {
    void insertAbout(About about);
    void updateAbout(About about);
    void deleteAbout(Integer id);
    About selectAboutById(Integer id);
    List<About> selectAboutAll();
}
