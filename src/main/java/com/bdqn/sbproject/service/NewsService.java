package com.bdqn.sbproject.service;

import com.bdqn.sbproject.pojo.News;

import java.util.List;

public interface NewsService {
    void insertNews(News news);
    void updateNews(News news);
    void deleteNews(Integer id);
    News selectNewsById(Integer id);
    List<News> selectNewsAll();
}
