package com.dhd.third.jingdong.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.bianjie.common.response.RespBody;
import com.bianjie.common.response.RespCode;
import com.dhd.third.jingdong.service.IJdUnionApiService;
import com.jd.open.api.sdk.DefaultJdClient;
import com.jd.open.api.sdk.JdClient;
import com.jd.open.api.sdk.domain.kplunion.ActivityService.request.query.ActivityReq;
import com.jd.open.api.sdk.domain.kplunion.CategoryService.request.get.CategoryReq;
import com.jd.open.api.sdk.domain.kplunion.CategoryService.response.get.GetResult;
import com.jd.open.api.sdk.domain.kplunion.CouponService.request.get.CreateGiftCouponReq;
import com.jd.open.api.sdk.domain.kplunion.CouponService.request.stop.StopGiftCouponReq;
import com.jd.open.api.sdk.domain.kplunion.CouponService.response.query.QueryResult;
import com.jd.open.api.sdk.domain.kplunion.CouponService.response.stop.StopResult;
import com.jd.open.api.sdk.domain.kplunion.GoodsService.request.query.BigFieldGoodsReq;
import com.jd.open.api.sdk.domain.kplunion.GoodsService.request.query.GoodsReq;
import com.jd.open.api.sdk.domain.kplunion.GoodsService.request.query.JFGoodsReq;
import com.jd.open.api.sdk.domain.kplunion.GoodsService.request.query.MaterialGoodsReq;
import com.jd.open.api.sdk.domain.kplunion.GoodsService.response.query.*;
import com.jd.open.api.sdk.domain.kplunion.OrderService.request.query.BonusOrderReq;
import com.jd.open.api.sdk.domain.kplunion.OrderService.request.query.OrderReq;
import com.jd.open.api.sdk.domain.kplunion.OrderService.request.query.OrderRowReq;
import com.jd.open.api.sdk.domain.kplunion.OrderService.response.query.BonusOrderQueryResult;
import com.jd.open.api.sdk.domain.kplunion.OrderService.response.query.OrderRowQueryResult;
import com.jd.open.api.sdk.domain.kplunion.PositionService.response.create.CreateResult;
import com.jd.open.api.sdk.domain.kplunion.PromotionService.request.get.PromotionCodeAppletReq;
import com.jd.open.api.sdk.domain.kplunion.StatisticsService.request.query.GiftCouponEffectDataReq;
import com.jd.open.api.sdk.domain.kplunion.StatisticsService.request.query.RedPacketEffectDataReq;
import com.jd.open.api.sdk.domain.kplunion.StatisticsService.response.query.RedPacketEffectDataQueryResult;
import com.jd.open.api.sdk.domain.kplunion.UserService.request.get.PidReq;
import com.jd.open.api.sdk.request.kplunion.*;
import com.jd.open.api.sdk.response.kplunion.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author linmingxi
 * 2020/12/25
 */
@Service
public class JdUnionApiServiceImpl implements IJdUnionApiService {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Value("${unionServerUrl}")
    String serverUrl;
    @Value("${unionAppKey}")
    String appKey;
    @Value("${unionAppSecret}")
    String appSecret;

    @Override
    public RespBody goodsJingfenQuery(String accessToken, Map map) {
        try {
            JdClient client = new DefaultJdClient(serverUrl, accessToken, appKey, appSecret);
            UnionOpenGoodsJingfenQueryRequest request = new UnionOpenGoodsJingfenQueryRequest();
            JFGoodsReq goodsReq = new JFGoodsReq();
            if (map.containsKey("eliteId")){
                goodsReq.setEliteId((Integer) map.get("eliteId"));
            }
            if (map.containsKey("currentPage")){
                goodsReq.setPageIndex((Integer) map.get("currentPage"));
            }
            if (map.containsKey("pageSize")){
                goodsReq.setPageSize((Integer) map.get("pageSize"));
            }
            if (map.containsKey("sortName")){
                goodsReq.setSortName((String) map.get("sortName"));
            }
            if (map.containsKey("sort")){
                goodsReq.setSort((String) map.get("sort"));
            }
            if (map.containsKey("pid")){
                goodsReq.setPid((String) map.get("pid"));
            }
            if (map.containsKey("fields")){
                goodsReq.setFields((String) map.get("fields"));
            }
            if (map.containsKey("forbidTypes")){
                goodsReq.setForbidTypes((String) map.get("forbidTypes"));
            }
            request.setVersion("1.0");
            request.setGoodsReq(goodsReq);
            UnionOpenGoodsJingfenQueryResponse response = client.execute(request);
            JingfenQueryResult queryResult = response.getQueryResult();
            if (queryResult.getCode() != 200) {
                logger.info("获取数据失败code={},message={}", queryResult.getCode(), queryResult.getMessage());
                return new RespBody();
            }

            JSONObject jsonObject = new JSONObject();
            jsonObject.put("data", queryResult.getData());
            jsonObject.put("totalCount", queryResult.getTotalCount());
            return new RespBody(jsonObject);
        } catch (Exception e) {
            logger.error("goodsJingfenQuery - error:{}", e);
            return new RespBody(RespCode.CODE_10501);
        }
    }

