package people;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import gestion.Ordonnance;
import utilitaire.Adresse;
import utilitaire.Personne;

public class ListeOrdonnance extends AbstractTableModel {
	private String Date_Naissance;
	private String Numero_Secu;
	private Mutuelle Mutuelle;
	private Medecin Medecin_Traitant;
	private Specialiste Specialiste;
	public  Personne Personne;


	private static final long serialVersionUID = 5380417556060869746L;

	public static ArrayList<Ordonnance> ordonnances = new ArrayList<Ordonnance>();
	TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(gestion.Ordonnance.getModel()); 
 
    private final String[] entetes = {"Numéro Ordonnance", "Nom Médecin", "Nom Specialiste", "Date de l'ordonnance"};
    
    public ListeOrdonnance() {
        super();
    		initOrdonnance();
    	}
    	
    	public static void initOrdonnance() {
    		Ordonnance Ord0 = new Ordonnance ("183",people.Medecin.getMedecin(1) , people.Specialiste.getSpecialiste(0) ,"30/08/2023");
    		ordonnances.add(Ord0);
    		Ordonnance Ord1 = (new Ordonnance("184", people.Medecin.getMedecin(0) , people.Specialiste.getSpecialiste(1) ,"30/08/2023"));
    		ordonnances.add(Ord1);
    		Ordonnance Ord2 = (new Ordonnance("185", people.Medecin.getMedecin(0) , people.Specialiste.getSpecialiste(1) ,"30/08/2023"));
    		ordonnances.add(Ord2);
            Ordonnance Ord3 = (new Ordonnance("181", people.Medecin.getMedecin(0) , people.Specialiste.getSpecialiste(0) ,"30/08/2023"));
    		ordonnances.add(Ord3);
            Ordonnance Ord4 = (new Ordonnance("186", people.Medecin.getMedecin(1) , people.Specialiste.getSpecialiste(1) ,"30/08/2023"));
    		ordonnances.add(Ord4);
            Ordonnance Ord5 = (new Ordonnance("187", people.Medecin.getMedecin(1) , people.Specialiste.getSpecialiste(1) ,"30/08/2023"));
    		ordonnances.add(Ord5);
            Ordonnance Ord6 = (new Ordonnance("182", people.Medecin.getMedecin(1) , people.Specialiste.getSpecialiste(0) ,"30/08/2023"));
    		ordonnances.add(Ord6);
            Ordonnance Ord7 = (new Ordonnance("180", people.Medecin.getMedecin(1) , people.Specialiste.getSpecialiste(1) ,"30/08/2023"));
    		ordonnances.add(Ord7);
    	}


    	public static Ordonnance getOrdonnance(int i) {
    		return ordonnances.get(i);
    	}

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
	  public void InformationsClients() {
	    	
	    }

	public static List<Ordonnance> getOrdonnances() {
		return ordonnances;
	}
	  
}
