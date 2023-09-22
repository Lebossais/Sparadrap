package gestion;


import javax.swing.DefaultRowSorter;
import javax.swing.table.TableModel;

import utilitaire.Personne;

public class Mutuelle {
	
	public Personne Personne;
	private int Departement;
	private int Prise_En_Charge;

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
