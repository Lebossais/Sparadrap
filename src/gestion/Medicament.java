package gestion;

public class Medicament {

	private int Medi_ID;
	String Medi_Nom;
	int Medi_Prix;
	String Medi_Date_Mise_en_Service;
	Categorie Categorie;

	/**
	 * @param Medi_ID
	 * @param Medi_Nom
	 * @param Categorie
	 * @param Medi_Prix
	 * @param Medi_Date_Mise_en_Service
	 */
	public Medicament (int Medi_ID, String Medi_Nom, Categorie Categorie, int Medi_Prix, String Medi_Date_Mise_en_Service) {
		super();
		this.Medi_ID = Medi_ID;
		setNom(Medi_Nom);
		setPrix(Medi_Prix);
		this.Categorie = Categorie;
		this.Medi_Date_Mise_en_Service = Medi_Date_Mise_en_Service;
	}

	/**
	 * 
	 * @return
	 */
	public String getNom() {
		return Medi_Nom;
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
				this.Medi_Nom = Nom;
			}
		} catch (Exception exception) {
		}
	}
	/**
	 * 
	 * @return
	 */
	public int getPrix() {
		return Medi_Prix;
	}
	/**
	 * 
	 * @param prix
	 */
	public void setPrix(int prix) {
		Medi_Prix = prix;
	}
	/**
	 * 
	 * @return
	 */
	public String getDate_Mise_en_Service() {
		return Medi_Date_Mise_en_Service;
	}
	/**
	 * 
	 * @param date_Mise_en_Service
	 */
	public void setDate_Mise_en_Service(String date_Mise_en_Service) {
		Medi_Date_Mise_en_Service = date_Mise_en_Service;
	}

	public int getMedi_ID() {
		return Medi_ID;
	}

	public Categorie getCategorie() {
		return Categorie;
	}

	/**
	 * 
	 * @return
	 */
	@Override
	public String toString() {
		return "\n Nom : " + Medi_Nom + "\n Catégorie : " + Categorie +"\n Prix unitaire : " + Medi_Prix + "€" + "\n Date_Mise_en_Service : " + Medi_Date_Mise_en_Service;
	}

}
