package com.ruoyi.novel.service;

import java.util.List;
import com.ruoyi.novel.domain.UserBookshelf;

/**
 * 用户书架Service接口
 * 
 * @author ruoyi
 * @date 2022-04-04
 */
public interface IUserBookshelfService 
{
    /**
     * 查询用户书架
     * 
     * @param id 用户书架主键
     * @return 用户书架
     */
    public UserBookshelf selectUserBookshelfById(Long id);

    /**
     * 查询用户书架列表
     * 
     * @param userBookshelf 用户书架
     * @return 用户书架集合
     */
    public List<UserBookshelf> selectUserBookshelfList(UserBookshelf userBookshelf);

    /**
     * 新增用户书架
     * 
     * @param userBookshelf 用户书架
     * @return 结果
     */
    public int insertUserBookshelf(UserBookshelf userBookshelf);

    /**
     * 修改用户书架
     * 
     * @param userBookshelf 用户书架
     * @return 结果
     */
    public int updateUserBookshelf(UserBookshelf userBookshelf);

    /**
     * 批量删除用户书架
     * 
     * @param ids 需要删除的用户书架主键集合
     * @return 结果
     */
    public int deleteUserBookshelfByIds(Long[] ids);

    /**
     * 删除用户书架信息
     * 
     * @param id 用户书架主键
     * @return 结果
     */
    public int deleteUserBookshelfById(Long id);
}
