package fr.bda.bdaencheres.bo;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;
 @Entity
public class ArticleVendu {

     @Id
     @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int noArticle;
    private String nomArticle;

    @Lob
    private String description;
    private LocalDate dateDebutEncheres;
    private LocalDate dateFinEncheres;
    private int miseAPrix;
    private int prixVente;
    private String etatVente;



    @ManyToOne
    private Categorie categorie;

    @ManyToOne
    private Utilisateur vendeur;

     public ArticleVendu() {
    }

     public ArticleVendu(String nomArticle, String description, LocalDate dateDebutEncheres, LocalDate dateFinEncheres, int miseAPrix, int prixVente, String etatVente, Categorie categorie, Utilisateur vendeur) {
         this.nomArticle = nomArticle;
         this.description = description;
         this.dateDebutEncheres = dateDebutEncheres;
         this.dateFinEncheres = dateFinEncheres;
         this.miseAPrix = miseAPrix;
         this.prixVente = prixVente;
         this.etatVente = etatVente;
         this.categorie = categorie;
         this.vendeur = vendeur;
     }

     public ArticleVendu(int noArticle, String nomArticle, String description, LocalDate dateDebutEncheres, LocalDate dateFinEncheres, int miseAPrix, int prixVente, String etatVente, Categorie categorie, Utilisateur vendeur) {
         this.noArticle = noArticle;
         this.nomArticle = nomArticle;
         this.description = description;
         this.dateDebutEncheres = dateDebutEncheres;
         this.dateFinEncheres = dateFinEncheres;
         this.miseAPrix = miseAPrix;
         this.prixVente = prixVente;
         this.etatVente = etatVente;
         this.categorie = categorie;
         this.vendeur = vendeur;
     }

     public int getNoArticle() {
        return noArticle;
    }

    public void setNoArticle(int noArticle) {
        this.noArticle = noArticle;
    }

    public String getNomArticle() {
        return nomArticle;
    }

    public void setNomArticle(String nomArticle) {
        this.nomArticle = nomArticle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


     public LocalDate getDateDebutEncheres() {
         return dateDebutEncheres;
     }

     public void setDateDebutEncheres(LocalDate dateDebutEncheres) {
         this.dateDebutEncheres = dateDebutEncheres;
     }

     public LocalDate getDateFinEncheres() {
         return dateFinEncheres;
     }

     public void setDateFinEncheres(LocalDate dateFinEncheres) {
         this.dateFinEncheres = dateFinEncheres;
     }

     public String getEtatVente() {
         return etatVente;
     }

     public void setEtatVente(String etatVente) {
         this.etatVente = etatVente;
     }

     public Categorie getCategorie() {
         return categorie;
     }

     public void setCategorie(Categorie categorie) {
         this.categorie = categorie;
     }

     public Utilisateur getVendeur() {
         return vendeur;
     }

     public void setVendeur(Utilisateur utilisateur) {
         this.vendeur = utilisateur;
     }

     public int getMiseAPrix() {
        return miseAPrix;
    }

    public void setMiseAPrix(int miseAPrix) {
        this.miseAPrix = miseAPrix;
    }

    public int getPrixVente() {
        return prixVente;
    }

    public void setPrixVente(int prixVente) {
        this.prixVente = prixVente;
    }

    @Override
    public String toString() {
        return "ArticleVendu{" +
                "noArticle='" + noArticle + '\'' +
                ", nomArticle='" + nomArticle + '\'' +
                ", description='" + description + '\'' +
                ", dateDebutEncheres=" + dateDebutEncheres +
                ", dateFinEncheres=" + dateFinEncheres +
                ", miseAPrix=" + miseAPrix +
                ", prixVente=" + prixVente +
                ", etatVente=" + etatVente +
                '}';
    }

     @Override
     public boolean equals(Object o) {
         if (this == o) return true;
         if (!(o instanceof ArticleVendu)) return false;
         ArticleVendu that = (ArticleVendu) o;
         return getNoArticle() == that.getNoArticle() && getDateDebutEncheres() == that.getDateDebutEncheres() && getDateFinEncheres() == that.getDateFinEncheres() && getMiseAPrix() == that.getMiseAPrix() && getPrixVente() == that.getPrixVente() && getEtatVente() == that.getEtatVente() && getNomArticle().equals(that.getNomArticle()) && getDescription().equals(that.getDescription()) && categorie.equals(that.categorie) && vendeur.equals(that.vendeur);
     }

     @Override
     public int hashCode() {
         return Objects.hash(getNoArticle(), getNomArticle(), getDescription(), getDateDebutEncheres(), getDateFinEncheres(), getMiseAPrix(), getPrixVente(), getEtatVente(), categorie, vendeur);
     }
 }
