package gestion;

import javax.swing.DefaultRowSorter;
import javax.swing.table.TableModel;

import utilitaire.Personne;
import utilitaire.Regex;

import java.util.regex.Pattern;

public class Achats {
	private String Num_Secu;
	Personne Personne;
	private Mutuelle Mutuelle;
	private String Date;
	public Ordonnance Ordonnance;
	AchatMedicament Medicament;

	/**
	 * 
	 * @param Personne
	 * @param Mutuelle
	 * @param Num_Secu
	 * @param Date
	 * @param Ordonnance
	 * @param Medicament
	 */
	public Achats(Personne Personne, Mutuelle Mutuelle, String Num_Secu, String Date, Ordonnance Ordonnance, gestion.AchatMedicament Medicament) {
		super();
		setPersonne(Personne);
		setMutuelle(Mutuelle);
		setNum_Secu(Num_Secu);
		this.Date = Date;
		this.Ordonnance = Ordonnance;
		this.Medicament = Medicament;
	}
	/**
	 * 
	 * @return
	 */
	public String getNum_Secu() {
		return Num_Secu;
	}
/**
 * 
 * @param Num_Secu
 */
	public void setNum_Secu(String Num_Secu) {
		if (Pattern.matches(Regex.getRegexSecu, Num_Secu)) {
			this.Num_Secu = Num_Secu;
		}
		else {
			throw new IllegalArgumentException("Numéro de Sécurité Sociale incorrecte");
		}
	}
/**
 * 
 * @return
 */
	public Personne getPersonne() {
		return Personne;
	}
/**
 * 
 * @param Personne
 */
	public void setPersonne(Personne Personne) {
		try {
			if (Personne == null) {
				throw new NullPointerException("la Personne ne peut etre null");
			} else {
				this.Personne = Personne;
			}
		}
		catch(Exception exception){

		}
	}
/**
 * 
 * @return
 */
	public Mutuelle getMutuelle() {
		return Mutuelle;
	}
/**
 * 
 * @param Mutuelle
 */
	public void setMutuelle(Mutuelle Mutuelle) {
		try {
			if (Mutuelle == null) {
				throw new NullPointerException("la mutuelle ne peut etre null");
			} else {
				this.Mutuelle = Mutuelle;
			}
		}
		catch(Exception exception){

		}
	}
/**
 * 
 * @return
 */
	public String getDate() {
		return Date;
	}
/**
 * 
 * @param date
 */
	public void setDate(String date) {
		Date = date;
	}
/**
 * 
 * @return
 */
	public Ordonnance getOrdonnance() {
		return Ordonnance;
	}
/**
 * 
 * @param ordonnance
 */
	public void setOrdonnance(Ordonnance ordonnance) {
		Ordonnance = ordonnance;
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
	public static DefaultRowSorter<TableModel, Integer> getRowSorter() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String toString() {
		return "\n Date de l'achat: " + Date  +"\n Personne : " + Personne + "\n Numéro de Securité Sociale : " + Num_Secu + "\n Mutuelle : " + Mutuelle.getPersonne().getPrenom()
	 + "\n Numéro de Departement : " +Mutuelle.getDepartement() +" \n Prise en Charge :" + Mutuelle.getPrise_En_Charge()+ "%"+ "\n\n Ordonnance : " + Ordonnance + "\n\n Résumé Commande : " + Medicament;
	}
}
