package people;

import javax.swing.DefaultRowSorter;
import javax.swing.table.TableModel;

import utilitaire.Personne;

public class Medecin {
	
	
	private Personne Personne;
	private int Aggrement;

	public Medecin(Personne Personne, int Aggrement) {
		super();
		
		this.Personne = Personne;
		this.Aggrement = Aggrement;
	}
	
	
	
	public Personne getPersonne() {
		return Personne;
	}
	public void setPersonne(Personne personne) {
		Personne = personne;
	}
	public int getAggrement() {
		return Aggrement;
	}
	public void setAggrement(int aggrement) {
		Aggrement = aggrement;
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
