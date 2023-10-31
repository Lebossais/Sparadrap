package utilitaire;

import javax.swing.table.TableModel;
import java.util.regex.Pattern;

public class Personne {

	private String Prenom ;
	private String Name ;
	private Adresse Adresse;
	private String Telephone;
	private String Email;
	
	/**
	 * 
	 * @param Prenom
	 * @param Name
	 * @param Adresse
	 * @param Telephone
	 * @param Email
	 */
	public Personne(String Prenom, String Name, Adresse Adresse, String Telephone, String Email) {
		super();
		setPrenom(Prenom);
		setName(Name);
		this.Adresse = Adresse;
		setTelephone(Telephone);
		setEmail(Email);
	}
	/**
	 * 
	 * @return
	 */
	public String getPrenom() {
		return Prenom;
	}
/**
 * 
 * @param Prenom
 */
	public void setPrenom(String Prenom) {
		if (Pattern.matches(Regex.getRegexPrenom, Prenom)) {
			this.Prenom = Prenom;
		}
		else {
			throw new IllegalArgumentException("Saisie du Prenom incorrecte");
		}
	}
/**
 * 
 * @return
 */
	public String getName() {
		return Name;
	}

	@Override
	public String toString() {
		return " Prénom : " + Prenom +"\n Nom : " + Name + "\n Adresse : " + Adresse + "\n N°Telephone : " + Telephone
				+ "\n Email : " + Email ;
	}

	/**
	 * 
	 * @param Name
	 */
	public void setName(String Name) {
		if (Pattern.matches(Regex.getRegexNom, Name)) {
			this.Name = Name;
		}
		else {
			throw new IllegalArgumentException("Saisie du Nom incorrecte");
		}

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
	 * @param Adresse
	 */
	public void setAdresse(Adresse Adresse) {
		try {
			if (Adresse == null) {
				throw new NullPointerException("l'Adresse ne peut etre null");
			} else {
				this.Adresse = Adresse;
			}
		}
		catch(Exception exception){
		}
	}
/**
 * 
 * @return
 */
	public String getTelephone() {
		return Telephone;
	}
/**
 * 
 * @param Telephone
 */
	public void setTelephone(String Telephone) {
		if (Pattern.matches(Regex.getRegexPhone, Telephone)) {
			this.Telephone = Telephone;
		}
		else {
			throw new IllegalArgumentException("Numéro de Téléphone incorrect");
		}
	}
/**
 * 
 * @return
 */
	public String getEmail() {
		return Email;
	}
/**
 * 
 * @param Email
 */
	public void setEmail(String Email) {
		if (Pattern.matches(Regex.getRegexEmail, Email)) {
			this.Email = Email ;
		}
		else {
			throw new IllegalArgumentException("Saisie de l'E-mail incorrecte");
		}
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
