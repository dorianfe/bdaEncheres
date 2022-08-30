package fr.bda.bdaencheres.dal;

import fr.bda.bdaencheres.bo.Enchere;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnchereDAO extends JpaRepository<Enchere, Integer> {
   
    

}
