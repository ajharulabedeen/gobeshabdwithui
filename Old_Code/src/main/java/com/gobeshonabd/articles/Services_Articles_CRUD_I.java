package com.gobeshonabd.articles;

import com.gobeshonabd.pojos.Articles;
import com.gobeshonabd.pojos.Articles_Concise_View;
import com.gobeshonabd.pojos.Articles_Insert;
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
