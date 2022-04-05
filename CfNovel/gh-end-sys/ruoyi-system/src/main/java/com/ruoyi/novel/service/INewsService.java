package com.ruoyi.novel.service;

import java.util.List;
import com.ruoyi.novel.domain.News;

/**
 * 新闻Service接口
 * 
 * @author ruoyi
 * @date 2022-04-04
 */
public interface INewsService 
{
    /**
     * 查询新闻
     * 
     * @param id 新闻主键
     * @return 新闻
     */
    public News selectNewsById(Long id);

    /**
     * 查询新闻列表
     * 
     * @param news 新闻
     * @return 新闻集合
     */
    public List<News> selectNewsList(News news);

    /**
     * 新增新闻
     * 
     * @param news 新闻
     * @return 结果
     */
    public int insertNews(News news);

    /**
     * 修改新闻
     * 
     * @param news 新闻
     * @return 结果
     */
    public int updateNews(News news);

    /**
     * 批量删除新闻
     * 
     * @param ids 需要删除的新闻主键集合
     * @return 结果
     */
    public int deleteNewsByIds(Long[] ids);

    /**
     * 删除新闻信息
     * 
     * @param id 新闻主键
     * @return 结果
     */
    public int deleteNewsById(Long id);
}
