package com.bbg.service;

import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.IService;
import com.bbg.pojo.SpacemanReclass;
import com.github.pagehelper.PageInfo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Mazw
 * @since 2019-08-01
 */
public interface SpacemanReclassService extends IService<SpacemanReclass> {

    List<SpacemanReclass> getLayoutCategory(Map<String, String> map);

    PageInfo getLayoutCategoryPage(Map<String, String> map, PageInfo pageInfo);

}
