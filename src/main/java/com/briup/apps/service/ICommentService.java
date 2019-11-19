package com.briup.apps.service;

import com.briup.apps.bean.Comment;

import java.util.List;
public interface ICommentService {
    public List<Comment> selectByArticleId(long id);
}
