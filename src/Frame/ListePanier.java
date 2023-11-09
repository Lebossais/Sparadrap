package Frame;

import DAO.DAOPanier;
import gestion.Panier;

import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class ListePanier  extends AbstractTableModel {

    private DAOPanier daoPanier = new DAOPanier();
    private static final long serialVersionUID = 5380417556060869746L;

    TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(Panier.getModel());

    private final String[] entetes = {"Nom du Medicament", "Catégorie", "Quantité", "Prix Unitaire", "Prix Total"};

    public ListePanier(){
        super();
    }

    @Override
    public int getRowCount() {
        return 7;
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
                return getColumnName(0);
            case 1 :
                return getColumnName(1);
            case 2 :
                return getColumnName(2);
            case 3 :
                return getColumnName(3);
            case 4 :
                return getColumnName(4);
            default:
                return null; //Ne devrait jamais arriver
        }
    }
}
