package people;

import java.util.ArrayList;
import java.util.List;

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
	        
	        Personne Jean = new Personne("Jean","Fouqueaut", adresse_Jean, "06.55.99.88.77", "Jean.Fouqueaut@gmail.com");
	        Personne Sarah = new Personne("Sarah", "Dupond",adresse_Sarah, "06.84.52.67.58", "Sarah.Dupont@hotmail.com");
	        Personne Marie = new Personne("Marie", "Petain", adresse_Marie, "06.52.14.58.96", "Marie.Durand@orange.fr");
	        
	        clients.add(new Client(Jean, "05/05/1998", "582 158 598 325 21" ));
	        clients.add(new Client(Sarah,"09/09/1986", "582 256 584 235 21" ));
	        clients.add(new Client(Marie, "15/12/2000","582 698 874 236 21" ));
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
}
