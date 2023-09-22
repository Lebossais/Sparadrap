package gestion;

import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultRowSorter;
import javax.swing.table.TableModel;

import enumeration.Categorie_Medicament;
import utilitaire.Adresse;
import utilitaire.Personne;

public class Declaration {
	
	public static ArrayList<Adresse> adresse = new ArrayList<Adresse>();
	public static ArrayList<Personne> personne = new ArrayList<Personne>();
	public static ArrayList<Medecin> medecin = new ArrayList<Medecin>();
	static ArrayList<Specialiste> specialiste = new ArrayList<Specialiste>();
	static ArrayList<Mutuelle> mutuelle = new ArrayList<Mutuelle>();
	public static List<Medicament> medicament = new ArrayList<Medicament>();
	public static List<AchatMedicament> achatMedicament = new ArrayList<AchatMedicament>();
	public static List<Client> clients = new ArrayList<Client>();
	public static List<Ordonnance> ordonnances = new ArrayList<Ordonnance>();
	public final static List<Achats> achats = new ArrayList<Achats>();
	
	public Declaration() {
		initAll();
	}
	
	public void initAll() {
		 adresse.add(new Adresse(59, "Rue de la Paix", 59842, "Bethune"));
	     adresse.add(new Adresse(47, "Rue de la Liberté",58421,"La Gorgue"));
	     adresse.add(new Adresse(2, "Rue de la Gastronomie", 59875,"Armentières"));
	     adresse.add(new Adresse (17,"Rue des Soins", 59842, "Dunkerque"));
	     adresse.add(new Adresse (25,"Rue des Concurrents", 62000, "Lens"));
	     
		 personne.add(new Personne("Jean","Fouqueaut", getAdresse(0) , "06.55.99.88.77", "Jean.Fouqueaut@gmail.com"));
	     personne.add(new Personne("Sarah", "Dupond" , getAdresse(1) , "06.84.52.67.58", "Sarah.Dupont@hotmail.com"));
	     personne.add(new Personne("Marie", "Petain", getAdresse(2), "06.52.14.58.96", "Marie.Durand@orange.fr"));
	        
	     personne.add(new Personne("Michel","Michel",getAdresse(3),"06.58.44.22.69","Michel.Michel@medecin.fr"));
	     personne.add(new Personne("Gaeten","Mortis", getAdresse(3),"06.59.45.23.70","Gaeten.Mortis@medecin.fr"));
	     personne.add(new Personne("Paul","Special", getAdresse(3), "06.60.46.24.71","Paul.Special@specialiste.fr"));
	     personne.add(new Personne("Jacqueline","Speciale", getAdresse(3), "06.61.47.25.72","Jacequline.Speciale@specialiste.fr"));
	       
	     personne.add(new Personne("Acoris","Mutuelle",getAdresse(4), "06.72.25.47.61","Acoris.Mutuelle@mutuelle.fr"));
	     personne.add(new Personne("France","Mutuelle",getAdresse(4) , "06.73.26.48.62","France.Mutuelle@mutuelle.fr"));
	     
	     medecin.add(new Medecin(getPersonne(3), 1));
	     medecin.add(new Medecin(getPersonne(4), 2));
	     
	     specialiste.add(new Specialiste(getPersonne(5), "Chiurgie"));
	     specialiste.add(new Specialiste(getPersonne(6), "Cardiologie"));
	     
	     mutuelle.add(new Mutuelle(getPersonne(7), 59, 85));
	     mutuelle.add(new Mutuelle(getPersonne(8), 62, 60));
	     
	     medicament.add(new Medicament("Doliprane", Categorie_Medicament.Analgesique, 5 , "27/08/2001"));
	     medicament.add(new Medicament("Amoxicilline",Categorie_Medicament.Antibiotique ,3, "05/08/2010"));
	     medicament.add(new Medicament("Xydol",Categorie_Medicament.Antiinflammatoire ,6, "14/12/2008"));
	     medicament.add(new Medicament("Cortisol",Categorie_Medicament.Corticoides ,10, "01/01/1950"));
			
	     achatMedicament.add(new AchatMedicament(getMedicament(0), 2));
		
		 getClients().add(new Client(getPersonne(0), "05/05/1998", "582 158 598 325 21", getMutuelle(0),getMedecin(0),getSpecialiste(0)));
	     getClients().add(new Client(getPersonne(1),"09/09/1986", "582 256 584 235 21",getMutuelle(0),getMedecin(0),getSpecialiste(1) ));
	     getClients().add(new Client(getPersonne(2), "15/12/2000","582 698 874 236 21",getMutuelle(1),getMedecin(1),null ));
	     
	  		ordonnances.add(new Ordonnance("183",Declaration.getMedecin(1) , Declaration.getSpecialiste(0) ,"30/08/2023"));
    		ordonnances.add(new Ordonnance("184", Declaration.getMedecin(0) , Declaration.getSpecialiste(1) ,"30/08/2023"));
    		ordonnances.add(new Ordonnance("185", Declaration.getMedecin(0) , Declaration.getSpecialiste(1) ,"30/08/2023"));
            ordonnances.add(new Ordonnance("181", Declaration.getMedecin(0) , Declaration.getSpecialiste(0) ,"30/08/2023"));
            ordonnances.add(new Ordonnance("186", Declaration.getMedecin(1) , Declaration.getSpecialiste(1) ,"30/08/2023"));
            ordonnances.add(new Ordonnance("187", Declaration.getMedecin(1) , Declaration.getSpecialiste(1) ,"30/08/2023"));
            ordonnances.add(new Ordonnance("182", Declaration.getMedecin(1) , Declaration.getSpecialiste(0) ,"30/08/2023"));
            ordonnances.add(new Ordonnance("180", Declaration.getMedecin(1) , Declaration.getSpecialiste(1) ,"30/08/2023"));
            
            achats.add(new Achats(Declaration.getPersonne(0),Declaration.getMutuelle(0),"582 158 598 325 21","31/08/2023", Declaration.getOrdonnance(0), Declaration.getAchatMedicament(0)));
	}
	
	
	public static AchatMedicament getAchatMedicament(int i) {
		return achatMedicament.get(i);
	}
	
