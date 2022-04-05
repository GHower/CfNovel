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
import com.ruoyi.novel.domain.HomeBook;
import com.ruoyi.novel.service.IHomeBookService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 首页小说设置Controller
 * 
 * @author ruoyi
 * @date 2022-04-04
 */
@RestController
@RequestMapping("/novel/home")
public class HomeBookController extends BaseController
{
    @Autowired
    private IHomeBookService homeBookService;

    /**
     * 查询首页小说设置列表
     */
    @PreAuthorize("@ss.hasPermi('novel:home:list')")
    @GetMapping("/list")
    public TableDataInfo list(HomeBook homeBook)
    {
        startPage();
        List<HomeBook> list = homeBookService.selectHomeBookList(homeBook);
        return getDataTable(list);
    }

    /**
     * 导出首页小说设置列表
     */
    @PreAuthorize("@ss.hasPermi('novel:home:export')")
    @Log(title = "首页小说设置", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, HomeBook homeBook)
    {
        List<HomeBook> list = homeBookService.selectHomeBookList(homeBook);
        ExcelUtil<HomeBook> util = new ExcelUtil<HomeBook>(HomeBook.class);
        util.exportExcel(response, list, "首页小说设置数据");
    }

    /**
     * 获取首页小说设置详细信息
     */
    @PreAuthorize("@ss.hasPermi('novel:home:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(homeBookService.selectHomeBookById(id));
    }

    /**
     * 新增首页小说设置
     */
    @PreAuthorize("@ss.hasPermi('novel:home:add')")
    @Log(title = "首页小说设置", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody HomeBook homeBook)
    {
        return toAjax(homeBookService.insertHomeBook(homeBook));
    }

    /**
     * 修改首页小说设置
     */
    @PreAuthorize("@ss.hasPermi('novel:home:edit')")
    @Log(title = "首页小说设置", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody HomeBook homeBook)
    {
        return toAjax(homeBookService.updateHomeBook(homeBook));
    }

    /**
     * 删除首页小说设置
     */
    @PreAuthorize("@ss.hasPermi('novel:home:remove')")
    @Log(title = "首页小说设置", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(homeBookService.deleteHomeBookByIds(ids));
    }
}
