package com.ruoyi.novel.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.novel.mapper.BookMapper;
import com.ruoyi.novel.domain.Book;
import com.ruoyi.novel.service.IBookService;

/**
 * 小说Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-04-04
 */
@Service
public class BookServiceImpl implements IBookService 
{
    @Autowired
    private BookMapper bookMapper;

    /**
     * 查询小说
     * 
     * @param id 小说主键
     * @return 小说
     */
    @Override
    public Book selectBookById(Long id)
    {
        return bookMapper.selectBookById(id);
    }

    /**
     * 查询小说列表
     * 
     * @param book 小说
     * @return 小说
     */
    @Override
    public List<Book> selectBookList(Book book)
    {
        return bookMapper.selectBookList(book);
    }

    /**
     * 新增小说
     * 
     * @param book 小说
     * @return 结果
     */
    @Override
    public int insertBook(Book book)
    {
        book.setCreateTime(DateUtils.getNowDate());
        return bookMapper.insertBook(book);
    }

    /**
     * 修改小说
     * 
     * @param book 小说
     * @return 结果
     */
    @Override
    public int updateBook(Book book)
    {
        book.setUpdateTime(DateUtils.getNowDate());
        return bookMapper.updateBook(book);
    }

    /**
     * 批量删除小说
     * 
     * @param ids 需要删除的小说主键
     * @return 结果
     */
    @Override
    public int deleteBookByIds(Long[] ids)
    {
        return bookMapper.deleteBookByIds(ids);
    }

    /**
     * 删除小说信息
     * 
     * @param id 小说主键
     * @return 结果
     */
    @Override
    public int deleteBookById(Long id)
    {
        return bookMapper.deleteBookById(id);
    }
}