    @Override
    public RespBody keywordQuery(String accessToken, Map map) {
        try {
            JdClient client = new DefaultJdClient(serverUrl, accessToken, appKey, appSecret);
            UnionOpenGoodsQueryRequest request = new UnionOpenGoodsQueryRequest();
            GoodsReq goodsReqDTO = new GoodsReq();
            request.setGoodsReqDTO(goodsReqDTO);
            UnionOpenGoodsQueryResponse response = client.execute(request);
            GoodsQueryResult queryResult = response.getQueryResult();
            if (queryResult.getCode() != 200) {
                logger.info("获取数据失败code={},message={}", queryResult.getCode(), queryResult.getMessage());
                return new RespBody();
            }
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("data", queryResult.getData());
            jsonObject.put("totalCount", queryResult.getTotalCount());
            jsonObject.put("hotWords", queryResult.getHotWords());
            jsonObject.put("similarSkuList", queryResult.getSimilarSkuList());
            return new RespBody(jsonObject);
        } catch (Exception e) {
            logger.error("keywordQeuryy - error:{}", e);
            return new RespBody(RespCode.CODE_10501);
        }
    }

    public RespBody promotionGoodsInfoQuery(String accessToken, Map map) {
        try {
            JdClient client = new DefaultJdClient(serverUrl, accessToken, appKey, appSecret);
            UnionOpenGoodsPromotiongoodsinfoQueryRequest request = new UnionOpenGoodsPromotiongoodsinfoQueryRequest();
//            request.setSkuIds(5225346,7275691);
            UnionOpenGoodsPromotiongoodsinfoQueryResponse response = client.execute(request);
            PromotionQueryResult queryResult = response.getQueryResult();
            if (queryResult.getCode() != 200) {
                logger.info("获取数据失败code={},message={}", queryResult.getCode(), queryResult.getMessage());
                return new RespBody();
            }
            return new RespBody(queryResult.getData());
        } catch (Exception e) {
            logger.error("promotionGoodsInfoQuery - error:{}", e);
            return new RespBody(RespCode.CODE_10501);
        }

    }

    @Override
    public RespBody categoryQuery(String accessToken, Map map) {
        try {
            JdClient client = new DefaultJdClient(serverUrl, accessToken, appKey, appSecret);
            UnionOpenCategoryGoodsGetRequest request = new UnionOpenCategoryGoodsGetRequest();
            CategoryReq req = new CategoryReq();
            request.setReq(req);
            UnionOpenCategoryGoodsGetResponse response = client.execute(request);
            GetResult queryResult = response.getGetResult();
            if (queryResult.getCode() != 200) {
                logger.info("获取数据失败code={},message={}", queryResult.getCode(), queryResult.getMessage());
                return new RespBody();
            }
            return new RespBody(queryResult.getData());
        } catch (Exception e) {
            logger.error("categoryQuery - error:{}", e);
            return new RespBody(RespCode.CODE_10501);
        }
    }

