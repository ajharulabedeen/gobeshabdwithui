package org.gobeshona.articles;

import org.gobeshona.articles.Articles;

/**
 *
 * @author abedeen
 */
public interface Article_Dao_I 
{
    public Articles post_Article(Articles articles);
    public void delete_Article(Integer articleId);
    public void edit_Article(Articles articles);    
}//ArticlePersistence_I
