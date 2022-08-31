package fr.bda.bdaencheres.controllers;

import fr.bda.bdaencheres.bo.ArticleVendu;
import fr.bda.bdaencheres.bo.Categorie;
import fr.bda.bdaencheres.bo.Utilisateur;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
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

    @GetMapping(value = "/articles",produces ="application/json")
    public ArticleVendu articlesList(@RequestParam(value = "nameArticle", defaultValue = "bouteille") String nomArticle) {
        Categorie cat = new Categorie();
        cat.setLibelle("Categorie");
        Utilisateur user3 = new Utilisateur("gzetsu", "tur", "ant", "mail", "8522", "54res rere", "79000", "niort", "zbeub", 25);

        return new ArticleVendu((int)counter.incrementAndGet(), String.format(template, nomArticle), "description", LocalDate.of(2020, 1, 8),LocalDate.of(2020, 4, 8),10, 0, "prepa vente", cat, user3);
    }
    @GetMapping(value = "/articles",produces ="application/rtf")
    public ArticleVendu articlesList1(@RequestParam(value = "nameArticle", defaultValue = "bouteille") String nomArticle) {
        Categorie cat = new Categorie();
        cat.setLibelle("Categorie");
        Utilisateur user3 = new Utilisateur("gzetsu", "tur", "ant", "mail", "8522", "54res rere", "79000", "niort", "zbeub", 25);

        return new ArticleVendu((int)counter.incrementAndGet(), String.format(template, nomArticle), "description", LocalDate.of(2020, 1, 8),LocalDate.of(2020, 4, 8),10, 0, "prepa vente", cat, user3);
    }
}

