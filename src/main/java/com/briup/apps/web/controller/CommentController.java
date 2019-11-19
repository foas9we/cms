package com.briup.apps.web.controller;

import com.briup.apps.bean.Comment;
import com.briup.apps.service.ICommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/comment")
public class CommentController {
    @Autowired
    private ICommentService commentService;
    @GetMapping("selectByArticleId")
    public List<Comment> selectByArticleId(long id){

        return commentService.selectByArticleId(id);
    }
}
