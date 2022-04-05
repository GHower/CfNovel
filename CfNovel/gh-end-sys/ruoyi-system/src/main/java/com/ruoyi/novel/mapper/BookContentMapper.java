package com.ruoyi.novel.mapper;

import java.util.List;
import com.ruoyi.novel.domain.BookContent;

/**
 * 小说内容Mapper接口
 * 
 * @author ruoyi
 * @date 2022-04-04
 */
public interface BookContentMapper 
{
    /**
     * 查询小说内容
     * 
     * @param id 小说内容主键
     * @return 小说内容
     */
    public BookContent selectBookContentById(Long id);

    /**
     * 查询小说内容列表
     * 
     * @param bookContent 小说内容
     * @return 小说内容集合
     */
    public List<BookContent> selectBookContentList(BookContent bookContent);

    /**
     * 新增小说内容
     * 
     * @param bookContent 小说内容
     * @return 结果
     */
    public int insertBookContent(BookContent bookContent);

    /**
     * 修改小说内容
     * 
     * @param bookContent 小说内容
     * @return 结果
     */
    public int updateBookContent(BookContent bookContent);

    /**
     * 删除小说内容
     * 
     * @param id 小说内容主键
     * @return 结果
     */
    public int deleteBookContentById(Long id);

    /**
     * 批量删除小说内容
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBookContentByIds(Long[] ids);
}
