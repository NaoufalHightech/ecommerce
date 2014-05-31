package ma.publicom.model;

import java.io.Serializable;
import java.util.Date;

public class Livre implements Serializable{

	private long idLivre;
	private String titre;
	private String nomAuteur;
	private Date datePublication;
	private String prix;
	
	public long getIdLivre() {
		return idLivre;
	}
	public void setIdLivre(long idLivre) {
		this.idLivre = idLivre;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getNomAuteur() {
		return nomAuteur;
	}
	public void setNomAuteur(String nomAuteur) {
		this.nomAuteur = nomAuteur;
	}
	public Date getDatePublication() {
		return datePublication;
	}
	public void setDatePublication(Date datePublication) {
		this.datePublication = datePublication;
	}
	public String getPrix() {
		return prix;
	}
	public void setPrix(String prix) {
		this.prix = prix;
	}
	
	
	
}
