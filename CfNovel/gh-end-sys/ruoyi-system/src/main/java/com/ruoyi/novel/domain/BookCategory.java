package com.ruoyi.novel.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 小说类别对象 book_category
 * 
 * @author ruoyi
 * @date 2022-04-04
 */
public class BookCategory extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 作品方向，0：男频，1：女频' */
    @Excel(name = "作品方向，0：男频，1：女频'")
    private Integer workDirection;

    /** 分类名 */
    @Excel(name = "分类名")
    private String name;

    /** 排序 */
    @Excel(name = "排序")
    private Integer sort;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long createUserId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long updateUserId;

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
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setSort(Integer sort) 
    {
        this.sort = sort;
    }

    public Integer getSort() 
    {
        return sort;
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
            .append("workDirection", getWorkDirection())
            .append("name", getName())
            .append("sort", getSort())
            .append("createUserId", getCreateUserId())
            .append("createTime", getCreateTime())
            .append("updateUserId", getUpdateUserId())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
