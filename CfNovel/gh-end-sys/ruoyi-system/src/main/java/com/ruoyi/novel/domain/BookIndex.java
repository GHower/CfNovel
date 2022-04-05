package com.ruoyi.novel.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 小说目录对象 book_index
 * 
 * @author ruoyi
 * @date 2022-04-04
 */
public class BookIndex extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 小说ID */
    @Excel(name = "小说ID")
    private Long bookId;

    /** 目录号 */
    @Excel(name = "目录号")
    private Long indexNum;

    /** 目录名 */
    @Excel(name = "目录名")
    private String indexName;

    /** 字数 */
    @Excel(name = "字数")
    private Long wordCount;

    /** 是否收费，1：收费，0：免费 */
    @Excel(name = "是否收费，1：收费，0：免费")
    private Integer isVip;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setBookId(Long bookId) 
    {
        this.bookId = bookId;
    }

    public Long getBookId() 
    {
        return bookId;
    }
    public void setIndexNum(Long indexNum) 
    {
        this.indexNum = indexNum;
    }

    public Long getIndexNum() 
    {
        return indexNum;
    }
    public void setIndexName(String indexName) 
    {
        this.indexName = indexName;
    }

    public String getIndexName() 
    {
        return indexName;
    }
    public void setWordCount(Long wordCount) 
    {
        this.wordCount = wordCount;
    }

    public Long getWordCount() 
    {
        return wordCount;
    }
    public void setIsVip(Integer isVip) 
    {
        this.isVip = isVip;
    }

    public Integer getIsVip() 
    {
        return isVip;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("bookId", getBookId())
            .append("indexNum", getIndexNum())
            .append("indexName", getIndexName())
            .append("wordCount", getWordCount())
            .append("isVip", getIsVip())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
