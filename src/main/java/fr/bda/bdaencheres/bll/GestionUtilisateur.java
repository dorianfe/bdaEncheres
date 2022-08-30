package fr.bda.bdaencheres.bll;

import fr.bda.bdaencheres.bo.Utilisateur;
import fr.bda.bdaencheres.dal.UtilisateurDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GestionUtilisateur {

    @Autowired
    public UtilisateurDAO dao;

    public List<Utilisateur> listerUtilisateurs() {

        return dao.findAll();
    }
    
    public void ajouterUtilisateur(Utilisateur utilisateur) {
    	dao.save(utilisateur);
    }


}
