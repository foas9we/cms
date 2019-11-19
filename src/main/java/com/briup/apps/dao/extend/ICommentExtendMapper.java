package com.briup.apps.dao.extend;

import com.briup.apps.bean.Comment;

import java.util.List;

public interface ICommentExtendMapper {
    /**
     * 通过文章的id查找文章评论信息
     * @param id
     * @return
     */
    public List<Comment> selectByArticleId(long id);
}
