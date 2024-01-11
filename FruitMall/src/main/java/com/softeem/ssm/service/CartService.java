package com.softeem.ssm.service;

import com.github.pagehelper.PageInfo;
import com.softeem.ssm.pojo.Cart;

import java.util.List;
import java.util.Map;

public interface CartService {
    List<Cart> findByNameAndUid(String name, Integer uid);
    Map addToCart(Cart cart, Integer id,Double price,String name,String imgPath,Integer quantity);
    void updateCartCountById(Cart cart);
    int addCartItem(Cart cart);

    int findByUidCount(Integer uid);

    PageInfo<Cart> findAll(Integer pageNum,Integer uid);

    void updateCart(Integer quantity,Double price,Integer id);

    void deleteById(Integer id);
}
