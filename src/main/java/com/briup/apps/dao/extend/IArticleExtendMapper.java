package com.briup.apps.dao.extend;

import com.briup.apps.bean.extend.ArticleExtend;

import java.util.List;

public interface IArticleExtendMapper {
    /**
     * 级联查询出所有文章相关的信息
     * @return
     */
   public List<ArticleExtend> selectAll();
    /**
     * 通过id级联查询出所有文章相关的信息
     * @return
     */
//    public ArticleExtend selectById(int id);

    /**
     * 对文章进行更新或者插入操作
     */
//    public void saveOrUpdte(Article article);

}
