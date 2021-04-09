package com.dhd.third.taobao.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.bianjie.common.response.RespBody;
import com.bianjie.common.response.RespCode;
import com.dhd.third.taobao.service.ITbUnionApiService;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.request.*;
import com.taobao.api.response.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Map;

/**
 * 淘宝api
 * @author linmingxi
 * 2021/01/04
 */
@Service
public class TbUnionApiServiceImpl implements ITbUnionApiService {

    Logger logger = LoggerFactory.getLogger(getClass());


    @Value("${unionServerUrl}")
    String serverUrl;
    @Value("${unionAppKey}")
    String appKey;
    @Value("${unionAppSecret}")
    String appSecret;

    @Override
    public RespBody tbkDgVegasTljCreate(Map param) {
       try {
           if (!param.containsKey("adzoneId")){
               return new RespBody(RespCode.CODE_10502);
           }
           if (!param.containsKey("itemId")){
               return new RespBody(RespCode.CODE_10502);
           }
           if (!param.containsKey("totalNum")){
               return new RespBody(RespCode.CODE_10502);
           }
           if (!param.containsKey("name")){
               return new RespBody(RespCode.CODE_10502);
           }
           if (!param.containsKey("userTotalWinNumLimit")){
               return new RespBody(RespCode.CODE_10502);
           }
           if (!param.containsKey("securitySwitch")){
               return new RespBody(RespCode.CODE_10502);
           }
           if (!param.containsKey("perFace")){
               return new RespBody(RespCode.CODE_10502);
           }
           if (!param.containsKey("sendStartTime")){
               return new RespBody(RespCode.CODE_10502);
           }

           TaobaoClient client = new DefaultTaobaoClient(serverUrl, appKey, appSecret);
           TbkDgVegasTljCreateRequest req = new TbkDgVegasTljCreateRequest();
           if (param.containsKey("campaignType")){
               //CPS佣金计划类型   定向：DX；鹊桥：LINK_EVENT；营销：MKT
               req.setCampaignType((String) param.get("campaignType"));
           }
           //必传: 妈妈广告位Id
           req.setAdzoneId((Long) param.get("adzoneId"));
           //必传:宝贝id
           req.setItemId((Long) param.get("itemId"));
           //必传:淘礼金总个数
           req.setTotalNum((Long) param.get("totalNum"));
           //必传:淘礼金名称，最大10个字符
           req.setName((String) param.get("name"));
           //必传:单用户累计中奖次数上限
           req.setUserTotalWinNumLimit((Long) param.get("userTotalWinNumLimit"));
           //必传:安全开关，若不进行安全校验，可能放大您的资损风险，请谨慎选择
           req.setSecuritySwitch((Boolean) param.get("securitySwitch"));
           //必传:单个淘礼金面额，支持两位小数，单位元
           req.setPerFace((String) param.get("perFace"));
           //必传:发放开始时间
           req.setSendStartTime((Date) param.get("sendStartTime"));
           if (param.containsKey("sendEndTime")){
               //发放截止时间
               req.setSendEndTime((Date) param.get("sendEndTime"));
           }
           if (param.containsKey("useEndTime")){
               //使用结束日期。如果是结束时间模式为相对时间，时间格式为1-7直接的整数,
               // 例如，1（相对领取时间1天）； 如果是绝对时间，格式为yyyy-MM-dd，
               // 例如，2019-01-29，表示到2019-01-29 23:59:59结束
               req.setUseEndTime((String) param.get("useEndTime"));
           }
           if (param.containsKey("useEndTimeMode")){
               //结束日期的模式,1:相对时间，2:绝对时间
               req.setUseEndTimeMode((Long) param.get("useEndTimeMode"));
           }
           if (param.containsKey("useStartTime")){
               //使用开始日期。相对时间，无需填写，以用户领取时间作为使用开始时间。
               // 绝对时间，格式 yyyy-MM-dd，例如，2019-01-29，表示从2019-01-29 00:00:00 开始
               req.setUseStartTime((String) param.get("useStartTime"));
           }
           if (param.containsKey("securityLevel")){
               //安全等级，0：适用于常规淘礼金投放场景；1：更高安全级别，适用于淘礼金面额偏大等安全性较高的淘礼金投放场景，
               // 可能导致更多用户拦截。security_switch为true，此字段不填写时，使用0作为默认安全级别。
               // 如果security_switch为false，不进行安全判断。
               req.setSecurityLevel((Long) param.get("securityLevel"));
           }
           TbkDgVegasTljCreateResponse response = client.execute(req);
           if (!response.isSuccess()){
               logger.info("获取数据失败code={},subMsg={}", response.getCode(), response.getSubMsg());
               return new RespBody(RespCode.CODE_10504.getCode(),response.getSubMsg());
           }
           TbkDgVegasTljCreateResponse.Result result = response.getResult();
           if (!result.getSuccess()){
               logger.info("获取数据失败msgCode={},msgInfo={}", result.getMsgCode(), result.getMsgInfo());
               return new RespBody(RespCode.CODE_10504.getCode(),result.getMsgInfo());
           }
           JSONObject jsonObject = new JSONObject();
           jsonObject.put("data", result.getModel());
           return new RespBody(jsonObject);
       }catch (Exception e){
           logger.error("tbkDgVegasTljCreate - error:{}", e);
           return new RespBody(RespCode.CODE_10501);
       }
    }

