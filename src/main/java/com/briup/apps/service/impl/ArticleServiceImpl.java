package com.briup.apps.service.impl;


import com.briup.apps.bean.Article;
import com.briup.apps.bean.ArticleExample;
import com.briup.apps.bean.extend.ArticleExtend;
import com.briup.apps.dao.ArticleMapper;
import com.briup.apps.dao.extend.IArticleExtendMapper;
import com.briup.apps.service.IArticleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class ArticleServiceImpl implements IArticleService {
   @Resource
    private ArticleMapper articleMapper;
    @Resource
    private IArticleExtendMapper articleExtendMapper;

    @Override
    public List<Article> findAll() {
        return articleMapper.selectByExample(new ArticleExample());
    }

    @Override
    public void saveOrUpdate(Article article) {
        if(article.getId()!=null){
            articleMapper.updateByPrimaryKey(article);
        }else{
            //初始化
            //标题不能重复
            ArticleExample example = new ArticleExample();
            example.createCriteria().andTitleEqualTo(article.getTitle());
            List<Article> Articles = articleMapper.selectByExample(example);
            article.setStatus(ArticleExtend.STATUS_UNCHECK);
            article.setThumpDown(0l);
            article.setThumpUp(0l);
            articleMapper.insert(article);

        }
    }

    @Override
    public List<ArticleExtend> deepFindAll() {
        return articleExtendMapper.selectAll();
    }
}
