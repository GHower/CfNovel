package com.ruoyi.novel.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 小说评论回复对象 book_comment_reply
 * 
 * @author ruoyi
 * @date 2022-04-04
 */
public class BookCommentReply extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 评论ID */
    @Excel(name = "评论ID")
    private Long commentId;

    /** 回复内容 */
    @Excel(name = "回复内容")
    private String replyContent;

    /** 审核状态，0：待审核，1：审核通过，2：审核不通过 */
    @Excel(name = "审核状态，0：待审核，1：审核通过，2：审核不通过")
    private Integer auditStatus;

    /** 回复时间 */
    @Excel(name = "回复时间")
    private Long createUserId;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setCommentId(Long commentId) 
    {
        this.commentId = commentId;
    }

    public Long getCommentId() 
    {
        return commentId;
    }
    public void setReplyContent(String replyContent) 
    {
        this.replyContent = replyContent;
    }

    public String getReplyContent() 
    {
        return replyContent;
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
            .append("commentId", getCommentId())
            .append("replyContent", getReplyContent())
            .append("auditStatus", getAuditStatus())
            .append("createTime", getCreateTime())
            .append("createUserId", getCreateUserId())
            .toString();
    }
}
