package ma.publicom.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import ma.publicom.bo.LivreBo;
import ma.publicom.model.Livre;

import com.opensymphony.xwork2.ModelDriven;

/* modelDriven
 Gestion des mod�les de persistances.*/
public class LivreAction implements ModelDriven<Livre> {

	Livre livre = new Livre();
	LivreBo livreBo;

	List<Livre> listLivres = new ArrayList<Livre>();

	public void setLivreBo(LivreBo livreBo) {
		this.livreBo = livreBo;
	}

	/*
	 * Les intercepteurs sont des filtres qui permettent de r�aliser des t�ches
	 * afin de simplifier et d�am�liorer le travail des d�veloppeurs. Dans la
	 * plupart des cas, les intercepteurs propos�s en standard par Struts sont
	 * suffisants et il est essentiel de comprendre l�int�r�t et l�apport de
	 * chacun d�eux.
	 */

	public Livre getModel() {
		// TODO Auto-generated method stub
		return livre;
	}

	public List<Livre> getListLivres() {

		return listLivres;
	}

	public String ajoutLivre() throws Exception {
		
		livre.setDatePublication(new Date());
		livreBo.ajoutLivre(livre);
		
		listLivres=null;
		listLivres = livreBo.trouverLivres();
		return "succes";
	}

	public String listLivre() {
		listLivres = livreBo.trouverLivres();
		return "succes";
	}

}
