package com.pino.avalon.model;

import java.util.Date;
import javax.persistence.*;

public class User {
    /**
     * 用户主键
     */
    @Id
    @Column(name = "pk_uid")
    private Integer pkUid;

    /**
     * 用户名
     */
    @Column(name = "uk_username")
    private String ukUsername;

    /**
     * 密码
     */
    private String password;

    /**
     * 用户注册邮箱
     */
    @Column(name = "uk_email")
    private String ukEmail;

    /**
     * 用户自我介绍
     */
    @Column(name = "self_introduction")
    private String selfIntroduction;

    /**
     * 用户头像
     */
    private String header;

    /**
     * 用户关注的标签ID
     */
    @Column(name = "tag_ids")
    private String tagIds;

    /**
     * 创建的时间
     */
    @Column(name = "gmt_create")
    private Date gmtCreate;

    /**
     * 修改的时间
     */
    @Column(name = "gmt_modified")
    private Date gmtModified;

    /**
     * 获取用户主键
     *
     * @return pk_uid - 用户主键
     */
    public Integer getPkUid() {
        return pkUid;
    }

    /**
     * 设置用户主键
     *
     * @param pkUid 用户主键
     */
    public void setPkUid(Integer pkUid) {
        this.pkUid = pkUid;
    }

    /**
     * 获取用户名
     *
     * @return uk_username - 用户名
     */
    public String getUkUsername() {
        return ukUsername;
    }

    /**
     * 设置用户名
     *
     * @param ukUsername 用户名
     */
    public void setUkUsername(String ukUsername) {
        this.ukUsername = ukUsername;
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取用户注册邮箱
     *
     * @return uk_email - 用户注册邮箱
     */
    public String getUkEmail() {
        return ukEmail;
    }

    /**
     * 设置用户注册邮箱
     *
     * @param ukEmail 用户注册邮箱
     */
    public void setUkEmail(String ukEmail) {
        this.ukEmail = ukEmail;
    }

    /**
     * 获取用户自我介绍
     *
     * @return self_introduction - 用户自我介绍
     */
    public String getSelfIntroduction() {
        return selfIntroduction;
    }

    /**
     * 设置用户自我介绍
     *
     * @param selfIntroduction 用户自我介绍
     */
    public void setSelfIntroduction(String selfIntroduction) {
        this.selfIntroduction = selfIntroduction;
    }

    /**
     * 获取用户头像
     *
     * @return header - 用户头像
     */
    public String getHeader() {
        return header;
    }

    /**
     * 设置用户头像
     *
     * @param header 用户头像
     */
    public void setHeader(String header) {
        this.header = header;
    }

    /**
     * 获取用户关注的标签ID
     *
     * @return tag_ids - 用户关注的标签ID
     */
    public String getTagIds() {
        return tagIds;
    }

    /**
     * 设置用户关注的标签ID
     *
     * @param tagIds 用户关注的标签ID
     */
    public void setTagIds(String tagIds) {
        this.tagIds = tagIds;
    }

    /**
     * 获取创建的时间
     *
     * @return gmt_create - 创建的时间
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * 设置创建的时间
     *
     * @param gmtCreate 创建的时间
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * 获取修改的时间
     *
     * @return gmt_modified - 修改的时间
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * 设置修改的时间
     *
     * @param gmtModified 修改的时间
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }
}