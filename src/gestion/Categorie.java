package gestion;


import utilitaire.Adresse;
import utilitaire.Regex;

import java.util.regex.Pattern;

public class Categorie {
	String Cat_Categorie;
	int Cat_ID;


public Categorie (int ID, String Categorie) {
	super();
	this.Cat_ID = ID;
	this.Cat_Categorie = Categorie;
}

	public int getCat_ID() {
		return Cat_ID;
	}

	public void setCat_ID(int ID) {
		this.Cat_ID = ID;
	}

	public String getCat_Categorie() {
		return Cat_Categorie;
	}


	public void setCat_Categorie(String Categorie) {
	this.Cat_Categorie = Categorie;
	}
}

