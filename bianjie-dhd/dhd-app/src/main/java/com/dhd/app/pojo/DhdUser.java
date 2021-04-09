package com.dhd.app.pojo;

import java.util.Date;

public class DhdUser {
    private String telephone;

    private String username;

    private String password;

    private String inviteCode;

    private Integer level;

    private Integer parentId;

    private String tbRelationId;

    private String tbSpecialId;

    private String tbPositionId;

    private String remark;

    private Integer fromPlatform;

    private Date createTime;

    private Integer modifyId;

    private Date modifyTime;

    private Integer status;

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getInviteCode() {
        return inviteCode;
    }

    public void setInviteCode(String inviteCode) {
        this.inviteCode = inviteCode == null ? null : inviteCode.trim();
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getTbRelationId() {
        return tbRelationId;
    }

    public void setTbRelationId(String tbRelationId) {
        this.tbRelationId = tbRelationId == null ? null : tbRelationId.trim();
    }

    public String getTbSpecialId() {
        return tbSpecialId;
    }

    public void setTbSpecialId(String tbSpecialId) {
        this.tbSpecialId = tbSpecialId == null ? null : tbSpecialId.trim();
    }

    public String getTbPositionId() {
        return tbPositionId;
    }

    public void setTbPositionId(String tbPositionId) {
        this.tbPositionId = tbPositionId == null ? null : tbPositionId.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getFromPlatform() {
        return fromPlatform;
    }

    public void setFromPlatform(Integer fromPlatform) {
        this.fromPlatform = fromPlatform;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getModifyId() {
        return modifyId;
    }

    public void setModifyId(Integer modifyId) {
        this.modifyId = modifyId;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}