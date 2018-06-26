package com.pino.avalon.model;

import java.util.Date;
import javax.persistence.*;

public class Comment {
    /**
     * 评论主键
     */
    @Id
    @Column(name = "pk_comment_id")
    private Integer pkCommentId;

    /**
     * 评论内容
     */
    @Column(name = "comment_content")
    private String commentContent;

    /**
     * 评论等级，1，2,3
     */
    @Column(name = "comment_level")
    private Byte commentLevel;

    /**
     * 关联用户ID
     */
    @Column(name = "u_id")
    private Integer uId;

    /**
     * 关联帖子ID
     */
    @Column(name = "post_id")
    private Integer postId;

    /**
     * 评论的父级ID
     */
    @Column(name = "parent_id")
    private Integer parentId;

    /**
     * 评论创建的时间
     */
    @Column(name = "gmt_create")
    private Date gmtCreate;

    /**
     * 评论修改的时间
     */
    @Column(name = "gmt_modified")
    private Date gmtModified;

    /**
     * 获取评论主键
     *
     * @return pk_comment_id - 评论主键
     */
    public Integer getPkCommentId() {
        return pkCommentId;
    }

    /**
     * 设置评论主键
     *
     * @param pkCommentId 评论主键
     */
    public void setPkCommentId(Integer pkCommentId) {
        this.pkCommentId = pkCommentId;
    }

    /**
     * 获取评论内容
     *
     * @return comment_content - 评论内容
     */
    public String getCommentContent() {
        return commentContent;
    }

    /**
     * 设置评论内容
     *
     * @param commentContent 评论内容
     */
    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    /**
     * 获取评论等级，1，2,3
     *
     * @return comment_level - 评论等级，1，2,3
     */
    public Byte getCommentLevel() {
        return commentLevel;
    }

    /**
     * 设置评论等级，1，2,3
     *
     * @param commentLevel 评论等级，1，2,3
     */
    public void setCommentLevel(Byte commentLevel) {
        this.commentLevel = commentLevel;
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
     * 获取关联帖子ID
     *
     * @return post_id - 关联帖子ID
     */
    public Integer getPostId() {
        return postId;
    }

    /**
     * 设置关联帖子ID
     *
     * @param postId 关联帖子ID
     */
    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    /**
     * 获取评论的父级ID
     *
     * @return parent_id - 评论的父级ID
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * 设置评论的父级ID
     *
     * @param parentId 评论的父级ID
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取评论创建的时间
     *
     * @return gmt_create - 评论创建的时间
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * 设置评论创建的时间
     *
     * @param gmtCreate 评论创建的时间
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * 获取评论修改的时间
     *
     * @return gmt_modified - 评论修改的时间
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * 设置评论修改的时间
     *
     * @param gmtModified 评论修改的时间
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }
}