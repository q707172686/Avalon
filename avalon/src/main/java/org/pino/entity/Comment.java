package org.pino.entity;

import java.util.Date;

/**
 * @Author: Pino
 * @Description: 评论实体类
 * @Date: 下午2:40 18-5-29
 * @Modified:
 */
public class Comment {
    /**
     * 评论的主键ID
     */
    private Integer pkCommentId;

    /**
     * 评论内容
     */
    private String commentContent;

    /**
     * 评论等级
     */
    private Byte commentLevel;

    /**
     * 发评论的用户ID
     */
    private Integer uId;

    /**
     * 评论的帖子ID
     */
    private Integer postId;

    /**
     * 评论的父级ID
     */
    private Integer parentId;

    /**
     * 评论创建的时间
     */
    private Date gmtCreate;

    /**
     * 评论的修改时间
     */
    private Date gmtModified;

    public Integer getPkCommentId() {
        return pkCommentId;
    }

    public void setPkCommentId(Integer pkCommentId) {
        this.pkCommentId = pkCommentId;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent == null ? null : commentContent.trim();
    }

    public Byte getCommentLevel() {
        return commentLevel;
    }

    public void setCommentLevel(Byte commentLevel) {
        this.commentLevel = commentLevel;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
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
     * 重写toString()，方便测试
     * @return 一个包含entity实例内容的字符串
     */
    @Override
    public String toString() {
        return "Comment{" +
                "pkCommentId=" + pkCommentId +
                ", commentContent='" + commentContent + '\'' +
                ", commentLevel=" + commentLevel +
                ", uId=" + uId +
                ", postId=" + postId +
                ", parentId=" + parentId +
                ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified +
                '}';
    }
}