    @Override
    public RespBody goodsBigfieldQuery(String accessToken, Map map) {
        try {
            JdClient client = new DefaultJdClient(serverUrl, accessToken, appKey, appSecret);
            UnionOpenGoodsBigfieldQueryRequest request = new UnionOpenGoodsBigfieldQueryRequest();
            BigFieldGoodsReq goodsReq = new BigFieldGoodsReq();
            if (map.containsKey("skuIds")){
                goodsReq.setSkuIds((Long[])map.get("skuIds"));
            }
            if (map.containsKey("fields")){
                goodsReq.setFields((String[])map.get("fields"));
            }
            request.setVersion("1.0");
            request.setGoodsReq(goodsReq);
            UnionOpenGoodsBigfieldQueryResponse response = client.execute(request);
            BigfieldQueryResult queryResult = response.getQueryResult();
            if (queryResult.getCode() != 200) {
                logger.info("获取数据失败code={},message={}", queryResult.getCode(), queryResult.getMessage());
                return new RespBody();
            }
            return new RespBody(queryResult.getData());
        } catch (Exception e) {
            logger.error("goodsDetailQuery - error:{}", e);
            return new RespBody(RespCode.CODE_10501);
        }
    }

    @Override
    public RespBody couponQuery(String accessToken, Map map) {
        try {
            JdClient client = new DefaultJdClient(serverUrl, accessToken, appKey, appSecret);
            UnionOpenCouponQueryRequest request = new UnionOpenCouponQueryRequest();
            List couponUrls = new ArrayList();
            couponUrls.add("abc");
            request.setCouponUrls(couponUrls);
            UnionOpenCouponQueryResponse response = client.execute(request);
            QueryResult queryResult = response.getQueryResult();
            if (queryResult.getCode() != 200) {
                logger.info("获取数据失败code={},message={}", queryResult.getCode(), queryResult.getMessage());
                return new RespBody();
            }
            return new RespBody(queryResult.getData());
        } catch (Exception e) {
            logger.error("couponQuery - error:{}", e);
            return new RespBody(RespCode.CODE_10501);
        }
    }

    @Override
    public RespBody promotionCommonGet(String accessToken, Map map) {
        try {
            JdClient client = new DefaultJdClient(serverUrl, accessToken, appKey, appSecret);
            UnionOpenPromotionCommonGetRequest request = new UnionOpenPromotionCommonGetRequest();
            com.jd.open.api.sdk.domain.kplunion.promotioncommon.PromotionService.request.get.PromotionCodeReq promotionCodeReq = new com.jd.open.api.sdk.domain.kplunion.promotioncommon.PromotionService.request.get.PromotionCodeReq();
            //推广物料url，例如活动链接、商品链接等；不支持仅传入skuid
            if (!map.containsKey("materialId")){
                return new RespBody(RespCode.CODE_10502);
            }
            //网站ID/APP ID，入口：京东联盟-推广管理-网站管理/APP管理-查看网站ID/APP ID（1、接口禁止使用导购媒体id入参；2、投放链接的网址或应用必须与传入的网站ID/AppID备案一致，否则订单会判“无效-来源与备案网址不符”）
            if (!map.containsKey("siteId")){
                return new RespBody(RespCode.CODE_10502);
            }

            promotionCodeReq.setMaterialId((String) map.get("materialId"));
            promotionCodeReq.setSiteId((String) map.get("siteId"));

            //推广位id
            if (map.containsKey("positionId")){
                promotionCodeReq.setPositionId((Long) map.get("positionId"));
            }
            //子渠道标识，您可自定义传入字母、数字或下划线，最多支持80个字符，该参数会在订单行查询接口中展示（需申请权限，申请方法请见https://union.jd.com/helpcenter/13246-13247-46301）
            if (map.containsKey("subUnionId")){
                promotionCodeReq.setSubUnionId((String) map.get("subUnionId"));
            }
            //系统扩展参数（需申请权限，申请方法请见https://union.jd.com/helpcenter/13246-13247-46301），最多支持40字符，参数会在订单行查询接口中展示
            if (map.containsKey("ext1")){
                promotionCodeReq.setSubUnionId((String) map.get("ext1"));
            }
            //联盟子推客身份标识（不能传入接口调用者自己的pid）
            if (map.containsKey("pid")){
                promotionCodeReq.setPid((String) map.get("pid"));
            }
            //优惠券领取链接，在使用优惠券、商品二合一功能时入参，且materialId须为商品详情页链接
            if (map.containsKey("couponUrl")){
                promotionCodeReq.setCouponUrl((String) map.get("couponUrl"));
            }
            //礼金批次号
            if (map.containsKey("giftCouponKey")){
                promotionCodeReq.setGiftCouponKey((String) map.get("giftCouponKey"));
            }
            request.setVersion("1.0");
            request.setPromotionCodeReq(promotionCodeReq);
            UnionOpenPromotionCommonGetResponse response = client.execute(request);
            com.jd.open.api.sdk.domain.kplunion.promotioncommon.PromotionService.response.get.GetResult queryResult = response.getGetResult();
            if (queryResult.getCode() != 200) {
                logger.info("获取数据失败code={},message={}", queryResult.getCode(), queryResult.getMessage());
                return new RespBody();
            }
            return new RespBody(queryResult.getData());
        } catch (Exception e) {
            logger.error("promotionCommonQuery - error:{}", e);
            return new RespBody(RespCode.CODE_10501);
        }
    }

