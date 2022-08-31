package fr.bda.bdaencheres;

import fr.bda.bdaencheres.bll.GestionCategorie;
import fr.bda.bdaencheres.bo.Categorie;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;

@SpringBootTest
@ComponentScan({ "fr.bda.bdaencheres.bll", "fr.bda.bdaencheres.dal" })
class testBllBella {

	/*
	 * @Autowired private GestionUtilisateur beangGestionUtilisateur;
	 * 
	 * @Autowired private GestionArticle beangGestionArticle;
	 */

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

		beanGestionCategorie.ajouterCategorie(cat1);
		beanGestionCategorie.ajouterCategorie(cat2);
		beanGestionCategorie.ajouterCategorie(cat3);

		//List<Categorie> categories = beanGestionCategorie.listerCategorie();
		
		List<Categorie> categories = beanGestionCategorie.trier("LD");

		
			System.out.println("oupss");
			for (Categorie categorie : categories) {
				
				//beanGestionCategorie.supprimmerCategorie(categorie);
				// System.out.println("**************************************************************************");
				// System.out.println("aficher la liste des categories");
			
				System.out.println(categorie.toString());
			}

		

		/*if (categories.size() > 1) {

			for (Categorie categorie : categories) {

				// beanGestionCategorie.supprimmerCategorie(categorie);
				//cat1.setLibelle("Sport Amateur");
				//beanGestionCategorie.modifierCategorie(cat1);
				//beanGestionCategorie.trier("LD");

				// System.out.println("**************************************************************************");
				// System.out.println("aficher la liste des categories aprés suppression");

				System.out.println(categorie.toString());
			}

		}*/
		
		
		
		
	}
}
