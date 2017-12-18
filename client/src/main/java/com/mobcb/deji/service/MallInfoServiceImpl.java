/**
 * Copyright (C) 2014-2017 南京墨博云舟信息科技有限公司 All Rights Reserved.
 */
package com.mobcb.deji.service;

import com.mobcb.deji.entity.MallInfoDo;
import com.mobcb.deji.mapper.MallMapper;
import com.mobcb.deji.model.BaseQueryModel;

import org.springframework.stereotype.Service;

import java.util.List;

import javax.annotation.Resource;

/**
 *MallInfoService ：
 *
 *@author xlb
 *@version 1.00
 *@since 2017/12/14 10:09
 */
@Service("mallInfoService")
public class MallInfoServiceImpl implements MallInfoService {

    @Resource
    MallMapper mallMapper;

    @Override
    public List<MallInfoDo> findAll(String name) {
        return mallMapper.findByName(name);
    }

    @Override
    public List<MallInfoDo> selectListOrPageBySql(BaseQueryModel queryModel) {
        return mallMapper.selectListOrPageBySql(queryModel);
    }
}
