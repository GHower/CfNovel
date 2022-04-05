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
import com.ruoyi.novel.domain.BookComment;
import com.ruoyi.novel.service.IBookCommentService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 小说评论Controller
 * 
 * @author ruoyi
 * @date 2022-04-04
 */
@RestController
@RequestMapping("/novel/comment")
public class BookCommentController extends BaseController
{
    @Autowired
    private IBookCommentService bookCommentService;

    /**
     * 查询小说评论列表
     */
    @PreAuthorize("@ss.hasPermi('novel:comment:list')")
    @GetMapping("/list")
    public TableDataInfo list(BookComment bookComment)
    {
        startPage();
        List<BookComment> list = bookCommentService.selectBookCommentList(bookComment);
        return getDataTable(list);
    }

    /**
     * 导出小说评论列表
     */
    @PreAuthorize("@ss.hasPermi('novel:comment:export')")
    @Log(title = "小说评论", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, BookComment bookComment)
    {
        List<BookComment> list = bookCommentService.selectBookCommentList(bookComment);
        ExcelUtil<BookComment> util = new ExcelUtil<BookComment>(BookComment.class);
        util.exportExcel(response, list, "小说评论数据");
    }

    /**
     * 获取小说评论详细信息
     */
    @PreAuthorize("@ss.hasPermi('novel:comment:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(bookCommentService.selectBookCommentById(id));
    }

    /**
     * 新增小说评论
     */
    @PreAuthorize("@ss.hasPermi('novel:comment:add')")
    @Log(title = "小说评论", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody BookComment bookComment)
    {
        return toAjax(bookCommentService.insertBookComment(bookComment));
    }

    /**
     * 修改小说评论
     */
    @PreAuthorize("@ss.hasPermi('novel:comment:edit')")
    @Log(title = "小说评论", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody BookComment bookComment)
    {
        return toAjax(bookCommentService.updateBookComment(bookComment));
    }

    /**
     * 删除小说评论
     */
    @PreAuthorize("@ss.hasPermi('novel:comment:remove')")
    @Log(title = "小说评论", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(bookCommentService.deleteBookCommentByIds(ids));
    }
}
