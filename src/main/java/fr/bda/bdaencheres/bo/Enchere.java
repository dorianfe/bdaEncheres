package fr.bda.bdaencheres.bo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDate;
@Entity
public class Enchere {

    private LocalDate dateEnchere;
    private int montantEnchere;

    @Id
    @ManyToOne
    private Utilisateur acheteur;
    @Id
    @ManyToOne
    private ArticleVendu article;


}
