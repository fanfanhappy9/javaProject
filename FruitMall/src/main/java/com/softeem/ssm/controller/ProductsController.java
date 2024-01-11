package com.softeem.ssm.controller;

import com.github.pagehelper.PageInfo;
import com.softeem.ssm.pojo.Products;
import com.softeem.ssm.service.ProductService;
import com.softeem.ssm.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/ProductsController")
public class ProductsController {
    @Autowired
    private ProductService productService;

    @RequestMapping("/findAll")
    @ResponseBody
    public Result findAll(int pageNum,int pageSize){
        PageInfo<Products> productList = productService.getProductList(pageNum,pageSize);
        return  new Result(true , "查询成功" , productList);
    }
    @RequestMapping("/findById")
    public String findById(Integer id, Model model){
        Products products = productService.findById(id);
        model.addAttribute("products",products);
        model.addAttribute("id",products.getId());
       return "orange";
    }
}
