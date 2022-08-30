package fr.bda.bdaencheres;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.Transactional;

import fr.bda.bdaencheres.bll.GestionUtilisateur;
import fr.bda.bdaencheres.bo.Utilisateur;

@SpringBootTest
@ComponentScan({"fr.bda.bdaencheres.bll", "fr.bda.bdaencheres.dal" })
class testBll {
	
	@Autowired
	private GestionUtilisateur beangGestionUtilisateur;
	
	
	
	@Test
	@Transactional
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

}
