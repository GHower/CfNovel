package com.ruoyi.novel.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 充值记录对象 pay_log
 * 
 * @author ruoyi
 * @date 2022-04-04
 */
public class PayLog extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 商户订单号 */
    @Excel(name = "商户订单号")
    private Long outTradeNo;

    /** 交易类型，0:充值购买屋币，1:包年VIP */
    @Excel(name = "交易类型，0:充值购买屋币，1:包年VIP")
    private Integer tradeType;

    /** 支付宝/微信交易号 */
    @Excel(name = "支付宝/微信交易号")
    private String tradeNo;

    /** 支付渠道，1：支付宝，2：微信 */
    @Excel(name = "支付渠道，1：支付宝，2：微信")
    private Integer payChannel;

    /** 交易金额(单位分) */
    @Excel(name = "交易金额(单位分)")
    private Long totalAmount;

    /** 支付用户ID */
    @Excel(name = "支付用户ID")
    private Long userId;

    /** 支付状态 */
    @Excel(name = "支付状态")
    private String payStatus;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setOutTradeNo(Long outTradeNo) 
    {
        this.outTradeNo = outTradeNo;
    }

    public Long getOutTradeNo() 
    {
        return outTradeNo;
    }
    public void setTradeType(Integer tradeType) 
    {
        this.tradeType = tradeType;
    }

    public Integer getTradeType() 
    {
        return tradeType;
    }
    public void setTradeNo(String tradeNo) 
    {
        this.tradeNo = tradeNo;
    }

    public String getTradeNo() 
    {
        return tradeNo;
    }
    public void setPayChannel(Integer payChannel) 
    {
        this.payChannel = payChannel;
    }

    public Integer getPayChannel() 
    {
        return payChannel;
    }
    public void setTotalAmount(Long totalAmount) 
    {
        this.totalAmount = totalAmount;
    }

    public Long getTotalAmount() 
    {
        return totalAmount;
    }
    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }
    public void setPayStatus(String payStatus) 
    {
        this.payStatus = payStatus;
    }

    public String getPayStatus() 
    {
        return payStatus;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("outTradeNo", getOutTradeNo())
            .append("tradeType", getTradeType())
            .append("tradeNo", getTradeNo())
            .append("payChannel", getPayChannel())
            .append("totalAmount", getTotalAmount())
            .append("userId", getUserId())
            .append("payStatus", getPayStatus())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
