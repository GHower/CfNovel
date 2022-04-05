package com.ruoyi.novel.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 用户消费记录对象 user_buy_record
 * 
 * @author ruoyi
 * @date 2022-04-04
 */
public class UserBuyRecord extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 用户ID */
    @Excel(name = "用户ID")
    private Long userId;

    /** 购买的小说ID */
    @Excel(name = "购买的小说ID")
    private Long bookId;

    /** 购买的小说名 */
    @Excel(name = "购买的小说名")
    private String bookName;

    /** 购买的章节ID */
    @Excel(name = "购买的章节ID")
    private Long bookIndexId;

    /** 购买的章节名 */
    @Excel(name = "购买的章节名")
    private String bookIndexName;

    /** 购买使用的屋币数量 */
    @Excel(name = "购买使用的屋币数量")
    private Long buyAmount;

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
    public void setBookName(String bookName) 
    {
        this.bookName = bookName;
    }

    public String getBookName() 
    {
        return bookName;
    }
    public void setBookIndexId(Long bookIndexId) 
    {
        this.bookIndexId = bookIndexId;
    }

    public Long getBookIndexId() 
    {
        return bookIndexId;
    }
    public void setBookIndexName(String bookIndexName) 
    {
        this.bookIndexName = bookIndexName;
    }

    public String getBookIndexName() 
    {
        return bookIndexName;
    }
    public void setBuyAmount(Long buyAmount) 
    {
        this.buyAmount = buyAmount;
    }

    public Long getBuyAmount() 
    {
        return buyAmount;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("userId", getUserId())
            .append("bookId", getBookId())
            .append("bookName", getBookName())
            .append("bookIndexId", getBookIndexId())
            .append("bookIndexName", getBookIndexName())
            .append("buyAmount", getBuyAmount())
            .append("createTime", getCreateTime())
            .toString();
    }
}
