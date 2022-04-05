package com.ruoyi.novel.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.novel.mapper.BookContentMapper;
import com.ruoyi.novel.domain.BookContent;
import com.ruoyi.novel.service.IBookContentService;

/**
 * 小说内容Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-04-04
 */
@Service
public class BookContentServiceImpl implements IBookContentService 
{
    @Autowired
    private BookContentMapper bookContentMapper;

    /**
     * 查询小说内容
     * 
     * @param id 小说内容主键
     * @return 小说内容
     */
    @Override
    public BookContent selectBookContentById(Long id)
    {
        return bookContentMapper.selectBookContentById(id);
    }

    /**
     * 查询小说内容列表
     * 
     * @param bookContent 小说内容
     * @return 小说内容
     */
    @Override
    public List<BookContent> selectBookContentList(BookContent bookContent)
    {
        return bookContentMapper.selectBookContentList(bookContent);
    }

    /**
     * 新增小说内容
     * 
     * @param bookContent 小说内容
     * @return 结果
     */
    @Override
    public int insertBookContent(BookContent bookContent)
    {
        return bookContentMapper.insertBookContent(bookContent);
    }

    /**
     * 修改小说内容
     * 
     * @param bookContent 小说内容
     * @return 结果
     */
    @Override
    public int updateBookContent(BookContent bookContent)
    {
        return bookContentMapper.updateBookContent(bookContent);
    }

    /**
     * 批量删除小说内容
     * 
     * @param ids 需要删除的小说内容主键
     * @return 结果
     */
    @Override
    public int deleteBookContentByIds(Long[] ids)
    {
        return bookContentMapper.deleteBookContentByIds(ids);
    }

    /**
     * 删除小说内容信息
     * 
     * @param id 小说内容主键
     * @return 结果
     */
    @Override
    public int deleteBookContentById(Long id)
    {
        return bookContentMapper.deleteBookContentById(id);
    }
}
