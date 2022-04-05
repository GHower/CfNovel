package com.ruoyi.novel.mapper;

import java.util.List;
import com.ruoyi.novel.domain.BookCommentReply;

/**
 * 小说评论回复Mapper接口
 * 
 * @author ruoyi
 * @date 2022-04-04
 */
public interface BookCommentReplyMapper 
{
    /**
     * 查询小说评论回复
     * 
     * @param id 小说评论回复主键
     * @return 小说评论回复
     */
    public BookCommentReply selectBookCommentReplyById(Long id);

    /**
     * 查询小说评论回复列表
     * 
     * @param bookCommentReply 小说评论回复
     * @return 小说评论回复集合
     */
    public List<BookCommentReply> selectBookCommentReplyList(BookCommentReply bookCommentReply);

    /**
     * 新增小说评论回复
     * 
     * @param bookCommentReply 小说评论回复
     * @return 结果
     */
    public int insertBookCommentReply(BookCommentReply bookCommentReply);

    /**
     * 修改小说评论回复
     * 
     * @param bookCommentReply 小说评论回复
     * @return 结果
     */
    public int updateBookCommentReply(BookCommentReply bookCommentReply);

    /**
     * 删除小说评论回复
     * 
     * @param id 小说评论回复主键
     * @return 结果
     */
    public int deleteBookCommentReplyById(Long id);

    /**
     * 批量删除小说评论回复
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBookCommentReplyByIds(Long[] ids);
}
