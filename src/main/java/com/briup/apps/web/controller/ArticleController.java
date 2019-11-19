package com.briup.apps.web.controller;


import com.briup.apps.bean.Article;
import com.briup.apps.service.IArticleService;
import com.briup.apps.util.Message;
import com.briup.apps.util.MessageUtil;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;
import java.util.List;

@RestController

@RequestMapping("/article")
public class ArticleController {
    @Autowired
    private IArticleService articleService;

    @GetMapping("findAll")
    public Message findAll(){
        List<Article> articleList= articleService.findAll();
        return MessageUtil.success(articleList);
    }

    @ApiOperation(value = "保存或更新文章信息",notes="如果参数中包含id则表示保存，如果参数中不包含id则表示更新")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id",value = "编号",paramType = "form",required = false,dataType = "long"),
            @ApiImplicitParam(name = "title",value = "标题",paramType = "form",required = true),
            @ApiImplicitParam(name = "content",value = "内容",paramType = "form",required = true),
            @ApiImplicitParam(name = "source",value = "源内容",paramType = "form",required = false),
            @ApiImplicitParam(name = "categoryId",value = "所属栏目id",paramType = "form",required = true,dataType = "long"),
            @ApiImplicitParam(name = "authorId",value = "所属作者id",paramType = "form",required = false,dataType = "long")
    })
    @PostMapping("saveOrUpdate")
    public Message saveOrUpdate(Long id,
        @NotNull String title,
        @NotNull String content,
        String source,
        @NotNull long categoryId,
        Long authorId){

        Article article = new Article();
        article.setId(id);
        article.setTitle(title);
        article.setContent(content);
        article.setSource(source);
        article.setCategoryId(categoryId);
        article.setAuthorId(authorId);
        articleService.saveOrUpdate(article);
        return MessageUtil.success("更新成功");
    }

}
