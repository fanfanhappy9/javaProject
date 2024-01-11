package com.softeem.ssm.controller;

import com.github.pagehelper.PageInfo;
import com.softeem.ssm.pojo.Cart;
import com.softeem.ssm.pojo.User;
import com.softeem.ssm.service.CartService;
import com.softeem.ssm.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
@RequestMapping("/CartController")
public class CartController {
    @Autowired
    private CartService cartService;

    @RequestMapping("/addToCart")
    @ResponseBody
    public Result addToCart(Double price, String name, String imgPath,Integer quantity, HttpSession session){
        User user =(User) session.getAttribute("user");
        Integer id = user.getId();
        Cart cart = new Cart();
        cart.setUid(id);
        cart.setQuantity(quantity);
        Map map = cartService.addToCart(cart, id, price, name, imgPath,quantity);
        return new Result(true,"添加成功",map);
    }

    @RequestMapping("/findAll")
    @ResponseBody
    public Result findAll(Integer pageNum, HttpSession session){
        User user =(User) session.getAttribute("user");
        Integer uid = user.getId();
        PageInfo<Cart> pageInfo = cartService.findAll(pageNum,uid);
        return new Result(true,"查询成功",pageInfo);
    }

    @RequestMapping("/updateCart")
    @ResponseBody
    public Result updateCart(Integer quantity,Double total,Integer id){
        cartService.updateCart(quantity,total,id);
        return new Result(true,"修改成功");
    }
    @RequestMapping("/deleteById")
    @ResponseBody
    public Result deleteById(Integer id){
        cartService.deleteById(id);
        return new Result(true,"删除成功");
    }

}
