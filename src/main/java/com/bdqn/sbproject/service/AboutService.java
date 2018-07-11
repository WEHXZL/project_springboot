package com.bdqn.sbproject.service;

import com.bdqn.sbproject.pojo.About;

import java.util.List;

public interface AboutService {
    void insertAbout(About about);
    void updateAbout(About about);
    void deleteAbout(Integer id);
    About selectAboutById(Integer id);
    List<About> selectAboutAll();
}
