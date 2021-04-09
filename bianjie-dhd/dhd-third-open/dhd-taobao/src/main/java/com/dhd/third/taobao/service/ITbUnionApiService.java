package com.dhd.third.taobao.service;

import com.bianjie.common.response.RespBody;

import java.util.Map;

/**
 * @author linmingxi
 * 2021/01/04
 */
public interface ITbUnionApiService {

    /**
     * 权限包:15029
     * (使用API前，请确认是否已有淘礼金权限，没有权限则无法调通API。点击去申请“开通淘礼金”：
     * https://tbk.bbs.taobao.com/detail.html?appId=45301&postId=9179492）淘宝客推广者，
     * 淘礼金创建功能及数据查看功能)
     *
     * taobao.tbk.dg.vegas.tlj.create ( 淘宝客-推广者-淘礼金创建 )
     * 创建淘礼金
     */
    RespBody tbkDgVegasTljCreate(Map param);

    /**
     * 权限包:15029
     * taobao.tbk.dg.vegas.tlj.instance.report( 淘宝客-推广者-淘礼金发放及使用报表 )
     * 淘礼金实例维度相关报表数据查询
     */
    RespBody tbkDgVegasTljInstanceReport(Map param);


    /**
     * 权限包:21226
     * (淘宝客传入用户标识的信息，查询该用户是否有当前阶段待核销的红包。)
     *
     * taobao.tbk.dg.vegas.send.status( 淘宝客-推广者-超级红包领取状态查询 )
     * 淘宝客传入用户标识的信息，查询该用户是否有当前阶段待核销的红包
     * （淘客接入前需签署协议 https://pub.alimama.com/fourth/protocol/common.htm?key=hangye_laxin）
     */
    RespBody tbkDgVegasSendStatus(Map param);

    /**
     * 权限包:16188
     * (推广者拉新的新用户订单明细查询和拉新活动对应数据查询)
     *
     * taobao.tbk.dg.newuser.order.get( 淘宝客-推广者-新用户订单明细查询 )
     * 拉新API
     */
    RespBody tbkDgNewuserOrderGet(Map param);

    /**
     * 权限包:16188
     * taobao.tbk.dg.newuser.order.sum( 淘宝客-推广者-拉新活动对应数据查询 )
     * 拉新活动汇总API
     */
    RespBody tbkDgNewuserOrderSum(Map param);

    /**
     * 权限包:18294
     * (淘宝客官方活动转链(支持淘宝、天猫等活动，以及饿了么等本地化活动))
     *
     * taobao.tbk.activity.info.get( 淘宝客-推广者-官方活动转链 )
     * 支持入参推广位和官方活动会场ID，获取活动信息和推广链接，包含推广长链接、短链接、淘口令、微信推广二维码地址等。
     * 改该API支持二方、三方类型的转链。官方活动会场ID，从淘宝客后台“我要推广-活动推广”中获取。
     */
    RespBody tbkActivityInfoGet(Map param);

    /**
     * 权限包:16518
     * (①精选商品库、榜单商品等特定批量商品的获取，②权益物料即优惠券及优惠券可用商品的批量获取)
     *
     * taobao.tbk.dg.optimus.material( 淘宝客-推广者-物料精选 )
     * 支持入参对应的“推广位”和官方提供的“物料id”，获取指定物料信息和推广链接，
     * 还可入参用户信息提供智能推荐（需智能推荐请先前协议
     * https://pub.alimama.com/fourth/protocol/common.htm?key=hangye_laxin）
     */
    RespBody tbkDgOptimusMaterial(Map param);

    /**
     * 权限包:16518
     * taobao.tbk.dg.optimus.promotion( 淘宝客-推广者-权益物料精选 )
     * 推广者使用。支持入参推广者对应的“推广位”和官方提供的“权益物料id”，获取指定权益物料。
     */
    RespBody tbkDgOptimusPromotion(Map param);

    /**
     * 权限包:16517
     * (获取聚划算的商品)
     *
     * taobao.ju.items.search( 聚划算商品搜索接口 )
     * 搜索聚划算商品
     */
    RespBody juItemsSearch(Map param);

    /**
     * 权限包:16516
     * (根据关键词搜索商品、店铺及相关信息)
     *
     * taobao.tbk.shop.get 淘宝客-推广者-店铺搜索
     * 淘宝客店铺查询
     */
    RespBody tbkShopGet(Map param);


    /**
     * 权限包:16516
     * taobao.tbk.dg.material.optional( 淘宝客-推广者-物料搜索 )
     * 通用物料搜索API（导购）
     */
    RespBody tbkDgMaterialOptional(Map param);


    /**
     * 权限包:16292
     * (输入卖家id，提供和该店铺相关联的店铺推荐)
     *
     * taobao.tbk.shop.recommend.get( 淘宝客-公用-店铺关联推荐 )
     * 入参卖家id，可推荐与此店铺相关联的相关店铺。
     */
    RespBody tbkShopRecommendGet(Map param);

    /**
     * 权限包:11655
     * (淘宝客【公用】淘口令生成)
     *
     * taobao.tbk.tpwd.create( 淘宝客-公用-淘口令生成 )
     * 提供淘口令生成接口。提交需要生成淘口令的内容、logo、url等参数，生成淘口令，
     * 其中关键信息为￥SADadW￥，后续可基于淘口令进行文案包装组装用于传播。
     */
    RespBody tbkTpwdCreate(Map param);

    /**
     * 权限包:14474
     * (支持渠道管理、会员运营管理功能的邀请码创建、邀请渠道或会员备案，以及备案信息的查看)
     *
     * taobao.tbk.sc.publisher.info.save( 淘宝客-公用-私域用户备案 )
     * 通过入参渠道管理或会员运营管理的邀请码，生成渠道id或会员运营id，完成渠道或会员的备案。
     */
    RespBody tbkScPublisherInfoSave(String sessionKey, Map param);

    /**
     * 权限包:14474
     * taobao.tbk.sc.publisher.info.get( 淘宝客-公用-私域用户备案信息查询 )
     * 查询已生成的渠道id或会员运营id的相关信息。
     */
    RespBody tbkScPublisherInfoGet(String sessionKey, Map param);


    /**
     * 权限包:14474
     * taobao.tbk.sc.invitecode.get( 淘宝客-公用-私域用户邀请码生成 )
     * 私域用户管理(即渠道管理或会员运营管理)功能中，通过此API可生成淘宝客自身的邀请码。
     */
    RespBody tbkScInvitecodeGet(String sessionKey, Map param);


    /**
     * 权限包:16189
     * (淘宝客的商品信息查询、阿里妈妈推广券信息查询)
     *
     * taobao.tbk.item.info.get( 淘宝客-公用-淘宝客商品详情查询(简版) )
     * 淘宝客商品详情查询（简版）
     */
    RespBody tbkItemInfoGet(Map param);


    /**
     * 权限包:16189
     * taobao.tbk.coupon.get( 淘宝客-公用-阿里妈妈推广券详情查询 )
     * 传入商品ID+券ID(券ID已知情况下)，或者传入me参数，均可查询阿里妈妈推广券详细信息。
     */
    RespBody tbkCouponGet(Map param);


}