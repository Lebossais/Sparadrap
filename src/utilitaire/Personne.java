package utilitaire;

import javax.swing.table.TableModel;

public class Personne {

	private String prenom ;
	private String name ;
	private Adresse Adresse;
	private String telephone;
	private String email;
	
	/**
	 * 
	 * @param prenom
	 * @param name
	 * @param Adresse
	 * @param telephone
	 * @param email
	 */
	public Personne(String prenom, String name, Adresse Adresse, String telephone, String email) {
		super();
		this.prenom = prenom ;
		this.name = name ;
		this.Adresse = Adresse;
		this.telephone = telephone;
		this.email = email;
	}
	/**
	 * 
	 * @return
	 */
	public String getPrenom() {
		return prenom;
	}
/**
 * 
 * @param prenom
 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
/**
 * 
 * @return
 */
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return " Prénom : " + prenom +"\n Nom : " + name + "\n Adresse : " + Adresse + "\n N°Telephone : " + telephone
				+ "\n Email : " + email ;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
/**
 * 
 * @return
 */
	public Adresse getAdresse() {
		return Adresse;
	}
	/**
	 * 
	 * @param adresse
	 */
	public void setAdresse(Adresse adresse) {
		this.Adresse = adresse ;
	}
/**
 * 
 * @return
 */
	public String getTelephone() {
		return telephone;
	}
/**
 * 
 * @param telephone
 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
/**
 * 
 * @return
 */
	public String getEmail() {
		return email;
	}
/**
 * 
 * @param email
 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * 
	 * @return
	 */
	public static TableModel getModel() {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * 
	 * @return
	 */
	public static int[] getSelectedRows() {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * 
	 * @return
	 */
}
