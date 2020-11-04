package com.kgc.controller;

import com.kgc.entity.Goods;
import com.kgc.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("goods")
public class GoodsServlet {
    @Autowired
    private GoodsService goodsService;
    @RequestMapping("login")
    public String login(String goodsName, String goodsPwd, Model model){
        System.out.println("goodsName:"+goodsName+"goodsPwd:"+goodsPwd);
        if ("admin".equalsIgnoreCase(goodsName)&&"admin".equalsIgnoreCase(goodsPwd)){
            model.addAttribute("mas","holleMsg");
            return "success";
        }else {
            return "error";
        }
    }
    @RequestMapping("listAll")
    public String listAll(Model model){
        List<Goods> list = goodsService.findAll();
        if (list!=null){
            model.addAttribute("list",list);
            return "list";
        }else {
            return "login";
        }
    }
}
