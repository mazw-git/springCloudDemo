package com.bbg.mapper;

import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.bbg.pojo.SpacemanReclass;

public interface SpacemanReclassMapper extends BaseMapper<SpacemanReclass>{

    List<SpacemanReclass> getLayoutCategory(Map<String, String> map);
    
}
