package people;

import javax.swing.DefaultRowSorter;
import javax.swing.table.TableModel;

import gestion.AchatMedicament;
import gestion.Ordonnance;
import utilitaire.Personne;

public class Achats {
	private String Num_Secu;
	Personne Personne;
	private Mutuelle Mutuelle;
	private String Date;
	Ordonnance Ordonnance;
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
		this.Personne = Personne;
		this.Mutuelle = Mutuelle;
		this.Num_Secu = Num_Secu;
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
 * @param num_Secu
 */
	public void setNum_Secu(String num_Secu) {
		Num_Secu = num_Secu;
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
 * @param personne
 */
	public void setPersonne(Personne personne) {
		Personne = personne;
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
 * @param mutuelle
 */
	public void setMutuelle(Mutuelle mutuelle) {
		Mutuelle = mutuelle;
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