    @Override
    public RespBody bysubunionidQuery(String accessToken, Map map) {
        try {
            JdClient client = new DefaultJdClient(serverUrl, accessToken, appKey, appSecret);
            UnionOpenPromotionBysubunionidGetRequest request = new UnionOpenPromotionBysubunionidGetRequest();
            com.jd.open.api.sdk.domain.kplunion.promotionbysubunioni.PromotionService.request.get.PromotionCodeReq promotionCodeReq = new com.jd.open.api.sdk.domain.kplunion.promotionbysubunioni.PromotionService.request.get.PromotionCodeReq();
            request.setPromotionCodeReq(promotionCodeReq);
            UnionOpenPromotionBysubunionidGetResponse response = client.execute(request);
            com.jd.open.api.sdk.domain.kplunion.promotionbysubunioni.PromotionService.response.get.GetResult queryResult = response.getGetResult();
            if (queryResult.getCode() != 200) {
                logger.info("获取数据失败code={},message={}", queryResult.getCode(), queryResult.getMessage());
                return new RespBody();
            }
            return new RespBody(queryResult.getData());
        } catch (Exception e) {
            logger.error("bysubunionidQuery - error:{}", e);
            return new RespBody(RespCode.CODE_10501);
        }
    }

    @Override
    public RespBody byunionidQuery(String accessToken, Map map) {
        try {
            JdClient client = new DefaultJdClient(serverUrl, accessToken, appKey, appSecret);
            UnionOpenPromotionByunionidGetRequest request = new UnionOpenPromotionByunionidGetRequest();
            com.jd.open.api.sdk.domain.kplunion.promotionbyunionid.PromotionService.request.get.PromotionCodeReq promotionCodeReq = new com.jd.open.api.sdk.domain.kplunion.promotionbyunionid.PromotionService.request.get.PromotionCodeReq();
            request.setPromotionCodeReq(promotionCodeReq);
            UnionOpenPromotionByunionidGetResponse response = client.execute(request);
            com.jd.open.api.sdk.domain.kplunion.promotionbyunionid.PromotionService.response.get.GetResult queryResult = response.getGetResult();
            if (queryResult.getCode() != 200) {
                logger.info("获取数据失败code={},message={}", queryResult.getCode(), queryResult.getMessage());
                return new RespBody();
            }
            return new RespBody(queryResult.getData());
        } catch (Exception e) {
            logger.error("byunionidQuery - error:{}", e);
            return new RespBody(RespCode.CODE_10501);
        }
    }

    @Override
    public RespBody appletQuery(String accessToken, Map map) {
        try {
            JdClient client = new DefaultJdClient(serverUrl, accessToken, appKey, appSecret);
            UnionOpenPromotionAppletGetRequest request = new UnionOpenPromotionAppletGetRequest();
            PromotionCodeAppletReq promotionCodeReq = new PromotionCodeAppletReq();
            request.setPromotionCodeReq(promotionCodeReq);
            UnionOpenPromotionAppletGetResponse response = client.execute(request);
            com.jd.open.api.sdk.domain.kplunion.PromotionService.response.get.GetResult queryResult = response.getGetResult();
            if (queryResult.getCode() != 200) {
                logger.info("获取数据失败code={},message={}", queryResult.getCode(), queryResult.getMessage());
                return new RespBody();
            }
            return new RespBody(queryResult.getData());
        } catch (Exception e) {
            logger.error("appletQuery - error:{}", e);
            return new RespBody(RespCode.CODE_10501);
        }
    }

