package com.swjd.controller;

import com.swjd.pojo.Good;
import com.swjd.service.IGoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class GoodController {
    @Autowired
    private IGoodService iGoodService;
    @RequestMapping("findGood")
    public ModelAndView findAll(Good good){
            ModelAndView mv = new ModelAndView("index.jsp");
            List<Good> goodList = iGoodService.findByName(good);
        for (Good g : goodList) {
            System.out.println(g);
        }
            mv.addObject("goodList",goodList);
            return mv;

    }
    @RequestMapping("add")
    public ModelAndView add(Good good){
        iGoodService.add(good);
        return findAll(null);
    }
    @RequestMapping("update")
    public ModelAndView update(Good good){
        iGoodService.update(good);
        System.out.println("update");
        return findAll(null);
    }
    @RequestMapping("updateChange")
    public ModelAndView updateChange(int id){
        Good one = iGoodService.findOne(id);
        ModelAndView mv = new ModelAndView("update.jsp");
        mv.addObject("good1",one);
        return mv;
    }
    @RequestMapping("delete")
    public ModelAndView delete(int id){
        System.out.println(id+"id");
        iGoodService.delete(id);
        return findAll(null);
    }
}