    @Override
    public RespBody tbkDgVegasTljInstanceReport(Map param) {
        try {
            if (!param.containsKey("rightsId")){
                return new RespBody(RespCode.CODE_10502);
            }
            TaobaoClient client = new DefaultTaobaoClient(serverUrl, appKey, appSecret);
            TbkDgVegasTljInstanceReportRequest req = new TbkDgVegasTljInstanceReportRequest();
            //实例ID
            req.setRightsId((String) param.get("rightsId"));
            TbkDgVegasTljInstanceReportResponse response = client.execute(req);
            if (!response.isSuccess()){
                logger.info("获取数据失败code={},subMsg={}", response.getCode(), response.getSubMsg());
                return new RespBody(RespCode.CODE_10504.getCode(),response.getSubMsg());
            }
            TbkDgVegasTljInstanceReportResponse.Result result = response.getResult();
            if (!result.getSuccess()){
                logger.info("获取数据失败msgCode={},msgInfo={}", result.getMsgCode(), result.getMsgInfo());
                return new RespBody(RespCode.CODE_10504.getCode(),result.getMsgInfo());
            }
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("data",result.getModel());
            return new RespBody(jsonObject);
        }catch (Exception e) {
            logger.error("tbkDgVegasTljInstanceReport - error:{}", e);
            return new RespBody(RespCode.CODE_10501);
        }
    }

    @Override
    public RespBody tbkDgVegasSendStatus(Map param) {
        try {
            TaobaoClient client = new DefaultTaobaoClient(serverUrl, appKey, appSecret);
            TbkDgVegasSendStatusRequest req = new TbkDgVegasSendStatusRequest();
            if (param.containsKey("relationId")){
                //渠道管理id
                req.setRelationId((String)param.get("relationId"));
            }
            if (param.containsKey("specialId")){
                //会员运营id
                req.setSpecialId((String)param.get("specialId"));
            }
            if (param.containsKey("deviceValue")){
                //加密后的值(ALIPAY_ID除外)，需用MD5加密，32位小写
                req.setDeviceValue((String)param.get("deviceValue"));
            }
            if (param.containsKey("deviceType")){
                //入参类型(该模式下返回的结果为模糊匹配结果，和实际情况可能存在误差)：
                // 1. IMEI 2. IDFA 3. OAID 4. MOBILE 5. ALIPAY_ID
                req.setDeviceType((String)param.get("deviceType"));
            }
            TbkDgVegasSendStatusResponse response = client.execute(req);
            if (!response.isSuccess()){
                logger.info("获取数据失败code={},subMsg={}", response.getCode(), response.getSubMsg());
                return new RespBody(RespCode.CODE_10504.getCode(),response.getSubMsg());
            }
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("data",response.getData().getResultList());
            return new RespBody(jsonObject);
        }catch (Exception e) {
            logger.error("tbkDgVegasSendStatus - error:{}", e);
            return new RespBody(RespCode.CODE_10501);
        }
    }

    @Override
    public RespBody tbkDgNewuserOrderGet(Map param) {
        try {
            if (!param.containsKey("activityId")){
                return new RespBody(RespCode.CODE_10502);
            }
            TaobaoClient client = new DefaultTaobaoClient(serverUrl, appKey, appSecret);
            TbkDgNewuserOrderGetRequest req = new TbkDgNewuserOrderGetRequest();

            req.setActivityId((String)param.get("activityId"));
            if (param.containsKey("adzoneId")){
                //mm_xxx_xxx_xxx的第三位
                req.setAdzoneId((Long) param.get("adzoneId"));
            }
            if (param.containsKey("currentPage")){
                //第几页，默认1，1~100
                req.setPageNo((Long) param.get("currentPage"));
            }
            if (param.containsKey("pageSize")){
                //页大小，默认20，1~100
                req.setPageSize((Long) param.get("pageSize"));
            }
            if (param.containsKey("startTime")){
                //开始时间，当活动为淘宝活动，表示最早注册时间；
                // 当活动为支付宝活动，表示最早绑定时间；当活动为天猫活动，表示最早领取红包时间
                req.setStartTime((Date)param.get("startTime"));
            }
            if (param.containsKey("endTime")){
                //结束时间，当活动为淘宝活动，表示最晚结束时间；
                //当活动为支付宝活动，表示最晚绑定时间；当活动为天猫活动，表示最晚领取红包的时间
                req.setEndTime((Date)param.get("endTime"));
            }
            TbkDgNewuserOrderGetResponse response = client.execute(req);
            if (!response.isSuccess()){
                logger.info("获取数据失败code={},subMsg={}", response.getCode(), response.getSubMsg());
                return new RespBody(RespCode.CODE_10504.getCode(),response.getSubMsg());
            }
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("data",response.getResults().getData());
            return new RespBody(jsonObject);
        }catch (Exception e) {
            logger.error("tbkDgNewuserOrderGet - error:{}", e);
            return new RespBody(RespCode.CODE_10501);
        }
    }

