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
import com.ruoyi.novel.domain.CrawlSource;
import com.ruoyi.novel.service.ICrawlSourceService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 爬虫源Controller
 * 
 * @author ruoyi
 * @date 2022-04-04
 */
@RestController
@RequestMapping("/novel/source")
public class CrawlSourceController extends BaseController
{
    @Autowired
    private ICrawlSourceService crawlSourceService;

    /**
     * 查询爬虫源列表
     */
    @PreAuthorize("@ss.hasPermi('novel:source:list')")
    @GetMapping("/list")
    public TableDataInfo list(CrawlSource crawlSource)
    {
        startPage();
        List<CrawlSource> list = crawlSourceService.selectCrawlSourceList(crawlSource);
        return getDataTable(list);
    }

    /**
     * 导出爬虫源列表
     */
    @PreAuthorize("@ss.hasPermi('novel:source:export')")
    @Log(title = "爬虫源", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CrawlSource crawlSource)
    {
        List<CrawlSource> list = crawlSourceService.selectCrawlSourceList(crawlSource);
        ExcelUtil<CrawlSource> util = new ExcelUtil<CrawlSource>(CrawlSource.class);
        util.exportExcel(response, list, "爬虫源数据");
    }

    /**
     * 获取爬虫源详细信息
     */
    @PreAuthorize("@ss.hasPermi('novel:source:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(crawlSourceService.selectCrawlSourceById(id));
    }

    /**
     * 新增爬虫源
     */
    @PreAuthorize("@ss.hasPermi('novel:source:add')")
    @Log(title = "爬虫源", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CrawlSource crawlSource)
    {
        return toAjax(crawlSourceService.insertCrawlSource(crawlSource));
    }

    /**
     * 修改爬虫源
     */
    @PreAuthorize("@ss.hasPermi('novel:source:edit')")
    @Log(title = "爬虫源", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CrawlSource crawlSource)
    {
        return toAjax(crawlSourceService.updateCrawlSource(crawlSource));
    }

    /**
     * 删除爬虫源
     */
    @PreAuthorize("@ss.hasPermi('novel:source:remove')")
    @Log(title = "爬虫源", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(crawlSourceService.deleteCrawlSourceByIds(ids));
    }
}
