package com.mobcb.deji.ctrl;

import com.mobcb.deji.client.MallInfoServiceClient;
import com.mobcb.deji.config.YmlConfig;
import com.mobcb.deji.entity.MallInfoDo;
import com.mobcb.deji.model.BaseQueryModel;
import com.mobcb.deji.model.MallInfoQueryModel;
import com.mobcb.deji.req.MallInfoQueryReq;
import com.mobcb.deji.service.MallInfoService;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.mobcb.deji.client.MallInfoServiceClient.PATH;

/**
 * @version 1.00
 * @since 11:40 2017-02-23
 */
@RestController("mallInfoCtrl")
@RequestMapping(PATH)
public class MallInfoCtrl implements MallInfoServiceClient{
    /**
     * 日志
     */
    private static Log logger = LogFactory.getLog(MallInfoCtrl.class);
    /**
     * 门店服务
     */
    @Autowired
    private MallInfoService mallInfoService;

    @Autowired
    MallInfoServiceClient mallServer;

    @Autowired
    YmlConfig ymlConfig;

    /**
     * 异步获取列表数据
     *
     * @return list
     */
    @Override
    public List<MallInfoDo> selectMallInfoListWithPageByExample(@RequestBody MallInfoQueryReq mallInfoQueryReq) {

        mallInfoQueryReq.paging();
        BaseQueryModel queryModel = converQueryReqToQueryModel(mallInfoQueryReq, new MallInfoQueryModel());
        List<MallInfoDo> mallList = this.mallInfoService.selectListOrPageBySql(queryModel);
        if(mallList.size() >0){
        }
        return mallList;
    }

    @Override
    public String isSuccess(@RequestParam("name") String name) {
        return "yes "+name+ymlConfig.getSimpleProp();
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String getIsSuccess(@RequestParam("name") String name) {
        return  mallServer.isSuccess(name);
    }

    @RequestMapping(value = "all", method = RequestMethod.POST)
    public List<MallInfoDo> findAll(@RequestBody MallInfoQueryReq queryModel) {
        return  mallServer.selectMallInfoListWithPageByExample(queryModel);
    }

    /**
     * basequeryReq的class，为了避免引入依赖
     */
    private static Class queryReqClass;

    public static <T extends BaseQueryModel> T converQueryReqToQueryModel(Object queryReq, T queryModel) {

        try{
            BeanUtils.copyProperties(queryReq, queryModel);
            return queryModel;
        }catch (Exception ex){
            throw new IllegalArgumentException(
                    "queryReq not baseQueryReq type, it is " + queryReq.getClass().getCanonicalName());
        }
    }
}
