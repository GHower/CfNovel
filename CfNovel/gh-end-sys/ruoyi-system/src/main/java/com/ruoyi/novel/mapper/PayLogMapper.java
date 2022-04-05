package com.ruoyi.novel.mapper;

import java.util.List;
import com.ruoyi.novel.domain.PayLog;

/**
 * 充值记录Mapper接口
 * 
 * @author ruoyi
 * @date 2022-04-04
 */
public interface PayLogMapper 
{
    /**
     * 查询充值记录
     * 
     * @param id 充值记录主键
     * @return 充值记录
     */
    public PayLog selectPayLogById(Long id);

    /**
     * 查询充值记录列表
     * 
     * @param payLog 充值记录
     * @return 充值记录集合
     */
    public List<PayLog> selectPayLogList(PayLog payLog);

    /**
     * 新增充值记录
     * 
     * @param payLog 充值记录
     * @return 结果
     */
    public int insertPayLog(PayLog payLog);

    /**
     * 修改充值记录
     * 
     * @param payLog 充值记录
     * @return 结果
     */
    public int updatePayLog(PayLog payLog);

    /**
     * 删除充值记录
     * 
     * @param id 充值记录主键
     * @return 结果
     */
    public int deletePayLogById(Long id);

    /**
     * 批量删除充值记录
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deletePayLogByIds(Long[] ids);
}
