package com.ruoyi.novel.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.novel.mapper.BookCommentReplyMapper;
import com.ruoyi.novel.domain.BookCommentReply;
import com.ruoyi.novel.service.IBookCommentReplyService;

/**
 * 小说评论回复Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-04-04
 */
@Service
public class BookCommentReplyServiceImpl implements IBookCommentReplyService 
{
    @Autowired
    private BookCommentReplyMapper bookCommentReplyMapper;

    /**
     * 查询小说评论回复
     * 
     * @param id 小说评论回复主键
     * @return 小说评论回复
     */
    @Override
    public BookCommentReply selectBookCommentReplyById(Long id)
    {
        return bookCommentReplyMapper.selectBookCommentReplyById(id);
    }

    /**
     * 查询小说评论回复列表
     * 
     * @param bookCommentReply 小说评论回复
     * @return 小说评论回复
     */
    @Override
    public List<BookCommentReply> selectBookCommentReplyList(BookCommentReply bookCommentReply)
    {
        return bookCommentReplyMapper.selectBookCommentReplyList(bookCommentReply);
    }

    /**
     * 新增小说评论回复
     * 
     * @param bookCommentReply 小说评论回复
     * @return 结果
     */
    @Override
    public int insertBookCommentReply(BookCommentReply bookCommentReply)
    {
        bookCommentReply.setCreateTime(DateUtils.getNowDate());
        return bookCommentReplyMapper.insertBookCommentReply(bookCommentReply);
    }

    /**
     * 修改小说评论回复
     * 
     * @param bookCommentReply 小说评论回复
     * @return 结果
     */
    @Override
    public int updateBookCommentReply(BookCommentReply bookCommentReply)
    {
        return bookCommentReplyMapper.updateBookCommentReply(bookCommentReply);
    }

    /**
     * 批量删除小说评论回复
     * 
     * @param ids 需要删除的小说评论回复主键
     * @return 结果
     */
    @Override
    public int deleteBookCommentReplyByIds(Long[] ids)
    {
        return bookCommentReplyMapper.deleteBookCommentReplyByIds(ids);
    }

    /**
     * 删除小说评论回复信息
     * 
     * @param id 小说评论回复主键
     * @return 结果
     */
    @Override
    public int deleteBookCommentReplyById(Long id)
    {
        return bookCommentReplyMapper.deleteBookCommentReplyById(id);
    }
}
