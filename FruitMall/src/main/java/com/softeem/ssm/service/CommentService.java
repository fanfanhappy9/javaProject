package com.softeem.ssm.service;

import com.github.pagehelper.PageInfo;
import com.softeem.ssm.pojo.Comment;

public interface CommentService {
    void addComment(Comment comment);

    PageInfo<Comment> page(Integer pageNum,Integer pid);
}
