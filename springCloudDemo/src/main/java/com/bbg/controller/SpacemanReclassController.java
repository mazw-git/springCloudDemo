package com.bbg.controller;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;











import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.plugins.Page;
import com.bbg.pojo.GoodsSkuRule;
import com.bbg.pojo.Inventory;
import com.bbg.pojo.SpacemanReclass;
import com.bbg.service.GoodsSkuRuleService;
import com.bbg.service.InventoryService;
import com.bbg.service.SpacemanReclassService;
import com.github.pagehelper.PageInfo;


@Controller
@RequestMapping("/spacemanReclass")
public class SpacemanReclassController {
    private static final Logger logger = LoggerFactory.getLogger(SpacemanReclassController.class);

    @Autowired
    private SpacemanReclassService spacemanReclassService;
    
    @Autowired
    private GoodsSkuRuleService goodsSkuRuleService;
    
    @Autowired
    private InventoryService inventoryService;
    
    @ResponseBody
    @RequestMapping("/getSkuNum")
    private List<GoodsSkuRule> getSkuNum(@RequestParam Map<String,String> map){
        return goodsSkuRuleService.getSkuNum(map);
    }
    
    @ResponseBody
    @RequestMapping("/getSkuNumPage")
    private PageInfo getSkuNumPage(@RequestParam Map<String,String> map,PageInfo pageInfo){
        return goodsSkuRuleService.getSkuNumPage(map,pageInfo);
    }
    
    
    @ResponseBody
    @RequestMapping("/getLayoutCategory")
    private List<SpacemanReclass> getLayoutCategory(@RequestParam Map<String,String> map){
        List<SpacemanReclass> list = spacemanReclassService.getLayoutCategory(map);
        return list;
    }
    
    @ResponseBody
    @RequestMapping("/getLayoutCategoryPage")
    private PageInfo getLayoutCategoryPage(@RequestParam Map<String,String> map,PageInfo pageInfo){
//        pageInfo.setPageNum(1);
//        pageInfo.setPageSize(10);
        return spacemanReclassService.getLayoutCategoryPage(map,pageInfo);
    }
    
    
    @ResponseBody
    @RequestMapping("/getGoodsSkuRuleList")
    public List<GoodsSkuRule> getGoodsSkuRuleList(){
        return goodsSkuRuleService.getGoodsSkuRuleList();
    }
    @ResponseBody
    @RequestMapping("/testDynamicDatasource")
    @DS("mysql")
    public List<Inventory> testDynamicDatasource(){
       List<Inventory> list = inventoryService.selectList(null);
       return list;
    }
}
