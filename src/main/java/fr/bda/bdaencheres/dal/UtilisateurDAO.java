package fr.bda.bdaencheres.dal;

import fr.bda.bdaencheres.bo.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UtilisateurDAO extends JpaRepository<Utilisateur, Integer> {
  
	
	List<Utilisateur> findByOrderByNomAsc();
	List<Utilisateur> findByOrderByNomDesc();
	List<Utilisateur> findByOrderByPrenomAsc();
	List<Utilisateur> findByOrderByPrenomDesc();
	List<Utilisateur> findByOrderByNoUtilisateurAsc();
	List<Utilisateur> findByOrderByNoUtilisateurDesc();
	
	//Utilisateur connexion(String pseudo, String motDePasse);
	
	
   
    

}
