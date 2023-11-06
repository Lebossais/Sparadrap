package gestion;

public class Panier {

    Achat Achat;
    Medicament Medicament;
    int Panier_Qte;

    public Panier (Achat Achat, Medicament Medicament, int Panier_Qte) {
        this.Achat = Achat;
        this.Medicament = Medicament;
        this.Panier_Qte = Panier_Qte;
    }

    public gestion.Achat getAchat() {
        return Achat;
    }

    public gestion.Medicament getMedicament() {
        return Medicament;
    }

    public int getPanier_Qte() {
        return Panier_Qte;
    }
}
