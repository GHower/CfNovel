package com.ruoyi.novel.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.novel.mapper.BookIndexMapper;
import com.ruoyi.novel.domain.BookIndex;
import com.ruoyi.novel.service.IBookIndexService;

/**
 * 小说目录Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-04-04
 */
@Service
public class BookIndexServiceImpl implements IBookIndexService 
{
    @Autowired
    private BookIndexMapper bookIndexMapper;

    /**
     * 查询小说目录
     * 
     * @param id 小说目录主键
     * @return 小说目录
     */
    @Override
    public BookIndex selectBookIndexById(Long id)
    {
        return bookIndexMapper.selectBookIndexById(id);
    }

    /**
     * 查询小说目录列表
     * 
     * @param bookIndex 小说目录
     * @return 小说目录
     */
    @Override
    public List<BookIndex> selectBookIndexList(BookIndex bookIndex)
    {
        return bookIndexMapper.selectBookIndexList(bookIndex);
    }

    /**
     * 新增小说目录
     * 
     * @param bookIndex 小说目录
     * @return 结果
     */
    @Override
    public int insertBookIndex(BookIndex bookIndex)
    {
        bookIndex.setCreateTime(DateUtils.getNowDate());
        return bookIndexMapper.insertBookIndex(bookIndex);
    }

    /**
     * 修改小说目录
     * 
     * @param bookIndex 小说目录
     * @return 结果
     */
    @Override
    public int updateBookIndex(BookIndex bookIndex)
    {
        bookIndex.setUpdateTime(DateUtils.getNowDate());
        return bookIndexMapper.updateBookIndex(bookIndex);
    }

    /**
     * 批量删除小说目录
     * 
     * @param ids 需要删除的小说目录主键
     * @return 结果
     */
    @Override
    public int deleteBookIndexByIds(Long[] ids)
    {
        return bookIndexMapper.deleteBookIndexByIds(ids);
    }

    /**
     * 删除小说目录信息
     * 
     * @param id 小说目录主键
     * @return 结果
     */
    @Override
    public int deleteBookIndexById(Long id)
    {
        return bookIndexMapper.deleteBookIndexById(id);
    }
}
