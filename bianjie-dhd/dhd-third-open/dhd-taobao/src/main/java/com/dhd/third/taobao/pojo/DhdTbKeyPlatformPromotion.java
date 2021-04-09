package com.dhd.third.taobao.pojo;

import java.util.Date;

public class DhdTbKeyPlatformPromotion {
    private Integer sid;

    private String promotionName;

    private String promotionId;

    private String promotionPid;

    private Long parentPlatformId;

    private Integer status;

    private Date createTime;

    private Integer creatorId;

    private Date modifyTime;

    private Integer modifyId;

    private String remark;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getPromotionName() {
        return promotionName;
    }

    public void setPromotionName(String promotionName) {
        this.promotionName = promotionName == null ? null : promotionName.trim();
    }

    public String getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(String promotionId) {
        this.promotionId = promotionId == null ? null : promotionId.trim();
    }

    public String getPromotionPid() {
        return promotionPid;
    }

    public void setPromotionPid(String promotionPid) {
        this.promotionPid = promotionPid == null ? null : promotionPid.trim();
    }

    public Long getParentPlatformId() {
        return parentPlatformId;
    }

    public void setParentPlatformId(Long parentPlatformId) {
        this.parentPlatformId = parentPlatformId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Integer creatorId) {
        this.creatorId = creatorId;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Integer getModifyId() {
        return modifyId;
    }

    public void setModifyId(Integer modifyId) {
        this.modifyId = modifyId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}