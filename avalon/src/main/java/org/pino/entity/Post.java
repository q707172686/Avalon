package org.pino.entity;

import java.util.Date;
/**
 * @Author: Pino
 * @Description: 帖子实体类
 * @Date: 下午2:40 18-5-29
 * @Modified:
 */
public class Post {
    /**
     * 帖子的主键ID
     */
    private Integer pkPid;

    /**
     * 创建帖子的用户ID
     */
    private Integer uId;

    /**
     * 帖子的标题
     */
    private String title;

    /**
     * 帖子的内容
     */
    private String content;

    /**
     * 赞的次数
     */
    private Integer praiseTime;

    /**
     * 收藏的次数
     */
    private Integer collectionTime;

    /**
     * 帖子的创建时间
     */
    private Date gmtCreate;

    /**
     * 帖子最近的修改时间
     */
    private Date gmtModified;

    public Integer getPkPid() {
        return pkPid;
    }

    public void setPkPid(Integer pkPid) {
        this.pkPid = pkPid;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getPraiseTime() {
        return praiseTime;
    }

    public void setPraiseTime(Integer praiseTime) {
        this.praiseTime = praiseTime;
    }

    public Integer getCollectionTime() {
        return collectionTime;
    }

    public void setCollectionTime(Integer collectionTime) {
        this.collectionTime = collectionTime;
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
     * 重写toString()方法
     * @return 包含实体类内容的字符串
     */
    @Override
    public String toString() {
        return "Post{" +
                "pkPid=" + pkPid +
                ", uId=" + uId +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", praiseTime=" + praiseTime +
                ", collectionTime=" + collectionTime +
                ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified +
                '}';
    }
}