    @Override
    public RespBody orderQuery(String accessToken, Map map) {
        try {
            JdClient client = new DefaultJdClient(serverUrl, accessToken, appKey, appSecret);
            UnionOpenOrderQueryRequest request = new UnionOpenOrderQueryRequest();
            OrderReq orderReq = new OrderReq();
            request.setOrderReq(orderReq);
            UnionOpenOrderQueryResponse response = client.execute(request);
            com.jd.open.api.sdk.domain.kplunion.OrderService.response.query.QueryResult queryResult = response.getQueryResult();
            if (queryResult.getCode() != 200) {
                logger.info("获取数据失败code={},message={}", queryResult.getCode(), queryResult.getMessage());
                return new RespBody();
            }
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("data",queryResult.getData());
            jsonObject.put("hasMore",queryResult.getHasMore());
            return new RespBody(jsonObject);
        } catch (Exception e) {
            logger.error("orderQuery - error:{}", e);
            return new RespBody(RespCode.CODE_10501);
        }
    }

    @Override
    public RespBody orderBonusQuery(String accessToken, Map map) {
        try {
            JdClient client = new DefaultJdClient(serverUrl, accessToken, appKey, appSecret);
            UnionOpenOrderBonusQueryRequest request = new UnionOpenOrderBonusQueryRequest();
            BonusOrderReq orderReq = new BonusOrderReq();
            request.setOrderReq(orderReq);
            UnionOpenOrderBonusQueryResponse response = client.execute(request);
            BonusOrderQueryResult queryResult = response.getQueryResult();
            if (queryResult.getCode() != 200) {
                logger.info("获取数据失败code={},message={}", queryResult.getCode(), queryResult.getMessage());
                return new RespBody();
            }
            return new RespBody(queryResult.getData());
        } catch (Exception e) {
            logger.error("orderBonusQuery - error:{}", e);
            return new RespBody(RespCode.CODE_10501);
        }
    }

    @Override
    public RespBody orderRowQuery(String accessToken, Map map) {
        try {
            JdClient client = new DefaultJdClient(serverUrl, accessToken, appKey, appSecret);
            UnionOpenOrderRowQueryRequest request = new UnionOpenOrderRowQueryRequest();
            OrderRowReq orderReq = new OrderRowReq();
            request.setOrderReq(orderReq);
            UnionOpenOrderRowQueryResponse response = client.execute(request);
            OrderRowQueryResult queryResult = response.getQueryResult();
            if (queryResult.getCode() != 200) {
                logger.info("获取数据失败code={},message={}", queryResult.getCode(), queryResult.getMessage());
                return new RespBody();
            }
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("data",queryResult.getData());
            jsonObject.put("hasMore",queryResult.getHasMore());
            return new RespBody(jsonObject);
        } catch (Exception e) {
            logger.error("orderRowQuery - error:{}", e);
            return new RespBody(RespCode.CODE_10501);
        }
    }

    @Override
    public RespBody orderAgentQuery(String accessToken, Map map) {
        try {
//            JdClient client=new DefaultJdClient(serverUrl,accessToken,appKey,appSecret);
//            UnionOpenOrderAgentQueryRequest request=new UnionOpenOrderAgentQueryRequest();
//            OrderAgentReq orderReq=new OrderAgentReq();
//            request.setOrderReq(orderReq);
//            UnionOpenOrderAgentQueryResponse response=client.execute(request);
            return null;
        } catch (Exception e) {
            logger.error("orderAgentQuery - error:{}", e);
            return new RespBody(RespCode.CODE_10501);
        }
    }

    @Override
    public RespBody openPositionQuery(String accessToken, Map map) {
        try {
            JdClient client = new DefaultJdClient(serverUrl, accessToken, appKey, appSecret);
            UnionOpenPositionQueryRequest request = new UnionOpenPositionQueryRequest();
            com.jd.open.api.sdk.domain.kplunion.PositionService.request.query.PositionReq positionReq = new com.jd.open.api.sdk.domain.kplunion.PositionService.request.query.PositionReq();
            request.setPositionReq(positionReq);
            UnionOpenPositionQueryResponse response = client.execute(request);
            com.jd.open.api.sdk.domain.kplunion.PositionService.response.query.QueryResult queryResult = response.getQueryResult();
            if (queryResult.getCode() != 200) {
                logger.info("获取数据失败code={},message={}", queryResult.getCode(), queryResult.getMessage());
                return new RespBody();
            }
            return new RespBody(queryResult.getData());
        } catch (Exception e) {
            logger.error("openPositionQuery - error:{}", e);
            return new RespBody(RespCode.CODE_10501);
        }
    }

