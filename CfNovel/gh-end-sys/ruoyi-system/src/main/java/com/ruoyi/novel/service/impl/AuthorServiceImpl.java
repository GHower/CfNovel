package com.ruoyi.novel.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.novel.mapper.AuthorMapper;
import com.ruoyi.novel.domain.Author;
import com.ruoyi.novel.service.IAuthorService;

/**
 * 作者Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-04-04
 */
@Service
public class AuthorServiceImpl implements IAuthorService 
{
    @Autowired
    private AuthorMapper authorMapper;

    /**
     * 查询作者
     * 
     * @param id 作者主键
     * @return 作者
     */
    @Override
    public Author selectAuthorById(Long id)
    {
        return authorMapper.selectAuthorById(id);
    }

    /**
     * 查询作者列表
     * 
     * @param author 作者
     * @return 作者
     */
    @Override
    public List<Author> selectAuthorList(Author author)
    {
        return authorMapper.selectAuthorList(author);
    }

    /**
     * 新增作者
     * 
     * @param author 作者
     * @return 结果
     */
    @Override
    public int insertAuthor(Author author)
    {
        author.setCreateTime(DateUtils.getNowDate());
        return authorMapper.insertAuthor(author);
    }

    /**
     * 修改作者
     * 
     * @param author 作者
     * @return 结果
     */
    @Override
    public int updateAuthor(Author author)
    {
        return authorMapper.updateAuthor(author);
    }

    /**
     * 批量删除作者
     * 
     * @param ids 需要删除的作者主键
     * @return 结果
     */
    @Override
    public int deleteAuthorByIds(Long[] ids)
    {
        return authorMapper.deleteAuthorByIds(ids);
    }

    /**
     * 删除作者信息
     * 
     * @param id 作者主键
     * @return 结果
     */
    @Override
    public int deleteAuthorById(Long id)
    {
        return authorMapper.deleteAuthorById(id);
    }
}
