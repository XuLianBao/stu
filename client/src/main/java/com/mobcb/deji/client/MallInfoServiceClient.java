
package com.mobcb.deji.client;


import com.mobcb.deji.entity.MallInfoDo;
import com.mobcb.deji.req.MallInfoQueryReq;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

import static com.mobcb.deji.client.MallInfoServiceClient.PATH;

/**
 *
 * @version 1.00
 * @since 2017-01-16 17:21
 */
@FeignClient(name = "mallInfo", path = PATH)
public interface MallInfoServiceClient {
    String PATH = "service/v1/baseinfos/malls";

    /**
     * 根据分页查询操作权限配置
     *
     * @param mallInfoQueryReq 搜索字段用实体类封装
     *
     * @return @
     */
    @RequestMapping(value = "/search", method = RequestMethod.POST,produces= MediaType.APPLICATION_JSON_VALUE)
    List<MallInfoDo> selectMallInfoListWithPageByExample(@RequestBody MallInfoQueryReq mallInfoQueryReq);

    @RequestMapping(value = "/isOk", method = RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
    String isSuccess(@RequestParam("name") String name);

}
