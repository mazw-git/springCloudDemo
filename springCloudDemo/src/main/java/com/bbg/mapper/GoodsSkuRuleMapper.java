package com.bbg.mapper;

import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.bbg.pojo.GoodsSkuRule;
import com.github.pagehelper.PageInfo;

public interface GoodsSkuRuleMapper extends BaseMapper<GoodsSkuRule> {
    List<GoodsSkuRule> getSkuNum(Map<String,String> map);

    
}
