package org.gobeshona.article_test;

import org.gobeshona.articles.*;
import org.gobeshona.util.DateUtil;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
///**
// *
// * @author Sajib
// */

@RunWith(SpringRunner.class)
@SpringBootTest
public class Test_ArticleDao {

    @Autowired
    Article_Dao_I articlePersistence_I;
//
//    

    public Test_ArticleDao() {
    }
//    

    /**
     * passing date : 22-12-2019 Sun
     */
    @Test
    public void test_post_Article() {
//        Articles articles = new Articles(15,"articleSubject", "articleContent", "articleType");
        Articles articles = new Articles("articleSubject", "articleContent", "articleType", 2, DateUtil.getDate().toString());
        articlePersistence_I.post_Article(articles);
    }
//    

    /**
     * @see passed date : 22-12-2019 Sun
     */
//    @Test
    public void test_delete_Article() {
        Integer articleId = 6;
        articlePersistence_I.delete_Article(articleId);
    }
//    

    @Test
    public void test_edit_Article() {
        Articles articles = new Articles("articleSubject", "articleContent", "articleType", 2, DateUtil.getDate().toString());
//        Articles articles = new Articles();
        articles.setArticleId(new Integer(6));
        articles.setArticleSubject("Test");
        articles.setCategory("test, Lie!");
//        articles.;
        articlePersistence_I.edit_Article(articles);

    }
//
//
}//Test_ArticlePersistence
