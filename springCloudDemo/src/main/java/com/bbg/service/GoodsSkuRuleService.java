package com.bbg.service;

import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.IService;
import com.bbg.pojo.GoodsSkuRule;
import com.github.pagehelper.PageInfo;

public interface GoodsSkuRuleService extends IService<GoodsSkuRule> {

      List<GoodsSkuRule> getSkuNum(Map<String,String> map);
      
      PageInfo getSkuNumPage(Map<String, String> map, PageInfo pageInfo);

      List<GoodsSkuRule> getGoodsSkuRuleList();

}
