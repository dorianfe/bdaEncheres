package fr.bda.bdaencheres.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.bda.bdaencheres.bo.Categorie;

public interface CategorieDAO extends JpaRepository<Categorie, Integer> {

}
