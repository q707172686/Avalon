package com.pino.avalon.model;

import java.util.Date;
import javax.persistence.*;

public class Post {
    /**
     * 主键
     */
    @Id
    @Column(name = "pk_pid")
    private Integer pkPid;

    /**
     * 关联用户ID
     */
    @Column(name = "u_id")
    private Integer uId;

    /**
     * 标题
     */
    private String title;

    /**
     * 内容
     */
    private String content;

    /**
     * 赞的次数
     */
    @Column(name = "praise_time")
    private Integer praiseTime;

    /**
     * 收藏次数
     */
    @Column(name = "collection_time")
    private Integer collectionTime;

    /**
     * 创建的时间
     */
    @Column(name = "gmt_create")
    private Date gmtCreate;

    /**
     * 修改时间
     */
    @Column(name = "gmt_modified")
    private Date gmtModified;

    /**
     * 获取主键
     *
     * @return pk_pid - 主键
     */
    public Integer getPkPid() {
        return pkPid;
    }

    /**
     * 设置主键
     *
     * @param pkPid 主键
     */
    public void setPkPid(Integer pkPid) {
        this.pkPid = pkPid;
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
     * 获取标题
     *
     * @return title - 标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置标题
     *
     * @param title 标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取内容
     *
     * @return content - 内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置内容
     *
     * @param content 内容
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 获取赞的次数
     *
     * @return praise_time - 赞的次数
     */
    public Integer getPraiseTime() {
        return praiseTime;
    }

    /**
     * 设置赞的次数
     *
     * @param praiseTime 赞的次数
     */
    public void setPraiseTime(Integer praiseTime) {
        this.praiseTime = praiseTime;
    }

    /**
     * 获取收藏次数
     *
     * @return collection_time - 收藏次数
     */
    public Integer getCollectionTime() {
        return collectionTime;
    }

    /**
     * 设置收藏次数
     *
     * @param collectionTime 收藏次数
     */
    public void setCollectionTime(Integer collectionTime) {
        this.collectionTime = collectionTime;
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
     * 获取修改时间
     *
     * @return gmt_modified - 修改时间
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * 设置修改时间
     *
     * @param gmtModified 修改时间
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }
}