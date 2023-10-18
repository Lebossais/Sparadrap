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

		setPersonne(Personne);
		setSpecialite(Specialite);
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
	public String getSpecialite() {
		return Specialite;
	}
	/**
	 * 
	 * @param Specialite
	 */
	public void setSpecialite(String Specialite) {
		try {
			if (Personne == null) {
				throw new NullPointerException("la Specialité ne peut etre null");
			} else {
				this.Specialite = Specialite;;
			}
		}
		catch(Exception exception){

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
	public static DefaultRowSorter<TableModel, Integer> getRowSorter() {
		// TODO Auto-generated method stub
		return null;
	}
}