    @Override
    public RespBody tbkDgNewuserOrderSum(Map param) {
        try {
            if (!param.containsKey("activityId")){
                return new RespBody(RespCode.CODE_10502);
            }
            if (!param.containsKey("currentPage")){
                return new RespBody(RespCode.CODE_10502);
            }
            if (!param.containsKey("pageSize")){
                return new RespBody(RespCode.CODE_10502);
            }
            TaobaoClient client = new DefaultTaobaoClient(serverUrl, appKey, appSecret);
            TbkDgNewuserOrderSumRequest req = new TbkDgNewuserOrderSumRequest();
            req.setActivityId((String)param.get("activityId"));
            //第几页，默认1，1~100
            req.setPageNo((Long) param.get("currentPage"));
            //页大小，默认20，1~100
            req.setPageSize((Long) param.get("pageSize"));
            if (param.containsKey("adzoneId")){
                //mm_xxx_xxx_xxx的第三位
                req.setAdzoneId((Long) param.get("adzoneId"));
            }
            if (param.containsKey("siteId")){
                //mm_xxx_xxx_xxx的第二位
                req.setSiteId((Long) param.get("siteId"));
            }
            if (param.containsKey("settleMonth")){
                //结算月份,201807
                req.setSettleMonth((String) param.get("settleMonth"));
            }
            TbkDgNewuserOrderSumResponse response = client.execute(req);
            if (!response.isSuccess()){
                logger.info("获取数据失败code={},subMsg={}", response.getCode(), response.getSubMsg());
                return new RespBody(RespCode.CODE_10504.getCode(),response.getSubMsg());
            }
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("data",response.getResults());
            return new RespBody(jsonObject);
        }catch (Exception e) {
            logger.error("tbkDgNewuserOrderSum - error:{}", e);
            return new RespBody(RespCode.CODE_10501);
        }
    }

    @Override
    public RespBody tbkActivityInfoGet(Map param) {
        try {
            if (!param.containsKey("adzoneId")){
                return new RespBody(RespCode.CODE_10502);
            }
            if (!param.containsKey("activityMaterialId")){
                return new RespBody(RespCode.CODE_10502);
            }
            TaobaoClient client = new DefaultTaobaoClient(serverUrl, appKey, appSecret);
            TbkActivityInfoGetRequest req = new TbkActivityInfoGetRequest();
            //mm_xxx_xxx_xxx的第三位
            req.setAdzoneId((Long) param.get("adzoneId"));
            if (param.containsKey("subPid")){
                //mm_xxx_xxx_xxx 仅三方分成场景使用
                req.setSubPid((String) param.get("subPid"));
            }
            if (param.containsKey("relationId")){
                //渠道关系id
                req.setRelationId((Long) param.get("relationId"));
            }
            if (param.containsKey("unionId")){
                //自定义输入串，英文和数字组成，长度不能大于12个字符，区分不同的推广渠道
                req.setUnionId((String)param.get("unionId"));
            }
            //官方活动会场ID，从淘宝客后台“我要推广-活动推广”中获取
            req.setActivityMaterialId((String) param.get("activityMaterialId"));
            TbkActivityInfoGetResponse response = client.execute(req);
            if (!response.isSuccess()){
                logger.info("获取数据失败code={},subMsg={}", response.getCode(), response.getSubMsg());
                return new RespBody(RespCode.CODE_10504.getCode(),response.getSubMsg());
            }
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("data",response.getData());
            return new RespBody(jsonObject);
        }catch (Exception e){
            logger.error("tbkActivityInfoGet - error:{}", e);
            return new RespBody(RespCode.CODE_10501);
        }
    }

    @Override
    public RespBody tbkDgOptimusMaterial(Map param) {
        try {
            if (!param.containsKey("adzoneId")){
                return new RespBody(RespCode.CODE_10502);
            }
            if (!param.containsKey("materialId")){
                return new RespBody(RespCode.CODE_10502);
            }
            TaobaoClient client = new DefaultTaobaoClient(serverUrl, appKey, appSecret);
            TbkDgOptimusMaterialRequest req = new TbkDgOptimusMaterialRequest();
            if (param.containsKey("currentPage")){
                //第几页，默认1，1~100
                req.setPageNo((Long) param.get("currentPage"));
            }
            if (param.containsKey("pageSize")){
                //页大小，默认20，1~100
                req.setPageSize((Long) param.get("pageSize"));
            }
            //mm_xxx_xxx_xxx的第三位
            req.setAdzoneId((Long) param.get("adzoneId"));
            req.setMaterialId((Long) param.get("materialId"));

            if (param.containsKey("deviceEncrypt")){
                //智能匹配-设备号加密类型：MD5
                req.setDeviceEncrypt((String) param.get("deviceEncrypt"));
            }
            if (param.containsKey("deviceValue")){
                //智能匹配-设备号加密后的值（MD5加密需32位小写）
                req.setDeviceValue((String) param.get("deviceValue"));
            }
            if (param.containsKey("deviceType")){
                //智能匹配-设备号类型：IMEI，或者IDFA，或者UTDID（UTDID不支持MD5加密），或者OAID
                req.setDeviceType((String) param.get("deviceType"));
            }
            if (param.containsKey("contentId")){
                //内容专用-内容详情ID
                req.setContentId((Long) param.get("contentId"));
            }
            if (param.containsKey("contentSource")){
                //内容专用-内容渠道信息
                req.setContentSource((String) param.get("contentSource"));
            }
            if (param.containsKey("itemId")){
                //商品ID，用于相似商品推荐
                req.setItemId((Long) param.get("itemId"));
            }
            if (param.containsKey("favoritesId")){
                //选品库投放id
                req.setFavoritesId((String) param.get("favoritesId"));
            }
            TbkDgOptimusMaterialResponse response = client.execute(req);
            if (!response.isSuccess()){
                logger.info("获取数据失败code={},subMsg={}", response.getCode(), response.getSubMsg());
                return new RespBody(RespCode.CODE_10504.getCode(),response.getSubMsg());
            }
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("data",response.getResultList());
            //商品总数-目前只有全品库商品查询有该字段
            jsonObject.put("totalCount",response.getTotalCount());
            //推荐信息-是否抄底
            jsonObject.put("isDefault",response.getIsDefault());
            return new RespBody(jsonObject);
        }catch (Exception e){
            logger.error("tbkDgOptimusMaterial - error:{}", e);
            return new RespBody(RespCode.CODE_10501);
        }
    }

