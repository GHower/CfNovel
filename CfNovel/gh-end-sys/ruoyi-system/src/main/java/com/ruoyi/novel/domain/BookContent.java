package com.ruoyi.novel.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 小说内容对象 book_content
 * 
 * @author ruoyi
 * @date 2022-04-04
 */
public class BookContent extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 目录ID */
    @Excel(name = "目录ID")
    private Long indexId;

    /** 小说章节内容 */
    @Excel(name = "小说章节内容")
    private String content;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setIndexId(Long indexId) 
    {
        this.indexId = indexId;
    }

    public Long getIndexId() 
    {
        return indexId;
    }
    public void setContent(String content) 
    {
        this.content = content;
    }

    public String getContent() 
    {
        return content;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("indexId", getIndexId())
            .append("content", getContent())
            .toString();
    }
}
