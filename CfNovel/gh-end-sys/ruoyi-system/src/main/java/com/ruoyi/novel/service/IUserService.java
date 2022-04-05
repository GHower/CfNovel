package com.ruoyi.novel.service;

import java.util.List;
import com.ruoyi.novel.domain.User;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2022-04-04
 */
public interface IUserService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public User selectUserById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param user 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<User> selectUserList(User user);

    /**
     * 新增【请填写功能名称】
     * 
     * @param user 【请填写功能名称】
     * @return 结果
     */
    public int insertUser(User user);

    /**
     * 修改【请填写功能名称】
     * 
     * @param user 【请填写功能名称】
     * @return 结果
     */
    public int updateUser(User user);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteUserByIds(Long[] ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteUserById(Long id);
}
