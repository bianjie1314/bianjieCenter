package com.dhd.third.jingdong.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DhdJdDownDirectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DhdJdDownDirectExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andSidIsNull() {
            addCriterion("sid is null");
            return (Criteria) this;
        }

        public Criteria andSidIsNotNull() {
            addCriterion("sid is not null");
            return (Criteria) this;
        }

        public Criteria andSidEqualTo(Integer value) {
            addCriterion("sid =", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotEqualTo(Integer value) {
            addCriterion("sid <>", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThan(Integer value) {
            addCriterion("sid >", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sid >=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThan(Integer value) {
            addCriterion("sid <", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThanOrEqualTo(Integer value) {
            addCriterion("sid <=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidIn(List<Integer> values) {
            addCriterion("sid in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotIn(List<Integer> values) {
            addCriterion("sid not in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidBetween(Integer value1, Integer value2) {
            addCriterion("sid between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotBetween(Integer value1, Integer value2) {
            addCriterion("sid not between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andIndexPicUrlIsNull() {
            addCriterion("index_pic_url is null");
            return (Criteria) this;
        }

        public Criteria andIndexPicUrlIsNotNull() {
            addCriterion("index_pic_url is not null");
            return (Criteria) this;
        }

        public Criteria andIndexPicUrlEqualTo(String value) {
            addCriterion("index_pic_url =", value, "indexPicUrl");
            return (Criteria) this;
        }

        public Criteria andIndexPicUrlNotEqualTo(String value) {
            addCriterion("index_pic_url <>", value, "indexPicUrl");
            return (Criteria) this;
        }

        public Criteria andIndexPicUrlGreaterThan(String value) {
            addCriterion("index_pic_url >", value, "indexPicUrl");
            return (Criteria) this;
        }

        public Criteria andIndexPicUrlGreaterThanOrEqualTo(String value) {
            addCriterion("index_pic_url >=", value, "indexPicUrl");
            return (Criteria) this;
        }

        public Criteria andIndexPicUrlLessThan(String value) {
            addCriterion("index_pic_url <", value, "indexPicUrl");
            return (Criteria) this;
        }

        public Criteria andIndexPicUrlLessThanOrEqualTo(String value) {
            addCriterion("index_pic_url <=", value, "indexPicUrl");
            return (Criteria) this;
        }

        public Criteria andIndexPicUrlLike(String value) {
            addCriterion("index_pic_url like", value, "indexPicUrl");
            return (Criteria) this;
        }

        public Criteria andIndexPicUrlNotLike(String value) {
            addCriterion("index_pic_url not like", value, "indexPicUrl");
            return (Criteria) this;
        }

        public Criteria andIndexPicUrlIn(List<String> values) {
            addCriterion("index_pic_url in", values, "indexPicUrl");
            return (Criteria) this;
        }

        public Criteria andIndexPicUrlNotIn(List<String> values) {
            addCriterion("index_pic_url not in", values, "indexPicUrl");
            return (Criteria) this;
        }

        public Criteria andIndexPicUrlBetween(String value1, String value2) {
            addCriterion("index_pic_url between", value1, value2, "indexPicUrl");
            return (Criteria) this;
        }

        public Criteria andIndexPicUrlNotBetween(String value1, String value2) {
            addCriterion("index_pic_url not between", value1, value2, "indexPicUrl");
            return (Criteria) this;
        }

        public Criteria andDetailUrlIsNull() {
            addCriterion("detail_url is null");
            return (Criteria) this;
        }

        public Criteria andDetailUrlIsNotNull() {
            addCriterion("detail_url is not null");
            return (Criteria) this;
        }

        public Criteria andDetailUrlEqualTo(String value) {
            addCriterion("detail_url =", value, "detailUrl");
            return (Criteria) this;
        }

        public Criteria andDetailUrlNotEqualTo(String value) {
            addCriterion("detail_url <>", value, "detailUrl");
            return (Criteria) this;
        }

        public Criteria andDetailUrlGreaterThan(String value) {
            addCriterion("detail_url >", value, "detailUrl");
            return (Criteria) this;
        }

        public Criteria andDetailUrlGreaterThanOrEqualTo(String value) {
            addCriterion("detail_url >=", value, "detailUrl");
            return (Criteria) this;
        }

        public Criteria andDetailUrlLessThan(String value) {
            addCriterion("detail_url <", value, "detailUrl");
            return (Criteria) this;
        }

        public Criteria andDetailUrlLessThanOrEqualTo(String value) {
            addCriterion("detail_url <=", value, "detailUrl");
            return (Criteria) this;
        }

        public Criteria andDetailUrlLike(String value) {
            addCriterion("detail_url like", value, "detailUrl");
            return (Criteria) this;
        }

        public Criteria andDetailUrlNotLike(String value) {
            addCriterion("detail_url not like", value, "detailUrl");
            return (Criteria) this;
        }

        public Criteria andDetailUrlIn(List<String> values) {
            addCriterion("detail_url in", values, "detailUrl");
            return (Criteria) this;
        }

        public Criteria andDetailUrlNotIn(List<String> values) {
            addCriterion("detail_url not in", values, "detailUrl");
            return (Criteria) this;
        }

        public Criteria andDetailUrlBetween(String value1, String value2) {
            addCriterion("detail_url between", value1, value2, "detailUrl");
            return (Criteria) this;
        }

        public Criteria andDetailUrlNotBetween(String value1, String value2) {
            addCriterion("detail_url not between", value1, value2, "detailUrl");
            return (Criteria) this;
        }

        public Criteria andCouponUrlIsNull() {
            addCriterion("coupon_url is null");
            return (Criteria) this;
        }

        public Criteria andCouponUrlIsNotNull() {
            addCriterion("coupon_url is not null");
            return (Criteria) this;
        }

        public Criteria andCouponUrlEqualTo(String value) {
            addCriterion("coupon_url =", value, "couponUrl");
            return (Criteria) this;
        }

        public Criteria andCouponUrlNotEqualTo(String value) {
            addCriterion("coupon_url <>", value, "couponUrl");
            return (Criteria) this;
        }

        public Criteria andCouponUrlGreaterThan(String value) {
            addCriterion("coupon_url >", value, "couponUrl");
            return (Criteria) this;
        }

        public Criteria andCouponUrlGreaterThanOrEqualTo(String value) {
            addCriterion("coupon_url >=", value, "couponUrl");
            return (Criteria) this;
        }

        public Criteria andCouponUrlLessThan(String value) {
            addCriterion("coupon_url <", value, "couponUrl");
            return (Criteria) this;
        }

        public Criteria andCouponUrlLessThanOrEqualTo(String value) {
            addCriterion("coupon_url <=", value, "couponUrl");
            return (Criteria) this;
        }

        public Criteria andCouponUrlLike(String value) {
            addCriterion("coupon_url like", value, "couponUrl");
            return (Criteria) this;
        }

        public Criteria andCouponUrlNotLike(String value) {
            addCriterion("coupon_url not like", value, "couponUrl");
            return (Criteria) this;
        }

        public Criteria andCouponUrlIn(List<String> values) {
            addCriterion("coupon_url in", values, "couponUrl");
            return (Criteria) this;
        }

        public Criteria andCouponUrlNotIn(List<String> values) {
            addCriterion("coupon_url not in", values, "couponUrl");
            return (Criteria) this;
        }

        public Criteria andCouponUrlBetween(String value1, String value2) {
            addCriterion("coupon_url between", value1, value2, "couponUrl");
            return (Criteria) this;
        }

        public Criteria andCouponUrlNotBetween(String value1, String value2) {
            addCriterion("coupon_url not between", value1, value2, "couponUrl");
            return (Criteria) this;
        }

        public Criteria andSpreadUrlIsNull() {
            addCriterion("spread_url is null");
            return (Criteria) this;
        }

        public Criteria andSpreadUrlIsNotNull() {
            addCriterion("spread_url is not null");
            return (Criteria) this;
        }

        public Criteria andSpreadUrlEqualTo(String value) {
            addCriterion("spread_url =", value, "spreadUrl");
            return (Criteria) this;
        }

        public Criteria andSpreadUrlNotEqualTo(String value) {
            addCriterion("spread_url <>", value, "spreadUrl");
            return (Criteria) this;
        }

        public Criteria andSpreadUrlGreaterThan(String value) {
            addCriterion("spread_url >", value, "spreadUrl");
            return (Criteria) this;
        }

        public Criteria andSpreadUrlGreaterThanOrEqualTo(String value) {
            addCriterion("spread_url >=", value, "spreadUrl");
            return (Criteria) this;
        }

        public Criteria andSpreadUrlLessThan(String value) {
            addCriterion("spread_url <", value, "spreadUrl");
            return (Criteria) this;
        }

        public Criteria andSpreadUrlLessThanOrEqualTo(String value) {
            addCriterion("spread_url <=", value, "spreadUrl");
            return (Criteria) this;
        }

        public Criteria andSpreadUrlLike(String value) {
            addCriterion("spread_url like", value, "spreadUrl");
            return (Criteria) this;
        }

        public Criteria andSpreadUrlNotLike(String value) {
            addCriterion("spread_url not like", value, "spreadUrl");
            return (Criteria) this;
        }

        public Criteria andSpreadUrlIn(List<String> values) {
            addCriterion("spread_url in", values, "spreadUrl");
            return (Criteria) this;
        }

        public Criteria andSpreadUrlNotIn(List<String> values) {
            addCriterion("spread_url not in", values, "spreadUrl");
            return (Criteria) this;
        }

        public Criteria andSpreadUrlBetween(String value1, String value2) {
            addCriterion("spread_url between", value1, value2, "spreadUrl");
            return (Criteria) this;
        }

        public Criteria andSpreadUrlNotBetween(String value1, String value2) {
            addCriterion("spread_url not between", value1, value2, "spreadUrl");
            return (Criteria) this;
        }

        public Criteria andBeforePriceIsNull() {
            addCriterion("before_price is null");
            return (Criteria) this;
        }

        public Criteria andBeforePriceIsNotNull() {
            addCriterion("before_price is not null");
            return (Criteria) this;
        }

        public Criteria andBeforePriceEqualTo(BigDecimal value) {
            addCriterion("before_price =", value, "beforePrice");
            return (Criteria) this;
        }

        public Criteria andBeforePriceNotEqualTo(BigDecimal value) {
            addCriterion("before_price <>", value, "beforePrice");
            return (Criteria) this;
        }

        public Criteria andBeforePriceGreaterThan(BigDecimal value) {
            addCriterion("before_price >", value, "beforePrice");
            return (Criteria) this;
        }

        public Criteria andBeforePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("before_price >=", value, "beforePrice");
            return (Criteria) this;
        }

        public Criteria andBeforePriceLessThan(BigDecimal value) {
            addCriterion("before_price <", value, "beforePrice");
            return (Criteria) this;
        }

        public Criteria andBeforePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("before_price <=", value, "beforePrice");
            return (Criteria) this;
        }

        public Criteria andBeforePriceIn(List<BigDecimal> values) {
            addCriterion("before_price in", values, "beforePrice");
            return (Criteria) this;
        }

        public Criteria andBeforePriceNotIn(List<BigDecimal> values) {
            addCriterion("before_price not in", values, "beforePrice");
            return (Criteria) this;
        }

        public Criteria andBeforePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("before_price between", value1, value2, "beforePrice");
            return (Criteria) this;
        }

        public Criteria andBeforePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("before_price not between", value1, value2, "beforePrice");
            return (Criteria) this;
        }

        public Criteria andAfterPriceIsNull() {
            addCriterion("after_price is null");
            return (Criteria) this;
        }

        public Criteria andAfterPriceIsNotNull() {
            addCriterion("after_price is not null");
            return (Criteria) this;
        }

        public Criteria andAfterPriceEqualTo(BigDecimal value) {
            addCriterion("after_price =", value, "afterPrice");
            return (Criteria) this;
        }

        public Criteria andAfterPriceNotEqualTo(BigDecimal value) {
            addCriterion("after_price <>", value, "afterPrice");
            return (Criteria) this;
        }

        public Criteria andAfterPriceGreaterThan(BigDecimal value) {
            addCriterion("after_price >", value, "afterPrice");
            return (Criteria) this;
        }

        public Criteria andAfterPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("after_price >=", value, "afterPrice");
            return (Criteria) this;
        }

        public Criteria andAfterPriceLessThan(BigDecimal value) {
            addCriterion("after_price <", value, "afterPrice");
            return (Criteria) this;
        }

        public Criteria andAfterPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("after_price <=", value, "afterPrice");
            return (Criteria) this;
        }

        public Criteria andAfterPriceIn(List<BigDecimal> values) {
            addCriterion("after_price in", values, "afterPrice");
            return (Criteria) this;
        }

        public Criteria andAfterPriceNotIn(List<BigDecimal> values) {
            addCriterion("after_price not in", values, "afterPrice");
            return (Criteria) this;
        }

        public Criteria andAfterPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("after_price between", value1, value2, "afterPrice");
            return (Criteria) this;
        }

        public Criteria andAfterPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("after_price not between", value1, value2, "afterPrice");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andLinkTypeIsNull() {
            addCriterion("link_type is null");
            return (Criteria) this;
        }

        public Criteria andLinkTypeIsNotNull() {
            addCriterion("link_type is not null");
            return (Criteria) this;
        }

        public Criteria andLinkTypeEqualTo(Integer value) {
            addCriterion("link_type =", value, "linkType");
            return (Criteria) this;
        }

        public Criteria andLinkTypeNotEqualTo(Integer value) {
            addCriterion("link_type <>", value, "linkType");
            return (Criteria) this;
        }

        public Criteria andLinkTypeGreaterThan(Integer value) {
            addCriterion("link_type >", value, "linkType");
            return (Criteria) this;
        }

        public Criteria andLinkTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("link_type >=", value, "linkType");
            return (Criteria) this;
        }

        public Criteria andLinkTypeLessThan(Integer value) {
            addCriterion("link_type <", value, "linkType");
            return (Criteria) this;
        }

        public Criteria andLinkTypeLessThanOrEqualTo(Integer value) {
            addCriterion("link_type <=", value, "linkType");
            return (Criteria) this;
        }

        public Criteria andLinkTypeIn(List<Integer> values) {
            addCriterion("link_type in", values, "linkType");
            return (Criteria) this;
        }

        public Criteria andLinkTypeNotIn(List<Integer> values) {
            addCriterion("link_type not in", values, "linkType");
            return (Criteria) this;
        }

        public Criteria andLinkTypeBetween(Integer value1, Integer value2) {
            addCriterion("link_type between", value1, value2, "linkType");
            return (Criteria) this;
        }

        public Criteria andLinkTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("link_type not between", value1, value2, "linkType");
            return (Criteria) this;
        }

        public Criteria andUsePlatformIsNull() {
            addCriterion("use_platform is null");
            return (Criteria) this;
        }

        public Criteria andUsePlatformIsNotNull() {
            addCriterion("use_platform is not null");
            return (Criteria) this;
        }

        public Criteria andUsePlatformEqualTo(Integer value) {
            addCriterion("use_platform =", value, "usePlatform");
            return (Criteria) this;
        }

        public Criteria andUsePlatformNotEqualTo(Integer value) {
            addCriterion("use_platform <>", value, "usePlatform");
            return (Criteria) this;
        }

        public Criteria andUsePlatformGreaterThan(Integer value) {
            addCriterion("use_platform >", value, "usePlatform");
            return (Criteria) this;
        }

        public Criteria andUsePlatformGreaterThanOrEqualTo(Integer value) {
            addCriterion("use_platform >=", value, "usePlatform");
            return (Criteria) this;
        }

        public Criteria andUsePlatformLessThan(Integer value) {
            addCriterion("use_platform <", value, "usePlatform");
            return (Criteria) this;
        }

        public Criteria andUsePlatformLessThanOrEqualTo(Integer value) {
            addCriterion("use_platform <=", value, "usePlatform");
            return (Criteria) this;
        }

        public Criteria andUsePlatformIn(List<Integer> values) {
            addCriterion("use_platform in", values, "usePlatform");
            return (Criteria) this;
        }

        public Criteria andUsePlatformNotIn(List<Integer> values) {
            addCriterion("use_platform not in", values, "usePlatform");
            return (Criteria) this;
        }

        public Criteria andUsePlatformBetween(Integer value1, Integer value2) {
            addCriterion("use_platform between", value1, value2, "usePlatform");
            return (Criteria) this;
        }

        public Criteria andUsePlatformNotBetween(Integer value1, Integer value2) {
            addCriterion("use_platform not between", value1, value2, "usePlatform");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}