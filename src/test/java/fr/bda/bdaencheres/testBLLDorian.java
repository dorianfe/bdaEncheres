package fr.bda.bdaencheres;

import fr.bda.bdaencheres.bll.GestionArticle;
import fr.bda.bdaencheres.bll.GestionUtilisateur;
import fr.bda.bdaencheres.bo.ArticleVendu;
import fr.bda.bdaencheres.bo.Categorie;
import fr.bda.bdaencheres.bo.Utilisateur;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;

import java.time.LocalDate;
import java.util.List;

@SpringBootTest
@ComponentScan({"fr.bda.bdaencheres.bll", "fr.bda.bdaencheres.dal" })
public class testBLLDorian {
    @Autowired
    private GestionUtilisateur beanGestionUtilisateur;
    @Autowired
    private GestionArticle beanGestionArticle;


    @Test
    void test() {
        Utilisateur user1 = new Utilisateur("gzetsu", "tur", "ant", "mail", "8522", "54res rere", "79000", "niort", "zbeub", 25);
        Utilisateur user2 = new Utilisateur("bella", "bella", "bella", "mail", "8522", "54res rere", "79000", "niort", "zbeub", 25);
        beanGestionUtilisateur.ajouterUtilisateur(user1);
        beanGestionUtilisateur.ajouterUtilisateur(user2);

        List<Utilisateur> utilisateurs = beanGestionUtilisateur.listerUtilisateurs();
        if (utilisateurs.size()==1) {
            System.out.println(utilisateurs);
        }
        else if (utilisateurs.size()>1) {
            for (Utilisateur user : utilisateurs) {
                System.out.println(user);
            }
        }

    }

    @Test
    void testArticle() {
        Utilisateur user3 = new Utilisateur("gzetsu", "tur", "ant", "mail", "8522", "54res rere", "79000", "niort", "zbeub", 25);
        beanGestionUtilisateur.ajouterUtilisateur(user3);


        Categorie cat = new Categorie();
        Categorie cat2 = new Categorie();
        cat.setLibelle("SF");
        cat2.setLibelle("Sport");
        ArticleVendu art = new ArticleVendu("gourde", "permet de boire", LocalDate.of(2020, 1, 8), LocalDate.of(2020, 4, 8), 10, 0, "prepa vente", cat, user3);
        ArticleVendu art2 = new ArticleVendu("bout", "boire", null, null, 10, 0, "en cours", cat2, user3);


        beanGestionArticle.ajouterArticle(art);
        beanGestionArticle.ajouterArticle(art2);

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

    }

}
