/**
 * Copyright (C) 2014-2017 南京墨博云舟信息科技有限公司 All Rights Reserved.
 */
package com.mobcb.deji.config;

import com.mobcb.deji.utils.SpringUtils;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *ConfigBean ：
 *
 *@author xlb
 *@version 1.00
 *@since 2017/12/18 19:25
 */
@Configuration
public class ConfigBean {

    @Bean("beanProperties")
    public YmlConfig getProperties(){
        YmlConfig ymlConfig = null;
        try {
           ymlConfig =  (YmlConfig) SpringUtils.getBean("ymlConfig");
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return ymlConfig;
    }
}
