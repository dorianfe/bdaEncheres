package fr.bda.bdaencheres.dal;

import fr.bda.bdaencheres.bo.Enchere;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EnchereDAO extends JpaRepository<Enchere, Integer> {
	
	List<Enchere> findByOrderByNoEnchereAsc();
	List<Enchere> findByOrderByNoEnchereDesc();
	List<Enchere> findByOrderByDateEnchereAsc();
	List<Enchere> findByOrderByDateEnchereDesc();
	List<Enchere> findByOrderByMontantEnchereAsc();
	List<Enchere> findByOrderByMontantEnchereDesc();
	List<Enchere> findByOrderByAcheteurAsc();
	List<Enchere> findByOrderByAcheteurDesc();
	List<Enchere> findByOrderByArticleAsc();
	List<Enchere> findByOrderByArticleDesc();
	
}
