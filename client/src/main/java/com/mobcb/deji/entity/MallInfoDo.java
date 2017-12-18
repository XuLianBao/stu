/**
 *   Copyright (c) 2014-2017 墨博云舟 All Rights Reserved. 
 */

package com.mobcb.deji.entity;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * MallInfoDo : 商场信息Dto
 *
 * @author storm
 * @version 1.00
 * @since 2017-01-11 16:44
 */
@Entity(name = "mall_info")
@Table(name = "mall_info", schema ="mob_base_info")
public class MallInfoDo implements Serializable {

    /**
     * 主键id
     */
    private String id;

    /**
     * openid标识
     */
    private String openId;

    /**
     * 组织id
     */
    private String orgId;

    /**
     * 商场编号
     */
    private String mallNo;

    /**
     * 名称
     */
    private String name;

    /**
     * 地址
     */
    private String address;

    /**
     * 区域Id
     */
    private String areaId;

    /**
     * 城市Id
     */
    private String cityId;

    /**
     * 省份Id
     */
    private String provinceId;

    /**
     * logo地址
     */
    private String logo;

    /**
     * x坐标
     */
    private Double pointX;

    /**
     * y坐标
     */
    private Double pointY;

    /**
     * 联系电话
     */
    private String telephone;

    /**
     * 创建时间
     */
    private Long createTime;

    /**
     * 修改时间
     */
    private Long modifyTime;

    /**
     * 图片地址
     */
    private String images;

    /**
     * 描述
     */
    private String description;

    /**
     * 简介
     */
    private String introduction;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 商店id
     */
    private String shopId;

    /**
     * 是否为总店
     */
    private Integer isHeadquarters;

    /**
     * 开户银行
     */
    private String openBank;

    /**
     * 开户账号
     */
    private String openBankAccount;

    /**
     * 税号
     */
    private String dutyParagraph;

    /**
     * 公司电话
     */
    private String companyPhone;

    /**
     * 钱数
     */
    private String money;


    public String getId() {

        return id;
    }

    public void setId(String id) {

        this.id = id;
    }

    public String getOpenId() {

        return openId;
    }

    public void setOpenId(String openId) {

        this.openId = openId;
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

    public String getAddress() {

        return address;
    }

    public void setAddress(String address) {

        this.address = address;
    }

    public String getAreaId() {

        return areaId;
    }

    public void setAreaId(String areaId) {

        this.areaId = areaId;
    }

    public String getCityId() {

        return cityId;
    }

    public void setCityId(String cityId) {

        this.cityId = cityId;
    }

    public String getProvinceId() {

        return provinceId;
    }

    public void setProvinceId(String provinceId) {

        this.provinceId = provinceId;
    }

    public String getLogo() {

        return logo;
    }

    public void setLogo(String logo) {

        this.logo = logo;
    }

    public Double getPointX() {

        return pointX;
    }

    public void setPointX(Double pointX) {

        this.pointX = pointX;
    }

    public Double getPointY() {

        return pointY;
    }

    public void setPointY(Double pointY) {

        this.pointY = pointY;
    }

    public String getTelephone() {

        return telephone;
    }

    public void setTelephone(String telephone) {

        this.telephone = telephone;
    }

    public Long getCreateTime() {

        return createTime;
    }

    public void setCreateTime(Long createTime) {

        this.createTime = createTime;
    }

    public Long getModifyTime() {

        return modifyTime;
    }

    public void setModifyTime(Long modifyTime) {

        this.modifyTime = modifyTime;
    }

    public String getImages() {

        return images;
    }

    public void setImages(String images) {

        this.images = images;
    }

    public String getDescription() {

        return description;
    }

    public void setDescription(String description) {

        this.description = description;
    }

    public String getIntroduction() {

        return introduction;
    }

    public void setIntroduction(String introduction) {

        this.introduction = introduction;
    }

    public Integer getStatus() {

        return status;
    }

    public void setStatus(Integer status) {

        this.status = status;
    }

    public String getShopId() {

        return shopId;
    }

    public void setShopId(String shopId) {

        this.shopId = shopId;
    }

    public String getOrgId() {

        return orgId;
    }

    public void setOrgId(String orgId) {

        this.orgId = orgId;
    }

    public Integer getIsHeadquarters() {

        return isHeadquarters;
    }

    public void setIsHeadquarters(Integer isHeadquarters) {

        this.isHeadquarters = isHeadquarters;
    }

    public String getOpenBank() {
        return openBank;
    }

    public void setOpenBank(String openBank) {
        this.openBank = openBank;
    }

    public String getOpenBankAccount() {
        return openBankAccount;
    }

    public void setOpenBankAccount(String openBankAccount) {
        this.openBankAccount = openBankAccount;
    }

    public String getDutyParagraph() {
        return dutyParagraph;
    }

    public void setDutyParagraph(String dutyParagraph) {
        this.dutyParagraph = dutyParagraph;
    }

    public String getCompanyPhone() {
        return companyPhone;
    }

    public void setCompanyPhone(String companyPhone) {
        this.companyPhone = companyPhone;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }
}
