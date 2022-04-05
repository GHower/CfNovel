package com.ruoyi.novel.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 爬虫源对象 crawl_source
 * 
 * @author ruoyi
 * @date 2022-04-04
 */
public class CrawlSource extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 源站名 */
    @Excel(name = "源站名")
    private String sourceName;

    /** 爬取规则（json串） */
    @Excel(name = "爬取规则", readConverterExp = "j=son串")
    private String crawlRule;

    /** 爬虫源状态，0：关闭，1：开启 */
    @Excel(name = "爬虫源状态，0：关闭，1：开启")
    private Integer sourceStatus;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setSourceName(String sourceName) 
    {
        this.sourceName = sourceName;
    }

    public String getSourceName() 
    {
        return sourceName;
    }
    public void setCrawlRule(String crawlRule) 
    {
        this.crawlRule = crawlRule;
    }

    public String getCrawlRule() 
    {
        return crawlRule;
    }
    public void setSourceStatus(Integer sourceStatus) 
    {
        this.sourceStatus = sourceStatus;
    }

    public Integer getSourceStatus() 
    {
        return sourceStatus;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("sourceName", getSourceName())
            .append("crawlRule", getCrawlRule())
            .append("sourceStatus", getSourceStatus())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
