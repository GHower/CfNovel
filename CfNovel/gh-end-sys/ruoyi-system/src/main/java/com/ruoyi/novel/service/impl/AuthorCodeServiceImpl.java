package com.ruoyi.novel.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.novel.mapper.AuthorCodeMapper;
import com.ruoyi.novel.domain.AuthorCode;
import com.ruoyi.novel.service.IAuthorCodeService;

/**
 * 作家邀请码Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-04-04
 */
@Service
public class AuthorCodeServiceImpl implements IAuthorCodeService 
{
    @Autowired
    private AuthorCodeMapper authorCodeMapper;

    /**
     * 查询作家邀请码
     * 
     * @param id 作家邀请码主键
     * @return 作家邀请码
     */
    @Override
    public AuthorCode selectAuthorCodeById(Long id)
    {
        return authorCodeMapper.selectAuthorCodeById(id);
    }

    /**
     * 查询作家邀请码列表
     * 
     * @param authorCode 作家邀请码
     * @return 作家邀请码
     */
    @Override
    public List<AuthorCode> selectAuthorCodeList(AuthorCode authorCode)
    {
        return authorCodeMapper.selectAuthorCodeList(authorCode);
    }

    /**
     * 新增作家邀请码
     * 
     * @param authorCode 作家邀请码
     * @return 结果
     */
    @Override
    public int insertAuthorCode(AuthorCode authorCode)
    {
        authorCode.setCreateTime(DateUtils.getNowDate());
        authorCode.setCreateUserId(SecurityUtils.getUserId());
        return authorCodeMapper.insertAuthorCode(authorCode);
    }

    /**
     * 修改作家邀请码
     * 
     * @param authorCode 作家邀请码
     * @return 结果
     */
    @Override
    public int updateAuthorCode(AuthorCode authorCode)
    {
        return authorCodeMapper.updateAuthorCode(authorCode);
    }

    /**
     * 批量删除作家邀请码
     * 
     * @param ids 需要删除的作家邀请码主键
     * @return 结果
     */
    @Override
    public int deleteAuthorCodeByIds(Long[] ids)
    {
        return authorCodeMapper.deleteAuthorCodeByIds(ids);
    }

    /**
     * 删除作家邀请码信息
     * 
     * @param id 作家邀请码主键
     * @return 结果
     */
    @Override
    public int deleteAuthorCodeById(Long id)
    {
        return authorCodeMapper.deleteAuthorCodeById(id);
    }
}
