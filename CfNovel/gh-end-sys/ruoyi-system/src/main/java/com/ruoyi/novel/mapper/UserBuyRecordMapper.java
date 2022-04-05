package com.ruoyi.novel.mapper;

import java.util.List;
import com.ruoyi.novel.domain.UserBuyRecord;

/**
 * 用户消费记录Mapper接口
 * 
 * @author ruoyi
 * @date 2022-04-04
 */
public interface UserBuyRecordMapper 
{
    /**
     * 查询用户消费记录
     * 
     * @param id 用户消费记录主键
     * @return 用户消费记录
     */
    public UserBuyRecord selectUserBuyRecordById(Long id);

    /**
     * 查询用户消费记录列表
     * 
     * @param userBuyRecord 用户消费记录
     * @return 用户消费记录集合
     */
    public List<UserBuyRecord> selectUserBuyRecordList(UserBuyRecord userBuyRecord);

    /**
     * 新增用户消费记录
     * 
     * @param userBuyRecord 用户消费记录
     * @return 结果
     */
    public int insertUserBuyRecord(UserBuyRecord userBuyRecord);

    /**
     * 修改用户消费记录
     * 
     * @param userBuyRecord 用户消费记录
     * @return 结果
     */
    public int updateUserBuyRecord(UserBuyRecord userBuyRecord);

    /**
     * 删除用户消费记录
     * 
     * @param id 用户消费记录主键
     * @return 结果
     */
    public int deleteUserBuyRecordById(Long id);

    /**
     * 批量删除用户消费记录
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteUserBuyRecordByIds(Long[] ids);
}
