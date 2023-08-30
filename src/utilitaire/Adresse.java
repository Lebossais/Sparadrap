package utilitaire;

public class Adresse {
	 int numero_rue ;
	 String nom_rue ;
	 int codePostal ;
	 String ville ;
		
	public Adresse (int numero_rue, String nom_rue, int codePostal, String ville) {
		super();
		this.numero_rue = numero_rue;
		this.nom_rue = nom_rue;
		this.codePostal = codePostal;
		this.ville = ville;
	}

	
	public int getNumero_rue() {
		return numero_rue;
	}
	public void setNumero_rue(int numero_rue) {
		this.numero_rue = numero_rue;
	}
	public String getNom_rue() {
		return nom_rue;
	}
	public void setNom_rue(String nom_rue) {
		this.nom_rue = nom_rue;
	}
	public int getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}


	@Override
	public String toString() {
		return "Adresse [numero_rue=" + numero_rue + ", nom_rue=" + nom_rue + ", codePostal=" + codePostal + ", ville="
				+ ville + "]";
	}	
	
}
