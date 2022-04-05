package com.ruoyi.novel.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 新闻对象 news
 * 
 * @author ruoyi
 * @date 2022-04-04
 */
public class News extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 类别ID */
    @Excel(name = "类别ID")
    private Long catId;

    /** 分类名 */
    @Excel(name = "分类名")
    private String catName;

    /** 来源 */
    @Excel(name = "来源")
    private String sourceName;

    /** 标题 */
    @Excel(name = "标题")
    private String title;

    /** 内容 */
    @Excel(name = "内容")
    private String content;

    /** 发布人ID */
    @Excel(name = "发布人ID")
    private Long createUserId;

    /** 更新人ID */
    @Excel(name = "更新人ID")
    private Long updateUserId;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setCatId(Long catId) 
    {
        this.catId = catId;
    }

    public Long getCatId() 
    {
        return catId;
    }
    public void setCatName(String catName) 
    {
        this.catName = catName;
    }

    public String getCatName() 
    {
        return catName;
    }
    public void setSourceName(String sourceName) 
    {
        this.sourceName = sourceName;
    }

    public String getSourceName() 
    {
        return sourceName;
    }
    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getTitle() 
    {
        return title;
    }
    public void setContent(String content) 
    {
        this.content = content;
    }

    public String getContent() 
    {
        return content;
    }
    public void setCreateUserId(Long createUserId) 
    {
        this.createUserId = createUserId;
    }

    public Long getCreateUserId() 
    {
        return createUserId;
    }
    public void setUpdateUserId(Long updateUserId) 
    {
        this.updateUserId = updateUserId;
    }

    public Long getUpdateUserId() 
    {
        return updateUserId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("catId", getCatId())
            .append("catName", getCatName())
            .append("sourceName", getSourceName())
            .append("title", getTitle())
            .append("content", getContent())
            .append("createTime", getCreateTime())
            .append("createUserId", getCreateUserId())
            .append("updateTime", getUpdateTime())
            .append("updateUserId", getUpdateUserId())
            .toString();
    }
}
