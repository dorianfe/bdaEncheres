package fr.bda.bdaencheres.controllers;

import fr.bda.bdaencheres.bll.GestionArticle;
import fr.bda.bdaencheres.bo.ArticleVendu;
import fr.bda.bdaencheres.bo.Categorie;
import fr.bda.bdaencheres.bo.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class RestControllerTest {

   /* @GetMapping("/test")
    public ResponseEntity<List<ArticleVendu>> getArticles(){

        return new ResponseEntity<List<ArticleVendu>>();
    }*/

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    @Autowired
    private GestionArticle gestionArticle;
//int noArticle, String nomArticle, String description, LocalDate dateDebutEncheres, LocalDate dateFinEncheres, int miseAPrix, int prixVente, Categorie categorie, Utilisateur vendeur
    @GetMapping(value = "/articles",produces ="application/json")
    @CrossOrigin(origins = "http://10.137.200.9/")
    public List<ArticleVendu> articlesList() {
        Categorie cat = new Categorie();
        cat.setLibelle("Categorie");
        Utilisateur use4 = new Utilisateur("gzetsu", "tur", "ant", "mail", "8522", "54res rere", "79000", "niort", "zbeub", 25);
        Utilisateur user3 = new Utilisateur("gzetsu", "tur", "ant", "mail", "8522", "54res rere", "79000", "niort", "zbeub", 25);
        List<ArticleVendu> listeArticles1 = gestionArticle.listerArticles();
        System.out.println("Quelqu'un s'est connecté");
        return listeArticles1;//new ArrayList<>();//gestionArticle.listerArticles();
    }
    //@GetMapping(value = "/articles",produces ="application/rtf")
    @CrossOrigin(origins = "http://localhost:4200/")
    public ArticleVendu articlesList1(@RequestParam(value = "nameArticle", defaultValue = "bouteille") String nomArticle) {
        Categorie cat1 = new Categorie();
        cat1.setLibelle("Categorie");
        Utilisateur user3 = new Utilisateur("gzetsu", "tur", "ant", "mail", "8522", "54res rere", "79000", "niort", "zbeub", 25);

        return new ArticleVendu((int)counter.incrementAndGet(), String.format(template, nomArticle), "description", LocalDate.of(2020, 1, 8),LocalDate.of(2020, 4, 8),10, 0, cat1, user3);
    }

    @GetMapping(value = "/article", produces = "application/json")
    public ArticleVendu articleVenduById(){

        return null;
    }
}

