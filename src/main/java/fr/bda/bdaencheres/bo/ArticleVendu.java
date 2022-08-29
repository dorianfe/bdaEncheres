package fr.bda.bdaencheres.bo;

import java.util.Objects;

public class ArticleVendu {

    private String noArticle;
    private String nomArticle;
    private String description;
    private int dateDebutEncheres;
    private int dateFinEncheres;
    private int miseAPrix;
    private int prixVente;
    private int etatVente;

    private Retrait retrait;
    private Categorie categorie;
    private Utilisateur utilisateur;

    public ArticleVendu() {
    }

    public String getNoArticle() {
        return noArticle;
    }

    public void setNoArticle(String noArticle) {
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

    public int getDateDebutEncheres() {
        return dateDebutEncheres;
    }

    public void setDateDebutEncheres(int dateDebutEncheres) {
        this.dateDebutEncheres = dateDebutEncheres;
    }

    public int getDateFinEncheres() {
        return dateFinEncheres;
    }

    public void setDateFinEncheres(int dateFinEncheres) {
        this.dateFinEncheres = dateFinEncheres;
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

    public int getEtatVente() {
        return etatVente;
    }

    public void setEtatVente(int etatVente) {
        this.etatVente = etatVente;
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
        return getDateDebutEncheres() == that.getDateDebutEncheres() && getDateFinEncheres() == that.getDateFinEncheres() && getMiseAPrix() == that.getMiseAPrix() && getPrixVente() == that.getPrixVente() && getEtatVente() == that.getEtatVente() && getNoArticle().equals(that.getNoArticle()) && getNomArticle().equals(that.getNomArticle()) && getDescription().equals(that.getDescription());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNoArticle(), getNomArticle(), getDescription(), getDateDebutEncheres(), getDateFinEncheres(), getMiseAPrix(), getPrixVente(), getEtatVente());
    }
}
