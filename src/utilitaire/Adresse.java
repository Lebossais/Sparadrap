package utilitaire;


public class Adresse {
	 int numero_rue ;
	 String nom_rue ;
	 int codePostal ;
	 String ville ;
	 /**
	  * 
	  * @param numero_rue
	  * @param nom_rue
	  * @param codePostal
	  * @param ville
	  */
	public Adresse (int numero_rue, String nom_rue, int codePostal, String ville) {
		super();
		this.numero_rue = numero_rue;
		setNom_rue(nom_rue);
		this.codePostal = codePostal;
		setVille(ville);
	}
		/**
		 * 
		 * @return
		 */
	public int getNumero_rue() {
		return numero_rue;
	}
	/**
	 * 
	 * @param numero_rue
	 */
	public void setNumero_rue(int numero_rue) {
		this.numero_rue = numero_rue;
	}
/**
 * 
 * @return
 */
	public String getNom_rue() {
		return nom_rue;
	}
/**
 * 
 * @param nom_rue
 */
	public void setNom_rue(String nom_rue) {
		try {
            if (nom_rue == null) {
                throw new NullPointerException("la Rue ne peut etre null");
            } else {
                this.nom_rue = nom_rue;
            }
        }
        catch(Exception exception){
            
        }
	}
/**
 * 
 * @return
 */
	public int getCodePostal() {
		return codePostal;
	}
/**
 * 
 * @param codePostal
 */
	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}
/**
 * 
 * @return
 */
	public String getVille() {
		return ville;
	}
/**
 * 
 * @param ville
 */
	public void setVille(String ville) {
		try {
            if (ville == null) {
                throw new NullPointerException("la Ville ne peut etre null");
            } else {
                this.ville = ville;
            }
        }
        catch(Exception exception){
            
        }
	}


	@Override
	public String toString() {
		return numero_rue + ", " + nom_rue + ", " + codePostal + ", "+ ville;
	}	
	
}
