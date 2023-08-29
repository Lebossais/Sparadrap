package people;

import javax.swing.DefaultRowSorter;
import javax.swing.table.TableModel;

import utilitaire.Personne;

public class Mutuelle {
	
	private Personne Personne;
	private int Departement;
	private int Prise_En_Charge;

	public Mutuelle(Personne Personne, int Departement, int Prise_En_Charge) {
		super();
		
		this.Personne = Personne;
		this.Departement = Departement ;
		this.Prise_En_Charge = Prise_En_Charge;
	}
	
	public Personne getPersonne() {
		return Personne;
	}

	public void setPersonne(Personne personne) {
		Personne = personne;
	}

	public int getDepartement() {
		return Departement;
	}

	public void setDepartement(int departement) {
		Departement = departement;
	}

	public int getPrise_En_Charge() {
		return Prise_En_Charge;
	}

	public void setPrise_En_Charge(int prise_En_Charge) {
		Prise_En_Charge = prise_En_Charge;
	}

	public static TableModel getModel() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static int[] getSelectedRows() {
		// TODO Auto-generated method stub
		return null;
	}
	public static DefaultRowSorter<TableModel, Integer> getRowSorter() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
