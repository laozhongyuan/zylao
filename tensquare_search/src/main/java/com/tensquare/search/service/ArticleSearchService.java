package com.tensquare.search.service;

import com.tensquare.search.dao.ArticleSearchDao;
import com.tensquare.search.pojo.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ArticleSearchService {

    @Autowired
    private ArticleSearchDao articleSearchDao;
    public void add(Article article){
        articleSearchDao.save(article);
    }

    public Page<Article> findByTitleOrContentLike(String keyword,int page,int size){
        PageRequest pageRequest = PageRequest.of(page - 1, size);
        return articleSearchDao.findByTitleOrContentLike(keyword,keyword, pageRequest);

           }
}
