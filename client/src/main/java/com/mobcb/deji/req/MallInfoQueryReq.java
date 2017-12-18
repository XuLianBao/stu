/**
 *   Copyright (c) 2014-2017 墨博云舟 All Rights Reserved. 
 */
package com.mobcb.deji.req;


/**
 * MallInfoQueryModel : 商场查询model
 *
 * @version 1.00
 * @since 2017-02-24 15:12
 */
public class MallInfoQueryReq extends BaseQueryReq {

    private String cityId;

    private Integer status;

    private Integer isHeadquarters;

    /**
     * 编号
     */
    private String mallNo;

    /**
     * 商场名称
     */
    private String name;

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    @Override
    public Integer getStatus() {
        return status;
    }

    @Override
    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getIsHeadquarters() {
        return isHeadquarters;
    }

    public void setIsHeadquarters(Integer isHeadquarters) {
        this.isHeadquarters = isHeadquarters;
    }

    public String getMallNo() {
        return mallNo;
    }

    public void setMallNo(String mallNo) {
        this.mallNo = mallNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
