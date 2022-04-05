package com.ruoyi.novel.mapper;

import java.util.List;
import com.ruoyi.novel.domain.AuthorCode;

/**
 * 作家邀请码Mapper接口
 * 
 * @author ruoyi
 * @date 2022-04-04
 */
public interface AuthorCodeMapper 
{
    /**
     * 查询作家邀请码
     * 
     * @param id 作家邀请码主键
     * @return 作家邀请码
     */
    public AuthorCode selectAuthorCodeById(Long id);

    /**
     * 查询作家邀请码列表
     * 
     * @param authorCode 作家邀请码
     * @return 作家邀请码集合
     */
    public List<AuthorCode> selectAuthorCodeList(AuthorCode authorCode);

    /**
     * 新增作家邀请码
     * 
     * @param authorCode 作家邀请码
     * @return 结果
     */
    public int insertAuthorCode(AuthorCode authorCode);

    /**
     * 修改作家邀请码
     * 
     * @param authorCode 作家邀请码
     * @return 结果
     */
    public int updateAuthorCode(AuthorCode authorCode);

    /**
     * 删除作家邀请码
     * 
     * @param id 作家邀请码主键
     * @return 结果
     */
    public int deleteAuthorCodeById(Long id);

    /**
     * 批量删除作家邀请码
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteAuthorCodeByIds(Long[] ids);
}
