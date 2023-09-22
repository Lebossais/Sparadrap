package gestion;

import javax.swing.DefaultRowSorter;
import javax.swing.table.TableModel;

import utilitaire.Personne;

public class Specialiste {

	Personne Personne;
	private String Specialite;
	/**
	 * 
	 * @param Personne
	 * @param Specialite
	 */
	public Specialiste(Personne Personne, String Specialite) {
		super();
		
		this.Personne = Personne;
		this.Specialite = Specialite;
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
	public String getSpecialite() {
		return Specialite;
	}
	/**
	 * 
	 * @param specialite
	 */
	public void setSpecialite(String specialite) {
		Specialite = specialite;
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
}
