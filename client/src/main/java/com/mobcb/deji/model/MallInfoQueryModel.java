
package com.mobcb.deji.model;

/**
 * MallInfoQueryModel : 商场查询model
 *
 * @version 1.00
 * @since 2017-02-24 15:12
 */
public class MallInfoQueryModel extends BaseQueryModel {

    /**
     * 城市id
     */
    private String cityId;
    /**
     * 是否为总店
     */
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
