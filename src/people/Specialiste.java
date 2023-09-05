package people;

import java.util.ArrayList;

import javax.swing.DefaultRowSorter;
import javax.swing.table.TableModel;

import utilitaire.Personne;

public class Specialiste {

	Personne Personne;
	private String Specialite;
	static ArrayList<Specialiste> specialiste = new ArrayList<Specialiste>();
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
	public Specialiste() {
		initSpecialiste();
	}
	
	void initSpecialiste() {
		Specialiste Spe_Paul = new Specialiste(utilitaire.Personne.getPersonne(5), "Chiurgie");
		specialiste.add(Spe_Paul);
        Specialiste Spe_Jacqueline = new Specialiste(utilitaire.Personne.getPersonne(6), "Cardiologie");
        specialiste.add(Spe_Jacqueline);
	}
	/**
	 * 
	 * @param i
	 * @return
	 */
	public static Specialiste getSpecialiste(int i) {
		return specialiste.get(i);
	}
	/**
	 * 
	 * @param specialiste
	 */
	public static void setSpecialiste(ArrayList<Specialiste> specialiste) {
		Specialiste.specialiste = specialiste;
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
