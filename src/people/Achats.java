package people;

import java.util.Date;

import javax.swing.DefaultRowSorter;
import javax.swing.table.TableModel;

import gestion.Ordonnance;
import utilitaire.Personne;

public class Achats {
	private String Num_Secu;
	Personne Personne;
	private Mutuelle Mutuelle;
	private String Date;
	Ordonnance Ordonnance;

	public Achats(Personne Personne, Mutuelle Mutuelle, String Num_Secu, String Date, Ordonnance Ordonnance) {
		super();
		this.Personne = Personne;
		this.Mutuelle = Mutuelle;
		this.Num_Secu = Num_Secu;
		this.Date = Date;
		this.Ordonnance = Ordonnance;
	}
	
	public Achats(Personne Personne, Mutuelle Mutuelle, String Num_Secu, String Date) {
		super();
		this.Personne = Personne;
		this.Mutuelle = Mutuelle;
		this.Num_Secu = Num_Secu;
		this.Date = Date;
	}
	
	
	
	public String getNum_Secu() {
		return Num_Secu;
	}

	public void setNum_Secu(String num_Secu) {
		Num_Secu = num_Secu;
	}

	public Personne getPersonne() {
		return Personne;
	}

	public void setPersonne(Personne personne) {
		Personne = personne;
	}

	public Mutuelle getMutuelle() {
		return Mutuelle;
	}

	public void setMutuelle(Mutuelle mutuelle) {
		Mutuelle = mutuelle;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	public Ordonnance getOrdonnance() {
		return Ordonnance;
	}

	public void setOrdonnance(Ordonnance ordonnance) {
		Ordonnance = ordonnance;
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
