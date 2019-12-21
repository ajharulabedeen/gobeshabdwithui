package org.gobeshona.articles;

import java.util.List;

public interface Services_Articles_CRUD_I
    {
//        String services_PostArticle(Articles_Insert articlesToPost);
        Articles_Insert services_PostArticle(Articles_Insert articlesToPost);
        String services_ArticleDelete(Articles articlesToDelete);
        String services_ArticlesUpdate(Articles articlesToUpdate);
        List<Articles_Concise_View> services_ReadAllArticlesWithOutContent();
        List services_ReadSpecificArticle(int articleID);
    }
