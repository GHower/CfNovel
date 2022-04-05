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
import com.ruoyi.novel.domain.PayLog;
import com.ruoyi.novel.service.IPayLogService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 充值记录Controller
 * 
 * @author ruoyi
 * @date 2022-04-04
 */
@RestController
@RequestMapping("/novel/log")
public class PayLogController extends BaseController
{
    @Autowired
    private IPayLogService payLogService;

    /**
     * 查询充值记录列表
     */
    @PreAuthorize("@ss.hasPermi('novel:log:list')")
    @GetMapping("/list")
    public TableDataInfo list(PayLog payLog)
    {
        startPage();
        List<PayLog> list = payLogService.selectPayLogList(payLog);
        return getDataTable(list);
    }

    /**
     * 导出充值记录列表
     */
    @PreAuthorize("@ss.hasPermi('novel:log:export')")
    @Log(title = "充值记录", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, PayLog payLog)
    {
        List<PayLog> list = payLogService.selectPayLogList(payLog);
        ExcelUtil<PayLog> util = new ExcelUtil<PayLog>(PayLog.class);
        util.exportExcel(response, list, "充值记录数据");
    }

    /**
     * 获取充值记录详细信息
     */
    @PreAuthorize("@ss.hasPermi('novel:log:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(payLogService.selectPayLogById(id));
    }

    /**
     * 新增充值记录
     */
    @PreAuthorize("@ss.hasPermi('novel:log:add')")
    @Log(title = "充值记录", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody PayLog payLog)
    {
        return toAjax(payLogService.insertPayLog(payLog));
    }

    /**
     * 修改充值记录
     */
    @PreAuthorize("@ss.hasPermi('novel:log:edit')")
    @Log(title = "充值记录", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody PayLog payLog)
    {
        return toAjax(payLogService.updatePayLog(payLog));
    }

    /**
     * 删除充值记录
     */
    @PreAuthorize("@ss.hasPermi('novel:log:remove')")
    @Log(title = "充值记录", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(payLogService.deletePayLogByIds(ids));
    }
}
