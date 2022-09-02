package fr.bda.bdaencheres;

import fr.bda.bdaencheres.bll.GestionArticle;
import fr.bda.bdaencheres.bll.GestionCategorie;
import fr.bda.bdaencheres.bll.GestionUtilisateur;
import fr.bda.bdaencheres.bo.ArticleVendu;
import fr.bda.bdaencheres.bo.Categorie;
import fr.bda.bdaencheres.bo.Utilisateur;
import fr.bda.bdaencheres.dal.CategorieDAO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.web.context.annotation.ApplicationScope;

import java.time.LocalDate;
import java.util.List;

@SpringBootTest
@ComponentScan({"fr.bda.bdaencheres.bll", "fr.bda.bdaencheres.dal", "fr.bda.bdaencheres.bo" })
@ContextConfiguration(classes={BdaEncheresApplication.class})

public class testBLLDorian {

    @Autowired
    private GestionArticle beanGestionArticle;
    @Autowired
    private GestionUtilisateur beanGestionUtilisateur;

    @Autowired
    private GestionCategorie beanGestionCategorie ;



    @Test
    void testArticle() {
        Utilisateur user3 = new Utilisateur("gzetsu", "tur", "ant", "mail", "8522", "54res rere", "79000", "niort", "zbeub", 25);
       // beanGestionCategorie = new GestionCategorie();
        Categorie cat = new Categorie();
        Categorie cat2 = new Categorie();
        cat.setLibelle("SF");
        cat2.setLibelle("Sport");

        ArticleVendu art = new ArticleVendu("gourde", "permet de boire", LocalDate.of(2020, 1, 8), LocalDate.of(2020, 4, 8), 10, 0, cat, user3);
        ArticleVendu art2 = new ArticleVendu("bout", "boire", LocalDate.of(2022, 1, 8), LocalDate.of(2023, 4, 8), 10, 0, cat2, user3);

        beanGestionUtilisateur.ajouterUtilisateur(user3);
        beanGestionCategorie.ajouterCategorie(cat);
        beanGestionCategorie.ajouterCategorie(cat2);
        beanGestionArticle.ajouterArticle(art);
        beanGestionArticle.ajouterArticle(art2);

        /*
        List<ArticleVendu> articles = beanGestionArticle.listerArticles();
        if (articles.size() > 1) {
            for(ArticleVendu article: articles){
                System.out.println(article);
            }
        }else {
            System.out.println(articles);
        }

        art.setDescription("blablablabla");
        beanGestionArticle.modifierArticle(art);
        List<ArticleVendu> articles2 = beanGestionArticle.listerArticles();

            System.out.println(articles2);
         */

    }

}
