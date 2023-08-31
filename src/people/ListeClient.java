package people;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import utilitaire.Personne;

public class ListeClient extends AbstractTableModel {

		private static final long serialVersionUID = 5380417556060869746L;

		private final static List<Client> clients = new ArrayList<Client>();
		TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(Client.getModel()); 
	 
	    private final String[] entetes = {"Prenom", "Nom", "N° de Secu", "Telephone"};
	    
	    public ListeClient() {
	        super();
	        
	        // Mutuelle Mutuelle, Medecin Medecin_Traitant, Specialiste Specialiste
	        
	        clients.add(new Client(utilitaire.Personne.getPersonne(0), "05/05/1998", "582 158 598 325 21", Mutuelle.getMutuelle(0),Medecin.getMedecin(0),Specialiste.getSpecialiste(0)));
	        clients.add(new Client(utilitaire.Personne.getPersonne(1),"09/09/1986", "582 256 584 235 21",Mutuelle.getMutuelle(0),Medecin.getMedecin(0),Specialiste.getSpecialiste(1) ));
	        clients.add(new Client(utilitaire.Personne.getPersonne(2), "15/12/2000","582 698 874 236 21",Mutuelle.getMutuelle(1),Medecin.getMedecin(1),null ));
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
	    
	    public void InformationsClients() {
	    	
	    }

		public static List<Client> getClients() {
			return clients;
		}

	    
}