    public static Client getClient(int i) {
    	return getClients().get(i);
    }
    
	public static  Adresse getAdresse(int i) {
		return adresse.get(i);
	}
	public void setAdresse(ArrayList<Adresse> adresse) {
		Declaration.adresse = adresse;
	}
	
	
	public static Personne getPersonne(int i) {
		return personne.get(i);
	}
	public void setPersonne(ArrayList<Personne> personne) {
		Declaration.personne = personne;
	}
	
	
	public static Medecin getMedecin(int i) {
		return medecin.get(i);
	}
	public static void setMedecin(ArrayList<Medecin> medecin) {
		Declaration.medecin = medecin;
	}
	
	public static Specialiste getSpecialiste(int i) {
		return specialiste.get(i);
	}
	public static void setSpecialiste(ArrayList<Specialiste> specialiste) {
		Declaration.specialiste = specialiste;
	}

	public static Mutuelle getMutuelle(int i) {
		return mutuelle.get(i);
	}
	public void setMutuelle(ArrayList<Mutuelle> mutuelle) {
		Declaration.mutuelle = mutuelle;
	}

	public static Medicament getMedicament(int i) {
		return medicament.get(i);
	}
	public static void setMedicament(List<Medicament> medicament) {
		Declaration.medicament = medicament;
	}
	
	
	public static List<AchatMedicament> getAchatMedicament() {
		return achatMedicament;
	}
	
	public static List<Client> getClients() {
		return clients;
	}
	
	public static Ordonnance getOrdonnance(int i) {
		return ordonnances.get(i);
	}
	public static void setOrdonnance(ArrayList<Ordonnance> ListeOrdonnances) {
		Declaration.ordonnances = ListeOrdonnances;
	}
	
	public static List<Achats> getAchats() {
		return Declaration.achats;
	}
	
	public static DefaultRowSorter<TableModel, Integer> getRowSorter() {
		// TODO Auto-generated method stub
		return null;
	}
}
