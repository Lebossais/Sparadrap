package gestion;

import javax.swing.*;
import javax.swing.table.TableModel;

public class Panier {

    Achat Achat;
    static Medicament Medicament;
    static int Panier_Qte;

    public Panier (Achat Achat, Medicament Medicament, int Panier_Qte) {
        this.Achat = Achat;
        this.Medicament = Medicament;
        this.Panier_Qte = Panier_Qte;
    }

    public gestion.Achat getAchat() {
        return Achat;
    }

    public static gestion.Medicament getMedicament() {
        return Medicament;
    }

    public static int getPanier_Qte() {
        return Panier_Qte;
    }


    public static double prixtotal() {
    	double var2 = getMedicament().getPrix();
    	double var1 = getPanier_Qte();
    	return var1 * var2;
    }

	@Override
    public String toString() {
    	return "\n Quantité : " + getPanier_Qte()  + Medicament + "\n Prix total : " + prixtotal()+"€";
    }

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