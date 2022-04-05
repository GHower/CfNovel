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
import com.ruoyi.novel.domain.BookIndex;
import com.ruoyi.novel.service.IBookIndexService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 小说目录Controller
 * 
 * @author ruoyi
 * @date 2022-04-04
 */
@RestController
@RequestMapping("/novel/index")
public class BookIndexController extends BaseController
{
    @Autowired
    private IBookIndexService bookIndexService;

    /**
     * 查询小说目录列表
     */
    @PreAuthorize("@ss.hasPermi('novel:index:list')")
    @GetMapping("/list")
    public TableDataInfo list(BookIndex bookIndex)
    {
        startPage();
        List<BookIndex> list = bookIndexService.selectBookIndexList(bookIndex);
        return getDataTable(list);
    }

    /**
     * 导出小说目录列表
     */
    @PreAuthorize("@ss.hasPermi('novel:index:export')")
    @Log(title = "小说目录", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, BookIndex bookIndex)
    {
        List<BookIndex> list = bookIndexService.selectBookIndexList(bookIndex);
        ExcelUtil<BookIndex> util = new ExcelUtil<BookIndex>(BookIndex.class);
        util.exportExcel(response, list, "小说目录数据");
    }

    /**
     * 获取小说目录详细信息
     */
    @PreAuthorize("@ss.hasPermi('novel:index:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(bookIndexService.selectBookIndexById(id));
    }

    /**
     * 新增小说目录
     */
    @PreAuthorize("@ss.hasPermi('novel:index:add')")
    @Log(title = "小说目录", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody BookIndex bookIndex)
    {
        return toAjax(bookIndexService.insertBookIndex(bookIndex));
    }

    /**
     * 修改小说目录
     */
    @PreAuthorize("@ss.hasPermi('novel:index:edit')")
    @Log(title = "小说目录", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody BookIndex bookIndex)
    {
        return toAjax(bookIndexService.updateBookIndex(bookIndex));
    }

    /**
     * 删除小说目录
     */
    @PreAuthorize("@ss.hasPermi('novel:index:remove')")
    @Log(title = "小说目录", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(bookIndexService.deleteBookIndexByIds(ids));
    }
}
