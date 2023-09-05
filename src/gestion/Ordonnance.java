package gestion;


import javax.swing.DefaultRowSorter;
import javax.swing.table.TableModel;

import people.Medecin;
import people.Specialiste;

public class Ordonnance {
	
	private String Num_Ordonnance;
	private String Date_Ordonnance;
	public people.Medecin Medecin;
	public people.Specialiste Specialiste;
	
	/**
	 * 
	 * @param Num_Ordonnance
	 * @param Medecin
	 * @param Specialiste
	 * @param Date_Ordonnance
	 */
	public Ordonnance(String Num_Ordonnance, Medecin Medecin, Specialiste Specialiste, String Date_Ordonnance) {
		super();
		this.Num_Ordonnance = Num_Ordonnance;
		this.Medecin = Medecin;
		this.Specialiste = Specialiste;
		this.Date_Ordonnance = Date_Ordonnance;	
	}
	/**
	 * 
	 * @return
	 */
	public String getNum_Ordonnance() {
		return Num_Ordonnance;
	}
	/**
	 * 
	 * @param num_Ordonnance
	 */
	public void setNum_Ordonnance(String num_Ordonnance) {
		Num_Ordonnance = num_Ordonnance;
	}
	/**
	 * 
	 * @return
	 */
	public String getDate_Ordonnance() {
		return Date_Ordonnance;
	}
	/**
	 * 
	 * @param date_Ordonnance
	 */
	public void setDate_Ordonnance(String date_Ordonnance) {
		Date_Ordonnance = date_Ordonnance;
	}
	/**
	 * 
	 * @return
	 */
	public people.Medecin getMedecin() {
		return Medecin;
	}
	/**
	 * 
	 * @param medecin
	 */
	public void setMedecin(people.Medecin medecin) {
		Medecin = medecin;
	}
	/**
	 * 
	 * @return
	 */
	public people.Specialiste getSpecialiste() {
		return Specialiste;
	}
	/**
	 * 
	 * @param specialiste
	 */
	public void setSpecialiste(people.Specialiste specialiste) {
		Specialiste = specialiste;
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
	
	  
	public String toString() {
		String c = null;
		String b = null;
		if (Specialiste != null) {
			c = Specialiste.getPersonne().getPrenom();
			b = Specialiste.getSpecialite();
		} else if (Specialiste == null) {
			c = "Aucun";
			b = null;
		}
		//"Numéro Ordonnance", "Nom Médecin", "Nom Specialiste", "Date de l'ordonnance"
		return  "\n" +"Numéro Ordonnance : " + Num_Ordonnance + "\n Nom Medecin : " + Medecin.getPersonne().getPrenom() + "\n Specialiste : " + c +" ( "+ b + " ) ";
	}
	  
}
