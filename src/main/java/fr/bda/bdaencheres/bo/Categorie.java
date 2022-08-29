package fr.bda.bdaencheres.bo;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Categorie {
	@Id
	private int noCategorie;
    private String libelle;
    
	public Categorie() {
		
	}

	public int getNoCategorie() {
		return noCategorie;
	}
	public void setNoCategorie(int noCategorie) {
		this.noCategorie = noCategorie;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	@Override
	public String toString() {
		return "Categorie [noCategorie=" + noCategorie + ", libelle=" + libelle + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(libelle, noCategorie);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categorie other = (Categorie) obj;
		return Objects.equals(libelle, other.libelle) && noCategorie == other.noCategorie;
	}
	
}
