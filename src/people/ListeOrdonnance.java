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

	private static final long serialVersionUID = 5380417556060869746L;

	private final static List<Ordonnance> ordonnances = new ArrayList<Ordonnance>();
	TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(gestion.Ordonnance.getModel()); 
 
    private final String[] entetes = {"Numéro Ordonnance", "Nom Médecin", "Nom Specialiste", "Date de l'ordonnance"};
    
    public ListeOrdonnance() {
        super();
        Adresse Cabinet = new Adresse (17,"Rue des Soins", 59842, "Dunkerque");
        Personne Michel = new Personne("Michel","Michel",Cabinet,"06.58.44.22.69","Michel.Michel@medecin.fr");
        Personne Michelle =  new Personne("Michelle","Michelle", Cabinet,"06.59.45.23.70","Michelle.Michelle@medecin.fr");
        Personne Paul = new Personne("Paul","Special", Cabinet, "06.60.46.24.71","Paul.Special@specialiste.fr");
        Personne Jacqueline = new Personne("Jacqueline","Speciale",Cabinet, "06.61.47.25.72","Jacequline.Speciale@specialiste.fr");
        Personne Jean = new Personne("Jean","Boscher",Cabinet,"06.62.67.25.75","Jean.Boscher@medecin.fr");
        
        Medecin Med1 = new Medecin(Michel, 1 );
        Medecin Med2 = new Medecin(Michelle, 2);
        Medecin Med3 = new Medecin(Jean, 3);
        
        Specialiste Spe1 = new Specialiste(Paul, "Chiurgie");
        Specialiste Spe2 = new Specialiste(Jacqueline, "Cardiologie");
        
        ordonnances.add(new Ordonnance("183", Med1 , Spe2 ,"30/08/2023"));
        ordonnances.add(new Ordonnance("183", Med1 , Spe2 ,"30/08/2023"));
        ordonnances.add(new Ordonnance("183", Med2 , Spe1 ,"30/08/2023"));
        ordonnances.add(new Ordonnance("183", Med2 , Spe2 ,"30/08/2023"));
        ordonnances.add(new Ordonnance("183", Med2 , Spe2 ,"30/08/2023"));
        ordonnances.add(new Ordonnance("183", Med3 , Spe1 ,"30/08/2023"));
        ordonnances.add(new Ordonnance("183", Med3 , Spe2 ,"30/08/2023"));
        	
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
