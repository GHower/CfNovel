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
import com.ruoyi.novel.domain.UserBuyRecord;
import com.ruoyi.novel.service.IUserBuyRecordService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 用户消费记录Controller
 * 
 * @author ruoyi
 * @date 2022-04-04
 */
@RestController
@RequestMapping("/novel/record")
public class UserBuyRecordController extends BaseController
{
    @Autowired
    private IUserBuyRecordService userBuyRecordService;

    /**
     * 查询用户消费记录列表
     */
    @PreAuthorize("@ss.hasPermi('novel:record:list')")
    @GetMapping("/list")
    public TableDataInfo list(UserBuyRecord userBuyRecord)
    {
        startPage();
        List<UserBuyRecord> list = userBuyRecordService.selectUserBuyRecordList(userBuyRecord);
        return getDataTable(list);
    }

    /**
     * 导出用户消费记录列表
     */
    @PreAuthorize("@ss.hasPermi('novel:record:export')")
    @Log(title = "用户消费记录", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, UserBuyRecord userBuyRecord)
    {
        List<UserBuyRecord> list = userBuyRecordService.selectUserBuyRecordList(userBuyRecord);
        ExcelUtil<UserBuyRecord> util = new ExcelUtil<UserBuyRecord>(UserBuyRecord.class);
        util.exportExcel(response, list, "用户消费记录数据");
    }

    /**
     * 获取用户消费记录详细信息
     */
    @PreAuthorize("@ss.hasPermi('novel:record:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(userBuyRecordService.selectUserBuyRecordById(id));
    }

    /**
     * 新增用户消费记录
     */
    @PreAuthorize("@ss.hasPermi('novel:record:add')")
    @Log(title = "用户消费记录", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody UserBuyRecord userBuyRecord)
    {
        return toAjax(userBuyRecordService.insertUserBuyRecord(userBuyRecord));
    }

    /**
     * 修改用户消费记录
     */
    @PreAuthorize("@ss.hasPermi('novel:record:edit')")
    @Log(title = "用户消费记录", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody UserBuyRecord userBuyRecord)
    {
        return toAjax(userBuyRecordService.updateUserBuyRecord(userBuyRecord));
    }

    /**
     * 删除用户消费记录
     */
    @PreAuthorize("@ss.hasPermi('novel:record:remove')")
    @Log(title = "用户消费记录", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(userBuyRecordService.deleteUserBuyRecordByIds(ids));
    }
}
