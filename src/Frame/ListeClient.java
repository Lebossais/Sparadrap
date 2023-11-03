package Frame;


import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import gestion.Client;

public class ListeClient extends AbstractTableModel {

		private static final long serialVersionUID = 5380417556060869746L;

		TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(Client.getModel()); 
	 
	    private final String[] entetes = {"Prenom", "Nom", "N° de Secu", "Telephone"};
	    
	    public int getRowCount() {
	        return Declaration.getClients().size();
	    }
	 
	    
	    public int getColumnCount() {
	        return entetes.length;
	    }
	 
	    public String getColumnName(int columnIndex) {
	        return entetes[columnIndex];
	    }
	 
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch(columnIndex){
	            case 0:
	                return gestion.Client.get(rowIndex).Personne.getPrenom();
	            case 1:
	                return gestion.Client.get(rowIndex).Personne.getName();
	            case 2:
	                return gestion.Client.get(rowIndex).getNumero_Secu();
	            case 3 :
	            	return gestion.Client.get(rowIndex).Personne.getTelephone();
	            default:
	                return null; //Ne devrait jamais arriver
	        }
	    }
	 
	    /**
	     * 
	     * @param rowIndex
	     */
	    public void removeClient(int rowIndex) {
	        Declaration.clients.remove(rowIndex);
	 
	        fireTableRowsDeleted(rowIndex, rowIndex);
	    }
	    /**
	     * 
	     * @param Liste
	     */
	    public void Retour(JTable Liste) {
	    	
	    }

	    
}
