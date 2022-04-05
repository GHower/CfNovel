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
import com.ruoyi.novel.domain.AuthorCode;
import com.ruoyi.novel.service.IAuthorCodeService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 作家邀请码Controller
 * 
 * @author ruoyi
 * @date 2022-04-04
 */
@RestController
@RequestMapping("/novel/code")
public class AuthorCodeController extends BaseController
{
    @Autowired
    private IAuthorCodeService authorCodeService;

    /**
     * 查询作家邀请码列表
     */
    @PreAuthorize("@ss.hasPermi('novel:code:list')")
    @GetMapping("/list")
    public TableDataInfo list(AuthorCode authorCode)
    {
        startPage();
        List<AuthorCode> list = authorCodeService.selectAuthorCodeList(authorCode);
        return getDataTable(list);
    }

    /**
     * 导出作家邀请码列表
     */
    @PreAuthorize("@ss.hasPermi('novel:code:export')")
    @Log(title = "作家邀请码", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, AuthorCode authorCode)
    {
        List<AuthorCode> list = authorCodeService.selectAuthorCodeList(authorCode);
        ExcelUtil<AuthorCode> util = new ExcelUtil<AuthorCode>(AuthorCode.class);
        util.exportExcel(response, list, "作家邀请码数据");
    }

    /**
     * 获取作家邀请码详细信息
     */
    @PreAuthorize("@ss.hasPermi('novel:code:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(authorCodeService.selectAuthorCodeById(id));
    }

    /**
     * 新增作家邀请码
     */
    @PreAuthorize("@ss.hasPermi('novel:code:add')")
    @Log(title = "作家邀请码", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody AuthorCode authorCode)
    {
        return toAjax(authorCodeService.insertAuthorCode(authorCode));
    }

    /**
     * 修改作家邀请码
     */
    @PreAuthorize("@ss.hasPermi('novel:code:edit')")
    @Log(title = "作家邀请码", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody AuthorCode authorCode)
    {
        return toAjax(authorCodeService.updateAuthorCode(authorCode));
    }

    /**
     * 删除作家邀请码
     */
    @PreAuthorize("@ss.hasPermi('novel:code:remove')")
    @Log(title = "作家邀请码", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(authorCodeService.deleteAuthorCodeByIds(ids));
    }
}
