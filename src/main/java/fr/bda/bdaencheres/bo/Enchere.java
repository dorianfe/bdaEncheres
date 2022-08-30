package fr.bda.bdaencheres.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDate;
@Entity
public class Enchere {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int noEnchere;
    private LocalDate dateEnchere;
    private int montantEnchere;

    @ManyToOne
    private Utilisateur acheteur;
    
    @ManyToOne
    private ArticleVendu article;
    
	/**
	 * 
	 */
	public Enchere() {
		super();
	}
	
	/**
	 * @param dateEnchere
	 * @param montantEnchere
	 * @param acheteur
	 * @param article
	 */
	public Enchere(LocalDate dateEnchere, int montantEnchere, Utilisateur acheteur, ArticleVendu article) {
		super();
		this.dateEnchere = dateEnchere;
		this.montantEnchere = montantEnchere;
		this.acheteur = acheteur;
		this.article = article;
	}



	public int getNoEnchere() {
		return noEnchere;
	}

	public void setNoEnchere(int noEnchere) {
		this.noEnchere = noEnchere;
	}

	public LocalDate getDateEnchere() {
		return dateEnchere;
	}

	public void setDateEnchere(LocalDate dateEnchere) {
		this.dateEnchere = dateEnchere;
	}

	public int getMontantEnchere() {
		return montantEnchere;
	}

	public void setMontantEnchere(int montantEnchere) {
		this.montantEnchere = montantEnchere;
	}

	public Utilisateur getAcheteur() {
		return acheteur;
	}

	public void setAcheteur(Utilisateur acheteur) {
		this.acheteur = acheteur;
	}

	public ArticleVendu getArticle() {
		return article;
	}

	public void setArticle(ArticleVendu article) {
		this.article = article;
	}


}
