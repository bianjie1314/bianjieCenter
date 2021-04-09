package com.dhd.third.jingdong.service;


import com.bianjie.common.response.RespBody;

import java.util.Map;

/**
 * 联盟api
 * @author linmingxi
 * 2020/12/25
 */
public interface IJdUnionApiService {


    /**
     *  京粉精选商品查询接口
     * 京东联盟精选优质商品，每日更新，可通过频道ID查询各个频道下的精选商品。
     * 用获取的优惠券链接调用转链接口时，需传入搜索接口link字段返回的原始优惠券链接，
     * 切勿对链接进行任何encode、decode操作，否则将导致转链二合一推广链接时校验失败。
     * */
    public RespBody goodsJingfenQuery(String accessToken, Map map);

    /**
     * 关键词商品查询接口【申请】
     * 查询商品及优惠券信息，返回的结果可调用转链接口生成单品或二合一推广链接。支持按SKUID、关键词、优惠券基本属性、是否拼购、是否爆款等条件查询，
     * 建议不要同时传入SKUID和其他字段，以获得较多的结果。支持按价格、佣金比例、佣金、引单量等维度排序。用优惠券链接调用转链接口时，
     * 需传入搜索接口link字段返回的原始优惠券链接，切勿对链接进行任何encode、decode操作，否则将导致转链二合一推广链接时校验失败。
     * */
    public RespBody keywordQuery(String accessToken, Map map);

    /**
     * 根据skuid查询商品信息接口
     *通过SKUID查询推广商品的名称、主图、类目、价格、物流、是否自营、30天引单数量等详细信息，
     * 支持批量获取。通常用于在媒体侧展示商品详情。
     * */
    public RespBody promotionGoodsInfoQuery(String accessToken, Map map);

    /**
     *  商品类目查询接口
     * 根据商品的父类目id查询子类目id信息，通常用获取各级类目对应关系，以便将推广商品归类。
     * 业务参数parentId、grade都输入0可查询所有一级类目ID，之后再用其作为parentId查询其子类目。
     */
    public RespBody categoryQuery(String accessToken, Map map);

    /**
     * 商品详情查询接口
     * 商品详情查询接口,大字段信息
     */
    public RespBody goodsBigfieldQuery(String accessToken, Map map);

    /**
     * 优惠券领取情况查询接口【申请】
     * 通过领券链接查询优惠券的平台、面额、期限、可用状态、
     * 剩余数量等详细信息，通常用于和商品信息一起展示优惠券券信息。需向cps-qxsq@jd.com申请权限。
     */
    public RespBody couponQuery(String accessToken, Map map);

    /**
     *网站/APP获取推广链接接口
     * 网站/APP来获取的推广链接，功能同宙斯接口的自定义链接转换、 APP领取代码接口通过商品链接、活动链接获取普通推广链接，
     * 支持传入subunionid参数，可用于区分媒体自身的用户ID，该参数可在订单查询接口返回，需向cps-qxsq@jd.com申请权限。
     */
    public RespBody promotionCommonGet(String accessToken, Map map);

    /**
     * 社交媒体获取推广链接接口【申请】
     * 通过商品链接、领券链接、活动链接获取普通推广链接或优惠券二合一推广链接，支持传入subunionid参数，
     * 可用于区分媒体自身的用户ID，该参数可在订单查询接口返回。接口和subunionid参数需向cps-qxsq@jd.com申请权限。
     * 功能同宙斯接口的优惠券,商品二合一转接API-通过subUnionId获取推广链接、联盟微信手q通过subUnionId获取推广链接。
     */
    public RespBody bysubunionidQuery(String accessToken, Map map);

    /**
     * 工具商获取推广链接接口【申请】
     * 工具商媒体帮助子站长获取普通推广链接和优惠券二合一推广链接，可传入PID参数以区分子站长的推广位，
     * 该参数可在订单查询接口返回。接口和subunionid参数需向cps-qxsq@jd.com申请权限。
     */
    public RespBody byunionidQuery(String accessToken, Map map);

    /**
     * 通过小程序获取推广链接【申请】
     */
    public RespBody appletQuery(String accessToken, Map map);

    /**
     * 订单查询接口
     * 查询推广订单及佣金信息，可查询最近90天内下单的订单，会随着订单状态变化同步更新数据。
     * 支持按下单时间、完成时间或更新时间查询。建议按更新时间每分钟调用一次，查询最近一分钟的订单更新数据。
     * 支持查询subunionid、推广位、PID参数，支持普通推客及工具商推客订单查询。
     */
    public RespBody orderQuery(String accessToken, Map map);

    /**
     * 奖励订单查询接口【申请】
     * 奖励订单查询接口，奖励活动效果的奖励订单明细查询接口，每日奖励订单大于五千单可申请该接口权限。
     * 未达到该标准的站长可在联盟官网—效果报表—导出对应订单明细。
     */
    public RespBody orderBonusQuery(String accessToken, Map map);

