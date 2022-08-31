package fr.bda.bdaencheres.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.bda.bdaencheres.bll.GestionUtilisateur;
import fr.bda.bdaencheres.bo.Utilisateur;

@RestController
@CrossOrigin(origins = "http://localhost:8090")
public class UtilisateurController {
	
	@Autowired
	private GestionUtilisateur gestionUtilisateur;
	
	@GetMapping("/users")
	public List<Utilisateur> listerUtilisateur(){
		return (List<Utilisateur>) gestionUtilisateur.listerUtilisateurs();
	}
}
