package org.launchcode.controllers;

import org.launchcode.models.Cheese;
import org.launchcode.models.data.CategoryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Lauren on 4/10/2017.
 */

@Controller
@RequestMapping("category")
public class CategoryController {

    @Autowired
    private CategoryDao categoryDao;

    // Request path: /category
    @RequestMapping(value = "")
    public String index(Model model) {

        model.addAttribute("categories", categoryDao.findAll());
        model.addAttribute("title", "Categories");

        return "cheese/index";
    }

}
