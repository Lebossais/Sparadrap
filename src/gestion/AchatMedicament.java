package gestion;

import java.util.ArrayList;
import java.util.List;

public class AchatMedicament {

	int Quantite;
	Medicament Medicament;
	
	public static List<AchatMedicament> achatMedicament = new ArrayList<AchatMedicament>();
	
	
	public AchatMedicament() {
		initAchatMedicament();
	}
	/**
	 * 
	 * @param Medicament
	 * @param Quantite
	 */
	public AchatMedicament(Medicament Medicament, int Quantite) {
		this.Medicament = Medicament;
		this.Quantite = Quantite;
	}
	
	public void initAchatMedicament() {
		achatMedicament.add(new AchatMedicament(gestion.Medicament.getMedicament(0), 2));
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
	/**
	 * 
	 * @param i
	 * @return
	 */
	public static AchatMedicament getAchatMedicament(int i) {
		return achatMedicament.get(i);
	}
	/**
	 * 
	 * @return
	 */
	public static List<AchatMedicament> getAchatMedicament() {
		return achatMedicament;
	}
	

	@Override
	public String toString() {
		return "\n Quantité : " + Quantite  + Medicament + "\n Prix total : " +prixtotal()+"€";
	}
	
	
}
