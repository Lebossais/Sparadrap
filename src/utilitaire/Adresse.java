package utilitaire;


public class Adresse {
	 int Adr_Numero_Rue ;
	 String Adr_Nom_Rue ;
	 int Adr_Code_Postal ;
	 String Adr_Ville ;
	 int Adr_ID;
	 /**
	  * 
	  * @param Adr_Numero_Rue
	  * @param adr_Nom_Rue
	  * @param adr_Code_Postal
	  * @param adr_Ville
	  */
	public Adresse (int Adr_Numero_Rue, String adr_Nom_Rue, int adr_Code_Postal, String adr_Ville, int Adr_ID) {
		super();
		this.Adr_Numero_Rue = Adr_Numero_Rue;
		setNom_rue(adr_Nom_Rue);
		this.Adr_Code_Postal = adr_Code_Postal;
		setVille(Adr_Ville);
	}
		/**
		 * 
		 * @return
		 */
	public int getNumero_rue() {
		return Adr_Numero_Rue;
	}
	/**
	 * 
	 * @param numero_rue
	 */
	public void setNumero_rue(int numero_rue) {
		this.Adr_Numero_Rue = numero_rue;
	}
/**
 * 
 * @return
 */
	public String getNom_rue() {
		return Adr_Nom_Rue;
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
                this.Adr_Nom_Rue = nom_rue;
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
		return Adr_Code_Postal;
	}
/**
 * 
 * @param codePostal
 */
	public void setCodePostal(int codePostal) {
		this.Adr_Code_Postal = codePostal;
	}
/**
 * 
 * @return
 */
	public String getVille() {
		return Adr_Nom_Rue;
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
                this.Adr_Ville = ville;
            }
        }
        catch(Exception exception){
            
        }
	}

	public int getAdr_ID() {
		return Adr_ID;
	}

	@Override
	public String toString() {
		return Adr_Numero_Rue + ", " + Adr_Nom_Rue + ", " + Adr_Code_Postal + ", "+ Adr_Ville;
	}	
	
}
