package com.how2java.tmall.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.how2java.tmall.pojo.Category;
import com.how2java.tmall.pojo.Property;
import com.how2java.tmall.service.impl.CategoryServiceImpl;
import com.how2java.tmall.service.impl.PropertServiceImpl;
import com.how2java.tmall.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("")
public class PropertyController {
    @Autowired
    PropertServiceImpl propertService;
    @Autowired
    CategoryServiceImpl categoryService;
    @RequestMapping("admin_property_list")
    public String list(Model model, Page page, int cid)
    {
        Category category = categoryService.get(cid);
        PageHelper.offsetPage(page.getStart(),page.getCount());
        List<Property> ps = propertService.list(cid);
        int total = (int)new PageInfo<>(ps).getTotal();
        page.setTotal(total);
        page.setParam("&cid="+category.getId());

        model.addAttribute("c",category);
        model.addAttribute("ps",ps);
        model.addAttribute("page",page);
        return "admin/listProperty";
    }
    @RequestMapping("admin_property_add")
    public String add(Model model,Property property){
        propertService.add(property);
        return "redirect:admin_property_list?cid="+property.getCid();
    }
    @RequestMapping("admin_property_delete")
    public String delete(int id){
        Property property = propertService.get(id);
        propertService.delete(id);
        return "redirect:admin_property_list?cid="+property.getCid();
    }
    @RequestMapping("admin_property_update")
    public String update(Property property){
        propertService.update(property);
        return "redirect:admin_property_list?cid="+property.getCid();
    }
    @RequestMapping("admin_property_edit")
    public String edit(Model model,int id){
        Property property = propertService.get(id);
        Category category = categoryService.get(property.getCid());
        property.setCategory(category);
        model.addAttribute("p",property);
        return "admin/editProperty";
    }
}
