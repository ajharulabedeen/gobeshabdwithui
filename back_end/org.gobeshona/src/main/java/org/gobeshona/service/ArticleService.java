package org.gobeshona.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.gobeshona.dao.IArticleDAO;
import org.gobeshona.entity.Article;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Service
@Component
@Qualifier("realService")
public class ArticleService implements IArticleService
    {

    @Autowired
    private IArticleDAO articleDAO;

    @Override
    public Article getArticleById(int articleId)
        {
        Article obj = articleDAO.getArticleById(articleId);
        return obj;
        }

    @Override
    public List<Article> getAllArticles()
        {
        System.out.println("Class Name: "+ getClass().toString()+".........\n\n");
        return articleDAO.getAllArticles();
        }

    @Override
    public synchronized boolean addArticle(Article article)
        {
        if (articleDAO.articleExists(article.getTitle(), article.getCategory()))
          {
            return false;
          } else
          {
            articleDAO.addArticle(article);
            return true;
          }
        }

    @Override
    public void updateArticle(Article article)
        {
        articleDAO.updateArticle(article);
        }

    @Override
    public void deleteArticle(int articleId)
        {
        articleDAO.deleteArticle(articleId);
        }
    }