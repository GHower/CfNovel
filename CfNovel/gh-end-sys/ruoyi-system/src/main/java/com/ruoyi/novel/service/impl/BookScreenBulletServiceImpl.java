package com.ruoyi.novel.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.novel.mapper.BookScreenBulletMapper;
import com.ruoyi.novel.domain.BookScreenBullet;
import com.ruoyi.novel.service.IBookScreenBulletService;

/**
 * 小说弹幕Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-04-04
 */
@Service
public class BookScreenBulletServiceImpl implements IBookScreenBulletService 
{
    @Autowired
    private BookScreenBulletMapper bookScreenBulletMapper;

    /**
     * 查询小说弹幕
     * 
     * @param id 小说弹幕主键
     * @return 小说弹幕
     */
    @Override
    public BookScreenBullet selectBookScreenBulletById(Long id)
    {
        return bookScreenBulletMapper.selectBookScreenBulletById(id);
    }

    /**
     * 查询小说弹幕列表
     * 
     * @param bookScreenBullet 小说弹幕
     * @return 小说弹幕
     */
    @Override
    public List<BookScreenBullet> selectBookScreenBulletList(BookScreenBullet bookScreenBullet)
    {
        return bookScreenBulletMapper.selectBookScreenBulletList(bookScreenBullet);
    }

    /**
     * 新增小说弹幕
     * 
     * @param bookScreenBullet 小说弹幕
     * @return 结果
     */
    @Override
    public int insertBookScreenBullet(BookScreenBullet bookScreenBullet)
    {
        bookScreenBullet.setCreateTime(DateUtils.getNowDate());
        return bookScreenBulletMapper.insertBookScreenBullet(bookScreenBullet);
    }

    /**
     * 修改小说弹幕
     * 
     * @param bookScreenBullet 小说弹幕
     * @return 结果
     */
    @Override
    public int updateBookScreenBullet(BookScreenBullet bookScreenBullet)
    {
        return bookScreenBulletMapper.updateBookScreenBullet(bookScreenBullet);
    }

    /**
     * 批量删除小说弹幕
     * 
     * @param ids 需要删除的小说弹幕主键
     * @return 结果
     */
    @Override
    public int deleteBookScreenBulletByIds(Long[] ids)
    {
        return bookScreenBulletMapper.deleteBookScreenBulletByIds(ids);
    }

    /**
     * 删除小说弹幕信息
     * 
     * @param id 小说弹幕主键
     * @return 结果
     */
    @Override
    public int deleteBookScreenBulletById(Long id)
    {
        return bookScreenBulletMapper.deleteBookScreenBulletById(id);
    }
}
