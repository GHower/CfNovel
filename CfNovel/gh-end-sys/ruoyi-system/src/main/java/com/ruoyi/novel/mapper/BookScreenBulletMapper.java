package com.ruoyi.novel.mapper;

import java.util.List;
import com.ruoyi.novel.domain.BookScreenBullet;

/**
 * 小说弹幕Mapper接口
 * 
 * @author ruoyi
 * @date 2022-04-04
 */
public interface BookScreenBulletMapper 
{
    /**
     * 查询小说弹幕
     * 
     * @param id 小说弹幕主键
     * @return 小说弹幕
     */
    public BookScreenBullet selectBookScreenBulletById(Long id);

    /**
     * 查询小说弹幕列表
     * 
     * @param bookScreenBullet 小说弹幕
     * @return 小说弹幕集合
     */
    public List<BookScreenBullet> selectBookScreenBulletList(BookScreenBullet bookScreenBullet);

    /**
     * 新增小说弹幕
     * 
     * @param bookScreenBullet 小说弹幕
     * @return 结果
     */
    public int insertBookScreenBullet(BookScreenBullet bookScreenBullet);

    /**
     * 修改小说弹幕
     * 
     * @param bookScreenBullet 小说弹幕
     * @return 结果
     */
    public int updateBookScreenBullet(BookScreenBullet bookScreenBullet);

    /**
     * 删除小说弹幕
     * 
     * @param id 小说弹幕主键
     * @return 结果
     */
    public int deleteBookScreenBulletById(Long id);

    /**
     * 批量删除小说弹幕
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBookScreenBulletByIds(Long[] ids);
}
