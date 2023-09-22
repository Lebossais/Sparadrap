package gestion;

import java.util.ArrayList;
import java.util.List;

public class AchatMedicament {

	int Quantite;
	Medicament Medicament;
	/**
	 * 
	 * @param Medicament
	 * @param Quantite
	 */
	public AchatMedicament(Medicament Medicament, int Quantite) {
		this.Medicament = Medicament;
		this.Quantite = Quantite;
	}
	/**
	 * 
	 * @return
	 */
	public double prixtotal() {
		double var2 = Medicament.getPrix();
		double var1 = Quantite;
		return var1 * var2;
	}
	
	
	public Medicament getMedicament() {
		return Medicament;
	}
	public void setMedicament(Medicament medicament) {
		Medicament = medicament;
	}
	/**
	 * 
	 * @return
	 */
	public int getQuantite() {
		return Quantite;
	}
	/**
	 * 
	 * @param quantite
	 */
	public void setQuantite(int quantite) {
		Quantite = quantite;
	}
	

	@Override
	public String toString() {
		return "\n Quantité : " + Quantite  + Medicament + "\n Prix total : " +prixtotal()+"€";
	}
	
	
}
