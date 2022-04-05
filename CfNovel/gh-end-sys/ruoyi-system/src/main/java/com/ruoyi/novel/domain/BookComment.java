package com.ruoyi.novel.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 小说评论对象 book_comment
 * 
 * @author ruoyi
 * @date 2022-04-04
 */
public class BookComment extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 小说ID */
    @Excel(name = "小说ID")
    private Long bookId;

    /** 评价内容 */
    @Excel(name = "评价内容")
    private String commentContent;

    /** 回复数量 */
    @Excel(name = "回复数量")
    private Long replyCount;

    /** 审核状态，0：待审核，1：审核通过，2：审核不通过 */
    @Excel(name = "审核状态，0：待审核，1：审核通过，2：审核不通过")
    private Integer auditStatus;

    /** 评价人 */
    @Excel(name = "评价人")
    private Long createUserId;

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
    public void setCommentContent(String commentContent) 
    {
        this.commentContent = commentContent;
    }

    public String getCommentContent() 
    {
        return commentContent;
    }
    public void setReplyCount(Long replyCount) 
    {
        this.replyCount = replyCount;
    }

    public Long getReplyCount() 
    {
        return replyCount;
    }
    public void setAuditStatus(Integer auditStatus) 
    {
        this.auditStatus = auditStatus;
    }

    public Integer getAuditStatus() 
    {
        return auditStatus;
    }
    public void setCreateUserId(Long createUserId) 
    {
        this.createUserId = createUserId;
    }

    public Long getCreateUserId() 
    {
        return createUserId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("bookId", getBookId())
            .append("commentContent", getCommentContent())
            .append("replyCount", getReplyCount())
            .append("auditStatus", getAuditStatus())
            .append("createTime", getCreateTime())
            .append("createUserId", getCreateUserId())
            .toString();
    }
}
