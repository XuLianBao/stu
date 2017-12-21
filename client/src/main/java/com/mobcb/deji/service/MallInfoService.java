/**
 * Copyright (C) 2014-2017 南京墨博云舟信息科技有限公司 All Rights Reserved.
 */
package com.mobcb.deji.service;

import com.mobcb.deji.entity.MallInfoDo;
import com.mobcb.deji.model.BaseQueryModel;

import java.util.List;

/**
 *MallInfoService ：
 *
 *@author xlb
 *@version 1.00
 *@since 2017/12/14 10:10
 */
public interface MallInfoService {
    List<MallInfoDo> findAll(String name);
    List<MallInfoDo> selectListOrPageBySql(BaseQueryModel queryModel);
}
