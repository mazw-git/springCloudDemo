package com.bbg.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.bbg.mapper.SpacemanReclassMapper;
import com.bbg.pojo.SpacemanReclass;
import com.bbg.service.SpacemanReclassService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Mazw
 * @since 2019-08-01
 */
@Service
public class SpacemanReclassServiceImpl extends ServiceImpl<SpacemanReclassMapper, SpacemanReclass> implements SpacemanReclassService {
   
    @Autowired
    private SpacemanReclassMapper spacemanReclassMapper;

    @Override
    public List<SpacemanReclass> getLayoutCategory(Map<String, String> map) {
        // TODO Auto-generated method stub
        return spacemanReclassMapper.getLayoutCategory(map);
    }
    @Override
    public PageInfo getLayoutCategoryPage(Map<String, String> map,PageInfo pageInfo) {
        PageHelper.startPage(pageInfo.getPageNum(), pageInfo.getPageSize());
        List<SpacemanReclass> list = spacemanReclassMapper.getLayoutCategory(map);
        pageInfo.setList(list);
        return pageInfo;
    }

    
    
    
}
