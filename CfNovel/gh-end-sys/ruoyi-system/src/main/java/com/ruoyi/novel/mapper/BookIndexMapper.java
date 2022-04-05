package com.ruoyi.novel.mapper;

import java.util.List;
import com.ruoyi.novel.domain.BookIndex;

/**
 * 小说目录Mapper接口
 * 
 * @author ruoyi
 * @date 2022-04-04
 */
public interface BookIndexMapper 
{
    /**
     * 查询小说目录
     * 
     * @param id 小说目录主键
     * @return 小说目录
     */
    public BookIndex selectBookIndexById(Long id);

    /**
     * 查询小说目录列表
     * 
     * @param bookIndex 小说目录
     * @return 小说目录集合
     */
    public List<BookIndex> selectBookIndexList(BookIndex bookIndex);

    /**
     * 新增小说目录
     * 
     * @param bookIndex 小说目录
     * @return 结果
     */
    public int insertBookIndex(BookIndex bookIndex);

    /**
     * 修改小说目录
     * 
     * @param bookIndex 小说目录
     * @return 结果
     */
    public int updateBookIndex(BookIndex bookIndex);

    /**
     * 删除小说目录
     * 
     * @param id 小说目录主键
     * @return 结果
     */
    public int deleteBookIndexById(Long id);

    /**
     * 批量删除小说目录
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBookIndexByIds(Long[] ids);
}
