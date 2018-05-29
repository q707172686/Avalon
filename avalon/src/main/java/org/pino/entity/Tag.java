package org.pino.entity;

import java.util.Date;
/**
 * @Author: Pino
 * @Description: 标签实体类
 * @Date: 下午2:40 18-5-29
 * @Modified:
 */
public class Tag {
    /**
     * 主键ID
     */
    private Integer pkTagId;

    /**
     * 标签名称，唯一约束
     */
    private String ukTagName;

    /**
     * 标签的图片路径
     */
    private String tagImage;

    /**
     * 标签的描述
     */
    private String tagDescripe;

    /**
     * 标签创建的时间
     */
    private Date gmtCreate;

    /**
     * 标签最近修改的时间
     */
    private Date gmtModified;

    public Integer getPkTagId() {
        return pkTagId;
    }

    public void setPkTagId(Integer pkTagId) {
        this.pkTagId = pkTagId;
    }

    public String getUkTagName() {
        return ukTagName;
    }

    public void setUkTagName(String ukTagName) {
        this.ukTagName = ukTagName == null ? null : ukTagName.trim();
    }

    public String getTagImage() {
        return tagImage;
    }

    public void setTagImage(String tagImage) {
        this.tagImage = tagImage == null ? null : tagImage.trim();
    }

    public String getTagDescripe() {
        return tagDescripe;
    }

    public void setTagDescripe(String tagDescripe) {
        this.tagDescripe = tagDescripe == null ? null : tagDescripe.trim();
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
     * @return 返回一个包含实体类内容的字符串
     */
    @Override
    public String toString() {
        return "Tag{" +
                "pkTagId=" + pkTagId +
                ", ukTagName='" + ukTagName + '\'' +
                ", tagImage='" + tagImage + '\'' +
                ", tagDescripe='" + tagDescripe + '\'' +
                ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified +
                '}';
    }
}