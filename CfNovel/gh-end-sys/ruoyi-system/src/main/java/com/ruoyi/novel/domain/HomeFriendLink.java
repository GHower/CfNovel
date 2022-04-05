package com.ruoyi.novel.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 home_friend_link
 * 
 * @author ruoyi
 * @date 2022-04-04
 */
public class HomeFriendLink extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 链接名 */
    @Excel(name = "链接名")
    private String linkName;

    /** 链接url */
    @Excel(name = "链接url")
    private String linkUrl;

    /** 排序号 */
    @Excel(name = "排序号")
    private Integer sort;

    /** 是否开启，0：不开启，1：开启 */
    @Excel(name = "是否开启，0：不开启，1：开启")
    private Integer isOpen;

    /** 创建人id */
    @Excel(name = "创建人id")
    private Long createUserId;

    /** 更新者用户id */
    @Excel(name = "更新者用户id")
    private Long updateUserId;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setLinkName(String linkName) 
    {
        this.linkName = linkName;
    }

    public String getLinkName() 
    {
        return linkName;
    }
    public void setLinkUrl(String linkUrl) 
    {
        this.linkUrl = linkUrl;
    }

    public String getLinkUrl() 
    {
        return linkUrl;
    }
    public void setSort(Integer sort) 
    {
        this.sort = sort;
    }

    public Integer getSort() 
    {
        return sort;
    }
    public void setIsOpen(Integer isOpen) 
    {
        this.isOpen = isOpen;
    }

    public Integer getIsOpen() 
    {
        return isOpen;
    }
    public void setCreateUserId(Long createUserId) 
    {
        this.createUserId = createUserId;
    }

    public Long getCreateUserId() 
    {
        return createUserId;
    }
    public void setUpdateUserId(Long updateUserId) 
    {
        this.updateUserId = updateUserId;
    }

    public Long getUpdateUserId() 
    {
        return updateUserId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("linkName", getLinkName())
            .append("linkUrl", getLinkUrl())
            .append("sort", getSort())
            .append("isOpen", getIsOpen())
            .append("createUserId", getCreateUserId())
            .append("createTime", getCreateTime())
            .append("updateUserId", getUpdateUserId())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
