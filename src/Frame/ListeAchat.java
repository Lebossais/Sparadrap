package Frame;

import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import DAO.DAOAchat;
import gestion.Compose;

public class ListeAchat extends AbstractTableModel {

	private DAOAchat daoAchat = new DAOAchat();

	private static final long serialVersionUID = 5380417556060869746L;
	Object p = null;
	TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(Compose.getModel());
 
    private final String[] entetes = {"Prénom du Client", "N° de Sécu", "N° Ordonnance", "Date"}; // Les différentes entêtes

	@Override
	public int getRowCount() {
        return daoAchat.findALL().size();
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
        	return daoAchat.find(rowIndex+1).getClient().getPersonne().getPrenom();
        case 1:
            return daoAchat.find(rowIndex+1).getClient().getNumero_Secu();
        case 2 :
        	//Problème concernant une commande sans Ordonnance arrive. Essayer différentes choses mais impossible de remplacer.
			if (daoAchat.find(rowIndex+1).getOrdonnance() == null) {
				return null;
			}else if (daoAchat.find(rowIndex+1).getOrdonnance() !=null) {
				return daoAchat.find(rowIndex+1).getOrdonnance().getOrd_Num(); // Declaration.achats.get(rowIndex).getOrdonnance().getNum_Ordonnance()
			}
        case 3 :
        	return daoAchat.find(rowIndex+1).getAchat_Date();
        default:
            return null; //Ne devrait jamais arriver
	}
}
}