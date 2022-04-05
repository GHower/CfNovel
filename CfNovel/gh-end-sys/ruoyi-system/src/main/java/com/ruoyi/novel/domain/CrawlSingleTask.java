package com.ruoyi.novel.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 抓取单本小说任务对象 crawl_single_task
 * 
 * @author ruoyi
 * @date 2022-04-04
 */
public class CrawlSingleTask extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 爬虫源ID */
    @Excel(name = "爬虫源ID")
    private Long sourceId;

    /** 源站小说ID */
    @Excel(name = "源站小说ID")
    private String sourceBookId;

    /** 任务状态，0：失败，1：成功，2；未执行 */
    @Excel(name = "任务状态，0：失败，1：成功，2；未执行")
    private Integer taskStatus;

    /** 已经执行次数，最多执行5次 */
    @Excel(name = "已经执行次数，最多执行5次")
    private Integer excCount;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setSourceId(Long sourceId) 
    {
        this.sourceId = sourceId;
    }

    public Long getSourceId() 
    {
        return sourceId;
    }
    public void setSourceBookId(String sourceBookId) 
    {
        this.sourceBookId = sourceBookId;
    }

    public String getSourceBookId() 
    {
        return sourceBookId;
    }
    public void setTaskStatus(Integer taskStatus) 
    {
        this.taskStatus = taskStatus;
    }

    public Integer getTaskStatus() 
    {
        return taskStatus;
    }
    public void setExcCount(Integer excCount) 
    {
        this.excCount = excCount;
    }

    public Integer getExcCount() 
    {
        return excCount;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("sourceId", getSourceId())
            .append("sourceBookId", getSourceBookId())
            .append("taskStatus", getTaskStatus())
            .append("excCount", getExcCount())
            .append("createTime", getCreateTime())
            .toString();
    }
}
