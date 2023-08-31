package people;

import java.util.ArrayList;

import javax.swing.DefaultRowSorter;
import javax.swing.table.TableModel;

import utilitaire.Personne;

public class Specialiste {

	Personne Personne;
	private String Specialite;
	static ArrayList<Specialiste> specialiste = new ArrayList<Specialiste>();

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
	
	public static Specialiste getSpecialiste(int i) {
		return specialiste.get(i);
	}

	public static void setSpecialiste(ArrayList<Specialiste> specialiste) {
		Specialiste.specialiste = specialiste;
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
