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

}
