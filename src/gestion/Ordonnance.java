package gestion;

import java.util.ArrayList;

import javax.swing.DefaultRowSorter;
import javax.swing.table.TableModel;

import people.Medecin;
import people.Mutuelle;
import people.Specialiste;

public class Ordonnance {
	
	private String Num_Ordonnance;
	private String Date_Ordonnance;
	public people.Medecin Medecin;
	public people.Specialiste Specialiste;
	public static ArrayList<Ordonnance> ordonnance = new ArrayList<Ordonnance>();
	
	
	public Ordonnance(String Num_Ordonnance, Medecin Medecin, Specialiste Specialiste, String Date_Ordonnance) {
		super();
		this.Num_Ordonnance = Num_Ordonnance;
		this.Medecin = Medecin;
		this.Specialiste = Specialiste;
		this.Date_Ordonnance = Date_Ordonnance;	
	}
	
	public Ordonnance() {
		initOrdonnance();
	}
	
	public static void initOrdonnance() {
		Ordonnance Ord0 = new Ordonnance ("183",people.Medecin.getMedecin(1) , people.Specialiste.getSpecialiste(0) ,"30/08/2023");
		ordonnance.add(Ord0);
		Ordonnance Ord1 = (new Ordonnance("184", people.Medecin.getMedecin(0) , people.Specialiste.getSpecialiste(1) ,"30/08/2023"));
		ordonnance.add(Ord1);
		Ordonnance Ord2 = (new Ordonnance("185", people.Medecin.getMedecin(0) , people.Specialiste.getSpecialiste(1) ,"30/08/2023"));
		ordonnance.add(Ord2);
        Ordonnance Ord3 = (new Ordonnance("181", people.Medecin.getMedecin(0) , people.Specialiste.getSpecialiste(0) ,"30/08/2023"));
		ordonnance.add(Ord3);
        Ordonnance Ord4 = (new Ordonnance("186", people.Medecin.getMedecin(1) , people.Specialiste.getSpecialiste(1) ,"30/08/2023"));
		ordonnance.add(Ord4);
        Ordonnance Ord5 = (new Ordonnance("187", people.Medecin.getMedecin(1) , people.Specialiste.getSpecialiste(1) ,"30/08/2023"));
		ordonnance.add(Ord5);
        Ordonnance Ord6 = (new Ordonnance("182", people.Medecin.getMedecin(1) , people.Specialiste.getSpecialiste(0) ,"30/08/2023"));
		ordonnance.add(Ord6);
        Ordonnance Ord7 = (new Ordonnance("180", people.Medecin.getMedecin(1) , people.Specialiste.getSpecialiste(1) ,"30/08/2023"));
		ordonnance.add(Ord7);
	}


	public static Ordonnance getOrdonnance(int i) {
		return ordonnance.get(i);
	}


	public static void setOrdonnance(ArrayList<Ordonnance> ordonnance) {
		Ordonnance.ordonnance = ordonnance;
	}
	public String getNum_Ordonnance() {
		return Num_Ordonnance;
	}

	public void setNum_Ordonnance(String num_Ordonnance) {
		Num_Ordonnance = num_Ordonnance;
	}

	public String getDate_Ordonnance() {
		return Date_Ordonnance;
	}

	public void setDate_Ordonnance(String date_Ordonnance) {
		Date_Ordonnance = date_Ordonnance;
	}

	public people.Medecin getMedecin() {
		return Medecin;
	}

	public void setMedecin(people.Medecin medecin) {
		Medecin = medecin;
	}

	public people.Specialiste getSpecialiste() {
		return Specialiste;
	}

	public void setSpecialiste(people.Specialiste specialiste) {
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
	
	  
	public String toString() {
		String c = null;
		if (Specialiste != null) {
			c = Specialiste.getPersonne().getPrenom();
		} else if (Specialiste == null) {
			c = "Aucun";
		}
		//"Numéro Ordonnance", "Nom Médecin", "Nom Specialiste", "Date de l'ordonnance"
		return  "\n" +"Numéro Ordonnance : " + Num_Ordonnance + "\n Nom Medecin : " + Medecin.getPersonne().getPrenom() + "\n Specialiste : " + c ;
	}
	  
}
