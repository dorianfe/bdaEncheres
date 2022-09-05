package fr.bda.bdaencheres;

import java.time.LocalDate;
import java.util.List;

import fr.bda.bdaencheres.bll.GestionArticle;
import fr.bda.bdaencheres.bo.ArticleVendu;
import fr.bda.bdaencheres.bo.Categorie;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;

import fr.bda.bdaencheres.bll.GestionUtilisateur;
import fr.bda.bdaencheres.bo.Utilisateur;

@SpringBootTest
@ComponentScan({"fr.bda.bdaencheres.bll", "fr.bda.bdaencheres.dal" })
class testBll {
	
	@Autowired
	private GestionUtilisateur beangGestionUtilisateur;
	@Autowired
	private GestionArticle beangGestionArticle;
	
	
	@Test
	void test() {
		Utilisateur user1 = new Utilisateur("gzetsu", "tur", "ant", "mail", "8522", "54res rere", "79000", "niort", "zbeub", 25);
		Utilisateur user2 = new Utilisateur("bella", "bella", "bella", "mail", "8522", "54res rere", "79000", "niort", "zbeub", 25);
		beangGestionUtilisateur.ajouterUtilisateur(user1);
		beangGestionUtilisateur.ajouterUtilisateur(user2);
		
		List<Utilisateur> utilisateurs = beangGestionUtilisateur.listerUtilisateurs();
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
		beangGestionUtilisateur.ajouterUtilisateur(user3);


		Categorie cat = new Categorie();
		Categorie cat2 = new Categorie();
		cat.setLibelle("SF");
		cat2.setLibelle("Sport");
		ArticleVendu art = new ArticleVendu("gourde", "permet de boire", LocalDate.of(2020, 1, 8), LocalDate.of(2020, 4, 8), 10, 0, cat, user3);
		ArticleVendu art2 = new ArticleVendu("bout", "boire", null, null, 10, 0, cat2, user3);


		beangGestionArticle.ajouterArticle(art);
		beangGestionArticle.ajouterArticle(art2);

		List<ArticleVendu> articles = beangGestionArticle.listerArticles();
		if (articles.size() > 1) {
			for(ArticleVendu article: articles){
				System.out.println(article);
			}
		}else {
			System.out.println(articles);
		}
	}
}
