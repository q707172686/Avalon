package org.pino.entity;

import java.sql.Date;
/**
 * @Author: Pino
 * @Description: 标签、帖子关系表
 * @Date: 下午2:40 18-5-29
 * @Modified:
 */
public class TagPostRel {
    /**
     * 主键ID
     */
    private Integer tpId;

    /**
     * 关联的标签ID
     */
    private Integer tagId;

    /**
     * 帖子ID
     */
    private Integer postId;

    /**
     * 创建的时间
     */
    private Date gmtCreate;

    /**
     * 最近一次修改的时间
     */
    private Date gmtModified;

    public Integer getTpId() {
        return tpId;
    }

    public void setTpId(Integer tpId) {
        this.tpId = tpId;
    }

    public Integer getTagId() {
        return tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
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
        return "TagPostRel{" +
                "tpId=" + tpId +
                ", tagId=" + tagId +
                ", postId=" + postId +
                ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified +
                '}';
    }
}