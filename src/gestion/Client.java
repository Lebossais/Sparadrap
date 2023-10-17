package gestion;

import java.util.regex.Pattern;

import javax.swing.DefaultRowSorter;
import javax.swing.table.TableModel;

import utilitaire.Personne;
import utilitaire.Regex;

public class Client {
	private String Date_Naissance;
	private String Numero_Secu;
	private Mutuelle Mutuelle;
	private Medecin Medecin_Traitant;
	private Specialiste Specialiste;
	public  Personne Personne;
	
	/**
	 * 
	 * @param Personne
	 * @param Date_Naissance
	 * @param Numero_Secu
	 * @param Mutuelle
	 * @param Medecin_Traitant
	 * @param Specialiste
	 */
	public Client(Personne Personne, String Date_Naissance,String Numero_Secu,Mutuelle Mutuelle, Medecin Medecin_Traitant, Specialiste Specialiste) {
		super();
		
		setPersonne(Personne);
		this.Date_Naissance = Date_Naissance;
		setNumero_Secu(Numero_Secu);
		setMutuelle(Mutuelle);;
		setMedecin_Traitant(Medecin_Traitant);
		setSpecialiste(Specialiste);
	}


	
	@Override
	public String toString() {
		String c = null;
		if (Specialiste != null) {
			c = Specialiste.getPersonne().getPrenom();
		} else if (Specialiste == null) {
			c = "Aucun";
		}
		
		return  "\n" + Personne.toString() + "\n Date de Naissance : " + Date_Naissance + "\n Numero de Sécurité Sociale : " + Numero_Secu + "\n Mutuelle : " + Mutuelle.getPersonne().getPrenom()
				+ " \n Medecin Traitant : " + Medecin_Traitant.getPersonne().getPrenom() + "\n Specialiste : " + c ;
	}

	/**
	 * 
	 * @return
	 */
	public Mutuelle getMutuelle() {
		return Mutuelle;
	}
	/**
	 * 
	 * @param mutuelle
	 */
	public void setMutuelle(Mutuelle mutuelle) {
		try {
            if (mutuelle == null) {
                throw new NullPointerException("la mutuelle ne peut etre null");
            } else {
                this.Mutuelle = mutuelle;
            }
        }
        catch(Exception exception){
            
        }
	}
	/**
	 * 
	 * @return
	 */
	public Personne getPersonne() {
		return Personne;
	}
	/**
	 * 
	 * @param personne
	 */
	public void setPersonne(Personne personne) {
		try {
            if (Personne == null) {
                throw new NullPointerException("la Personne ne peut etre null");
            } else {
                this.Personne = personne;
            }
        }
        catch(Exception exception){
            
        }
	}
	/**
	 * 
	 * @return
	 */
	public String getDate_Naissance() {
		return Date_Naissance;
	}
	/**
	 * 
	 * @param date_Naissance
	 */
	public void setDate_Naissance(String date_Naissance) {
		Date_Naissance = date_Naissance;
	}
	/**
	 * 
	 * @return
	 */
	public String getNumero_Secu() {
		return Numero_Secu;
	}
	/**
	 * 
	 * @param numero_Secu
	 */
	public void setNumero_Secu(String numero_Secu)throws IllegalArgumentException {
		if (Pattern.matches(Regex.getRegexSecu, numero_Secu)) {
		this.Numero_Secu = numero_Secu;
		}
		else {
			throw new IllegalArgumentException("Numéro de Sécurité Sociale incorrecte");
		}
	}
	/**
	 * 
	 * @return
	 */
	public Medecin getMedecin_Traitant() {
		return Medecin_Traitant;
	}
	/**
	 * 
	 * @param medecin_Traitant
	 */
	public void setMedecin_Traitant(Medecin medecin_Traitant) {
		try {
            if (Medecin_Traitant == null) {
                throw new NullPointerException("le médecin Traitant ne peut etre null");
            } else {
                this.Medecin_Traitant = medecin_Traitant;
            }
        }
        catch(Exception exception){
            
        }
	}
	/**
	 * 
	 * @return
	 */
	public Specialiste getSpecialiste() {
		return Specialiste;
	}
	/**
	 * 
	 * @param specialiste
	 */
	public void setSpecialiste(Specialiste specialiste) {
		Specialiste = specialiste;
	}
	/**
	 * 
	 * @return
	 */
	public static TableModel getModel() {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * 
	 * @return
	 */
	public static int[] getSelectedRows() {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * 
	 * @return
	 */
	public static DefaultRowSorter<TableModel, Integer> getRowSorter() {
		// TODO Auto-generated method stub
		return null;
	}
}
