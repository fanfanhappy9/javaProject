package com.softeem.ssm.controller;

import com.github.pagehelper.PageInfo;
import com.softeem.ssm.pojo.Comment;
import com.softeem.ssm.pojo.User;
import com.softeem.ssm.service.CommentService;
import com.softeem.ssm.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Date;

@Controller
@RequestMapping("/CommentController")
public class CommentController {
    @Autowired
    private CommentService commentService;

    @RequestMapping("/addComment")
    @ResponseBody
    public Result addComment(@RequestBody Comment comment,HttpSession session){
        User user = (User)session.getAttribute("user");
        comment.setCreateTime(new Date());
        comment.setUid(user.getId());
        commentService.addComment(comment);
        return new Result(true,"添加成功");
    }

    @RequestMapping("/findAll")
    @ResponseBody
    public Result findAll(Integer pageNum,Integer pid){
        PageInfo<Comment> pageInfo = commentService.page(pageNum,pid);
        return new Result(true,"查询成功",pageInfo);
    }
}
