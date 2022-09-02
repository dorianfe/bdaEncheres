package fr.bda.bdaencheres.bll;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import fr.bda.bdaencheres.bo.Categorie;
import fr.bda.bdaencheres.dal.CategorieDAO;

@Service
public class GestionCategorie {

	@Autowired
	CategorieDAO dao;

	
	public List<Categorie> listerCategorie() {

	         return dao.findAll();
	    }

	   
	    public void ajouterCategorie(Categorie cat) {
	    	dao.save(cat);
	    }
	    
	    public void modifierCategorie(Categorie cat) {
	    	
	    	dao.save(cat);
	    }
	    
	    public void supprimmerCategorie(Categorie sup) {
	    	
	    	dao.delete(sup);
	    }

	    public List<Categorie> trier(String par){
	    	
	    	List<Categorie> liste = null;
	    	
	    	switch (par){
	    	
	    	case "NA" : liste = dao.findByOrderByNoCategorieAsc(); break;
	    	case "ND" : liste = dao.findByOrderByNoCategorieDesc(); break;
	    	case "LA" : liste = dao.findByOrderByLibelleAsc(); break;
	    	case "LD" : liste = dao.findByOrderByLibelleDesc();break;
	    		
	    	}
	    	
	    	return liste;
	    	
	    }




}
