package gestion;

import java.util.ArrayList;
import java.util.List;

public class Medicament {
	String Nom;
	int Prix;
	String Date_Mise_en_Service;
	int Quantité;
	public List<Medicament> medicament = new ArrayList<Medicament>();
	
	
	public Medicament (String Nom, Categorie_Medicament Categorie, int Prix, String Date_Mise_en_Service, int Quantité) {
		this.Nom = Nom;
		this.Prix = Prix;
		this.Date_Mise_en_Service = Date_Mise_en_Service;
		this.Quantité = Quantité;
		
		medicament.add(new Medicament("Doliprane", Categorie.Analgésique, 5 , "27/08/2001" , 2 ));
		
	}

	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public int getPrix() {
		return Prix;
	}
	public void setPrix(int prix) {
		Prix = prix;
	}
	public String getDate_Mise_en_Service() {
		return Date_Mise_en_Service;
	}
	public void setDate_Mise_en_Service(String date_Mise_en_Service) {
		Date_Mise_en_Service = date_Mise_en_Service;
	}
	public int getQuantité() {
		return Quantité;
	}
	public void setQuantité(int quantité) {
		Quantité = quantité;
	}

	
	
	@Override
	public String toString() {
		return "Medicament [Nom=" + Nom + ", Prix=" + Prix + ", Date_Mise_en_Service=" + Date_Mise_en_Service
				+ ", Quantité=" + Quantité + "]";
	}
	
	
}
