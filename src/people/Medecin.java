package people;

import java.util.ArrayList;

import javax.swing.DefaultRowSorter;
import javax.swing.table.TableModel;

import utilitaire.Personne;

public class Medecin {
	public Personne Personne;
	private int Aggrement;
	static ArrayList<Medecin> medecin = new ArrayList<Medecin>();

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
	
	public Medecin() {
		initMedecin();
	}
	
	void initMedecin() {
		Medecin Med_Michel = new Medecin(utilitaire.Personne.getPersonne(3), 1);
		medecin.add(Med_Michel);
        Medecin Med_Gaeten = new Medecin(utilitaire.Personne.getPersonne(4), 2);
        medecin.add(Med_Gaeten);
	}
	/**
	 * 
	 * @param i
	 * @return
	 */
	public static Medecin getMedecin(int i) {
		return medecin.get(i);
	}
	/**
	 * 
	 * @param medecin
	 */
	public static void setMedecin(ArrayList<Medecin> medecin) {
		Medecin.medecin = medecin;
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