    @Override
    public RespBody tbkDgOptimusPromotion(Map param) {
        try {
            if (!param.containsKey("adzoneId")){
                return new RespBody(RespCode.CODE_10502);
            }
            if (!param.containsKey("promotionId")){
                return new RespBody(RespCode.CODE_10502);
            }
            TaobaoClient client = new DefaultTaobaoClient(serverUrl, appKey, appSecret);
            TbkDgOptimusPromotionRequest req = new TbkDgOptimusPromotionRequest();
            if (param.containsKey("currentPage")){
                //第几页，默认1，1~100
                req.setPageNum((Long) param.get("currentPage"));
            }
            if (param.containsKey("pageSize")){
                //页大小，默认20，1~100
                req.setPageSize((Long) param.get("pageSize"));
            }
            //mm_xxx_xxx_xxx的第三位
            req.setAdzoneId((Long) param.get("adzoneId"));
            //官方提供的权益物料Id。有价券-37104、大额店铺券-37116，更多权益物料id敬请期待！
            req.setPromotionId((Long) param.get("promotionId"));
            TbkDgOptimusPromotionResponse response = client.execute(req);
            if (!response.isSuccess()){
                logger.info("获取数据失败code={},subMsg={}", response.getCode(), response.getSubMsg());
                return new RespBody(RespCode.CODE_10504.getCode(),response.getSubMsg());
            }
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("data",response.getResultList());
            return new RespBody(jsonObject);
        }catch (Exception e){
            logger.error("tbkDgOptimusPromotion - error:{}", e);
            return new RespBody(RespCode.CODE_10501);
        }
    }

    @Override
    public RespBody juItemsSearch(Map param) {
        try {
            if (!param.containsKey("currentPage")){
                return new RespBody(RespCode.CODE_10502);
            }
            if (!param.containsKey("pageSize")){
                return new RespBody(RespCode.CODE_10502);
            }
            if (!param.containsKey("pid")){
                return new RespBody(RespCode.CODE_10502);
            }
            TaobaoClient client = new DefaultTaobaoClient(serverUrl, appKey, appSecret);
            JuItemsSearchRequest req = new JuItemsSearchRequest();
            JuItemsSearchRequest.TopItemQuery obj1 = new JuItemsSearchRequest.TopItemQuery();
            //第几页，默认1，1~100
            obj1.setCurrentPage((Long) param.get("currentPage"));
            //页大小，默认20，1~100
            obj1.setPageSize((Long) param.get("pageSize"));
            //媒体pid,必传
            obj1.setPid((String) param.get("pid"));
            if (param.containsKey("postage")){
                //是否包邮,可不传
                obj1.setPostage((Boolean) param.get("postage"));
            }
            if (param.containsKey("status")){
                //状态，预热：1，正在进行中：2,可不传
                obj1.setStatus((Long) param.get("status"));
            }
            if (param.containsKey("taobaoCategoryId")){
                //淘宝类目id,可不传
                obj1.setTaobaoCategoryId((Long) param.get("taobaoCategoryId"));
            }
            if (param.containsKey("word")){
                //搜索关键词,可不传
                obj1.setWord((String) param.get("word"));
            }
            req.setParamTopItemQuery(obj1);
            JuItemsSearchResponse response = client.execute(req);
            if (!response.isSuccess()){
                logger.info("获取数据失败code={},subMsg={}", response.getCode(), response.getSubMsg());
                return new RespBody(RespCode.CODE_10504.getCode(),response.getSubMsg());
            }
            JuItemsSearchResponse.PaginationResult result = response.getResult();
            if (!result.getSuccess()){
                logger.info("获取数据失败msgCode={},msgInfo={}", result.getMsgCode(), result.getMsgInfo());
                return new RespBody(RespCode.CODE_10504.getCode(),result.getMsgInfo());
            }
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("data",result.getModelList());
            jsonObject.put("totalCount",result.getTotalItem());
            jsonObject.put("trackParams",result.getTrackParams());
            return new RespBody(jsonObject);
        }catch (Exception e){
            logger.error("juItemsSearch - error:{}", e);
            return new RespBody(RespCode.CODE_10501);
        }
    }

