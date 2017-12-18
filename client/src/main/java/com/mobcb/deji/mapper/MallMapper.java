
package com.mobcb.deji.mapper;

import com.mobcb.deji.entity.MallInfoDo;
import com.mobcb.deji.model.BaseQueryModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

import tk.mybatis.mapper.common.MySqlMapper;

/**
 *MallMapper ：
 *
 *@author xlb
 *@version 1.00
 *@since 2017/12/14 10:07
 */
@Mapper
public interface MallMapper extends tk.mybatis.mapper.common.Mapper<MallInfoDo>, MySqlMapper<MallInfoDo> {

    /**
     * 查询指定名称的商户信息
     * @param name 商户名称
     * @return 商户列表
     */
    @Select("SELECT * FROM mob_base_info.mall_info WHERE  1=1  AND(#{name} IS NULL OR  NAME LIKE #{name})")
    List<MallInfoDo> findByName(@Param("name") String name);

    /**
     *
     * @param queryModel 查询模型
     * @return 商铺结果
     */
    List<MallInfoDo> selectListOrPageBySql(BaseQueryModel queryModel);
}
