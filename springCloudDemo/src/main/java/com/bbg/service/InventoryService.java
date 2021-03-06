package com.bbg.service;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.service.IService;
import com.bbg.pojo.Inventory;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Yanghu
 * @since 2019-08-01
 */
@DS("mysql")
public interface InventoryService extends IService<Inventory> {

}
