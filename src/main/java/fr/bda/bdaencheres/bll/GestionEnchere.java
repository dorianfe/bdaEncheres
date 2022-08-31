package fr.bda.bdaencheres.bll;

import fr.bda.bdaencheres.bo.Enchere;
import fr.bda.bdaencheres.dal.EnchereDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GestionEnchere {

    @Autowired
    EnchereDAO dao;

    public List<Enchere> listeEncheres() {

        return dao.findAll();
    }

    public void ajouterEnchere(Enchere enchere) {
        dao.save(enchere);
    }
    public void modifierEnchere(Enchere modif) {
    	
    	dao.save(modif);
    }
    
    public void supprimmerEnchere(Enchere sup) {
    	
    	dao.delete(sup);
    }
    
    public List<Enchere> trier(String par){
    	
    	List<Enchere> liste = null;
    	
    	switch (par){
    	
    	case "NA" : liste = dao.findByOrderByNoEnchereAsc(); break;
    	case "ND" : liste = dao.findByOrderByNoEnchereDesc(); break;
    	case "DA" : liste = dao.findByOrderByDateEnchereAsc(); break;
    	case "DD" : liste = dao.findByOrderByDateEnchereDesc();break;
    	case "MA" : liste = dao.findByOrderByMontantEnchereAsc(); break;
    	case "MD" : liste = dao.findByOrderByMontantEnchereDesc(); break;
    	case "AA1" : liste = dao.findByOrderByAcheteurAsc(); break;
    	case "AD1" : liste = dao.findByOrderByAcheteurDesc();break;
    	case "AA" : liste = dao.findByOrderByArticleAsc(); break;
    	case "AD" : liste = dao.findByOrderByArticleDesc();break;
    	
    	
 
    		
    	}
    	
    	
    	
    	return liste;
    	
    }


}
