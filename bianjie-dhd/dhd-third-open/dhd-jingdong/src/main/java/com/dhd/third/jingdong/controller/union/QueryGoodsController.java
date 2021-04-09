package com.dhd.third.jingdong.controller.union;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.bianjie.common.response.RespBody;
import com.bianjie.common.response.RespBodyBuilder;
import com.bianjie.common.response.RespCode;
import com.dhd.common.model.H5RequestModel;
import com.dhd.third.jingdong.controller.base.BaseController;
import com.dhd.third.jingdong.pojo.DhdJdChannel;
import com.dhd.third.jingdong.service.IJdChannelService;
import com.dhd.third.jingdong.service.IJdPromotionUrlInfoService;
import com.dhd.third.jingdong.service.IJdUnionApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 查询商品
 * @author linmingxi
 * 2020/12/25
 */
@Controller
@RequestMapping(value = "/jd/union")
public class QueryGoodsController extends BaseController {

    @Autowired
    IJdUnionApiService apiUnionService;
    @Autowired
    IJdChannelService jdChannelService;
    @Autowired
    IJdPromotionUrlInfoService jdPromotionUrlInfoService;

    @PostMapping("/jingfenQuery")
    @ResponseBody
    public String goodsJingfenGuery(@RequestBody H5RequestModel requestModel){
        try {

            if (!requestModel.getParam().containsKey("eId")){
                return RespBodyBuilder.toError(RespCode.CODE_10502);
            }
            //默认20
            requestModel.getParam().put("pageSize",20);
            requestModel.getParam().put("currentPage",requestModel.getPage().getCurrentPage());
            DhdJdChannel dhdJdChannel = jdChannelService.selectByPrimaryKey(Integer.parseInt((String) requestModel.getParam().get("eId")));
            requestModel.getParam().put("eliteId",dhdJdChannel.getChannelId());
            //
            //sortName:排序字段(price：单价, commissionShare：佣金比例, commission：佣金， inOrderCount30DaysSku：sku维度30天引单量，comments：评论数，goodComments：好评数)
            RespBody respBody = apiUnionService.goodsJingfenQuery(null, requestModel.getParam());
            if (respBody.getCode() != RespCode.CODE_200.getCode()){
                return RespBodyBuilder.toError(respBody.getCode(),respBody.getMsg());
            }
            //过滤字段
            JSONArray jsonArray = new JSONArray();
            JSONObject data = (JSONObject)respBody.getData();
//            if (data.containsKey("data") && data.getJSONArray("data").size() > 0){
//                JSONArray dataJSONArray = data.getJSONArray("data");
//                for (int i =0; i < dataJSONArray.size();i++){
//                    JSONObject item = dataJSONArray.getJSONObject(i);
//                    JSONObject jsonObject = new JSONObject();
//                    //商品ID
//                    jsonObject.put("skuId",item.getLong("skuId"));
//                    //商品名称
//                    jsonObject.put("skuName",item.getString("skuName"));
//                    //spuid，其值为同款商品的主skuid
//                    jsonObject.put("spuid",item.getLong("spuid"));
//                    //价格
//                    jsonObject.put("priceInfo",item.getJSONObject("priceInfo"));
//                    //图片信息
//                    jsonObject.put("imageInfo",item.getJSONObject("imageInfo"));
//                    //商品落地页
//                    jsonObject.put("materialUrl","http://"+item.getString("materialUrl"));
//                    //评论数
//                    jsonObject.put("comments",item.getLong("comments"));
//                    //好评率
//                    jsonObject.put("goodCommentsShare",item.getDouble("goodCommentsShare"));
//                    //g=自营，p=pop
//                    jsonObject.put("owner",item.getString("owner"));
//                    //京东配送 1：是，0：不是
//                    jsonObject.put("deliveryType",item.getInteger("deliveryType"));
//                    //优惠劵信息
//                    jsonObject.put("couponList",item.getJSONArray("couponList"));
//                    //店铺信息
//                    jsonObject.put("shopInfo",item.getJSONObject("shopInfo"));
//                    if (item.containsKey("skuLabelInfo")){
//                        jsonObject.put("skuLabelInfo",item.getJSONObject("skuLabelInfo"));
//                    }
//                    jsonArray.add(jsonObject);
//                }
//            }
//            data.put("data",jsonArray);
            return RespBodyBuilder.toSuccessWithObject(data);
        }catch (Exception e){
            logger.error("jingfenQuery - error:{}",e);
            return RespBodyBuilder.toError(RespCode.CODE_10501);
        }
    }


    /** 商品详情 **/
    @PostMapping("/goodsDetail")
    @ResponseBody
    public String goodsBigfieldQuery(@RequestBody H5RequestModel requestModel){
        try {
            if (!requestModel.getParam().containsKey("skuIds")){
                return RespBodyBuilder.toError(RespCode.CODE_10502);
            }
            String[] skuIds = String.valueOf(requestModel.getParam().get("skuIds")).split(",");
            Long[] skuIdsLong = new Long[skuIds.length];
            for (int i =0; i < skuIds.length;i++){
                skuIdsLong[i]=Long.parseLong(skuIds[i]);
            }
            requestModel.getParam().put("skuIds",skuIdsLong);
            RespBody respBody = apiUnionService.goodsBigfieldQuery(null, requestModel.getParam());
            if (respBody.getCode() != RespCode.CODE_200.getCode()){
                return RespBodyBuilder.toError(respBody.getCode(),respBody.getMsg());
            }
            return RespBodyBuilder.toSuccessWithObject(respBody.getData());
        }catch (Exception e){
            logger.error("goodsDetail - error:{}",e);
            return RespBodyBuilder.toError(RespCode.CODE_10501);
        }
    }


    /** 推广链接获取 **/
    @PostMapping("/promotionUrlGet")
    @ResponseBody
    public String promotionUrlGet(@RequestBody H5RequestModel requestModel){
        try {
            if (!requestModel.getParam().containsKey("materialId")){
                return RespBodyBuilder.toError(RespCode.CODE_10502);
            }
            RespBody respBody = jdPromotionUrlInfoService.promotionCommonGet(requestModel);
            if (respBody.getCode() != RespCode.CODE_200.getCode()){
                return RespBodyBuilder.toError(respBody.getCode(),respBody.getMsg());
            }
            return RespBodyBuilder.toSuccessWithObject(respBody.getData());
        }catch (Exception e){
            logger.error("promotionUrlGet - error:{}",e);
            return RespBodyBuilder.toError(RespCode.CODE_10501);
        }
    }

}
