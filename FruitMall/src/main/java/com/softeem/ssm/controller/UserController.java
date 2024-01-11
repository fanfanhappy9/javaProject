package com.softeem.ssm.controller;

import com.softeem.ssm.pojo.User;
import com.softeem.ssm.service.UserService;
import com.softeem.ssm.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/UserController")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public String login(String username , String password, HttpSession session) {
        List<User> list = userService.login(username, password);
        if (list.size()>0){
            session.setAttribute("user",list.get(0));
            return "redirect:/";
        }else {
            return "redirect:/login";
        }
    }
    @RequestMapping("/register")
    public String register(User user){
        userService.register(user);
        return "redirect:/";
    }
    @RequestMapping("/logout")
    public String logout(HttpSession session){
        session.removeAttribute("user");
        return "redirect:/login";
    }

}
