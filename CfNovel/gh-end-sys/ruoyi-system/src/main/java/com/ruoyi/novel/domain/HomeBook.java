package com.ruoyi.novel.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 首页小说设置对象 home_book
 * 
 * @author ruoyi
 * @date 2022-04-04
 */
public class HomeBook extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 小说ID */
    @Excel(name = "小说ID")
    private Long bookId;

    /** 排序号 */
    @Excel(name = "排序号")
    private Integer sort;

    /** 类型，0：轮播图，1：顶部小说栏设置，2：本周强推，3：热门推荐，4：精品推荐 */
    @Excel(name = "类型，0：轮播图，1：顶部小说栏设置，2：本周强推，3：热门推荐，4：精品推荐")
    private Integer type;

    /** 创建人ID */
    @Excel(name = "创建人ID")
    private Long createUserId;

    /** 更新人ID */
    @Excel(name = "更新人ID")
    private Long updateUserId;

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
    public void setSort(Integer sort) 
    {
        this.sort = sort;
    }

    public Integer getSort() 
    {
        return sort;
    }
    public void setType(Integer type) 
    {
        this.type = type;
    }

    public Integer getType() 
    {
        return type;
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
            .append("bookId", getBookId())
            .append("sort", getSort())
            .append("type", getType())
            .append("createTime", getCreateTime())
            .append("createUserId", getCreateUserId())
            .append("updateTime", getUpdateTime())
            .append("updateUserId", getUpdateUserId())
            .toString();
    }
}
