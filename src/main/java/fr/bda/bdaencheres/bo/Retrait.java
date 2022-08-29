package fr.bda.bdaencheres.bo;

import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Retrait {
	
    private String rue;
    private String codePostal;
    private String ville;
    
    @OneToOne(cascade = CascadeType.ALL)
	@Id
    private ArticleVendu article;
	
    
    

	public Retrait() {
		
	}
	

	/**
	 * @param rue
	 * @param codePostal
	 * @param ville
	 * @param article
	 */
	public Retrait(String rue, String codePostal, String ville, ArticleVendu article) {
		super();
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
		this.article = article;
	}




	public String getRue() {
		return rue;
	}


	public void setRue(String rue) {
		this.rue = rue;
	}


	public String getCodePostal() {
		return codePostal;
	}


	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}


	public String getVille() {
		return ville;
	}


	public void setVille(String ville) {
		this.ville = ville;
	}


	public ArticleVendu getArticle() {
		return article;
	}


	public void setArticle(ArticleVendu article) {
		this.article = article;
	}


	@Override
	public int hashCode() {
		return Objects.hash(article, codePostal, rue, ville);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Retrait other = (Retrait) obj;
		return Objects.equals(article, other.article) && Objects.equals(codePostal, other.codePostal)
				&& Objects.equals(rue, other.rue) && Objects.equals(ville, other.ville);
	}


	@Override
	public String toString() {
		return "Retrait [rue=" + rue + ", codePostal=" + codePostal + ", ville=" + ville + ", article=" + article + "]";
	} 
    
	
    
    
    

    
}
