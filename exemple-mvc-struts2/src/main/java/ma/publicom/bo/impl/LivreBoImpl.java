package ma.publicom.bo.impl;

import java.util.List;

import ma.publicom.bo.LivreBo;
import ma.publicom.dao.LivreDAO;
import ma.publicom.model.Livre;

public class LivreBoImpl implements LivreBo{

	LivreDAO livreDAO;
	
	
	public void setLivreDAO(LivreDAO livreDAO) {
		this.livreDAO = livreDAO;
	}

	public void ajoutLivre(Livre livre) {
		// TODO Auto-generated method stub
		livreDAO.ajoutLivre(livre);
		
	}

	public List<Livre> trouverLivres() {
		// TODO Auto-generated method stub
		return livreDAO.listLivres();
	}

}
