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
import com.ruoyi.novel.domain.BookScreenBullet;
import com.ruoyi.novel.service.IBookScreenBulletService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 小说弹幕Controller
 * 
 * @author ruoyi
 * @date 2022-04-04
 */
@RestController
@RequestMapping("/novel/bullet")
public class BookScreenBulletController extends BaseController
{
    @Autowired
    private IBookScreenBulletService bookScreenBulletService;

    /**
     * 查询小说弹幕列表
     */
    @PreAuthorize("@ss.hasPermi('novel:bullet:list')")
    @GetMapping("/list")
    public TableDataInfo list(BookScreenBullet bookScreenBullet)
    {
        startPage();
        List<BookScreenBullet> list = bookScreenBulletService.selectBookScreenBulletList(bookScreenBullet);
        return getDataTable(list);
    }

    /**
     * 导出小说弹幕列表
     */
    @PreAuthorize("@ss.hasPermi('novel:bullet:export')")
    @Log(title = "小说弹幕", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, BookScreenBullet bookScreenBullet)
    {
        List<BookScreenBullet> list = bookScreenBulletService.selectBookScreenBulletList(bookScreenBullet);
        ExcelUtil<BookScreenBullet> util = new ExcelUtil<BookScreenBullet>(BookScreenBullet.class);
        util.exportExcel(response, list, "小说弹幕数据");
    }

    /**
     * 获取小说弹幕详细信息
     */
    @PreAuthorize("@ss.hasPermi('novel:bullet:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(bookScreenBulletService.selectBookScreenBulletById(id));
    }

    /**
     * 新增小说弹幕
     */
    @PreAuthorize("@ss.hasPermi('novel:bullet:add')")
    @Log(title = "小说弹幕", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody BookScreenBullet bookScreenBullet)
    {
        return toAjax(bookScreenBulletService.insertBookScreenBullet(bookScreenBullet));
    }

    /**
     * 修改小说弹幕
     */
    @PreAuthorize("@ss.hasPermi('novel:bullet:edit')")
    @Log(title = "小说弹幕", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody BookScreenBullet bookScreenBullet)
    {
        return toAjax(bookScreenBulletService.updateBookScreenBullet(bookScreenBullet));
    }

    /**
     * 删除小说弹幕
     */
    @PreAuthorize("@ss.hasPermi('novel:bullet:remove')")
    @Log(title = "小说弹幕", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(bookScreenBulletService.deleteBookScreenBulletByIds(ids));
    }
}
