package com.ruoyi.novel.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.novel.mapper.UserBookshelfMapper;
import com.ruoyi.novel.domain.UserBookshelf;
import com.ruoyi.novel.service.IUserBookshelfService;

/**
 * 用户书架Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-04-04
 */
@Service
public class UserBookshelfServiceImpl implements IUserBookshelfService 
{
    @Autowired
    private UserBookshelfMapper userBookshelfMapper;

    /**
     * 查询用户书架
     * 
     * @param id 用户书架主键
     * @return 用户书架
     */
    @Override
    public UserBookshelf selectUserBookshelfById(Long id)
    {
        return userBookshelfMapper.selectUserBookshelfById(id);
    }

    /**
     * 查询用户书架列表
     * 
     * @param userBookshelf 用户书架
     * @return 用户书架
     */
    @Override
    public List<UserBookshelf> selectUserBookshelfList(UserBookshelf userBookshelf)
    {
        return userBookshelfMapper.selectUserBookshelfList(userBookshelf);
    }

    /**
     * 新增用户书架
     * 
     * @param userBookshelf 用户书架
     * @return 结果
     */
    @Override
    public int insertUserBookshelf(UserBookshelf userBookshelf)
    {
        userBookshelf.setCreateTime(DateUtils.getNowDate());
        return userBookshelfMapper.insertUserBookshelf(userBookshelf);
    }

    /**
     * 修改用户书架
     * 
     * @param userBookshelf 用户书架
     * @return 结果
     */
    @Override
    public int updateUserBookshelf(UserBookshelf userBookshelf)
    {
        userBookshelf.setUpdateTime(DateUtils.getNowDate());
        return userBookshelfMapper.updateUserBookshelf(userBookshelf);
    }

    /**
     * 批量删除用户书架
     * 
     * @param ids 需要删除的用户书架主键
     * @return 结果
     */
    @Override
    public int deleteUserBookshelfByIds(Long[] ids)
    {
        return userBookshelfMapper.deleteUserBookshelfByIds(ids);
    }

    /**
     * 删除用户书架信息
     * 
     * @param id 用户书架主键
     * @return 结果
     */
    @Override
    public int deleteUserBookshelfById(Long id)
    {
        return userBookshelfMapper.deleteUserBookshelfById(id);
    }
}
