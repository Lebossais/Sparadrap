package people;

import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import gestion.Achats;
import gestion.Declaration;

public class ListeAchat extends AbstractTableModel {

	private static final long serialVersionUID = 5380417556060869746L;
	Object p = null;
	TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(Achats.getModel()); 
 
    private final String[] entetes = {"Prénom du Client", "N° de Sécu", "N° Ordonnance", "Date"}; // Les différentes entêtes

	@Override
	public int getRowCount() {
        return Declaration.achats.size();
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
        	return Declaration.achats.get(rowIndex).getPersonne().getPrenom();
        case 1:
            return Declaration.achats.get(rowIndex).getNum_Secu();
        case 2 :
        	//Problème concernant une commande sans Ordonnance arrive. Essayer différentes choses mais impossible de remplacer.
			if (Declaration.achats.get(rowIndex).getOrdonnance() == null) {
				return null;
			}else if (Declaration.achats.get(rowIndex).getOrdonnance().getNum_Ordonnance() !=null) {
				return Declaration.achats.get(rowIndex).getOrdonnance().getNum_Ordonnance();
			}
        case 3 :
        	return Declaration.achats.get(rowIndex).getDate();
        default:
            return null; //Ne devrait jamais arriver
	}
}
	/**
	 * 
	 * @param Achats
	 */
	  public void addAchats(Achats Achats) {
	        Declaration.achats.add(Achats);
	 
	        fireTableRowsInserted(Declaration.achats.size() -1, Declaration.achats.size() -1);
	  }
}