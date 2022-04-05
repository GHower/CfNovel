package com.ruoyi.novel.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.novel.mapper.PayLogMapper;
import com.ruoyi.novel.domain.PayLog;
import com.ruoyi.novel.service.IPayLogService;

/**
 * 充值记录Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-04-04
 */
@Service
public class PayLogServiceImpl implements IPayLogService 
{
    @Autowired
    private PayLogMapper payLogMapper;

    /**
     * 查询充值记录
     * 
     * @param id 充值记录主键
     * @return 充值记录
     */
    @Override
    public PayLog selectPayLogById(Long id)
    {
        return payLogMapper.selectPayLogById(id);
    }

    /**
     * 查询充值记录列表
     * 
     * @param payLog 充值记录
     * @return 充值记录
     */
    @Override
    public List<PayLog> selectPayLogList(PayLog payLog)
    {
        return payLogMapper.selectPayLogList(payLog);
    }

    /**
     * 新增充值记录
     * 
     * @param payLog 充值记录
     * @return 结果
     */
    @Override
    public int insertPayLog(PayLog payLog)
    {
        payLog.setCreateTime(DateUtils.getNowDate());
        return payLogMapper.insertPayLog(payLog);
    }

    /**
     * 修改充值记录
     * 
     * @param payLog 充值记录
     * @return 结果
     */
    @Override
    public int updatePayLog(PayLog payLog)
    {
        payLog.setUpdateTime(DateUtils.getNowDate());
        return payLogMapper.updatePayLog(payLog);
    }

    /**
     * 批量删除充值记录
     * 
     * @param ids 需要删除的充值记录主键
     * @return 结果
     */
    @Override
    public int deletePayLogByIds(Long[] ids)
    {
        return payLogMapper.deletePayLogByIds(ids);
    }

    /**
     * 删除充值记录信息
     * 
     * @param id 充值记录主键
     * @return 结果
     */
    @Override
    public int deletePayLogById(Long id)
    {
        return payLogMapper.deletePayLogById(id);
    }
}
