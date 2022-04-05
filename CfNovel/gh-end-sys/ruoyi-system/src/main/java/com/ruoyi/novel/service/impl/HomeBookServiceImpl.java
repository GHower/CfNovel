package com.ruoyi.novel.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.novel.mapper.HomeBookMapper;
import com.ruoyi.novel.domain.HomeBook;
import com.ruoyi.novel.service.IHomeBookService;

/**
 * 首页小说设置Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-04-04
 */
@Service
public class HomeBookServiceImpl implements IHomeBookService 
{
    @Autowired
    private HomeBookMapper homeBookMapper;

    /**
     * 查询首页小说设置
     * 
     * @param id 首页小说设置主键
     * @return 首页小说设置
     */
    @Override
    public HomeBook selectHomeBookById(Long id)
    {
        return homeBookMapper.selectHomeBookById(id);
    }

    /**
     * 查询首页小说设置列表
     * 
     * @param homeBook 首页小说设置
     * @return 首页小说设置
     */
    @Override
    public List<HomeBook> selectHomeBookList(HomeBook homeBook)
    {
        return homeBookMapper.selectHomeBookList(homeBook);
    }

    /**
     * 新增首页小说设置
     * 
     * @param homeBook 首页小说设置
     * @return 结果
     */
    @Override
    public int insertHomeBook(HomeBook homeBook)
    {
        homeBook.setCreateTime(DateUtils.getNowDate());
        return homeBookMapper.insertHomeBook(homeBook);
    }

    /**
     * 修改首页小说设置
     * 
     * @param homeBook 首页小说设置
     * @return 结果
     */
    @Override
    public int updateHomeBook(HomeBook homeBook)
    {
        homeBook.setUpdateTime(DateUtils.getNowDate());
        return homeBookMapper.updateHomeBook(homeBook);
    }

    /**
     * 批量删除首页小说设置
     * 
     * @param ids 需要删除的首页小说设置主键
     * @return 结果
     */
    @Override
    public int deleteHomeBookByIds(Long[] ids)
    {
        return homeBookMapper.deleteHomeBookByIds(ids);
    }

    /**
     * 删除首页小说设置信息
     * 
     * @param id 首页小说设置主键
     * @return 结果
     */
    @Override
    public int deleteHomeBookById(Long id)
    {
        return homeBookMapper.deleteHomeBookById(id);
    }
}
