package people;

import java.util.ArrayList;

import javax.swing.DefaultRowSorter;
import javax.swing.table.TableModel;

import utilitaire.Personne;

public class Medecin {
	public Personne Personne;
	private int Aggrement;
	static ArrayList<Medecin> medecin = new ArrayList<Medecin>();

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
	
	public static Medecin getMedecin(int i) {
		return medecin.get(i);
	}

	public static void setMedecin(ArrayList<Medecin> medecin) {
		Medecin.medecin = medecin;
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