    @Override
    public RespBody tbkShopGet(Map param) {
        try {
            if (!param.containsKey("fields")){
                return new RespBody(RespCode.CODE_10502);
            }
            if (!param.containsKey("qName")){
                return new RespBody(RespCode.CODE_10502);
            }
            TaobaoClient client = new DefaultTaobaoClient(serverUrl, appKey, appSecret);
            TbkShopGetRequest req = new TbkShopGetRequest();
            //必传:需返回的字段列表,user_id,shop_title,shop_type,seller_nick,pict_url,shop_url
            req.setFields((String) param.get("fields"));
            //必传:查询词
            req.setQ((String) param.get("qName"));
            if (param.containsKey("sort")){
                //排序,排序_des（降序），排序_asc（升序），佣金比率（commission_rate）， 商品数量（auction_count），销售总数量（total_auction）
                //示例:commission_rate_des
                req.setSort((String) param.get("sort"));
            }
            if (param.containsKey("isTmall")){
                //是否商城的店铺，设置为true表示该是属于淘宝商城的店铺，设置为false或不设置表示不判断这个属性
                req.setIsTmall((Boolean) param.get("isTmall"));
            }
            if (param.containsKey("startCredit")){
                //信用等级下限，1~20
                req.setStartCredit((Long) param.get("startCredit"));
            }
            if (param.containsKey("endCredit")){
                //信用等级上限，1~20
                req.setEndCredit((Long) param.get("endCredit"));
            }
            if (param.containsKey("startCommissionRate")){
                //淘客佣金比率下限，1~10000
                req.setStartCommissionRate((Long) param.get("startCommissionRate"));
            }
            if (param.containsKey("endCommissionRate")){
                //淘客佣金比率上限，1~10000
                req.setEndCommissionRate((Long) param.get("endCommissionRate"));
            }
            if (param.containsKey("startTotalAction")){
                //店铺商品总数下限
                req.setStartTotalAction((Long) param.get("startTotalAction"));
            }
            if (param.containsKey("endTotalAction")){
                //店铺商品总数上限
                req.setEndTotalAction((Long) param.get("endTotalAction"));
            }
            if (param.containsKey("startAuctionCount")){
                //累计推广商品下限
                req.setStartAuctionCount((Long) param.get("startAuctionCount"));
            }
            if (param.containsKey("endAuctionCount")){
                //累计推广商品上限
                req.setEndAuctionCount((Long) param.get("endAuctionCount"));
            }
            if (param.containsKey("platform")){
                //链接形式：1：PC，2：无线，默认：１
                req.setPlatform((Long) param.get("platform"));
            }
            if (param.containsKey("currentPage")){
                //第几页，默认1，1~100
                req.setPageNo((Long) param.get("currentPage"));
            }
            if (param.containsKey("pageSize")){
                //页大小，默认20，1~100
                req.setPageSize((Long) param.get("pageSize"));
            }
            TbkShopGetResponse response = client.execute(req);
            if (!response.isSuccess()){
                logger.info("获取数据失败code={},subMsg={}", response.getCode(), response.getSubMsg());
                return new RespBody(RespCode.CODE_10504.getCode(),response.getSubMsg());
            }
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("data", response.getResults());
            jsonObject.put("totalCount", response.getTotalResults());
            return new RespBody(jsonObject);
        }catch (Exception e){
            logger.error("tbkShopGet - error:{}", e);
            return new RespBody(RespCode.CODE_10501);
        }
    }

