package com.gh.home.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author ghower
 * @date 2022/3/30 16:09
 */
@Controller
public class IndexController {
    @GetMapping({"/", "index"})
//    @ApiOperation(value = "查询出一级分类、渲染首页")
    public String index(Model model) {
//        List<CategoryEntity> categoryEntityList = categoryService.listOneCategory(0L);
//        model.addAttribute("category", categoryEntityList);
        return "index";
    }
}
