package people;

import javax.swing.DefaultRowSorter;
import javax.swing.table.TableModel;

import utilitaire.Personne;

public class Specialiste {

	Personne Personne;
	private String Specialite;

	public Specialiste(Personne Personne, String Specialite) {
		super();
		
		this.Personne = Personne;
		this.Specialite = Specialite;
	}
	
	
	
	public Personne getPersonne() {
		return Personne;
	}
	public void setPersonne(Personne personne) {
		Personne = personne;
	}
	public String getSpecialite() {
		return Specialite;
	}
	public void setSpecialite(String specialite) {
		Specialite = specialite;
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
