package com.softeem.ssm.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.softeem.ssm.mapper.CartMapper;
import com.softeem.ssm.pojo.Cart;
import com.softeem.ssm.pojo.CartExample;
import com.softeem.ssm.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class CartServiceImpl implements CartService {
    @Autowired
    private CartMapper cartMapper;
    @Override
    public List<Cart> findByNameAndUid(String name, Integer uid) {
        CartExample cartExample=new CartExample();
        CartExample.Criteria criteria = cartExample.createCriteria();
        criteria.andNameEqualTo(name);
        criteria.andUidEqualTo(uid);
        List<Cart> carts = cartMapper.selectByExample(cartExample);
        return carts;
    }

    @Override
    public Map addToCart(Cart cart, Integer id,Double price,String name,String imgPath,Integer quantity) {
        List<Cart> carts = this.findByNameAndUid(name, cart.getUid());
        if (carts.size()>0){
            Cart cartItem = carts.get(0);
            cartItem.setQuantity(cartItem.getQuantity()+quantity);
            cartItem.setTotal(BigDecimal.valueOf(cartItem.getQuantity()*price));
            this.updateCartCountById(cartItem);
        }else {
            cart.setName(name);
            cart.setPrice(BigDecimal.valueOf(price));
            cart.setImgPath(imgPath);
            cart.setTotal(BigDecimal.valueOf(quantity*price));
            this.addCartItem(cart);
        }
        Map map=new HashMap();
        Integer count = this.findByUidCount(cart.getUid());
        map.put("productCount",count);
        map.put("productName",name);
        return map;

    }

    @Override
    public void updateCartCountById(Cart cart) {
        cartMapper.updateByPrimaryKey(cart);
    }

    @Override
    public int addCartItem(Cart cart) {
        return cartMapper.insert(cart);
    }

    @Override
    public int findByUidCount(Integer uid) {
        CartExample cartExample=new CartExample();
        CartExample.Criteria criteria = cartExample.createCriteria();
        criteria.andUidEqualTo(uid);
        return cartMapper.countByExample(cartExample);
    }

    @Override
    public PageInfo<Cart> findAll(Integer pageNum,Integer uid) {
        PageHelper.startPage(pageNum , 4);
        CartExample cartExample=new CartExample();
        CartExample.Criteria criteria = cartExample.createCriteria();
        criteria.andUidEqualTo(uid);
        List<Cart> cartList = cartMapper.selectByExample(cartExample);
        PageInfo<Cart> pageInfo=new PageInfo<>(cartList);
        return pageInfo;
    }

    @Override
    public void updateCart( Integer quantity,Double total,Integer id) {
        Cart cart = cartMapper.selectByPrimaryKey(id);
        cart.setQuantity(quantity);
        cart.setTotal(BigDecimal.valueOf(total));
        cartMapper.updateByPrimaryKey(cart);
    }

    @Override
    public void deleteById(Integer id) {
        cartMapper.deleteByPrimaryKey(id);
    }
}
