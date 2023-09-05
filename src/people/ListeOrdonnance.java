package people;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import gestion.Ordonnance;
import utilitaire.Personne;

public class ListeOrdonnance extends AbstractTableModel {

	public  Personne Personne;

	private static final long serialVersionUID = 5380417556060869746L;

	public static List<Ordonnance> ordonnances = new ArrayList<Ordonnance>();
	TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(gestion.Ordonnance.getModel()); 
 
    private final String[] entetes = {"Numéro Ordonnance", "Nom Médecin", "Date de l'ordonnance"};
    

    	public ListeOrdonnance() {
    		super();
    		ordonnances.add(new Ordonnance("183",people.Medecin.getMedecin(1) , people.Specialiste.getSpecialiste(0) ,"30/08/2023"));
    		ordonnances.add(new Ordonnance("184", people.Medecin.getMedecin(0) , people.Specialiste.getSpecialiste(1) ,"30/08/2023"));
    		ordonnances.add(new Ordonnance("185", people.Medecin.getMedecin(0) , people.Specialiste.getSpecialiste(1) ,"30/08/2023"));
            ordonnances.add(new Ordonnance("181", people.Medecin.getMedecin(0) , people.Specialiste.getSpecialiste(0) ,"30/08/2023"));
            ordonnances.add(new Ordonnance("186", people.Medecin.getMedecin(1) , people.Specialiste.getSpecialiste(1) ,"30/08/2023"));
            ordonnances.add(new Ordonnance("187", people.Medecin.getMedecin(1) , people.Specialiste.getSpecialiste(1) ,"30/08/2023"));
            ordonnances.add(new Ordonnance("182", people.Medecin.getMedecin(1) , people.Specialiste.getSpecialiste(0) ,"30/08/2023"));
            ordonnances.add(new Ordonnance("180", people.Medecin.getMedecin(1) , people.Specialiste.getSpecialiste(1) ,"30/08/2023"));
    	}

    	/**
    	 * 
    	 * @param i
    	 * @return
    	 */
    	public static Ordonnance getOrdonnance(int i) {
    		return ordonnances.get(i);
    	}
    	/**
    	 * 
    	 * @param ListeOrdonnances
    	 */
    	public static void setOrdonnance(ArrayList<Ordonnance> ListeOrdonnances) {
    		ListeOrdonnance.ordonnances = ListeOrdonnances;
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
        case 2 :
        	return ordonnances.get(rowIndex).getDate_Ordonnance();
        default:
            return null; //Ne devrait jamais arriver
	}
}
	/**
	 * 
	 * @param Ordonnances
	 */
	  public void addOrdonnance(Ordonnance Ordonnances) {
	        ordonnances.add(Ordonnances);
	 
	        fireTableRowsInserted(ordonnances.size() -1, ordonnances.size() -1);

	  }
	  /**
	   * 
	   * @return
	   */
	public static List<Ordonnance> getOrdonnances() {
		return ordonnances;
	}
	  
}
