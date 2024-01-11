package com.softeem.ssm.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.softeem.ssm.mapper.CommentMapper;
import com.softeem.ssm.pojo.Comment;
import com.softeem.ssm.pojo.CommentExample;
import com.softeem.ssm.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentMapper commentMapper;
    @Override
    public void addComment(Comment comment) {
        commentMapper.insert(comment);
    }

    @Override
    public PageInfo<Comment> page(Integer pageNum,Integer pid) {
        PageHelper.startPage(pageNum , 4);
        CommentExample commentExample=new CommentExample();
        CommentExample.Criteria criteria = commentExample.createCriteria();
        criteria.andPidEqualTo(pid);
        List<Comment> commentList = commentMapper.selectByExample(commentExample);
        PageInfo<Comment> pageInfo=new PageInfo<>(commentList);
        return pageInfo;
    }
}
