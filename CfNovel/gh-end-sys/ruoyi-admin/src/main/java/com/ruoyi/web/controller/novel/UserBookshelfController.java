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
import com.ruoyi.novel.domain.UserBookshelf;
import com.ruoyi.novel.service.IUserBookshelfService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 用户书架Controller
 * 
 * @author ruoyi
 * @date 2022-04-04
 */
@RestController
@RequestMapping("/novel/bookshelf")
public class UserBookshelfController extends BaseController
{
    @Autowired
    private IUserBookshelfService userBookshelfService;

    /**
     * 查询用户书架列表
     */
    @PreAuthorize("@ss.hasPermi('novel:bookshelf:list')")
    @GetMapping("/list")
    public TableDataInfo list(UserBookshelf userBookshelf)
    {
        startPage();
        List<UserBookshelf> list = userBookshelfService.selectUserBookshelfList(userBookshelf);
        return getDataTable(list);
    }

    /**
     * 导出用户书架列表
     */
    @PreAuthorize("@ss.hasPermi('novel:bookshelf:export')")
    @Log(title = "用户书架", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, UserBookshelf userBookshelf)
    {
        List<UserBookshelf> list = userBookshelfService.selectUserBookshelfList(userBookshelf);
        ExcelUtil<UserBookshelf> util = new ExcelUtil<UserBookshelf>(UserBookshelf.class);
        util.exportExcel(response, list, "用户书架数据");
    }

    /**
     * 获取用户书架详细信息
     */
    @PreAuthorize("@ss.hasPermi('novel:bookshelf:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(userBookshelfService.selectUserBookshelfById(id));
    }

    /**
     * 新增用户书架
     */
    @PreAuthorize("@ss.hasPermi('novel:bookshelf:add')")
    @Log(title = "用户书架", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody UserBookshelf userBookshelf)
    {
        return toAjax(userBookshelfService.insertUserBookshelf(userBookshelf));
    }

    /**
     * 修改用户书架
     */
    @PreAuthorize("@ss.hasPermi('novel:bookshelf:edit')")
    @Log(title = "用户书架", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody UserBookshelf userBookshelf)
    {
        return toAjax(userBookshelfService.updateUserBookshelf(userBookshelf));
    }

    /**
     * 删除用户书架
     */
    @PreAuthorize("@ss.hasPermi('novel:bookshelf:remove')")
    @Log(title = "用户书架", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(userBookshelfService.deleteUserBookshelfByIds(ids));
    }
}
