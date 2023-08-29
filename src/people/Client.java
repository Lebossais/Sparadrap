package people;

import javax.swing.DefaultRowSorter;
import javax.swing.table.TableModel;
import utilitaire.Personne;

public class Client {
	private String Date_Naissance;
	private String Numero_Secu;
	private Mutuelle Mutuelle;
	private Medecin Medecin_Traitant;
	private Specialiste Specialiste;
	Personne Personne;
	
	public Client(Personne Personne, String Date_Naissance,String Numero_Secu,Mutuelle Mutuelle, Medecin Medecin_Traitant, Specialiste Specialiste) {
		super();
		
		this.Personne = Personne;
		this.Date_Naissance = Date_Naissance;
		this.Numero_Secu = Numero_Secu;
		this.Mutuelle = Mutuelle;
		this.Medecin_Traitant = Medecin_Traitant;
		this.Specialiste = Specialiste;
		
		
	}

	
	
	public Mutuelle getMutuelle() {
		return Mutuelle;
	}

	public void setMutuelle(Mutuelle mutuelle) {
		Mutuelle = mutuelle;
	}

	public Personne getPersonne() {
		return Personne;
	}

	public void setPersonne(Personne personne) {
		Personne = personne;
	}

	public String getDate_Naissance() {
		return Date_Naissance;
	}

	public void setDate_Naissance(String date_Naissance) {
		Date_Naissance = date_Naissance;
	}

	public String getNumero_Secu() {
		return Numero_Secu;
	}

	public void setNumero_Secu(String numero_Secu) {
		Numero_Secu = numero_Secu;
	}

	public Medecin getMedecin_Traitant() {
		return Medecin_Traitant;
	}

	public void setMedecin_Traitant(Medecin medecin_Traitant) {
		Medecin_Traitant = medecin_Traitant;
	}

	public Specialiste getSpecialiste() {
		return Specialiste;
	}

	public void setSpecialiste(Specialiste specialiste) {
		Specialiste = specialiste;
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
