package com.ruoyi.novel.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 小说弹幕对象 book_screen_bullet
 * 
 * @author ruoyi
 * @date 2022-04-04
 */
public class BookScreenBullet extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 小说内容ID */
    @Excel(name = "小说内容ID")
    private Long contentId;

    /** 小说弹幕内容 */
    @Excel(name = "小说弹幕内容")
    private String screenBullet;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setContentId(Long contentId) 
    {
        this.contentId = contentId;
    }

    public Long getContentId() 
    {
        return contentId;
    }
    public void setScreenBullet(String screenBullet) 
    {
        this.screenBullet = screenBullet;
    }

    public String getScreenBullet() 
    {
        return screenBullet;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("contentId", getContentId())
            .append("screenBullet", getScreenBullet())
            .append("createTime", getCreateTime())
            .toString();
    }
}
