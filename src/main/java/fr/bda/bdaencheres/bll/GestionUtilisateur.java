package fr.bda.bdaencheres.bll;

import fr.bda.bdaencheres.bo.Utilisateur;
import fr.bda.bdaencheres.dal.UtilisateurDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GestionUtilisateur {

    @Autowired
    private UtilisateurDAO dao;

    
    
    public void ajouterUtilisateur(Utilisateur utilisateur) {
    	dao.save(utilisateur);
    }
    
    public void supprimerUtilisateur(Utilisateur utilisateur) {
    	dao.delete(utilisateur);
    }
    
    public void modifierUtilisateur(Utilisateur utilisateur) {
    	
    }
    
    public List<Utilisateur> listerUtilisateurs() {

        return dao.findAll();
    }
    
    public Utilisateur chercherUtilisateurParNoUtilisateur(int noUtilisateur) {
    	return dao.getOne(noUtilisateur);
    }
    
    public List<Utilisateur> listerUtilisateursParNomAsc() {

        return dao.findByOrderByNomAsc();
    } 
    public List<Utilisateur> listerUtilisateursParNomDesc() {

        return dao.findByOrderByNomDesc();
    }
    
    public List<Utilisateur> listerUtilisateursParPrenomAsc() {

        return dao.findByOrderByPrenomAsc();
    }
    public List<Utilisateur> listerUtilisateursParPrenomDesc() {

        return dao.findByOrderByPrenomDesc();
    }
    
    public List<Utilisateur> listerUtilisateursParNoUtilisateurAsc() {

        return dao.findByOrderByNoUtilisateurAsc();
    }
    public List<Utilisateur> listerUtilisateursParNoUtilisateurDesc() {

        return dao.findByOrderByNoUtilisateurDesc();
    }


}