    @Override
    public RespBody openPositionCreate(String accessToken, Map map) {
        try {
            JdClient client = new DefaultJdClient(serverUrl, accessToken, appKey, appSecret);
            UnionOpenPositionCreateRequest request = new UnionOpenPositionCreateRequest();
            com.jd.open.api.sdk.domain.kplunion.PositionService.request.create.PositionReq positionReq = new com.jd.open.api.sdk.domain.kplunion.PositionService.request.create.PositionReq();
            request.setPositionReq(positionReq);
            UnionOpenPositionCreateResponse response = client.execute(request);
            CreateResult queryResult = response.getCreateResult();
            if (queryResult.getCode() != 200) {
                logger.info("获取数据失败code={},message={}", queryResult.getCode(), queryResult.getMessage());
                return new RespBody();
            }
            return new RespBody(queryResult.getData());
        } catch (Exception e) {
            logger.error("openPositionCreate - error:{}", e);
            return new RespBody(RespCode.CODE_10501);
        }
    }

    @Override
    public RespBody openUserPidGet(String accessToken, Map map) {
        try {
            JdClient client = new DefaultJdClient(serverUrl, accessToken, appKey, appSecret);
            UnionOpenUserPidGetRequest request = new UnionOpenUserPidGetRequest();
            PidReq pidReq = new PidReq();
            request.setPidReq(pidReq);
            UnionOpenUserPidGetResponse response = client.execute(request);
            com.jd.open.api.sdk.domain.kplunion.UserService.response.get.GetResult queryResult = response.getGetResult();
            if (queryResult.getCode() != 200) {
                logger.info("获取数据失败code={},message={}", queryResult.getCode(), queryResult.getMessage());
                return new RespBody();
            }
            return new RespBody(queryResult.getData());
        } catch (Exception e) {
            logger.error("openUserPidGet - error:{}", e);
            return new RespBody(RespCode.CODE_10501);
        }
    }

    @Override
    public RespBody goodsMaterialQuery(String accessToken, Map map) {
        try {
            JdClient client=new DefaultJdClient(serverUrl,accessToken,appKey,appSecret);
            UnionOpenGoodsMaterialQueryRequest request=new UnionOpenGoodsMaterialQueryRequest();
            MaterialGoodsReq goodsReq=new MaterialGoodsReq();
            request.setGoodsReq(goodsReq);
            UnionOpenGoodsMaterialQueryResponse response=client.execute(request);
            MaterialQueryResult queryResult = response.getQueryResult();
            if (queryResult.getCode() != 200) {
                logger.info("获取数据失败code={},message={}", queryResult.getCode(), queryResult.getMessage());
                return new RespBody();
            }
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("data",queryResult.getData());
            jsonObject.put("totalCount",queryResult.getTotalCount());
            return new RespBody(jsonObject);
        }catch (Exception e){
            logger.error("goodsMaterialQuery - error:{}", e);
            return new RespBody(RespCode.CODE_10501);
        }
    }

    @Override
    public RespBody ruleCommissionMix(String accessToken, Map map) {
        try {
//            JdClient client=new DefaultJdClient(serverUrl,accessToken,appKey,appSecret);
//            UnionOpenRuleCommissionMixRequest request=new UnionOpenRuleCommissionMixRequest();
//            request.setAppKey(appkey);
//            CommissionRuleReq commissionRuleReq=new CommissionRuleReq();
//            request.setCommissionRuleReq(commissionRuleReq);
//            UnionOpenRuleCommissionMixResponse response=client.execute(request);
            return null;
        }catch (Exception e){
            logger.error("ruleCommissionMix - error:{}", e);
            return new RespBody(RespCode.CODE_10501);
        }
    }

    @Override
    public RespBody redpacketQuery(String accessToken, Map map) {
        try {
            JdClient client=new DefaultJdClient(serverUrl,accessToken,appKey,appSecret);
            UnionOpenStatisticsRedpacketQueryRequest request=new UnionOpenStatisticsRedpacketQueryRequest();
            RedPacketEffectDataReq effectDataReq=new RedPacketEffectDataReq();
            request.setEffectDataReq(effectDataReq);
            UnionOpenStatisticsRedpacketQueryResponse response=client.execute(request);
            RedPacketEffectDataQueryResult queryResult = response.getQueryResult();
            if (queryResult.getCode() != 200) {
                logger.info("获取数据失败code={},message={}", queryResult.getCode(), queryResult.getMessage());
                return new RespBody();
            }
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("data",queryResult.getData());
            jsonObject.put("totalCount",queryResult.getTotalCount());
            return new RespBody(jsonObject);
        }catch (Exception e){
            logger.error("redpacketQuery - error:{}", e);
            return new RespBody(RespCode.CODE_10501);
        }
    }

