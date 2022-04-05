package com.ruoyi.novel.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.novel.mapper.UserBuyRecordMapper;
import com.ruoyi.novel.domain.UserBuyRecord;
import com.ruoyi.novel.service.IUserBuyRecordService;

/**
 * 用户消费记录Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-04-04
 */
@Service
public class UserBuyRecordServiceImpl implements IUserBuyRecordService 
{
    @Autowired
    private UserBuyRecordMapper userBuyRecordMapper;

    /**
     * 查询用户消费记录
     * 
     * @param id 用户消费记录主键
     * @return 用户消费记录
     */
    @Override
    public UserBuyRecord selectUserBuyRecordById(Long id)
    {
        return userBuyRecordMapper.selectUserBuyRecordById(id);
    }

    /**
     * 查询用户消费记录列表
     * 
     * @param userBuyRecord 用户消费记录
     * @return 用户消费记录
     */
    @Override
    public List<UserBuyRecord> selectUserBuyRecordList(UserBuyRecord userBuyRecord)
    {
        return userBuyRecordMapper.selectUserBuyRecordList(userBuyRecord);
    }

    /**
     * 新增用户消费记录
     * 
     * @param userBuyRecord 用户消费记录
     * @return 结果
     */
    @Override
    public int insertUserBuyRecord(UserBuyRecord userBuyRecord)
    {
        userBuyRecord.setCreateTime(DateUtils.getNowDate());
        return userBuyRecordMapper.insertUserBuyRecord(userBuyRecord);
    }

    /**
     * 修改用户消费记录
     * 
     * @param userBuyRecord 用户消费记录
     * @return 结果
     */
    @Override
    public int updateUserBuyRecord(UserBuyRecord userBuyRecord)
    {
        return userBuyRecordMapper.updateUserBuyRecord(userBuyRecord);
    }

    /**
     * 批量删除用户消费记录
     * 
     * @param ids 需要删除的用户消费记录主键
     * @return 结果
     */
    @Override
    public int deleteUserBuyRecordByIds(Long[] ids)
    {
        return userBuyRecordMapper.deleteUserBuyRecordByIds(ids);
    }

    /**
     * 删除用户消费记录信息
     * 
     * @param id 用户消费记录主键
     * @return 结果
     */
    @Override
    public int deleteUserBuyRecordById(Long id)
    {
        return userBuyRecordMapper.deleteUserBuyRecordById(id);
    }
}
