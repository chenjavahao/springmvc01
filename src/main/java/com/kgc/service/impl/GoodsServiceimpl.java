package com.kgc.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kgc.dao.GoodsMapper;
import com.kgc.entity.Goods;
import com.kgc.entity.GoodsExample;
import com.kgc.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GoodsServiceimpl implements GoodsService {
    @Autowired
    private GoodsMapper goodsMapper;
    @Override
    public List<Goods> findAll() {
        GoodsExample goodsExample=new GoodsExample();
        return goodsMapper.selectByExample(goodsExample);
    }

    @Override
    public PageInfo<Goods> findAlls(Goods goods, int page, int pageSize) {
        GoodsExample goodsExample=new GoodsExample();
        GoodsExample.Criteria criteria = goodsExample.createCriteria();
        if (goods.getTypeid()>0){
            criteria.andTypeidEqualTo(goods.getTypeid());
        }
        if (goods.getName()!=null && goods.getName().trim().length()>0){
            criteria.andNameLike("%"+goods.getName()+"%");
        }
        PageHelper.startPage(page,pageSize);
        List<Goods> list = goodsMapper.selectByExample(goodsExample);
        PageInfo<Goods> pageInfo=new PageInfo<Goods>(list);
        return pageInfo;
    }

    @Override
    public Goods findById(int id) {
        return goodsMapper.selectByPrimaryKey(id);
    }

    @Override
    public void insert(Goods goods) {
        goodsMapper.insert(goods);
       // goodsMapper.insertSelective(goods);
    }

    @Override
    public void update(Goods goods) {
       // goodsMapper.updateByPrimaryKey(goods);
        goodsMapper.updateByPrimaryKeySelective(goods);
    }

    @Override
    public void delete(int id) {
        goodsMapper.deleteByPrimaryKey(id);
    }
}
