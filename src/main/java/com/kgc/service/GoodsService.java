package com.kgc.service;

import com.github.pagehelper.PageInfo;
import com.kgc.entity.Goods;

import java.util.List;

public interface GoodsService {
    List<Goods>findAll();
    PageInfo findAlls(Goods goods, int page, int pageSize);
    Goods findById(int id);
    void insert(Goods goods);
    void update(Goods goods);
    void delete(int id);


}
