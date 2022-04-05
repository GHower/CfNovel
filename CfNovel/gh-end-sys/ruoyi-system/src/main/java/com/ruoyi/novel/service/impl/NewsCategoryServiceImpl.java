package com.ruoyi.novel.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.novel.mapper.NewsCategoryMapper;
import com.ruoyi.novel.domain.NewsCategory;
import com.ruoyi.novel.service.INewsCategoryService;

/**
 * 新闻类别Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-04-04
 */
@Service
public class NewsCategoryServiceImpl implements INewsCategoryService 
{
    @Autowired
    private NewsCategoryMapper newsCategoryMapper;

    /**
     * 查询新闻类别
     * 
     * @param id 新闻类别主键
     * @return 新闻类别
     */
    @Override
    public NewsCategory selectNewsCategoryById(Long id)
    {
        return newsCategoryMapper.selectNewsCategoryById(id);
    }

    /**
     * 查询新闻类别列表
     * 
     * @param newsCategory 新闻类别
     * @return 新闻类别
     */
    @Override
    public List<NewsCategory> selectNewsCategoryList(NewsCategory newsCategory)
    {
        return newsCategoryMapper.selectNewsCategoryList(newsCategory);
    }

    /**
     * 新增新闻类别
     * 
     * @param newsCategory 新闻类别
     * @return 结果
     */
    @Override
    public int insertNewsCategory(NewsCategory newsCategory)
    {
        newsCategory.setCreateTime(DateUtils.getNowDate());
        return newsCategoryMapper.insertNewsCategory(newsCategory);
    }

    /**
     * 修改新闻类别
     * 
     * @param newsCategory 新闻类别
     * @return 结果
     */
    @Override
    public int updateNewsCategory(NewsCategory newsCategory)
    {
        newsCategory.setUpdateTime(DateUtils.getNowDate());
        return newsCategoryMapper.updateNewsCategory(newsCategory);
    }

    /**
     * 批量删除新闻类别
     * 
     * @param ids 需要删除的新闻类别主键
     * @return 结果
     */
    @Override
    public int deleteNewsCategoryByIds(Long[] ids)
    {
        return newsCategoryMapper.deleteNewsCategoryByIds(ids);
    }

    /**
     * 删除新闻类别信息
     * 
     * @param id 新闻类别主键
     * @return 结果
     */
    @Override
    public int deleteNewsCategoryById(Long id)
    {
        return newsCategoryMapper.deleteNewsCategoryById(id);
    }
}
