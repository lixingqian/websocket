package com.websocket.cn.bean;

/**
 * 贵州神玥数字科技有限公司 版权所有 © Copyright 2019<br>
 *
 * @author : lixingqian
 * @Description : <br>
 * @date : Created in 2019-6-25 20:36 <br>
 */
public class CodeQueryModel {
    private String tableName;
    private String zxjgbm;
    private String ywlsh;
    private String userId;
    private String userName;
    private String xzqhbm;
    private String ywbm;
    private String blqd;

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getZxjgbm() {
        return zxjgbm;
    }

    public void setZxjgbm(String zxjgbm) {
        this.zxjgbm = zxjgbm;
    }

    public String getYwlsh() {
        return ywlsh;
    }

    public void setYwlsh(String ywlsh) {
        this.ywlsh = ywlsh;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getXzqhbm() {
        return xzqhbm;
    }

    public void setXzqhbm(String xzqhbm) {
        this.xzqhbm = xzqhbm;
    }

    public String getYwbm() {
        return ywbm;
    }

    public void setYwbm(String ywbm) {
        this.ywbm = ywbm;
    }

    public String getBlqd() {
        return blqd;
    }

    public void setBlqd(String blqd) {
        this.blqd = blqd;
    }

    @Override
    public String toString() {
        return "CodeQueryModel{" +
                "tableName='" + tableName + '\'' +
                ", zxjgbm='" + zxjgbm + '\'' +
                ", ywlsh='" + ywlsh + '\'' +
                ", userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", xzqhbm='" + xzqhbm + '\'' +
                ", ywbm='" + ywbm + '\'' +
                ", blqd='" + blqd + '\'' +
                '}';
    }
}
