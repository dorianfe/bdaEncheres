package fr.bda.bdaencheres.dal;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.bda.bdaencheres.bo.Categorie;


public interface CategorieDAO extends JpaRepository<Categorie, Integer> {

	List<Categorie> findByOrderByNoCategorieAsc();
	List<Categorie> findByOrderByNoCategorieDesc();
	List<Categorie> findByOrderByLibelleAsc();
	List<Categorie> findByOrderByLibelleDesc();


}

