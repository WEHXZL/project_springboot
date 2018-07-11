package com.bdqn.sbproject.controller;

import com.bdqn.sbproject.pojo.About;
import com.bdqn.sbproject.service.AboutService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/about")
public class AboutController {

    @Resource
    private AboutService aboutService;

    @RequestMapping("/insert.do")
    public void insertAbout(About about){
        this.aboutService.insertAbout(about);
    }

    @GetMapping("/getAll.do")
    public List<About> selectAbout(){
       return this.aboutService.selectAboutAll();
    }

    @GetMapping("/getWhere.do")
    public About selectAboutById(Integer id){
       return this.aboutService.selectAboutById(id);
    }

    @GetMapping("/update.do")
    public void updateAbout(About about){
            this.aboutService.updateAbout(about);
    }

    @GetMapping("/delete.do")
    public void deleteAbout(Integer id){
            this.aboutService.deleteAbout(id);
    }

}
