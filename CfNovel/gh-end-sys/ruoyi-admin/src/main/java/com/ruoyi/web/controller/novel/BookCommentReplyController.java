package com.ruoyi.web.controller.novel;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.novel.domain.BookCommentReply;
import com.ruoyi.novel.service.IBookCommentReplyService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 小说评论回复Controller
 * 
 * @author ruoyi
 * @date 2022-04-04
 */
@RestController
@RequestMapping("/novel/reply")
public class BookCommentReplyController extends BaseController
{
    @Autowired
    private IBookCommentReplyService bookCommentReplyService;

    /**
     * 查询小说评论回复列表
     */
    @PreAuthorize("@ss.hasPermi('novel:reply:list')")
    @GetMapping("/list")
    public TableDataInfo list(BookCommentReply bookCommentReply)
    {
        startPage();
        List<BookCommentReply> list = bookCommentReplyService.selectBookCommentReplyList(bookCommentReply);
        return getDataTable(list);
    }

    /**
     * 导出小说评论回复列表
     */
    @PreAuthorize("@ss.hasPermi('novel:reply:export')")
    @Log(title = "小说评论回复", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, BookCommentReply bookCommentReply)
    {
        List<BookCommentReply> list = bookCommentReplyService.selectBookCommentReplyList(bookCommentReply);
        ExcelUtil<BookCommentReply> util = new ExcelUtil<BookCommentReply>(BookCommentReply.class);
        util.exportExcel(response, list, "小说评论回复数据");
    }

    /**
     * 获取小说评论回复详细信息
     */
    @PreAuthorize("@ss.hasPermi('novel:reply:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(bookCommentReplyService.selectBookCommentReplyById(id));
    }

    /**
     * 新增小说评论回复
     */
    @PreAuthorize("@ss.hasPermi('novel:reply:add')")
    @Log(title = "小说评论回复", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody BookCommentReply bookCommentReply)
    {
        return toAjax(bookCommentReplyService.insertBookCommentReply(bookCommentReply));
    }

    /**
     * 修改小说评论回复
     */
    @PreAuthorize("@ss.hasPermi('novel:reply:edit')")
    @Log(title = "小说评论回复", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody BookCommentReply bookCommentReply)
    {
        return toAjax(bookCommentReplyService.updateBookCommentReply(bookCommentReply));
    }

    /**
     * 删除小说评论回复
     */
    @PreAuthorize("@ss.hasPermi('novel:reply:remove')")
    @Log(title = "小说评论回复", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(bookCommentReplyService.deleteBookCommentReplyByIds(ids));
    }
}