    @Override
    public RespBody tbkDgMaterialOptional(Map param) {
        try {
            if (!param.containsKey("adzoneId")){
                return new RespBody(RespCode.CODE_10502);
            }
            TaobaoClient client = new DefaultTaobaoClient(serverUrl, appKey, appSecret);
            TbkDgMaterialOptionalRequest req = new TbkDgMaterialOptionalRequest();
            req.setAdzoneId((Long) param.get("adzoneId"));
            if (param.containsKey("startDsr")){
                //商品筛选(特定媒体支持)-店铺dsr评分。筛选大于等于当前设置的店铺dsr评分的商品0-50000之间
                req.setStartDsr((Long) param.get("startDsr"));
            }
            if (param.containsKey("currentPage")){
                //第几页，默认1，1~100
                req.setPageNo((Long) param.get("currentPage"));
            }
            if (param.containsKey("pageSize")){
                //页大小，默认20，1~100
                req.setPageSize((Long) param.get("pageSize"));
            }
            if (param.containsKey("platform")){
                //链接形式：1：PC，2：无线，默认：1
                req.setPlatform((Long) param.get("platform"));
            }
            if (param.containsKey("endTkRate")){
                //商品筛选-淘客佣金比率上限。如：1234表示12.34%
                req.setEndTkRate((Long) param.get("endTkRate"));
            }
            if (param.containsKey("startTkRate")){
                //商品筛选-淘客佣金比率下限。如：1234表示12.34%
                req.setStartTkRate((Long) param.get("startTkRate"));
            }
            if (param.containsKey("endPrice")){
                //商品筛选-折扣价范围上限。单位：元
                req.setEndPrice((Long) param.get("endPrice"));
            }
            if (param.containsKey("startPrice")){
                //商品筛选-折扣价范围下限。单位：元
                req.setStartPrice((Long) param.get("startPrice"));
            }
            if (param.containsKey("isOverseas")){
                //商品筛选-是否海外商品。true表示属于海外商品，false或不设置表示不限
                req.setIsOverseas((Boolean) param.get("isOverseas"));
            }
            if (param.containsKey("isTmall")){
                //商品筛选-是否天猫商品。true表示属于天猫商品，false或不设置表示不限
                req.setIsTmall((Boolean) param.get("isTmall"));
            }
            if (param.containsKey("sort")){
                //排序_des（降序），排序_asc（升序），销量（total_sales），淘客佣金比率（tk_rate），
                // 累计推广量（tk_total_sales），总支出佣金（tk_total_commi），价格（price）
                req.setSort((String) param.get("sort"));
            }
            if (param.containsKey("itemloc")){
                //商品筛选-所在地
                req.setItemloc((String) param.get("itemloc"));
            }
            if (param.containsKey("cat")){
                //商品筛选-后台类目ID。用,分割，最大10个，该ID可以通过taobao.itemcats.get接口获取到
                req.setCat((String) param.get("cat"));
            }
            if (param.containsKey("q")){
                //商品筛选-查询词
                req.setQ((String)param.get("q"));
            }
            if (param.containsKey("materialId")){
                //不传时默认物料id=2836；如果直接对消费者投放，
                // 可使用官方个性化算法优化的搜索物料id=17004
                req.setMaterialId((Long)param.get("materialId"));
            }
            if (param.containsKey("hasCoupon")){
                //优惠券筛选-是否有优惠券。true表示该商品有优惠券，false或不设置表示不限
                req.setHasCoupon((Boolean) param.get("hasCoupon"));
            }
            if (param.containsKey("ip")){
                //ip参数影响邮费获取，如果不传或者传入不准确，邮费无法精准提供
                req.setIp((String) param.get("ip"));
            }
            if (param.containsKey("needFreeShipment")){
                //商品筛选-是否包邮。true表示包邮，false或不设置表示不限
                req.setNeedFreeShipment((Boolean) param.get("needFreeShipment"));
            }
            if (param.containsKey("needPrepay")){
                //商品筛选-是否加入消费者保障。true表示加入，false或不设置表示不限
                req.setNeedPrepay((Boolean) param.get("needPrepay"));
            }
            if (param.containsKey("includePayRate30")){
                //商品筛选(特定媒体支持)-成交转化是否高于行业均值。True表示大于等于，false或不设置表示不限
                req.setIncludePayRate30((Boolean) param.get("includePayRate30"));
            }
            if (param.containsKey("includeGoodRate")){
                //商品筛选-好评率是否高于行业均值。True表示大于等于，false或不设置表示不限
                req.setIncludeGoodRate((Boolean) param.get("includeGoodRate"));
            }
            if (param.containsKey("includeRfdRate")){
                //商品筛选(特定媒体支持)-退款率是否低于行业均值。True表示大于等于，false或不设置表示不限
                req.setIncludeRfdRate((Boolean) param.get("includeRfdRate"));
            }
            if (param.containsKey("npxLevel")){
                //商品筛选-牛皮癣程度。取值：1不限，2无，3轻微
                req.setNpxLevel((Long) param.get("npxLevel"));
            }
            if (param.containsKey("endKaTkRate")){
                //商品筛选-KA媒体淘客佣金比率上限。如：1234表示12.34%
                req.setEndKaTkRate((Long) param.get("endKaTkRate"));
            }
            if (param.containsKey("startKaTkRate")){
                //商品筛选-KA媒体淘客佣金比率下限。如：1234表示12.34%
                req.setStartKaTkRate((Long) param.get("startKaTkRate"));
            }
            if (param.containsKey("deviceEncrypt")){
                //智能匹配-设备号加密类型：MD5
                req.setDeviceEncrypt((String) param.get("deviceEncrypt"));
            }
            if (param.containsKey("deviceValue")){
                //智能匹配-设备号加密后的值（MD5加密需32位小写）
                req.setDeviceValue((String) param.get("deviceValue"));
            }
            if (param.containsKey("deviceType")){
                //智能匹配-设备号类型：IMEI，或者IDFA，或者UTDID（UTDID不支持MD5加密），或者OAID
                req.setDeviceType((String) param.get("deviceType"));
            }
            if (param.containsKey("lockRateEndTime")){
                //锁佣结束时间
                req.setLockRateEndTime((Long) param.get("lockRateEndTime"));
            }
            if (param.containsKey("lockRateStartTime")){
                //锁佣开始时间
                req.setLockRateStartTime((Long) param.get("lockRateStartTime"));
            }
            if (param.containsKey("longitude")){
                //本地化业务入参-LBS信息-经度
                req.setLongitude((String) param.get("longitude"));
            }
            if (param.containsKey("latitude")){
                //本地化业务入参-LBS信息-纬度
                req.setLatitude((String) param.get("latitude"));
            }
            if (param.containsKey("cityCode")){
                //本地化业务入参-LBS信息-国标城市码，仅支持单个请求，
                // 请求饿了么卡券物料时，该字段必填。 （详细城市ID见：https://mo.m.taobao.com/page_2020010315120200508）
                req.setCityCode((String) param.get("cityCode"));
            }
            if (param.containsKey("sellerIds")){
                //商家id，仅支持饿了么卡券商家ID，支持批量请求1-100以内，多个商家ID使用英文逗号分隔
                req.setSellerIds((String) param.get("sellerIds"));
            }
            if (param.containsKey("specialId")){
                //会员运营ID
                req.setSpecialId((String) param.get("specialId"));
            }
            if (param.containsKey("relationId")){
                //渠道关系ID，仅适用于渠道推广场景
                req.setRelationId((String) param.get("relationId"));
            }
            if (param.containsKey("pageResultKey")){
                //本地化业务入参-分页唯一标识，非首页的请求必传，值为上一页返回结果中的page_result_key字段值
                req.setPageResultKey((String) param.get("pageResultKey"));
            }
            TbkDgMaterialOptionalResponse response = client.execute(req);
            if (!response.isSuccess()){
                logger.info("获取数据失败code={},subMsg={}", response.getCode(), response.getSubMsg());
                return new RespBody(RespCode.CODE_10504.getCode(),response.getSubMsg());
            }
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("data", response.getResultList());
            //下次分页需要传入
            jsonObject.put("pageResultKey", response.getPageResultKey());
            jsonObject.put("totalCount", response.getTotalResults());
            return new RespBody(jsonObject);
        }catch (Exception e){
            logger.error("tbkDgMaterialOptional - error:{}", e);
            return new RespBody(RespCode.CODE_10501);
        }
    }

