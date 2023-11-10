package Frame;

import DAO.DAOPanier;
import gestion.Panier;

import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import java.util.ArrayList;
import java.util.List;

public class ListePanier  extends AbstractTableModel {

    private final DAOPanier daoPanier = new DAOPanier();
    public static final List<Panier> panier = new ArrayList<Panier>();
    private static final long serialVersionUID = 5380417556060869746L;

    TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(Panier.getModel());

    private final String[] entetes = {"Nom du Medicament", "Catégorie", "Quantité", "Prix Unitaire", "Prix Total"};

    public ListePanier(){
        super();
    }

    @Override
    public int getRowCount() {
        return getListePanier().size();
    }

    @Override
    public int getColumnCount() {
        return entetes.length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return entetes[columnIndex];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0 :
                return ListePanier.getPanier(rowIndex).getMedicament().getNom();
            case 1 :
                return panier.get(rowIndex).getMedicament().getCategorie().getCat_Categorie();
            case 2 :
                return panier.get(rowIndex).getPanier_Qte();
            case 3 :
                return panier.get(rowIndex).getMedicament().getPrix();
            case 4 :
                return Panier.prixtotal()+"€";
            default:
                return null; //Ne devrait jamais arriver
        }
    }
    public void remove(int rowIndex) {
        panier.remove(rowIndex);

        fireTableRowsDeleted(rowIndex, rowIndex);
    }

    public static List<Panier> getListePanier(){
        return panier;
    }
    public static Panier getPanier(int i){
        return panier.get(i);
    }

    public static void setPanier(List<Panier> Panier){
        Panier = panier;
    }
}
