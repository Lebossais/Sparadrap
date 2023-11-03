package gestion;

import java.util.Date;

public class Achat {

	Date Achat_Date;
	int Achat_ID;

	Client	Client;

	Ordonnance Ordonnance;

	/**
	 *
	 * @param Achat_ID
	 * @param Achat_Date
	 * @param Client
	 * @param Ordonnance
	 */
	public Achat(int Achat_ID, Date Achat_Date, Client Client, Ordonnance Ordonnance) {
		this.Achat_ID = Achat_ID;
		this.Achat_Date = Achat_Date;
		this.Client = Client;
		this.Ordonnance = Ordonnance;
	}

	public Date getAchat_Date() {
		return Achat_Date;
	}

	public int getAchat_ID() {
		return Achat_ID;
	}

	public gestion.Client getClient() {
		return Client;
	}

	public gestion.Ordonnance getOrdonnance() {
		return Ordonnance;
	}

	//public double prixtotal() {
	//	double var2 = getMedicament().getPrix();
	//	double var1 = Quantite;
	//	return var1 * var2;
	//}

//	@Override
	//public String toString() {
	//	return "\n Quantité : " + Quantite  + Medicament + "\n Prix total : " + prixtotal()+"€";
	//}
}
