package com.softeem.ssm.service;

import com.github.pagehelper.PageInfo;
import com.softeem.ssm.pojo.Products;

public interface ProductService {
    PageInfo<Products> getProductList(Integer pageNum,Integer pageSize);

    Products findById(Integer id);


}
