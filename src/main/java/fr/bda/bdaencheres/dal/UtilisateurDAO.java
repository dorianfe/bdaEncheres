package fr.bda.bdaencheres.dal;

import fr.bda.bdaencheres.bo.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UtilisateurDAO extends JpaRepository<Utilisateur, Integer> {
   List<Utilisateur> findByOrderByNomDesc();
    

}
