package utilitaire;

import java.util.ArrayList;


public class Adresse {
	 int numero_rue ;
	 String nom_rue ;
	 int codePostal ;
	 String ville ;
	 ArrayList<Adresse> adresse = new ArrayList<Adresse>();
		
	public Adresse (int numero_rue, String nom_rue, int codePostal, String ville) {
		super();
		this.numero_rue = numero_rue;
		this.nom_rue = nom_rue;
		this.codePostal = codePostal;
		this.ville = ville;
	}
	
	public Adresse() {
		initAdresse();
	}
	
	public void initAdresse() {
	 Adresse adresse_Jean = new Adresse(59, "Rue de la Paix", 59842, "Bethune");
	 adresse.add(adresse_Jean);
     Adresse adresse_Sarah = new Adresse(47, "Rue de la Liberté",58421,"La Gorgue");
     adresse.add(adresse_Sarah);
     Adresse adresse_Marie = new Adresse(2, "Rue de la Gastronomie", 59875,"Armentières");
     adresse.add(adresse_Marie);
     Adresse Cabinet = new Adresse (17,"Rue des Soins", 59842, "Dunkerque");
     adresse.add(Cabinet);
     Adresse Base_Des_Mutuelles = new Adresse (25,"Rue des Concurrents", 62000, "Lens");
     adresse.add(Base_Des_Mutuelles);
     
	}
	
	public  Adresse getAdresse(int i) {
			return adresse.get(i);
		}

		public void setAdresse(ArrayList<Adresse> adresse) {
			this.adresse = adresse;
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
		return numero_rue + ", " + nom_rue + ", " + codePostal + ", "+ ville;
	}	
	
}
