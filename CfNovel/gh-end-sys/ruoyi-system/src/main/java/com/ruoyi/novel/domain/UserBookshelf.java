package com.ruoyi.novel.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 用户书架对象 user_bookshelf
 * 
 * @author ruoyi
 * @date 2022-04-04
 */
public class UserBookshelf extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 用户ID */
    @Excel(name = "用户ID")
    private Long userId;

    /** 小说ID */
    @Excel(name = "小说ID")
    private Long bookId;

    /** 上一次阅读的章节内容表ID */
    @Excel(name = "上一次阅读的章节内容表ID")
    private Long preContentId;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }
    public void setBookId(Long bookId) 
    {
        this.bookId = bookId;
    }

    public Long getBookId() 
    {
        return bookId;
    }
    public void setPreContentId(Long preContentId) 
    {
        this.preContentId = preContentId;
    }

    public Long getPreContentId() 
    {
        return preContentId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("userId", getUserId())
            .append("bookId", getBookId())
            .append("preContentId", getPreContentId())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
