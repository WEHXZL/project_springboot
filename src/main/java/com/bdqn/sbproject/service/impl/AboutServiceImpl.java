package com.bdqn.sbproject.service.impl;

import com.bdqn.sbproject.dao.AboutDao;
import com.bdqn.sbproject.pojo.About;
import com.bdqn.sbproject.service.AboutService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service("aboutService")
public class AboutServiceImpl implements AboutService {
    @Resource
    private AboutDao aboutDao;

    @Override
    public void insertAbout(About about) {
            this.aboutDao.insertAbout(about);
    }

    @Override
    public void updateAbout(About about) {
            this.aboutDao.updateAbout(about);
    }

    @Override
    public void deleteAbout(Integer id) {
            this.aboutDao.deleteAbout(id);
    }

    @Override
    public About selectAboutById(Integer id) {
        return this.aboutDao.selectAboutById(id);
    }

    @Override
    public List<About> selectAboutAll() {
        return this.aboutDao.selectAboutAll();
    }
}
