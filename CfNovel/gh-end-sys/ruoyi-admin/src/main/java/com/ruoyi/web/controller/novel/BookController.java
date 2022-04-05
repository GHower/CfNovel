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
import com.ruoyi.novel.domain.Book;
import com.ruoyi.novel.service.IBookService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 小说Controller
 * 
 * @author ruoyi
 * @date 2022-04-04
 */
@RestController
@RequestMapping("/novel/book")
public class BookController extends BaseController
{
    @Autowired
    private IBookService bookService;

    /**
     * 查询小说列表
     */
    @PreAuthorize("@ss.hasPermi('novel:book:list')")
    @GetMapping("/list")
    public TableDataInfo list(Book book)
    {
        startPage();
        List<Book> list = bookService.selectBookList(book);
        return getDataTable(list);
    }

    /**
     * 导出小说列表
     */
    @PreAuthorize("@ss.hasPermi('novel:book:export')")
    @Log(title = "小说", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Book book)
    {
        List<Book> list = bookService.selectBookList(book);
        ExcelUtil<Book> util = new ExcelUtil<Book>(Book.class);
        util.exportExcel(response, list, "小说数据");
    }

    /**
     * 获取小说详细信息
     */
    @PreAuthorize("@ss.hasPermi('novel:book:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(bookService.selectBookById(id));
    }

    /**
     * 新增小说
     */
    @PreAuthorize("@ss.hasPermi('novel:book:add')")
    @Log(title = "小说", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Book book)
    {
        return toAjax(bookService.insertBook(book));
    }

    /**
     * 修改小说
     */
    @PreAuthorize("@ss.hasPermi('novel:book:edit')")
    @Log(title = "小说", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Book book)
    {
        return toAjax(bookService.updateBook(book));
    }

    /**
     * 删除小说
     */
    @PreAuthorize("@ss.hasPermi('novel:book:remove')")
    @Log(title = "小说", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(bookService.deleteBookByIds(ids));
    }
}
