package fr.bda.bdaencheres.dal;

import fr.bda.bdaencheres.bo.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurDAO extends JpaRepository<Utilisateur, Integer> {

}
