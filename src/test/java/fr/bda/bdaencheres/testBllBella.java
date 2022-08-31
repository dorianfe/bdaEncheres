package fr.bda.bdaencheres;

import java.time.LocalDate;
import java.util.List;

import fr.bda.bdaencheres.bll.GestionArticle;
import fr.bda.bdaencheres.bll.GestionCategorie;
import fr.bda.bdaencheres.bo.ArticleVendu;
import fr.bda.bdaencheres.bo.Categorie;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.Transactional;

import fr.bda.bdaencheres.bll.GestionUtilisateur;
import fr.bda.bdaencheres.bo.Utilisateur;

@SpringBootTest
@ComponentScan({ "fr.bda.bdaencheres.bll", "fr.bda.bdaencheres.dal" })
class testBllBella {

	
	 @Autowired private GestionUtilisateur beangGestionUtilisateur;
	 
	@Autowired
	private GestionArticle beangGestionArticle;

	@Autowired
	private GestionCategorie beanGestionCategorie;

	@Test
	public void testCategorie() {

		Categorie cat1 = new Categorie();
		Categorie cat2 = new Categorie();
		Categorie cat3 = new Categorie();
		
		cat1.setLibelle("information");
		cat2.setLibelle("vetement");
		cat3.setLibelle("Sport&Loisir");


		Utilisateur user1 = new Utilisateur("gzetsu", "tur", "ant", "mail", "8522", "54res rere", "79000", "niort",
				"zbeub", 25);

		ArticleVendu art = new ArticleVendu("gourde", "permet de boire", LocalDate.of(2020, 1, 8),
				LocalDate.of(2020, 4, 8), 10, 0, "prepa vente", cat1, user1);
		ArticleVendu art2 = new ArticleVendu("bout", "boire", null, null, 10, 0, "en cours", cat1, user1);

		beangGestionArticle.ajouterArticle(art);
		beangGestionArticle.ajouterArticle(art2);

		
		beanGestionCategorie.ajouterCategorie(cat1);
		beanGestionCategorie.ajouterCategorie(cat2);
		beanGestionCategorie.ajouterCategorie(cat3);

		List<Categorie> categories = beanGestionCategorie.listerCategorie();

		if (categories.size() > 1) {

			for (Categorie categorie : categories) {
				System.out.println(
						"*********************************************************************************************************/n");

				System.out.println("List d'categorie ajouter");

				System.out.println(categorie);
			}

		}
		if (categories.size() == 1) {

			System.out.println(
					"*********************************************************************************************************/n");

			System.out.println("categorie ajouter si il existe un dans la liste");

			System.out.println(categories);

		}

		List<ArticleVendu> artVendus = beangGestionArticle.listerArticles();

		if (artVendus.size() > 1) {
			for (ArticleVendu artVendu : artVendus) {

				System.out.println("*********************************************************************************************************/n");

				System.out.println("Liste d'article  ajouter ");

				System.out.println(artVendu);

			}
		}

		if (artVendus.size() == 1) {

			System.out.println(
					"*********************************************************************************************************/n");

			System.out.println("article ajouter si il existe un dans la liste");

			System.out.println(artVendus);
		}

	}
}
