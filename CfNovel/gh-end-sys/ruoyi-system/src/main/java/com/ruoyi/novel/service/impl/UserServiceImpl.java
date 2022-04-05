package com.ruoyi.novel.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.novel.mapper.UserMapper;
import com.ruoyi.novel.domain.User;
import com.ruoyi.novel.service.IUserService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-04-04
 */
@Service
public class UserServiceImpl implements IUserService 
{
    @Autowired
    private UserMapper userMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public User selectUserById(Long id)
    {
        return userMapper.selectUserById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param user 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<User> selectUserList(User user)
    {
        return userMapper.selectUserList(user);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param user 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertUser(User user)
    {
        user.setCreateTime(DateUtils.getNowDate());
        return userMapper.insertUser(user);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param user 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateUser(User user)
    {
        user.setUpdateTime(DateUtils.getNowDate());
        return userMapper.updateUser(user);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteUserByIds(Long[] ids)
    {
        return userMapper.deleteUserByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteUserById(Long id)
    {
        return userMapper.deleteUserById(id);
    }
}
