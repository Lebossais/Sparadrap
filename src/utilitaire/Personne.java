package utilitaire;

import javax.swing.DefaultRowSorter;
import javax.swing.table.TableModel;

public class Personne {

	private String prenom ;
	private String name ;
	private Adresse Adresse;
	private String telephone;
	private String email;

	public Personne(String prenom, String name, Adresse Adresse, String telephone, String email) {
		super();
		
		this.prenom = prenom ;
		this.name = name ;
		this.Adresse = Adresse;
		this.telephone = telephone;
		this.email = email;
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
