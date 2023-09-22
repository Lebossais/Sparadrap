package gestion;

import javax.swing.DefaultRowSorter;
import javax.swing.table.TableModel;

import utilitaire.Personne;

public class Medecin {
	public Personne Personne;
	private int Aggrement;

	/**
	 * 
	 * @param Personne
	 * @param Aggrement
	 */
	public Medecin(Personne Personne, int Aggrement) {
		super();
		
		this.Personne = Personne;
		this.Aggrement = Aggrement;
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
	public int getAggrement() {
		return Aggrement;
	}
	/**
	 * 
	 * @param aggrement
	 */
	public void setAggrement(int aggrement) {
		Aggrement = aggrement;
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
