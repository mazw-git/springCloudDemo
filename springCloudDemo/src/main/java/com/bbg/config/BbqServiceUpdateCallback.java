package com.bbg.config;


import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.model.ConfigChangeEvent;
import com.ctrip.framework.apollo.spring.annotation.ApolloConfig;
import com.ctrip.framework.apollo.spring.annotation.ApolloConfigChangeListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class BbqServiceUpdateCallback {

    protected static final Logger LOGGER = LoggerFactory.getLogger(BbqServiceUpdateCallback.class);

    /*private static ApplicationContext applicationContext;
    @Resource
    private BbgJobExecutor bbgJobExecutor;
    private static List<AdminBiz> adminBizList;*/

    @ApolloConfig
    private Config config;
    @ApolloConfigChangeListener
    private void onRedisChange(ConfigChangeEvent changeEvent) throws Exception{
    //    Address.address = changeEvent.getChange("xxl.job.admin.addresses").getNewValue();
    }
}

