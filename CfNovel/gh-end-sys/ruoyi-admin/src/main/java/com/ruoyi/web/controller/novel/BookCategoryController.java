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
import com.ruoyi.novel.domain.BookCategory;
import com.ruoyi.novel.service.IBookCategoryService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 小说类别Controller
 * 
 * @author ruoyi
 * @date 2022-04-04
 */
@RestController
@RequestMapping("/novel/category")
public class BookCategoryController extends BaseController
{
    @Autowired
    private IBookCategoryService bookCategoryService;

    /**
     * 查询小说类别列表
     */
    @PreAuthorize("@ss.hasPermi('novel:category:list')")
    @GetMapping("/list")
    public TableDataInfo list(BookCategory bookCategory)
    {
        startPage();
        List<BookCategory> list = bookCategoryService.selectBookCategoryList(bookCategory);
        return getDataTable(list);
    }

    /**
     * 导出小说类别列表
     */
    @PreAuthorize("@ss.hasPermi('novel:category:export')")
    @Log(title = "小说类别", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, BookCategory bookCategory)
    {
        List<BookCategory> list = bookCategoryService.selectBookCategoryList(bookCategory);
        ExcelUtil<BookCategory> util = new ExcelUtil<BookCategory>(BookCategory.class);
        util.exportExcel(response, list, "小说类别数据");
    }

    /**
     * 获取小说类别详细信息
     */
    @PreAuthorize("@ss.hasPermi('novel:category:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(bookCategoryService.selectBookCategoryById(id));
    }

    /**
     * 新增小说类别
     */
    @PreAuthorize("@ss.hasPermi('novel:category:add')")
    @Log(title = "小说类别", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody BookCategory bookCategory)
    {
        return toAjax(bookCategoryService.insertBookCategory(bookCategory));
    }

    /**
     * 修改小说类别
     */
    @PreAuthorize("@ss.hasPermi('novel:category:edit')")
    @Log(title = "小说类别", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody BookCategory bookCategory)
    {
        return toAjax(bookCategoryService.updateBookCategory(bookCategory));
    }

    /**
     * 删除小说类别
     */
    @PreAuthorize("@ss.hasPermi('novel:category:remove')")
    @Log(title = "小说类别", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(bookCategoryService.deleteBookCategoryByIds(ids));
    }
}
