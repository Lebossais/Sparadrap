package people;


import java.util.ArrayList;
import java.util.List;


import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import gestion.Ordonnance;
import utilitaire.Personne;

public class ListeAchat extends AbstractTableModel {

	private static final long serialVersionUID = 5380417556060869746L;
	Object p = null;
	public final static List<Achats> achats = new ArrayList<Achats>();
	TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(Achats.getModel()); 
 
    private final String[] entetes = {"Prénom du Client", "N° de Sécu", "N° Ordonnance", "Date"}; // Les différentes entêtes
    
    public ListeAchat() {
        super();
        achats.add(new Achats(Personne.getPersonne(0),Mutuelle.getMutuelle(0),"582 158 598 325 21","31/08/2023", ListeOrdonnance.getOrdonnance(0), gestion.AchatMedicament.getAchatMedicament(0)));
        }

	@Override
	public int getRowCount() {
        return achats.size();
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
        	return achats.get(rowIndex).Personne.getPrenom();
        case 1:
            return achats.get(rowIndex).getNum_Secu();
        case 2 :
        	//Problème concernant une commande sans Ordonnance arrive. Essayer différentes choses mais impossible de remplacer.
            return achats.get(rowIndex).Ordonnance.getNum_Ordonnance();
        case 3 :
        	return achats.get(rowIndex).getDate();
        default:
            return null; //Ne devrait jamais arriver
	}
}
	/**
	 * 
	 * @param Achats
	 */
	  public void addAchats(Achats Achats) {
	        achats.add(Achats);
	 
	        fireTableRowsInserted(achats.size() -1, achats.size() -1);
	  }
	  /**
	   * 
	   * @return
	   */
	public static List<Achats> getAchats() {
		return achats;
	}
	  
	  
	 
}