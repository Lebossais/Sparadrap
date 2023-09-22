package people;

import java.util.List;

import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import gestion.Declaration;
import gestion.Ordonnance;
import utilitaire.Personne;

public class ListeOrdonnance extends AbstractTableModel {

	public  Personne Personne;

	private static final long serialVersionUID = 5380417556060869746L;

	TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(gestion.Ordonnance.getModel()); 
 
    private final String[] entetes = {"Numéro Ordonnance", "Nom Médecin", "Date de l'ordonnance"};
    

    	public ListeOrdonnance() {
    		super();
    	}


	@Override
	public int getRowCount() {
        return Declaration.ordonnances.size();
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
        	return Declaration.ordonnances.get(rowIndex).getNum_Ordonnance();
        case 1:
            return Declaration.ordonnances.get(rowIndex).Medecin.Personne.getPrenom();
        case 2 :
        	return Declaration.ordonnances.get(rowIndex).getDate_Ordonnance();
        default:
            return null; //Ne devrait jamais arriver
	}
}
	/**
	 * 
	 * @param Ordonnances
	 */
	  public void addOrdonnance(Ordonnance Ordonnances) {
		  Declaration.ordonnances.add(Ordonnances);
	 
	        fireTableRowsInserted(Declaration.ordonnances.size() -1, Declaration.ordonnances.size() -1);

	  }
	  /**
	   * 
	   * @return
	   */
	public static List<Ordonnance> getOrdonnances() {
		return Declaration.ordonnances;
	}
	  
}
