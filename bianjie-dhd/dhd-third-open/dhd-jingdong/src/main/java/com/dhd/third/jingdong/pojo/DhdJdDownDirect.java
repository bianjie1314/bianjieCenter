package com.dhd.third.jingdong.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class DhdJdDownDirect {
    private Integer sid;

    private String name;

    private String indexPicUrl;

    private String detailUrl;

    private String couponUrl;

    private String spreadUrl;

    private BigDecimal beforePrice;

    private BigDecimal afterPrice;

    private Date createTime;

    private Date startTime;

    private Date endTime;

    private Integer linkType;

    private Integer usePlatform;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getIndexPicUrl() {
        return indexPicUrl;
    }

    public void setIndexPicUrl(String indexPicUrl) {
        this.indexPicUrl = indexPicUrl == null ? null : indexPicUrl.trim();
    }

    public String getDetailUrl() {
        return detailUrl;
    }

    public void setDetailUrl(String detailUrl) {
        this.detailUrl = detailUrl == null ? null : detailUrl.trim();
    }

    public String getCouponUrl() {
        return couponUrl;
    }

    public void setCouponUrl(String couponUrl) {
        this.couponUrl = couponUrl == null ? null : couponUrl.trim();
    }

    public String getSpreadUrl() {
        return spreadUrl;
    }

    public void setSpreadUrl(String spreadUrl) {
        this.spreadUrl = spreadUrl == null ? null : spreadUrl.trim();
    }

    public BigDecimal getBeforePrice() {
        return beforePrice;
    }

    public void setBeforePrice(BigDecimal beforePrice) {
        this.beforePrice = beforePrice;
    }

    public BigDecimal getAfterPrice() {
        return afterPrice;
    }

    public void setAfterPrice(BigDecimal afterPrice) {
        this.afterPrice = afterPrice;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getLinkType() {
        return linkType;
    }

    public void setLinkType(Integer linkType) {
        this.linkType = linkType;
    }

    public Integer getUsePlatform() {
        return usePlatform;
    }

    public void setUsePlatform(Integer usePlatform) {
        this.usePlatform = usePlatform;
    }
}