package gestion;

import enumeration.Categorie;

public class Medicament {
	String Nom;
	int Prix;
	String Date_Mise_en_Service;
	Categorie Categorie;

	/**
	 * 
	 * @param Nom
	 * @param Categorie
	 * @param Prix
	 * @param Date_Mise_en_Service
	 */
	public Medicament (String Nom, Categorie Categorie, int Prix, String Date_Mise_en_Service) {
		super();
		setNom(Nom);
		setPrix(Prix);
		this.Categorie = Categorie;
		this.Date_Mise_en_Service = Date_Mise_en_Service;
	}

	/**
	 * 
	 * @return
	 */
	public String getNom() {
		return Nom;
	}
	/**
	 * 
	 * @param Nom
	 */
	public void setNom(String Nom) {
		try {
			if (Nom == null) {
				throw new NullPointerException("le Nom ne peut etre null");
			} else {
				this.Nom = Nom;
			}
		} catch (Exception exception) {
		}
	}
	/**
	 * 
	 * @return
	 */
	public int getPrix() {
		return Prix;
	}
	/**
	 * 
	 * @param prix
	 */
	public void setPrix(int prix) {
		Prix = prix;
	}
	/**
	 * 
	 * @return
	 */
	public String getDate_Mise_en_Service() {
		return Date_Mise_en_Service;
	}
	/**
	 * 
	 * @param date_Mise_en_Service
	 */
	public void setDate_Mise_en_Service(String date_Mise_en_Service) {
		Date_Mise_en_Service = date_Mise_en_Service;
	}
	/**
	 * 
	 * @return
	 */
	@Override
	public String toString() {
		return "\n Nom : " + Nom + "\n Catégorie : " + Categorie +"\n Prix unitaire : " + Prix + "€" + "\n Date_Mise_en_Service : " + Date_Mise_en_Service;
	}

}
