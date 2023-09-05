package people;

import java.util.ArrayList;

import javax.swing.DefaultRowSorter;
import javax.swing.table.TableModel;

import utilitaire.Personne;

public class Mutuelle {
	
	public Personne Personne;
	private int Departement;
	private int Prise_En_Charge;
	static ArrayList<Mutuelle> mutuelle = new ArrayList<Mutuelle>();

	/**
	 * 
	 * @param Personne
	 * @param Departement
	 * @param Prise_En_Charge
	 */
	public Mutuelle(Personne Personne, int Departement, int Prise_En_Charge) {
		super();
		
		this.Personne = Personne;
		this.Departement = Departement ;
		this.Prise_En_Charge = Prise_En_Charge;
	}
	
	public Mutuelle() {
		initMutuelle();
	}

	void initMutuelle() {
        Mutuelle Acoris_Mutuelle = new Mutuelle(utilitaire.Personne.getPersonne(7), 59, 85);
        mutuelle.add(Acoris_Mutuelle);
        Mutuelle France_Mutuelle = new Mutuelle(utilitaire.Personne.getPersonne(8), 62, 60);
        mutuelle.add(France_Mutuelle);
	}
	/**
	 * 
	 * @param i
	 * @return
	 */
	public static Mutuelle getMutuelle(int i) {
		return mutuelle.get(i);
	}
	/**
	 * 
	 * @param mutuelle
	 */
	public void setMutuelle(ArrayList<Mutuelle> mutuelle) {
		Mutuelle.mutuelle = mutuelle;
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
	public int getDepartement() {
		return Departement;
	}
	/**
	 * 
	 * @param departement
	 */
	public void setDepartement(int departement) {
		Departement = departement;
	}
	/**
	 * 
	 * @return
	 */
	public int getPrise_En_Charge() {
		return Prise_En_Charge;
	}
	/**
	 * 
	 * @param prise_En_Charge
	 */
	public void setPrise_En_Charge(int prise_En_Charge) {
		Prise_En_Charge = prise_En_Charge;
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