    /**
     * 订单行查询接口
     * 查询推广订单及佣金信息，可查询最近90天内下单的订单，会随着订单状态变化同步更新数据。
     * 支持按下单时间、完成时间或更新时间查询。建议按更新时间每分钟调用一次，查询最近一分钟的订单更新数据。
     * 支持查询subunionid、推广位、PID参数，支持普通推客及工具商推客订单查询。如需要通过SDK调用此接口，
     * 请接入JOS SDK：https://union.jd.com/helpcenter/13246-13312-108188
     */
    public RespBody orderRowQuery(String accessToken, Map map);

    /**
     * 工具商订单行查询接口【申请】
     * 工具商订单行查询接口
     */
    public RespBody orderAgentQuery(String accessToken, Map map);

    /**
     * 查询推广位【申请】
     * 工具商媒体帮助推客查询推广位，推广位分为两种类型：3：私域推广位，上限5000个，不在联盟后台展示，
     * 无对应 PID；4：联盟后台推广位，上限500个，在联盟后台展示，可用于内容平台推广。
     * 业务参数key需要由推客进入联盟官网-我的工具-我的API中查询，有效期365天。此接口需向cps-qxsq@jd.com申请权限
     */
    public RespBody openPositionQuery(String accessToken, Map map);

    /**
     * 创建推广位【申请】
     * 工具商媒体帮助推客批量创建推广位，推广位分为两种类型：3：私域推广位，上限5000个，
     * 不在联盟后台展示，无对应 PID；4：联盟后台推广位，上限500个，在联盟后台展示，自动生成PID，
     * 可用于内容平台推广。业务参数key需要由推客进入联盟官网-我的工具-我的API中查询，有效期365天。
     * 此接口需向cps-qxsq@jd.com申请权限。
     */
    public RespBody openPositionCreate(String accessToken, Map map);

    /**
     * 获取PID【申请】
     * 工具商媒体帮助子站长创建PID，该参数可在媒体和子站长之间建立关联，并通过获取推广链接、
     * 订单查询来跟踪。需向cps-qxsq@jd.com申请权限。此接口创建的pid,同一联盟用户不能超过10个，
     * 和官网手动创建的推广位相加不能超过500个。
     */
    public RespBody openUserPidGet(String accessToken, Map map);

    /**
     * 猜你喜欢商品推荐
     * 输入频道id、userid即可获取个性化推荐的商品信息，
     * 目前联盟推荐的精选频道包含猜你喜欢、实时热销、大额券、9.9包邮等各种实时数据，
     * 适用于toc搭建频道页，千人千面商品推荐模块场景。建议使用clickURL转链长链接，
     * 千人千面推荐效果会更好。注意：请勿传入排序参数，以免影响推荐效果。
     **/
    public RespBody goodsMaterialQuery(String accessToken, Map map);

    /**
     * 佣金规则混合接口【申请】
     * 佣金规则混合接口
     */
    public RespBody ruleCommissionMix(String accessToken, Map map);

    /**
     * 京享红包效果数据
     * 查询京享红包活动的浏览数次数、红包发放数量、红包使用数量、有效红包订单数量、
     * 有效红包订单GMV、有效红包订单预估佣金。支持查询T+1数据，可按推广位ID、京享红包活动ID筛选数据。
     */
    public RespBody redpacketQuery(String accessToken, Map map);

    /**
     * 活动查询接口
     * 提供联盟官方活动查询，支持分别查询联盟PC端、京粉APP、大促营销日历的活动，
     * 可查询活动链接、图片、规则等素材。建议按日期依次查询当天及未来的活动。
     */
    public RespBody activityQuery(String accessToken, Map map);

    /**
     * 礼金停止
     * 如您创建的礼金设置有误，可随时调用此接口停止礼金，未发放的礼金将在停止次日返回您的礼金账户，
     * 已发放未使用的礼金将在过期后次日返回您的礼金账户。注意：礼金停止后不可恢复。
     */
    public RespBody couponGiftStop(String accessToken, Map map);

    /**
     * 礼金创建
     * 礼金创建接口可针对指定商品生成礼金批次ID，之后还需调用转链接口，传入商品链接+礼金ID+普通优惠券链接，
     * 即可生成礼金推广链接，进行投放推广。 注：您需要预先充值才可创建礼金，请在联盟PC官网-工具场景-京享礼金，
     * 或京粉app-首页京享礼金内进行充值。（您需开通礼金充值权限方可充值，部分在黑名单中的商品不可创建礼金）
     */
    public RespBody couponGiftGet(String accessToken, Map map);


    /**
     * 礼金效果数据
     * 您可以通过礼金批次ID或礼金商品SKUID实时查询礼金面额、剩余数量、有效期等基础信息，以及礼金的实时推广数据。
     */
    public RespBody giftcouponQuery(String accessToken, Map map);

}
