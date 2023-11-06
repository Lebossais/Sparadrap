package Frame;

import java.util.List;

import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import DAO.DAOOrdonnance;
import DAO.DAOSpecialiste;
import gestion.Ordonnance;
import gestion.Specialiste;

public class ListeOrdonnance extends AbstractTableModel {

	private DAOOrdonnance daoOrdonnance = new DAOOrdonnance();

	private static final long serialVersionUID = 5380417556060869746L;

	TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(gestion.Ordonnance.getModel()); 
 
    private final String[] entetes = {"Numéro Ordonnance", "Nom Médecin", "Date de l'ordonnance"};
    

    	public ListeOrdonnance() {
    		super();
    	}


	@Override
	public int getRowCount() {
        return daoOrdonnance.findALL().size();
    }
 
    public int getColumnCount() {
        return entetes.length;
    }
 
    public String getColumnName(int columnIndex) {
        return entetes[columnIndex];
    }
 

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		switch(columnIndex){
        case 0:
        	return daoOrdonnance.findNumOrdonnance();
        case 1:
            return daoOrdonnance.findDateordonnance();
        case 2 :
        	return daoOrdonnance.findmedecinprenom();
        default:
            return null; //Ne devrait jamais arriver
	}
}
	/**
	 * 
	 * @param Ordonnances
	 */
//	  public void addOrdonnance(Ordonnance Ordonnances) {
//		  Declaration.ordonnances.add(Ordonnances);
//
//	        fireTableRowsInserted(Declaration.ordonnances.size() -1, Declaration.ordonnances.size() -1);
	// }
}
