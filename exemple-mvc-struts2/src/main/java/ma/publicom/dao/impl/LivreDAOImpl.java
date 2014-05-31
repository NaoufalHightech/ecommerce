package ma.publicom.dao.impl;

import java.util.Date;
import java.util.List;

import ma.publicom.dao.LivreDAO;
import ma.publicom.model.Livre;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/*HibernateTemplate et le DAO HibernateDaoSupport
  ainsi qu’une technique dite ’non intrusive’ à travers laquelle aucun code Spring ne figurera dans votre DAO.*/
/* Créez un DAO non intrusif par une injection d'une SessionFactory*/
public class LivreDAOImpl extends HibernateDaoSupport implements LivreDAO{

	public void ajoutLivre(Livre livre) {
		// TODO Auto-generated method stub
		livre.setDatePublication(new Date());
		getHibernateTemplate().save(livre);
		
	}

	public List<Livre> listLivres() {
		// TODO Auto-generated method stub
		return (List<Livre>) getHibernateTemplate().find("from Livre");
	}

}
