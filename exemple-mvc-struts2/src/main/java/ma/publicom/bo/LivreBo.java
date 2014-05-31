package ma.publicom.bo;

import java.util.List;

import ma.publicom.model.Livre;

public interface LivreBo {

	void ajoutLivre(Livre livre);
	
	List<Livre> trouverLivres();
}
