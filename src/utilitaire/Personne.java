package utilitaire;

import java.util.ArrayList;

import javax.swing.DefaultRowSorter;
import javax.swing.table.TableModel;

public class Personne {

	private String prenom ;
	private String name ;
	private Adresse Adresse;
	private String telephone;
	private String email;
	 static ArrayList<Personne> personne = new ArrayList<Personne>();
	public Personne(String prenom, String name, Adresse Adresse, String telephone, String email) {
		super();
		this.prenom = prenom ;
		this.name = name ;
		this.Adresse = Adresse;
		this.telephone = telephone;
		this.email = email;
	}
	
	public Personne() {
		// TODO Auto-generated constructor stub
		Personneinit();
	}
	public void Personneinit() {
		 Personne Jean = new Personne("Jean","Fouqueaut", utilitaire.Adresse.getAdresse(0) , "06.55.99.88.77", "Jean.Fouqueaut@gmail.com");
		 personne.add(Jean);
	     Personne Sarah = new Personne("Sarah", "Dupond" , utilitaire.Adresse.getAdresse(1) , "06.84.52.67.58", "Sarah.Dupont@hotmail.com");
	     personne.add(Sarah);
	     Personne Marie = new Personne("Marie", "Petain", utilitaire.Adresse.getAdresse(2), "06.52.14.58.96", "Marie.Durand@orange.fr");
	     personne.add(Marie);
	        
	     Personne Michel = new Personne("Michel","Michel",utilitaire.Adresse.getAdresse(3),"06.58.44.22.69","Michel.Michel@medecin.fr");
	     personne.add(Michel);
	     Personne Gaeten =  new Personne("Gaeten","Mortis", utilitaire.Adresse.getAdresse(3),"06.59.45.23.70","Gaeten.Mortis@medecin.fr");
	     personne.add(Gaeten);
	     Personne Paul = new Personne("Paul","Special", utilitaire.Adresse.getAdresse(3), "06.60.46.24.71","Paul.Special@specialiste.fr");
	     personne.add(Paul);
	     Personne Jacqueline = new Personne("Jacqueline","Speciale",utilitaire.Adresse.getAdresse(3), "06.61.47.25.72","Jacequline.Speciale@specialiste.fr");
	     personne.add(Jacqueline);
	       
	     Personne Acoris = new Personne("Acoris","Mutuelle",utilitaire.Adresse.getAdresse(4), "06.72.25.47.61","Acoris.Mutuelle@mutuelle.fr");
	     personne.add(Acoris);
	     Personne France = new Personne("France","Mutuelle",utilitaire.Adresse.getAdresse(4) , "06.73.26.48.62","France.Mutuelle@mutuelle.fr");
	     personne.add(France);
	}
	
//	System.out.println(personne.getPersonne(0));
	
	
	public static Personne getPersonne(int i) {
		return personne.get(i);
	}

	public void setPersonne(ArrayList<Personne> personne) {
		Personne.personne = personne;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return " Prénom : " + prenom +"\n Nom : " + name + "\n Adresse : " + Adresse + "\n N°Telephone : " + telephone
				+ "\n Email : " + email ;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Adresse getAdresse() {
		return Adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.Adresse = adresse ;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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
