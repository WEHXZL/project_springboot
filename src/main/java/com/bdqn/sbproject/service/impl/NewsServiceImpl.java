package com.bdqn.sbproject.service.impl;

import com.bdqn.sbproject.dao.NewsDao;
import com.bdqn.sbproject.pojo.News;
import com.bdqn.sbproject.service.NewsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service("newsService")
public class NewsServiceImpl implements NewsService {
    @Resource
    private NewsDao newsDao;

    @Override
    public void insertNews(News news) {
            this.newsDao.insertNews(news);
    }

    @Override
    public void updateNews(News news) {
            this.newsDao.updateNews(news);
    }

    @Override
    public void deleteNews(Integer id) {
            this.newsDao.deleteNews(id);
    }

    @Override
    public News selectNewsById(Integer id) {
        return newsDao.selectNewsById(id);
    }

    @Override
    public List<News> selectNewsAll() {
        return newsDao.selectNewsAll();
    }
}
