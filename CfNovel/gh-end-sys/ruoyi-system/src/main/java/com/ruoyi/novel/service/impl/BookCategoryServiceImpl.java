package com.ruoyi.novel.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.novel.mapper.BookCategoryMapper;
import com.ruoyi.novel.domain.BookCategory;
import com.ruoyi.novel.service.IBookCategoryService;

/**
 * 小说类别Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-04-04
 */
@Service
public class BookCategoryServiceImpl implements IBookCategoryService 
{
    @Autowired
    private BookCategoryMapper bookCategoryMapper;

    /**
     * 查询小说类别
     * 
     * @param id 小说类别主键
     * @return 小说类别
     */
    @Override
    public BookCategory selectBookCategoryById(Long id)
    {
        return bookCategoryMapper.selectBookCategoryById(id);
    }

    /**
     * 查询小说类别列表
     * 
     * @param bookCategory 小说类别
     * @return 小说类别
     */
    @Override
    public List<BookCategory> selectBookCategoryList(BookCategory bookCategory)
    {
        return bookCategoryMapper.selectBookCategoryList(bookCategory);
    }

    /**
     * 新增小说类别
     * 
     * @param bookCategory 小说类别
     * @return 结果
     */
    @Override
    public int insertBookCategory(BookCategory bookCategory)
    {
        bookCategory.setCreateTime(DateUtils.getNowDate());
        return bookCategoryMapper.insertBookCategory(bookCategory);
    }

    /**
     * 修改小说类别
     * 
     * @param bookCategory 小说类别
     * @return 结果
     */
    @Override
    public int updateBookCategory(BookCategory bookCategory)
    {
        bookCategory.setUpdateTime(DateUtils.getNowDate());
        return bookCategoryMapper.updateBookCategory(bookCategory);
    }

    /**
     * 批量删除小说类别
     * 
     * @param ids 需要删除的小说类别主键
     * @return 结果
     */
    @Override
    public int deleteBookCategoryByIds(Long[] ids)
    {
        return bookCategoryMapper.deleteBookCategoryByIds(ids);
    }

    /**
     * 删除小说类别信息
     * 
     * @param id 小说类别主键
     * @return 结果
     */
    @Override
    public int deleteBookCategoryById(Long id)
    {
        return bookCategoryMapper.deleteBookCategoryById(id);
    }
}
