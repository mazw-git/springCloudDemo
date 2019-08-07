package com.bbg.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.bbg.mapper.GoodsSkuRuleMapper;
import com.bbg.pojo.GoodsSkuRule;
import com.bbg.service.GoodsSkuRuleService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
@Service
public class GoodsSkuRuleServiceImpl extends ServiceImpl<GoodsSkuRuleMapper, GoodsSkuRule> implements
        GoodsSkuRuleService {
    @Autowired
    private GoodsSkuRuleMapper mapper;

    @Override
    public List<GoodsSkuRule> getSkuNum(Map<String,String> map) {
        // TODO Auto-generated method stub
        return mapper.getSkuNum(map);
    }

    @Override
    public PageInfo getSkuNumPage(Map<String, String> map,PageInfo pageInfo) {
        // TODO Auto-generated method stub
        PageHelper.startPage(pageInfo.getPageNum(), pageInfo.getPageSize());
        List<GoodsSkuRule>list = mapper.getSkuNum(map);
        pageInfo.setList(list);
        return pageInfo;
    }

    @Override
    public List<GoodsSkuRule> getGoodsSkuRuleList() {
        // TODO Auto-generated method stub
        return mapper.selectList(null);
    }
    
}
