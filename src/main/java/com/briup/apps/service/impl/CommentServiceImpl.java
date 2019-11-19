package com.briup.apps.service.impl;


import com.briup.apps.bean.Comment;
import com.briup.apps.dao.extend.ICommentExtendMapper;
import com.briup.apps.service.ICommentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class CommentServiceImpl implements ICommentService {
   @Resource
    ICommentExtendMapper commentExtendMapper;

    @Override
    public List<Comment> selectByArticleId(long id) {
        return commentExtendMapper.selectByArticleId(id);
    }
}