    @Override
    public RespBody tbkShopRecommendGet(Map param) {
        try {
            if (!param.containsKey("fields")){
                return new RespBody(RespCode.CODE_10502);
            }
            if (!param.containsKey("userId")){
                return new RespBody(RespCode.CODE_10502);
            }
            TaobaoClient client = new DefaultTaobaoClient(serverUrl, appKey, appSecret);
            TbkShopRecommendGetRequest req = new TbkShopRecommendGetRequest();
            //需返回的字段列表,user_id,shop_title,shop_type,seller_nick,pict_url,shop_url
            req.setFields((String)param.get("fields"));
            req.setUserId((Long)param.get("userId"));
            if (param.containsKey("count")){
                //返回数量，默认20，最大值40
                req.setCount((Long)param.get("count"));
            }
            if (param.containsKey("platform")){
                //链接形式：1：PC，2：无线，默认：1
                req.setPlatform((Long)param.get("platform"));
            }
            TbkShopRecommendGetResponse response = client.execute(req);
            if (!response.isSuccess()){
                logger.info("获取数据失败code={},subMsg={}", response.getCode(), response.getSubMsg());
                return new RespBody(RespCode.CODE_10504.getCode(),response.getSubMsg());
            }
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("data",response.getResults());
            return new RespBody(jsonObject);
        }catch (Exception e){
            logger.error("tbkShopRecommendGet - error:{}", e);
            return new RespBody(RespCode.CODE_10501);
        }
    }

    @Override
    public RespBody tbkTpwdCreate(Map param) {
        try {
            if (!param.containsKey("text")){
                return new RespBody(RespCode.CODE_10502);
            }
            if (!param.containsKey("url")){
                return new RespBody(RespCode.CODE_10502);
            }
            TaobaoClient client = new DefaultTaobaoClient(serverUrl, appKey, appSecret);
            TbkTpwdCreateRequest req = new TbkTpwdCreateRequest();
            req.setText((String)param.get("text"));
            req.setUrl((String)param.get("url"));
            if (param.containsKey("userId")){
                req.setUserId((String)param.get("userId"));
            }
            if (param.containsKey("logo")){
                req.setLogo((String)param.get("logo"));
            }
            TbkTpwdCreateResponse response = client.execute(req);
            if (!response.isSuccess()){
                logger.info("获取数据失败code={},subMsg={}", response.getCode(), response.getSubMsg());
                return new RespBody(RespCode.CODE_10504.getCode(),response.getSubMsg());
            }
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("data",response.getData());
            return new RespBody(jsonObject);
        }catch (Exception e){
            logger.error("tbkTpwdCreate - error:{}", e);
            return new RespBody(RespCode.CODE_10501);
        }
    }

    @Override
    public RespBody tbkScPublisherInfoSave(String sessionKey, Map param) {
        try {
            if (!param.containsKey("inviterCode")){
                return new RespBody(RespCode.CODE_10502);
            }
            if (!param.containsKey("infoType")){
                return new RespBody(RespCode.CODE_10502);
            }
            TaobaoClient client = new DefaultTaobaoClient(serverUrl, appKey, appSecret);
            TbkScPublisherInfoSaveRequest req = new TbkScPublisherInfoSaveRequest();
            if (param.containsKey("relationFrom")){
                //渠道备案 - 来源，取链接的来源
                req.setRelationFrom((String)param.get("relationFrom"));
            }
            if (param.containsKey("offlineScene")){
                //渠道备案 - 线下场景信息，1 - 门店，2- 学校，3 - 工厂，4 - 其他
                req.setOfflineScene((String)param.get("offlineScene"));
            }
            if (param.containsKey("onlineScene")){
                //渠道备案 - 线上场景信息，1 - 微信群，2- QQ群，3 - 其他
                req.setOnlineScene((String)param.get("onlineScene"));
            }
            //淘宝客邀请渠道或会员的邀请码
            req.setInviterCode((String)param.get("inviterCode"));
            //类型，必选 默认为1:
            req.setInfoType((Long) param.get("infoType"));
            if (param.containsKey("note")){
                //媒体侧渠道备注
                req.setNote((String) param.get("note"));
            }
            if (param.containsKey("registerInfo")){
                //线下备案注册信息,字段包含: 电话号码(phoneNumber，必填),
                // 省(province,必填),市(city,必填),区县街道(location,必填),
                // 详细地址(detailAddress,必填),经营类型(career,线下个人必填),
                // 店铺类型(shopType,线下店铺必填),店铺名称(shopName,线下店铺必填),
                // 店铺证书类型(shopCertifyType,线下店铺选填),店铺证书编号(certifyNumber,线下店铺选填)
                //eg:{"phoneNumber":"18801088599","city":"江苏省","province":"南京市","location":"玄武区花园小区","detailAddress":"5号楼3单元101室","shopType":"社区店","shopName":"全家便利店","shopCertifyType":"营业执照","certifyNumber":"111100299001"}
                req.setRegisterInfo((String) param.get("registerInfo"));
            }
            TbkScPublisherInfoSaveResponse response = client.execute(req, sessionKey);
            if (!response.isSuccess()){
                logger.info("获取数据失败code={},subMsg={}", response.getCode(), response.getSubMsg());
                return new RespBody(RespCode.CODE_10504.getCode(),response.getSubMsg());
            }
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("data",response.getData());
            return new RespBody(jsonObject);
        }catch (Exception e){
            logger.error("tbkScPublisherInfoSave - error:{}", e);
            return new RespBody(RespCode.CODE_10501);
        }
    }

