package fr.bda.bdaencheres;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import fr.bda.bdaencheres.bo.ArticleVendu;
import fr.bda.bdaencheres.bo.Categorie;
import fr.bda.bdaencheres.bo.Utilisateur;

class testTable {

	@Test
	void testUtilisateur() {
		Utilisateur user1 = new Utilisateur("gzetsu", "tur", "ant", "mail", "8522", "54res rere", "79000", "niort", "zbeub", 25);
		assertNotNull(user1);
		Utilisateur user2 = new Utilisateur("bella", "bella", "bella", "mail", "8522", "54res rere", "79000", "niort", "zbeub", 25);
		
		System.out.println(user1.toString());
		System.out.println(user2.toString());
	}
	@Test
	void testCategorie() {
		Categorie cat = new Categorie();
		cat.setLibelle("SF");
		
		System.out.println(cat.toString());
	}
	@Test
	void testArticle() {
		Utilisateur user1 = new Utilisateur("gzetsu", "tur", "ant", "mail", "8522", "54res rere", "79000", "niort", "zbeub", 25);
		Categorie cat = new Categorie();
		cat.setLibelle("SF");
		ArticleVendu art = new ArticleVendu("gourde", "permet de boire", LocalDate.of(2020, 1, 8), LocalDate.of(2020, 4, 8), 10, 0, "prepa vente", cat, user1);
		ArticleVendu art2 = new ArticleVendu("bout", "boire", null, null, 10, 0, "en cours", cat, user1);
		System.out.println(art.toString());
		System.out.println(art2.toString());
	}

}
