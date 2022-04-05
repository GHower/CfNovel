package com.ruoyi.novel.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 批量抓取任务对象 crawl_batch_task
 * 
 * @author ruoyi
 * @date 2022-04-04
 */
public class CrawlBatchTask extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 爬虫源ID */
    @Excel(name = "爬虫源ID")
    private Long sourceId;

    /** 成功抓取数量 */
    @Excel(name = "成功抓取数量")
    private Long crawlCountSuccess;

    /** 目标抓取数量 */
    @Excel(name = "目标抓取数量")
    private Long crawlCountTarget;

    /** 任务状态，1：正在运行，0已停止 */
    @Excel(name = "任务状态，1：正在运行，0已停止")
    private Integer taskStatus;

    /** 任务开始时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "任务开始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date startTime;

    /** 任务结束时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "任务结束时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date endTime;

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
    public void setCrawlCountSuccess(Long crawlCountSuccess) 
    {
        this.crawlCountSuccess = crawlCountSuccess;
    }

    public Long getCrawlCountSuccess() 
    {
        return crawlCountSuccess;
    }
    public void setCrawlCountTarget(Long crawlCountTarget) 
    {
        this.crawlCountTarget = crawlCountTarget;
    }

    public Long getCrawlCountTarget() 
    {
        return crawlCountTarget;
    }
    public void setTaskStatus(Integer taskStatus) 
    {
        this.taskStatus = taskStatus;
    }

    public Integer getTaskStatus() 
    {
        return taskStatus;
    }
    public void setStartTime(Date startTime) 
    {
        this.startTime = startTime;
    }

    public Date getStartTime() 
    {
        return startTime;
    }
    public void setEndTime(Date endTime) 
    {
        this.endTime = endTime;
    }

    public Date getEndTime() 
    {
        return endTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("sourceId", getSourceId())
            .append("crawlCountSuccess", getCrawlCountSuccess())
            .append("crawlCountTarget", getCrawlCountTarget())
            .append("taskStatus", getTaskStatus())
            .append("startTime", getStartTime())
            .append("endTime", getEndTime())
            .toString();
    }
}
