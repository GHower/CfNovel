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
import com.ruoyi.novel.domain.NewsCategory;
import com.ruoyi.novel.service.INewsCategoryService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 新闻类别Controller
 * 
 * @author ruoyi
 * @date 2022-04-04
 */
@RestController
@RequestMapping("/novel/news/category")
public class NewsCategoryController extends BaseController
{
    @Autowired
    private INewsCategoryService newsCategoryService;

    /**
     * 查询新闻类别列表
     */
    @PreAuthorize("@ss.hasPermi('novel:news:list')")
    @GetMapping("/list")
    public TableDataInfo list(NewsCategory newsCategory)
    {
        startPage();
        List<NewsCategory> list = newsCategoryService.selectNewsCategoryList(newsCategory);
        return getDataTable(list);
    }

    /**
     * 导出新闻类别列表
     */
    @PreAuthorize("@ss.hasPermi('novel:news:export')")
    @Log(title = "新闻类别", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, NewsCategory newsCategory)
    {
        List<NewsCategory> list = newsCategoryService.selectNewsCategoryList(newsCategory);
        ExcelUtil<NewsCategory> util = new ExcelUtil<NewsCategory>(NewsCategory.class);
        util.exportExcel(response, list, "新闻类别数据");
    }

    /**
     * 获取新闻类别详细信息
     */
    @PreAuthorize("@ss.hasPermi('novel:news:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(newsCategoryService.selectNewsCategoryById(id));
    }

    /**
     * 新增新闻类别
     */
    @PreAuthorize("@ss.hasPermi('novel:news:add')")
    @Log(title = "新闻类别", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody NewsCategory newsCategory)
    {
        return toAjax(newsCategoryService.insertNewsCategory(newsCategory));
    }

    /**
     * 修改新闻类别
     */
    @PreAuthorize("@ss.hasPermi('novel:news:edit')")
    @Log(title = "新闻类别", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody NewsCategory newsCategory)
    {
        return toAjax(newsCategoryService.updateNewsCategory(newsCategory));
    }

    /**
     * 删除新闻类别
     */
    @PreAuthorize("@ss.hasPermi('novel:news:remove')")
    @Log(title = "新闻类别", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(newsCategoryService.deleteNewsCategoryByIds(ids));
    }
}
