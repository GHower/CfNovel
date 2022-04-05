package com.ruoyi.novel.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 作家邀请码对象 author_code
 * 
 * @author ruoyi
 * @date 2022-04-04
 */
public class AuthorCode extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 邀请码 */
    @Excel(name = "邀请码")
    private String inviteCode;

    /** 有效时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "有效时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date validityTime;

    /** 是否使用过，0：未使用，1:使用过 */
    @Excel(name = "是否使用过，0：未使用，1:使用过")
    private Integer isUse;

    /** 创建人ID */
    @Excel(name = "创建人ID")
    private Long createUserId;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setInviteCode(String inviteCode) 
    {
        this.inviteCode = inviteCode;
    }

    public String getInviteCode() 
    {
        return inviteCode;
    }
    public void setValidityTime(Date validityTime) 
    {
        this.validityTime = validityTime;
    }

    public Date getValidityTime() 
    {
        return validityTime;
    }
    public void setIsUse(Integer isUse) 
    {
        this.isUse = isUse;
    }

    public Integer getIsUse() 
    {
        return isUse;
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
            .append("inviteCode", getInviteCode())
            .append("validityTime", getValidityTime())
            .append("isUse", getIsUse())
            .append("createTime", getCreateTime())
            .append("createUserId", getCreateUserId())
            .toString();
    }
}
