package org.pino.entity;

import java.sql.Date;

/**
 * @Author: Pino
 * @Description: 用户实体类
 * @Date: 下午2:40 18-5-29
 * @Modified:
 */
public class User {
    /**
     * 用户主键ID
     */
    private Integer pkUid;

    /**
     * 用户名，唯一约束
     */
    private String ukUsername;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 用户邮箱
     */
    private String ukEmail;

    /**
     * 用户自我介绍
     */
    private String selfIntroduction;

    /**
     * 用户头像路径
     */
    private String header;

    /**
     * 用户选择的所有标签，以一个String来存储
     */
    private String tagIds;

    /**
     * 创建用户的时间
     */
    private Date gmtCreate;

    /**
     * 最近一次修改用户的时间
     */
    private Date gmtModified;

    public Integer getPkUid() {
        return pkUid;
    }

    public void setPkUid(Integer pkUid) {
        this.pkUid = pkUid;
    }

    public String getUkUsername() {
        return ukUsername;
    }

    public void setUkUsername(String ukUsername) {
        this.ukUsername = ukUsername == null ? null : ukUsername.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getUkEmail() {
        return ukEmail;
    }

    public void setUkEmail(String ukEmail) {
        this.ukEmail = ukEmail == null ? null : ukEmail.trim();
    }

    public String getSelfIntroduction() {
        return selfIntroduction;
    }

    public void setSelfIntroduction(String selfIntroduction) {
        this.selfIntroduction = selfIntroduction == null ? null : selfIntroduction.trim();
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header == null ? null : header.trim();
    }

    public String getTagIds() {
        return tagIds;
    }

    public void setTagIds(String tagIds) {
        this.tagIds = tagIds == null ? null : tagIds.trim();
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * 重写toString()方法，方便测试
     * @return 一个包含实体类内容的字符串
     */
    @Override
    public String toString() {
        return "User{" +
                "pkUid=" + pkUid +
                ", ukUsername='" + ukUsername + '\'' +
                ", password='" + password + '\'' +
                ", ukEmail='" + ukEmail + '\'' +
                ", selfIntroduction='" + selfIntroduction + '\'' +
                ", header='" + header + '\'' +
                ", tagIds='" + tagIds + '\'' +
                ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified +
                '}';
    }
}