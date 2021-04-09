package com.bianjie.orm.pojo;

import java.util.Date;

public class PhonePackage {
    private Integer id;

    private String mvno;

    private Integer mno;

    private String code;

    private String name;

    private Byte category;

    private Boolean optional;

    private Integer lowFee;

    private Integer money;

    private String extCode;

    private String extName;

    private Integer extLowFee;

    private Integer extMoney;

    private Integer status;

    private Byte type;

    private Byte nbrType;

    private Byte servType;

    private String parentCode;

    private Byte parentServType;

    private String serviceDesc;

    private Boolean defaultFlag;

    private String tag;

    private Integer creatorId;

    private Date createTime;

    private Integer modifierId;

    private Date modifyTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMvno() {
        return mvno;
    }

    public void setMvno(String mvno) {
        this.mvno = mvno == null ? null : mvno.trim();
    }

    public Integer getMno() {
        return mno;
    }

    public void setMno(Integer mno) {
        this.mno = mno;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Byte getCategory() {
        return category;
    }

    public void setCategory(Byte category) {
        this.category = category;
    }

    public Boolean getOptional() {
        return optional;
    }

    public void setOptional(Boolean optional) {
        this.optional = optional;
    }

    public Integer getLowFee() {
        return lowFee;
    }

    public void setLowFee(Integer lowFee) {
        this.lowFee = lowFee;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public String getExtCode() {
        return extCode;
    }

    public void setExtCode(String extCode) {
        this.extCode = extCode == null ? null : extCode.trim();
    }

    public String getExtName() {
        return extName;
    }

    public void setExtName(String extName) {
        this.extName = extName == null ? null : extName.trim();
    }

    public Integer getExtLowFee() {
        return extLowFee;
    }

    public void setExtLowFee(Integer extLowFee) {
        this.extLowFee = extLowFee;
    }

    public Integer getExtMoney() {
        return extMoney;
    }

    public void setExtMoney(Integer extMoney) {
        this.extMoney = extMoney;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Byte getNbrType() {
        return nbrType;
    }

    public void setNbrType(Byte nbrType) {
        this.nbrType = nbrType;
    }

    public Byte getServType() {
        return servType;
    }

    public void setServType(Byte servType) {
        this.servType = servType;
    }

    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode == null ? null : parentCode.trim();
    }

    public Byte getParentServType() {
        return parentServType;
    }

    public void setParentServType(Byte parentServType) {
        this.parentServType = parentServType;
    }

    public String getServiceDesc() {
        return serviceDesc;
    }

    public void setServiceDesc(String serviceDesc) {
        this.serviceDesc = serviceDesc == null ? null : serviceDesc.trim();
    }

    public Boolean getDefaultFlag() {
        return defaultFlag;
    }

    public void setDefaultFlag(Boolean defaultFlag) {
        this.defaultFlag = defaultFlag;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag == null ? null : tag.trim();
    }

    public Integer getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Integer creatorId) {
        this.creatorId = creatorId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getModifierId() {
        return modifierId;
    }

    public void setModifierId(Integer modifierId) {
        this.modifierId = modifierId;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}