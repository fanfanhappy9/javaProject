package com.softeem.ssm.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.softeem.ssm.mapper.ProductsMapper;
import com.softeem.ssm.pojo.Products;
import com.softeem.ssm.pojo.ProductsExample;
import com.softeem.ssm.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductsMapper productsMapper;
    @Override
    public PageInfo<Products> getProductList(Integer pageNum ,Integer pageSize) {
        PageHelper.startPage(pageNum , pageSize);
        List<Products> products = productsMapper.selectByExample(null);
        PageInfo<Products> pageInfo=new PageInfo<>(products);
        return pageInfo;
    }

    @Override
    public Products findById(Integer id) {
        return productsMapper.selectByPrimaryKey(id);
    }
}
