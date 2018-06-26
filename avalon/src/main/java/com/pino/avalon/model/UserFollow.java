package com.pino.avalon.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "user_follow")
public class UserFollow {
    /**
     * 主键
     */
    @Id
    @Column(name = "uf_id")
    private Integer ufId;

    /**
     * 关联用户ID
     */
    @Column(name = "u_id")
    private Integer uId;

    /**
     * 关联关注的人的ID
     */
    @Column(name = "follow_id")
    private Integer followId;

    /**
     * 创建时间
     */
    @Column(name = "gmt_create")
    private Date gmtCreate;

    /**
     * 修改时间
     */
    @Column(name = "gmt_modified")
    private String gmtModified;

    /**
     * 获取主键
     *
     * @return uf_id - 主键
     */
    public Integer getUfId() {
        return ufId;
    }

    /**
     * 设置主键
     *
     * @param ufId 主键
     */
    public void setUfId(Integer ufId) {
        this.ufId = ufId;
    }

    /**
     * 获取关联用户ID
     *
     * @return u_id - 关联用户ID
     */
    public Integer getuId() {
        return uId;
    }

    /**
     * 设置关联用户ID
     *
     * @param uId 关联用户ID
     */
    public void setuId(Integer uId) {
        this.uId = uId;
    }

    /**
     * 获取关联关注的人的ID
     *
     * @return follow_id - 关联关注的人的ID
     */
    public Integer getFollowId() {
        return followId;
    }

    /**
     * 设置关联关注的人的ID
     *
     * @param followId 关联关注的人的ID
     */
    public void setFollowId(Integer followId) {
        this.followId = followId;
    }

    /**
     * 获取创建时间
     *
     * @return gmt_create - 创建时间
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * 设置创建时间
     *
     * @param gmtCreate 创建时间
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * 获取修改时间
     *
     * @return gmt_modified - 修改时间
     */
    public String getGmtModified() {
        return gmtModified;
    }

    /**
     * 设置修改时间
     *
     * @param gmtModified 修改时间
     */
    public void setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
    }
}