    @Override
    public RespBody activityQuery(String accessToken, Map map) {
        try {
            JdClient client=new DefaultJdClient(serverUrl,accessToken,appKey,appSecret);
            UnionOpenActivityQueryRequest request=new UnionOpenActivityQueryRequest();
            ActivityReq activityReq=new ActivityReq();
            request.setActivityReq(activityReq);
            UnionOpenActivityQueryResponse response=client.execute(request);
            com.jd.open.api.sdk.domain.kplunion.ActivityService.response.query.QueryResult queryResult = response.getQueryResult();
            if (queryResult.getCode() != 200) {
                logger.info("获取数据失败code={},message={}", queryResult.getCode(), queryResult.getMessage());
                return new RespBody();
            }
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("data",queryResult.getData());
            jsonObject.put("totalCount",queryResult.getTotalCount());
            return new RespBody(jsonObject);
        }catch (Exception e){
            logger.error("activityQuery - error:{}", e);
            return new RespBody(RespCode.CODE_10501);
        }
    }

    @Override
    public RespBody couponGiftStop(String accessToken, Map map) {
        try {
            JdClient client=new DefaultJdClient(serverUrl,accessToken,appKey,appSecret);
            UnionOpenCouponGiftStopRequest request=new UnionOpenCouponGiftStopRequest();
            StopGiftCouponReq couponReq=new StopGiftCouponReq();
            request.setCouponReq(couponReq);
            UnionOpenCouponGiftStopResponse response=client.execute(request);
            StopResult queryResult = response.getStopResult();
            if (queryResult.getCode() != 200) {
                logger.info("获取数据失败code={},message={}", queryResult.getCode(), queryResult.getMessage());
                return new RespBody(RespCode.CODE_10504.getCode(),queryResult.getMessage());
            }
            return new RespBody();
        }catch (Exception e){
            logger.error("activityQuery - error:{}", e);
            return new RespBody(RespCode.CODE_10501);
        }
    }

    @Override
    public RespBody couponGiftGet(String accessToken, Map map) {
        try {
            JdClient client=new DefaultJdClient(serverUrl,accessToken,appKey,appSecret);
            UnionOpenCouponGiftGetRequest request=new UnionOpenCouponGiftGetRequest();
            CreateGiftCouponReq couponReq=new CreateGiftCouponReq();
            request.setCouponReq(couponReq);
            UnionOpenCouponGiftGetResponse response=client.execute(request);
            com.jd.open.api.sdk.domain.kplunion.CouponService.response.get.GetResult queryResult = response.getGetResult();
            if (queryResult.getCode() != 200) {
                logger.info("获取数据失败code={},message={}", queryResult.getCode(), queryResult.getMessage());
                return new RespBody();
            }
            return new RespBody(queryResult.getData());
        }catch (Exception e){
            logger.error("couponGiftGet - error:{}", e);
            return new RespBody(RespCode.CODE_10501);
        }
    }

    @Override
    public RespBody giftcouponQuery(String accessToken, Map map) {
        try {
            JdClient client=new DefaultJdClient(serverUrl,accessToken,appKey,appSecret);
            UnionOpenStatisticsGiftcouponQueryRequest request=new UnionOpenStatisticsGiftcouponQueryRequest();
            GiftCouponEffectDataReq effectDataReq=new GiftCouponEffectDataReq();
            request.setEffectDataReq(effectDataReq);
            UnionOpenStatisticsGiftcouponQueryResponse response=client.execute(request);
            com.jd.open.api.sdk.domain.kplunion.StatisticsService.response.query.QueryResult queryResult = response.getQueryResult();
            if (queryResult.getCode() != 200) {
                logger.info("获取数据失败code={},message={}", queryResult.getCode(), queryResult.getMessage());
                return new RespBody();
            }
            return new RespBody(queryResult.getData());
        }catch (Exception e){
            logger.error("giftcouponQuery - error:{}", e);
            return new RespBody(RespCode.CODE_10501);
        }
    }
}
