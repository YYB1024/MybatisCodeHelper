package com.domain;

/**
 * 账号关联
 */
public class UserAccountRelate {
    /**
     * 主键
     */
    private Long id;

    /**
     * 用户id-app学号
     */
    private Long userid;

    /**
     * 绑定号码-unionid
     */
    private String bindNo;

    /**
     * 绑定号码crc码
     */
    private Long bindNoCrc;

    /**
     * 关联的wx学号
     */
    private Long bindUserId;

    /**
     * 服务号openid
     */
    private String openid;

    /**
     * 绑定号码crc码
     */
    private Long openidCrc;

    /**
     * 0：未关注，1 已关注
     */
    private Boolean subscribe;

    /**
     * 0:新建,1:更新,2:D(删除),3:R(彻底删除)
     */
    private Boolean status;

    /**
     * 创建时间
     */
    private Long createTime;

    /**
     * 更新时间
     */
    private Long updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public String getBindNo() {
        return bindNo;
    }

    public void setBindNo(String bindNo) {
        this.bindNo = bindNo;
    }

    public Long getBindNoCrc() {
        return bindNoCrc;
    }

    public void setBindNoCrc(Long bindNoCrc) {
        this.bindNoCrc = bindNoCrc;
    }

    public Long getBindUserId() {
        return bindUserId;
    }

    public void setBindUserId(Long bindUserId) {
        this.bindUserId = bindUserId;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public Long getOpenidCrc() {
        return openidCrc;
    }

    public void setOpenidCrc(Long openidCrc) {
        this.openidCrc = openidCrc;
    }

    public Boolean getSubscribe() {
        return subscribe;
    }

    public void setSubscribe(Boolean subscribe) {
        this.subscribe = subscribe;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }
}