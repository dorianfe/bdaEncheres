package fr.bda.bdaencheres.controllers;

import java.net.URI;
import java.util.List;
import java.util.logging.Logger;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import fr.bda.bdaencheres.bll.GestionUtilisateur;
import fr.bda.bdaencheres.bo.Utilisateur;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class UtilisateurController {
	@Autowired
	private GestionUtilisateur gestionUtilisateur;
	
	@GetMapping("/users")
	public List<Utilisateur> listerUtilisateur(){
		return (List<Utilisateur>) gestionUtilisateur.listerUtilisateurs();
	}
	
	@PostMapping(value = "/creationUtilisateur", consumes = "application/json" )
	public void ajouterUtilisateur(@RequestBody Utilisateur utilisateur) {
		if (gestionUtilisateur.verifCreationUtilisateur(utilisateur)){
			gestionUtilisateur.ajouterUtilisateur(utilisateur);
		}
		else{

		}
	}
	
	@Autowired
	HttpSession session;
	
	@PostMapping(value = "/connexion", consumes = "application/json" )
	public ResponseEntity<Utilisateur> connexionUtilisateur(@RequestBody Utilisateur utilisateur) {
		Utilisateur utilisateurConnecte = gestionUtilisateur.connexion(utilisateur);
		//System.out.println(pseudo + " et " + motDePasse);
		if (utilisateurConnecte!=null) {
			session.setAttribute("userInSession", utilisateurConnecte);
			System.out.println("connecté");
			return ResponseEntity.created(
					URI.create(String.format("/utilisateur/%s", utilisateurConnecte.getPseudo()))).body(utilisateurConnecte) ;
		}
		else {
			System.out.println("connexion fail");
			return ResponseEntity.notFound().build() ;
		}
		
	}
}
