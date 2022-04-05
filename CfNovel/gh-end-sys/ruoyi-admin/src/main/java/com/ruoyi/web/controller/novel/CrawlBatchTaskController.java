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
import com.ruoyi.novel.domain.CrawlBatchTask;
import com.ruoyi.novel.service.ICrawlBatchTaskService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 批量抓取任务Controller
 * 
 * @author ruoyi
 * @date 2022-04-04
 */
@RestController
@RequestMapping("/novel/task")
public class CrawlBatchTaskController extends BaseController
{
    @Autowired
    private ICrawlBatchTaskService crawlBatchTaskService;

    /**
     * 查询批量抓取任务列表
     */
    @PreAuthorize("@ss.hasPermi('novel:task:list')")
    @GetMapping("/list")
    public TableDataInfo list(CrawlBatchTask crawlBatchTask)
    {
        startPage();
        List<CrawlBatchTask> list = crawlBatchTaskService.selectCrawlBatchTaskList(crawlBatchTask);
        return getDataTable(list);
    }

    /**
     * 导出批量抓取任务列表
     */
    @PreAuthorize("@ss.hasPermi('novel:task:export')")
    @Log(title = "批量抓取任务", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CrawlBatchTask crawlBatchTask)
    {
        List<CrawlBatchTask> list = crawlBatchTaskService.selectCrawlBatchTaskList(crawlBatchTask);
        ExcelUtil<CrawlBatchTask> util = new ExcelUtil<CrawlBatchTask>(CrawlBatchTask.class);
        util.exportExcel(response, list, "批量抓取任务数据");
    }

    /**
     * 获取批量抓取任务详细信息
     */
    @PreAuthorize("@ss.hasPermi('novel:task:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(crawlBatchTaskService.selectCrawlBatchTaskById(id));
    }

    /**
     * 新增批量抓取任务
     */
    @PreAuthorize("@ss.hasPermi('novel:task:add')")
    @Log(title = "批量抓取任务", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CrawlBatchTask crawlBatchTask)
    {
        return toAjax(crawlBatchTaskService.insertCrawlBatchTask(crawlBatchTask));
    }

    /**
     * 修改批量抓取任务
     */
    @PreAuthorize("@ss.hasPermi('novel:task:edit')")
    @Log(title = "批量抓取任务", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CrawlBatchTask crawlBatchTask)
    {
        return toAjax(crawlBatchTaskService.updateCrawlBatchTask(crawlBatchTask));
    }

    /**
     * 删除批量抓取任务
     */
    @PreAuthorize("@ss.hasPermi('novel:task:remove')")
    @Log(title = "批量抓取任务", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(crawlBatchTaskService.deleteCrawlBatchTaskByIds(ids));
    }
}
