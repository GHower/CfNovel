package com.ruoyi.novel.mapper;

import java.util.List;
import com.ruoyi.novel.domain.HomeBook;

/**
 * 首页小说设置Mapper接口
 * 
 * @author ruoyi
 * @date 2022-04-04
 */
public interface HomeBookMapper 
{
    /**
     * 查询首页小说设置
     * 
     * @param id 首页小说设置主键
     * @return 首页小说设置
     */
    public HomeBook selectHomeBookById(Long id);

    /**
     * 查询首页小说设置列表
     * 
     * @param homeBook 首页小说设置
     * @return 首页小说设置集合
     */
    public List<HomeBook> selectHomeBookList(HomeBook homeBook);

    /**
     * 新增首页小说设置
     * 
     * @param homeBook 首页小说设置
     * @return 结果
     */
    public int insertHomeBook(HomeBook homeBook);

    /**
     * 修改首页小说设置
     * 
     * @param homeBook 首页小说设置
     * @return 结果
     */
    public int updateHomeBook(HomeBook homeBook);

    /**
     * 删除首页小说设置
     * 
     * @param id 首页小说设置主键
     * @return 结果
     */
    public int deleteHomeBookById(Long id);

    /**
     * 批量删除首页小说设置
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteHomeBookByIds(Long[] ids);
}
