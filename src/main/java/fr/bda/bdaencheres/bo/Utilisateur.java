package fr.bda.bdaencheres.bo;

import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Utilisateur {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int noUtilisateur;
    private String pseudo;
    private String nom;
    private String prenom;
    private String email;
    private String telephone;
    private String rue;
    private String codePostal;
    private String ville;
    private String motDePasse;
    private int credit;
    private boolean administrateur = false;
    
    
    // liste des articles mis en vente par l'utilisateur
    @OneToMany //(cascade = CascadeType.REMOVE)
    private List<ArticleVendu> listeArticles;
    
    // liste des encheres faites par l'utilisateur
    @OneToMany
    private List<Enchere> listeEncheres;
    
    public Utilisateur() {

	}
    
	

	/**
	 * @param noUtilisateur
	 * @param pseudo
	 * @param nom
	 * @param prenom
	 * @param email
	 * @param telephone
	 * @param rue
	 * @param codePostal
	 * @param ville
	 * @param motDePasse
	 * @param credit
	 */
	public Utilisateur(int noUtilisateur, String pseudo, String nom, String prenom, String email, String telephone,
			String rue, String codePostal, String ville, String motDePasse, int credit) {
		super();
		this.noUtilisateur = noUtilisateur;
		this.pseudo = pseudo;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.telephone = telephone;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
		this.motDePasse = motDePasse;
		this.credit = credit;

	}



	/**
	 * @param pseudo
	 * @param nom
	 * @param prenom
	 * @param email
	 * @param telephone
	 * @param rue
	 * @param codePostal
	 * @param ville
	 * @param motDePasse
	 * @param credit
	 */
	public Utilisateur(String pseudo, String nom, String prenom, String email, String telephone,
			String rue, String codePostal, String ville, String motDePasse, int credit) {
		
		this.pseudo = pseudo;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.telephone = telephone;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
		this.motDePasse = motDePasse;
		this.credit = credit;
	}
	
	

	public int getNoUtilisateur() {
		return noUtilisateur;
	}
	public void setNoUtilisateur(int noUtilisateur) {
		this.noUtilisateur = noUtilisateur;
	}
	
	public String getPseudo() {
		return pseudo;
	}
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
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
	
	public String getMotDePasse() {
		return motDePasse;
	}
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}
	
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	
	public boolean isAdministrateur() {
		return administrateur;
	}
	public void setAdministrateur(boolean administrateur) {
		this.administrateur = administrateur;
	}
	
	public List<ArticleVendu> getListeArticles() {
		return listeArticles;
	}
	public void setListeArticles(List<ArticleVendu> listeArticles) {
		this.listeArticles = listeArticles;
	}

	public List<Enchere> getListeEncheres() {
		return listeEncheres;
	}
	public void setListeEncheres(List<Enchere> listeEncheres) {
		this.listeEncheres = listeEncheres;
	}



	@Override
	public String toString() {
		return "Utilisateur [noUtilisateur=" + noUtilisateur + ", pseudo=" + pseudo + ", nom=" + nom + ", prenom="
				+ prenom + ", email=" + email + ", telephone=" + telephone + ", rue=" + rue + ", codePostal="
				+ codePostal + ", ville=" + ville + ", motDePasse=" + motDePasse + ", credit=" + credit
				+ ", administrateur=" + administrateur + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(administrateur, codePostal, credit, email, motDePasse, noUtilisateur, nom, prenom, pseudo,
				rue, telephone, ville);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Utilisateur other = (Utilisateur) obj;
		return administrateur == other.administrateur && Objects.equals(codePostal, other.codePostal)
				&& credit == other.credit && Objects.equals(email, other.email)
				&& Objects.equals(motDePasse, other.motDePasse) && noUtilisateur == other.noUtilisateur
				&& Objects.equals(nom, other.nom) && Objects.equals(prenom, other.prenom)
				&& Objects.equals(pseudo, other.pseudo) && Objects.equals(rue, other.rue)
				&& Objects.equals(telephone, other.telephone) && Objects.equals(ville, other.ville);
	}

    
    

}