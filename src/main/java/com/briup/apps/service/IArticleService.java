package com.briup.apps.service;

import com.briup.apps.bean.Article;
import com.briup.apps.bean.extend.ArticleExtend;

import java.util.List;
public interface IArticleService {

    public List<Article> findAll();

    public void saveOrUpdate(Article article);

    /**
     * 级联查询出文章以及文章的评论
     * @return
     */
    public List<ArticleExtend> deepFindAll();
}
