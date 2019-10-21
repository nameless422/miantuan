package com.how2java.tmall.test;

import com.how2java.tmall.pojo.PropertyValue;
import com.how2java.tmall.pojo.User;
import com.how2java.tmall.service.CategoryService;
import com.how2java.tmall.service.ProductService;
import com.how2java.tmall.service.PropertyValueService;
import com.how2java.tmall.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class ProductTest {
    @Autowired(required = false)
    ProductService productService;
    @Autowired(required = false)
    CategoryService categoryService;
    @Autowired
    PropertyValueService propertyValueService;
    @Autowired
    UserService userService;

    @Test
    public void testCategory(){
        System.out.println(categoryService.get(productService.get(2).getCid())
        .getName());
        //System.out.println(propertyValueService.list());
    }
    @Test
    public void testPorpertyValue(){

        List<PropertyValue> list= propertyValueService.list(2);
        for (PropertyValue pv: list) {
            int i =0;
            System.out.println(list.get(0).toString());
            i++;
        }
    }
    @Test
    public void testuser(){
        List<User> list = userService.list();
        for (User user:list
             ) {
            int i =0;
            System.out.println(list.get(i).toString());
            i++;
        }
    }
}