    @Override
    public RespBody tbkScPublisherInfoGet(String sessionKey, Map param) {
        try {
            if (!param.containsKey("infoType")){
                return new RespBody(RespCode.CODE_10502);
            }
            if (!param.containsKey("relationApp")){
                return new RespBody(RespCode.CODE_10502);
            }
            TaobaoClient client = new DefaultTaobaoClient(serverUrl, appKey, appKey);
            TbkScPublisherInfoGetRequest req = new TbkScPublisherInfoGetRequest();
            //类型，必选 1:渠道信息；2:会员信息
            req.setInfoType((Long)param.get("infoType"));
            //备案的场景：common（通用备案），etao（一淘备案），minietao（一淘小程序备案），
            // offlineShop（线下门店备案），offlinePerson（线下个人备案）。如不填默认common。查询会员信息只需填写common即可
            req.setRelationApp((String)param.get("relationApp"));
            if (param.containsKey("relationId")){
                //渠道独占 - 渠道关系ID
                req.setRelationId((Long)param.get("relationId"));
            }
            if (param.containsKey("specialId")){
                //会员独占 - 会员运营ID
                req.setSpecialId((String) param.get("specialId"));
            }
            if (param.containsKey("externalId")){
                //淘宝客外部用户标记，如自身系统账户ID；微信ID等
                req.setExternalId((String) param.get("externalId"));
            }
            if (param.containsKey("externalType")){
                //1-微信、2-微博、3-抖音、4-快手、5-QQ，0-其他；默认为0
                req.setExternalType((Long) param.get("externalType"));
            }
            if (param.containsKey("currentPage")){
                //第几页，默认1，1~100
                req.setPageNo((Long) param.get("currentPage"));
            }
            if (param.containsKey("pageSize")){
                //页大小，默认20，1~100
                req.setPageSize((Long) param.get("pageSize"));
            }
            TbkScPublisherInfoGetResponse response = client.execute(req, sessionKey);
            if (!response.isSuccess()){
                logger.info("获取数据失败code={},subMsg={}", response.getCode(), response.getSubMsg());
                return new RespBody(RespCode.CODE_10504.getCode(),response.getSubMsg());
            }
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("data",response.getData());
            return new RespBody(jsonObject);
        }catch (Exception e){
            logger.error("tbkScPublisherInfoGet - error:{}", e);
            return new RespBody(RespCode.CODE_10501);
        }
    }

    @Override
    public RespBody tbkScInvitecodeGet(String sessionKey, Map param) {
        try {
            if (!param.containsKey("codeType")){
                return new RespBody(RespCode.CODE_10502);
            }
            if (!param.containsKey("relationApp")){
                return new RespBody(RespCode.CODE_10502);
            }
            TaobaoClient client = new DefaultTaobaoClient(serverUrl, appKey, appSecret);
            TbkScInvitecodeGetRequest req = new TbkScInvitecodeGetRequest();
            if (param.containsKey("relationId")){
                //渠道关系ID
                req.setRelationId((Long)param.get("relationId"));
            }
            //渠道推广的物料类型
            req.setRelationApp((String)param.get("relationApp"));
            //邀请码类型，1 - 渠道邀请，2 - 渠道裂变，3 -会员邀请
            req.setCodeType((Long)param.get("codeType"));
            TbkScInvitecodeGetResponse response = client.execute(req, sessionKey);
            if (!response.isSuccess()){
                logger.info("获取数据失败code={},subMsg={}", response.getCode(), response.getSubMsg());
                return new RespBody(RespCode.CODE_10504.getCode(),response.getSubMsg());
            }
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("data",response.getData());
            return new RespBody(jsonObject);
        }catch (Exception e){
            logger.error("tbkScInvitecodeGet - error:{}", e);
            return new RespBody(RespCode.CODE_10501);
        }
    }

    @Override
    public RespBody tbkItemInfoGet(Map param) {
        try {
            if (!param.containsKey("numIids")){
                return new RespBody(RespCode.CODE_10502);
            }
            TaobaoClient client = new DefaultTaobaoClient(serverUrl, appKey, appSecret);
            TbkItemInfoGetRequest req = new TbkItemInfoGetRequest();
            req.setNumIids((String)param.get("numIids"));
            if (param.containsKey("platform")){
                req.setPlatform((Long)param.get("platform"));
            }
            if (param.containsKey("ip")){
                req.setIp((String) param.get("ip"));
            }
            TbkItemInfoGetResponse response = client.execute(req);
            if (!response.isSuccess()){
                logger.info("获取数据失败code={},subMsg={}", response.getCode(), response.getSubMsg());
                return new RespBody(RespCode.CODE_10504.getCode(),response.getSubMsg());
            }
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("data",response.getResults());
            return new RespBody(jsonObject);
        }catch (Exception e){
            logger.error("tbkItemInfoGet - error:{}", e);
            return new RespBody(RespCode.CODE_10501);
        }
    }

    @Override
    public RespBody tbkCouponGet(Map param) {
        try {
            TaobaoClient client = new DefaultTaobaoClient(serverUrl, appKey, appSecret);
            TbkCouponGetRequest req = new TbkCouponGetRequest();
            if (param.containsKey("me")){
                //带券ID与商品ID的加密串
                req.setMe((String)param.get("me"));
            }
            if (param.containsKey("itemId")){
                //商品ID
                req.setItemId((Long) param.get("itemId"));
            }
            if (param.containsKey("activityId")){
                //券ID
                req.setActivityId((String) param.get("activityId"));
            }
            TbkCouponGetResponse response = client.execute(req);
            if (!response.isSuccess()){
                logger.info("获取数据失败code={},subMsg={}", response.getCode(), response.getSubMsg());
                return new RespBody(RespCode.CODE_10504.getCode(),response.getSubMsg());
            }
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("data",response.getData());
            return new RespBody(jsonObject);
        }catch (Exception e){
            logger.error("tbkCouponGet - error:{}", e);
            return new RespBody(RespCode.CODE_10501);
        }
    }
}
