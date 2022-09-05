package fr.bda.bdaencheres.controllers;

import fr.bda.bdaencheres.bll.GestionArticle;
import fr.bda.bdaencheres.bo.ArticleVendu;
import fr.bda.bdaencheres.bo.Categorie;
import fr.bda.bdaencheres.bo.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@CrossOrigin(origins = {"http://localhost:8080", "http://localhost:53928", "http://10.137.200.9:8080", "http://localhost:55753/", "http://localhost:4200/"})
public class RestControllerTest {

   /* @GetMapping("/test")
    public ResponseEntity<List<ArticleVendu>> getArticles(){

        return new ResponseEntity<List<ArticleVendu>>();
    }*/

    @Autowired
    private GestionArticle gestionArticle;
    //int noArticle, String nomArticle, String description, LocalDate dateDebutEncheres, LocalDate dateFinEncheres, int miseAPrix, int prixVente, Categorie categorie, Utilisateur vendeur
    @GetMapping(value = "/articles",produces ="application/json")
    @CrossOrigin(origins = {"http://localhost:8080", "http://localhost:53928", "http://10.137.200.9:8080", "http://localhost:55753/", "http://localhost:4200/"})
    public List<ArticleVendu> articlesList() {
        //Categorie cat = new Categorie();
        //cat.setLibelle("Categorie");
        //Utilisateur use4 = new Utilisateur("gzetsu", "tur", "ant", "mail", "8522", "54res rere", "79000", "niort", "zbeub", 25);
        //Utilisateur user3 = new Utilisateur("gzetsu", "tur", "ant", "mail", "8522", "54res rere", "79000", "niort", "zbeub", 25);
        List<ArticleVendu> listeArticles1 = gestionArticle.listerArticles();
        System.out.println("Quelqu'un s'est connecté");
        return listeArticles1;
    }

    //this gets the body of a POST HTTP request and packs it into a String, as well as deserializes it into a POJO.
    @PostMapping(value = "/ajouterArticle", produces ="application/json")
    @ResponseBody
    @CrossOrigin(origins = {"http://10.137.200.5:8080","http://localhost:8080", "http://localhost:53928", "http://10.137.200.9:8080", "http://localhost:55753/", "http://localhost:4200/"})
    public ResponseEntity<ArticleVendu> ajouterUnArticle(@RequestBody ArticleVendu article) {

        ArticleVendu articleSauvegarde = gestionArticle.ajouterArticle(article);

        return ResponseEntity.created(URI.create(String.format("/article/%s", articleSauvegarde.getNomArticle()))).body(articleSauvegarde);
    }

}

