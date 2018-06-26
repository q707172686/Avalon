package com.pino.avalon.model;

import java.util.Date;
import javax.persistence.*;

public class Tag {
    /**
     * 标签主键
     */
    @Id
    @Column(name = "pk_tag_id")
    private Integer pkTagId;

    /**
     * 标签名称
     */
    @Column(name = "uk_tag_name")
    private String ukTagName;

    /**
     * 标签图片路径
     */
    @Column(name = "tag_image")
    private String tagImage;

    /**
     * 标签描述
     */
    @Column(name = "tag_descripe")
    private String tagDescripe;

    /**
     * 标签等级（1,2）
     */
    @Column(name = "tag_level")
    private Byte tagLevel;

    /**
     * 标签父级ID
     */
    @Column(name = "parent_id")
    private Byte parentId;

    /**
     * 标签创建时间
     */
    @Column(name = "gmt_create")
    private Date gmtCreate;

    /**
     * 标签修改时间
     */
    @Column(name = "gmt_modified")
    private Date gmtModified;

    /**
     * 获取标签主键
     *
     * @return pk_tag_id - 标签主键
     */
    public Integer getPkTagId() {
        return pkTagId;
    }

    /**
     * 设置标签主键
     *
     * @param pkTagId 标签主键
     */
    public void setPkTagId(Integer pkTagId) {
        this.pkTagId = pkTagId;
    }

    /**
     * 获取标签名称
     *
     * @return uk_tag_name - 标签名称
     */
    public String getUkTagName() {
        return ukTagName;
    }

    /**
     * 设置标签名称
     *
     * @param ukTagName 标签名称
     */
    public void setUkTagName(String ukTagName) {
        this.ukTagName = ukTagName;
    }

    /**
     * 获取标签图片路径
     *
     * @return tag_image - 标签图片路径
     */
    public String getTagImage() {
        return tagImage;
    }

    /**
     * 设置标签图片路径
     *
     * @param tagImage 标签图片路径
     */
    public void setTagImage(String tagImage) {
        this.tagImage = tagImage;
    }

    /**
     * 获取标签描述
     *
     * @return tag_descripe - 标签描述
     */
    public String getTagDescripe() {
        return tagDescripe;
    }

    /**
     * 设置标签描述
     *
     * @param tagDescripe 标签描述
     */
    public void setTagDescripe(String tagDescripe) {
        this.tagDescripe = tagDescripe;
    }

    /**
     * 获取标签等级（1,2）
     *
     * @return tag_level - 标签等级（1,2）
     */
    public Byte getTagLevel() {
        return tagLevel;
    }

    /**
     * 设置标签等级（1,2）
     *
     * @param tagLevel 标签等级（1,2）
     */
    public void setTagLevel(Byte tagLevel) {
        this.tagLevel = tagLevel;
    }

    /**
     * 获取标签父级ID
     *
     * @return parent_id - 标签父级ID
     */
    public Byte getParentId() {
        return parentId;
    }

    /**
     * 设置标签父级ID
     *
     * @param parentId 标签父级ID
     */
    public void setParentId(Byte parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取标签创建时间
     *
     * @return gmt_create - 标签创建时间
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * 设置标签创建时间
     *
     * @param gmtCreate 标签创建时间
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * 获取标签修改时间
     *
     * @return gmt_modified - 标签修改时间
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * 设置标签修改时间
     *
     * @param gmtModified 标签修改时间
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }
}