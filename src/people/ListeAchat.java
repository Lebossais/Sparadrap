package people;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import gestion.Ordonnance;
import utilitaire.Adresse;
import utilitaire.Personne;

public class ListeAchat extends AbstractTableModel {

	private static final long serialVersionUID = 5380417556060869746L;

	private final static List<Ordonnance> ordonnances = new ArrayList<Ordonnance>();
	TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(gestion.Ordonnance.getModel()); 
 
    private final String[] entetes = {}; // Les différentes entêtes
    
    public ListeAchat() {
        super();
       
        }

	@Override
	public int getRowCount() {
        return ordonnances.size();
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
        	return ordonnances.get(rowIndex).getNum_Ordonnance();
        case 1:
            return ordonnances.get(rowIndex).Medecin.Personne.getPrenom();
        case 2:
            return ordonnances.get(rowIndex).Specialiste.Personne.getPrenom();
        case 3 :
        	return ordonnances.get(rowIndex).getDate_Ordonnance();
        default:
            return null; //Ne devrait jamais arriver
	}
}
	  public void addOrdonnance(Ordonnance Ordonnances) {
	        ordonnances.add(Ordonnances);
	 
	        fireTableRowsInserted(ordonnances.size() -1, ordonnances.size() -1);

	  }

	public static List<Ordonnance> getOrdonnances() {
		return ordonnances;
	}
	  
	  
	  
}