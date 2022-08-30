package fr.bda.bdaencheres.dal;

import fr.bda.bdaencheres.bo.ArticleVendu;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleVenduDAO extends JpaRepository<ArticleVendu, Integer> {
	
	List<ArticleVendu> findByOrderByPrixVenteAsc();
	List<ArticleVendu> findByOrderByPrixVenteDesc();
	List<ArticleVendu> findByOrderByEtatVenteAsc();
	List<ArticleVendu> findByOrderByEtatVenteDesc();
	List<ArticleVendu> findByOrderByDateDebutEncheresAsc();
	List<ArticleVendu> findByOrderByDateDebutEncheresDesc();
	List<ArticleVendu> findByOrderByDateFinEncheresAsc();
	List<ArticleVendu> findByOrderByDateFinEncheresDesc();
	List<ArticleVendu> findByOrderByDescriptionAsc();
	List<ArticleVendu> findByOrderByDescriptionDesc();
	
	
	
	
	
	
	

}
