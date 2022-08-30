package fr.bda.bdaencheres.bll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.bda.bdaencheres.bo.Categorie;
import fr.bda.bdaencheres.dal.CategorieDAO;

@Service
public class GestionCategorie {
	
	@Autowired
	CategorieDAO dao;
	
	public List<Categorie> listerUtilisateurs() {

	        return dao.findAll();
	    }
	    
	    public void ajouterUtilisateur(Categorie cat) {
	    	dao.save(cat);
	    }
	

}
