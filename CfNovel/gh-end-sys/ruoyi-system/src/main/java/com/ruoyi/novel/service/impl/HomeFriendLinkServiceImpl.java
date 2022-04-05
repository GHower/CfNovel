package com.ruoyi.novel.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.novel.mapper.HomeFriendLinkMapper;
import com.ruoyi.novel.domain.HomeFriendLink;
import com.ruoyi.novel.service.IHomeFriendLinkService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-04-04
 */
@Service
public class HomeFriendLinkServiceImpl implements IHomeFriendLinkService 
{
    @Autowired
    private HomeFriendLinkMapper homeFriendLinkMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public HomeFriendLink selectHomeFriendLinkById(Long id)
    {
        return homeFriendLinkMapper.selectHomeFriendLinkById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param homeFriendLink 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<HomeFriendLink> selectHomeFriendLinkList(HomeFriendLink homeFriendLink)
    {
        return homeFriendLinkMapper.selectHomeFriendLinkList(homeFriendLink);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param homeFriendLink 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertHomeFriendLink(HomeFriendLink homeFriendLink)
    {
        homeFriendLink.setCreateTime(DateUtils.getNowDate());
        return homeFriendLinkMapper.insertHomeFriendLink(homeFriendLink);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param homeFriendLink 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateHomeFriendLink(HomeFriendLink homeFriendLink)
    {
        homeFriendLink.setUpdateTime(DateUtils.getNowDate());
        return homeFriendLinkMapper.updateHomeFriendLink(homeFriendLink);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteHomeFriendLinkByIds(Long[] ids)
    {
        return homeFriendLinkMapper.deleteHomeFriendLinkByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteHomeFriendLinkById(Long id)
    {
        return homeFriendLinkMapper.deleteHomeFriendLinkById(id);
    }
}
