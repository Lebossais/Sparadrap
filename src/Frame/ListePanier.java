package Frame;

import DAO.DAOPanier;
import gestion.Panier;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class ListePanier  extends AbstractTableModel {

    private DAOPanier daoPanier = new DAOPanier();

    TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(Panier.getModel());

    private final String[] enetes = {"Nom du Medicament", "Catégorie", "Quantité", "Prix Unitaire", "Prix Total"};

    @Override
    public int getRowCount() {
        return daoPanier.findALL().size();
    }

    @Override
    public int getColumnCount() {
        return enetes.length;
    }
    public String getColumnName(int columnIndex){
        return enetes[columnIndex];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return daoPanier.find(rowIndex+1).getMedicament().getNom();
            case 1:
                return daoPanier.find(rowIndex+1).getMedicament().getCategorie().getCat_Categorie();
            case 2:
                return daoPanier.find(rowIndex+1).getPanier_Qte();
            case 3:
                return daoPanier.find(rowIndex+1).getMedicament().getPrix();
            case 4:
                return null;
            default:
                return null; //Ne devrait jamais arriver
        }
    }
}
