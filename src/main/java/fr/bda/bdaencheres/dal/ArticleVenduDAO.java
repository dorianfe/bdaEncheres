package fr.bda.bdaencheres.dal;

import fr.bda.bdaencheres.bo.ArticleVendu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleVenduDAO extends JpaRepository<ArticleVendu, Integer> {

}
