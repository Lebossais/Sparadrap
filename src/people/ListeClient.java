package people;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import utilitaire.Adresse;
import utilitaire.Personne;

public class ListeClient extends AbstractTableModel {

		private static final long serialVersionUID = 5380417556060869746L;

		private final List<Client> clients = new ArrayList<Client>();
		TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(Client.getModel()); 
	 
	    private final String[] entetes = {"Prenom", "Nom", "N° de Secu", "Telephone"};
	    
	    public ListeClient() {
	        super();
	        Adresse adresse_Jean = new Adresse(59, "Rue de la Paix", 59842, "Bethune");
	        Adresse adresse_Sarah = new Adresse(47, "Rue de la Liberté",58421,"La Gorgue");
	        Adresse adresse_Marie = new Adresse(2, "Rue de la Gastronomie", 59875,"Armentières");
	        Adresse Cabinet = new Adresse (17,"Rue des Soins", 59842, "Dunkerque");
	        Adresse Base_Des_Mutuelles = new Adresse (25,"Rue des Concurrents", 62000, "Lens");
	        
	        Personne Jean = new Personne("Jean","Fouqueaut", adresse_Jean, "06.55.99.88.77", "Jean.Fouqueaut@gmail.com");
	        Personne Sarah = new Personne("Sarah", "Dupond",adresse_Sarah, "06.84.52.67.58", "Sarah.Dupont@hotmail.com");
	        Personne Marie = new Personne("Marie", "Petain", adresse_Marie, "06.52.14.58.96", "Marie.Durand@orange.fr");
	        
	        Personne Michel = new Personne("Michel","Michel",Cabinet,"06.58.44.22.69","Michel.Michel@medecin.fr");
	        Personne Michelle =  new Personne("Michelle","Michelle", Cabinet,"06.59.45.23.70","Michelle.Michelle@medecin.fr");
	        Personne Paul = new Personne("Paul","Special", Cabinet, "06.60.46.24.71","Paul.Special@specialiste.fr");
	        Personne Jacqueline = new Personne("Jacqueline","Speciale",Cabinet, "06.61.47.25.72","Jacequline.Speciale@specialiste.fr");
	        
	        Personne Acoris = new Personne("Acoris","Mutuelle",Base_Des_Mutuelles, "06.72.25.47.61","Acoris.Mutuelle@mutuelle.fr");
	        Personne France = new Personne("France","Mutuelle",Base_Des_Mutuelles , "06.73.26.48.62","France.Mutuelle@mutuelle.fr");
	        Mutuelle Acoris_Mutuelle = new Mutuelle(Acoris, 59, 85);
	        Mutuelle France_Mutuelle = new Mutuelle(France, 62, 60);
	        
	        Medecin Med1 = new Medecin(Michel, 1 );
	        Medecin Med2 = new Medecin(Michelle, 2);
	        
	        Specialiste Spe1 = new Specialiste(Paul, "Chiurgie");
	        Specialiste Spe2 = new Specialiste(Jacqueline, "Cardiologie");
	        
	        // Mutuelle Mutuelle, Medecin Medecin_Traitant, Specialiste Specialiste
	        
	        clients.add(new Client(Jean, "05/05/1998", "582 158 598 325 21", Acoris_Mutuelle,Med1,Spe1));
	        clients.add(new Client(Sarah,"09/09/1986", "582 256 584 235 21",Acoris_Mutuelle,Med1,Spe2 ));
	        clients.add(new Client(Marie, "15/12/2000","582 698 874 236 21",France_Mutuelle,Med2,null ));
	    }
	 
	    public int getRowCount() {
	        return clients.size();
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
	                return clients.get(rowIndex).Personne.getPrenom();
	            case 1:
	                return clients.get(rowIndex).Personne.getName();
	            case 2:
	                return clients.get(rowIndex).getNumero_Secu();
	            case 3 :
	            	return clients.get(rowIndex).Personne.getTelephone();
	            default:
	                return null; //Ne devrait jamais arriver
	        }
	    }
	 
	    public void addClient(Client Client) {
	        clients.add(Client);
	 
	        fireTableRowsInserted(clients.size() -1, clients.size() -1);
	    }
	 
	    public void removeClient(int rowIndex) {
	        clients.remove(rowIndex);
	 
	        fireTableRowsDeleted(rowIndex, rowIndex);
	    }
	    
	    public void Retour(JTable Liste) {
	    	
	    }
}
