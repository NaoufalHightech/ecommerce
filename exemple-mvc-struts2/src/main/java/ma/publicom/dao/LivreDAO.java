package ma.publicom.dao;

import java.util.List;

import ma.publicom.model.Livre;

public interface LivreDAO {

	void ajoutLivre( Livre livre);
	List<Livre> listLivres();
}
