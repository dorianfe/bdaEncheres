package fr.bda.bdaencheres.bll;

import fr.bda.bdaencheres.bo.ArticleVendu;
import fr.bda.bdaencheres.bo.Utilisateur;
import fr.bda.bdaencheres.dal.ArticleVenduDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GestionArticle {

    @Autowired
    ArticleVenduDAO dao;

    public List<ArticleVendu> listeArticles() {

        return dao.findAll();
    }

    public void ajouterArticle(ArticleVendu article) {
        dao.save(article);
    }

}
