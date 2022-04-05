package com.ruoyi.novel.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 小说对象 book
 * 
 * @author ruoyi
 * @date 2022-04-04
 */
public class Book extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 作品方向，0：男频，1：女频' */
    @Excel(name = "作品方向，0：男频，1：女频'")
    private Integer workDirection;

    /** 分类ID */
    @Excel(name = "分类ID")
    private Long catId;

    /** 分类名 */
    @Excel(name = "分类名")
    private String catName;

    /** 小说封面 */
    @Excel(name = "小说封面")
    private String picUrl;

    /** 小说名 */
    @Excel(name = "小说名")
    private String bookName;

    /** 作者id */
    @Excel(name = "作者id")
    private Long authorId;

    /** 作者名 */
    @Excel(name = "作者名")
    private String authorName;

    /** 书籍描述 */
    @Excel(name = "书籍描述")
    private String bookDesc;

    /** 评分，预留字段 */
    @Excel(name = "评分，预留字段")
    private Long score;

    /** 书籍状态，0：连载中，1：已完结 */
    @Excel(name = "书籍状态，0：连载中，1：已完结")
    private Integer bookStatus;

    /** 点击量 */
    @Excel(name = "点击量")
    private Long visitCount;

    /** 总字数 */
    @Excel(name = "总字数")
    private Long wordCount;

    /** 评论数 */
    @Excel(name = "评论数")
    private Long commentCount;

    /** 最新目录ID */
    @Excel(name = "最新目录ID")
    private Long lastIndexId;

    /** 最新目录名 */
    @Excel(name = "最新目录名")
    private String lastIndexName;

    /** 最新目录更新时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "最新目录更新时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date lastIndexUpdateTime;

    /** 是否收费，1：收费，0：免费 */
    @Excel(name = "是否收费，1：收费，0：免费")
    private Integer isVip;

    /** 状态，0：入库，1：上架 */
    @Excel(name = "状态，0：入库，1：上架")
    private Integer status;

    /** 爬虫源站ID */
    @Excel(name = "爬虫源站ID")
    private Long crawlSourceId;

    /** 抓取的源站小说ID */
    @Excel(name = "抓取的源站小说ID")
    private String crawlBookId;

    /** 最后一次的抓取时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "最后一次的抓取时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date crawlLastTime;

    /** 是否已停止更新，0：未停止，1：已停止 */
    @Excel(name = "是否已停止更新，0：未停止，1：已停止")
    private Integer crawlIsStop;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setWorkDirection(Integer workDirection) 
    {
        this.workDirection = workDirection;
    }

    public Integer getWorkDirection() 
    {
        return workDirection;
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
    public void setPicUrl(String picUrl) 
    {
        this.picUrl = picUrl;
    }

    public String getPicUrl() 
    {
        return picUrl;
    }
    public void setBookName(String bookName) 
    {
        this.bookName = bookName;
    }

    public String getBookName() 
    {
        return bookName;
    }
    public void setAuthorId(Long authorId) 
    {
        this.authorId = authorId;
    }

    public Long getAuthorId() 
    {
        return authorId;
    }
    public void setAuthorName(String authorName) 
    {
        this.authorName = authorName;
    }

    public String getAuthorName() 
    {
        return authorName;
    }
    public void setBookDesc(String bookDesc) 
    {
        this.bookDesc = bookDesc;
    }

    public String getBookDesc() 
    {
        return bookDesc;
    }
    public void setScore(Long score) 
    {
        this.score = score;
    }

    public Long getScore() 
    {
        return score;
    }
    public void setBookStatus(Integer bookStatus) 
    {
        this.bookStatus = bookStatus;
    }

    public Integer getBookStatus() 
    {
        return bookStatus;
    }
    public void setVisitCount(Long visitCount) 
    {
        this.visitCount = visitCount;
    }

    public Long getVisitCount() 
    {
        return visitCount;
    }
    public void setWordCount(Long wordCount) 
    {
        this.wordCount = wordCount;
    }

    public Long getWordCount() 
    {
        return wordCount;
    }
    public void setCommentCount(Long commentCount) 
    {
        this.commentCount = commentCount;
    }

    public Long getCommentCount() 
    {
        return commentCount;
    }
    public void setLastIndexId(Long lastIndexId) 
    {
        this.lastIndexId = lastIndexId;
    }

    public Long getLastIndexId() 
    {
        return lastIndexId;
    }
    public void setLastIndexName(String lastIndexName) 
    {
        this.lastIndexName = lastIndexName;
    }

    public String getLastIndexName() 
    {
        return lastIndexName;
    }
    public void setLastIndexUpdateTime(Date lastIndexUpdateTime) 
    {
        this.lastIndexUpdateTime = lastIndexUpdateTime;
    }

    public Date getLastIndexUpdateTime() 
    {
        return lastIndexUpdateTime;
    }
    public void setIsVip(Integer isVip) 
    {
        this.isVip = isVip;
    }

    public Integer getIsVip() 
    {
        return isVip;
    }
    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
    }
    public void setCrawlSourceId(Long crawlSourceId) 
    {
        this.crawlSourceId = crawlSourceId;
    }

    public Long getCrawlSourceId() 
    {
        return crawlSourceId;
    }
    public void setCrawlBookId(String crawlBookId) 
    {
        this.crawlBookId = crawlBookId;
    }

    public String getCrawlBookId() 
    {
        return crawlBookId;
    }
    public void setCrawlLastTime(Date crawlLastTime) 
    {
        this.crawlLastTime = crawlLastTime;
    }

    public Date getCrawlLastTime() 
    {
        return crawlLastTime;
    }
    public void setCrawlIsStop(Integer crawlIsStop) 
    {
        this.crawlIsStop = crawlIsStop;
    }

    public Integer getCrawlIsStop() 
    {
        return crawlIsStop;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("workDirection", getWorkDirection())
            .append("catId", getCatId())
            .append("catName", getCatName())
            .append("picUrl", getPicUrl())
            .append("bookName", getBookName())
            .append("authorId", getAuthorId())
            .append("authorName", getAuthorName())
            .append("bookDesc", getBookDesc())
            .append("score", getScore())
            .append("bookStatus", getBookStatus())
            .append("visitCount", getVisitCount())
            .append("wordCount", getWordCount())
            .append("commentCount", getCommentCount())
            .append("lastIndexId", getLastIndexId())
            .append("lastIndexName", getLastIndexName())
            .append("lastIndexUpdateTime", getLastIndexUpdateTime())
            .append("isVip", getIsVip())
            .append("status", getStatus())
            .append("updateTime", getUpdateTime())
            .append("createTime", getCreateTime())
            .append("crawlSourceId", getCrawlSourceId())
            .append("crawlBookId", getCrawlBookId())
            .append("crawlLastTime", getCrawlLastTime())
            .append("crawlIsStop", getCrawlIsStop())
            .toString();
    }
}
