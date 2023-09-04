package principal;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.util.Arrays;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import people.Client;
import people.ListeClient;
import utilitaire.Adresse;
import utilitaire.Personne;
import java.awt.Toolkit;

public class Liste extends JFrame {

private static final long serialVersionUID = 1L;
private ListeClient modele = new ListeClient();
private JTable tableau = new JTable(modele);;
public JFrame frame;
TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(tableau.getModel());


public Liste() {
    setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\PROJET\\JAVA\\Sparadrap\\src\\swing\\bank\\Logo-removebg-preview.png"));

    setTitle("Liste des Clients");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    getContentPane().add(new JScrollPane(tableau), BorderLayout.CENTER);

    JPanel boutons = new JPanel();

    boutons.add(new JButton(new InformationsAction()));
    boutons.add(new JButton(new RemoveAction()));
    boutons.add(new JButton(new FilterAction()));
    boutons.add(new JButton(new RetourAction()));

    getContentPane().add(boutons, BorderLayout.SOUTH);
    tableau.setAutoCreateRowSorter(true); 
    tableau.setRowSorter(sorter);
    sorter.setSortable(2, false);
    sorter.setSortsOnUpdates(true);
  
    pack();
 
}




private class RemoveAction extends AbstractAction {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private RemoveAction() {
        super("Supprimmer");
    }

//    public void actionPerformed(ActionEvent e) {
//        int[] selection = tableau.getSelectedRows();
//
//        for(int i = selection.length - 1; i >= 0; i--){
//            modele.removeClient(selection[i]);
//        }
//    }
 public void actionPerformed(ActionEvent e) {
    int[] selection = tableau.getSelectedRows();
    int[] modelIndexes = new int[selection.length];

    for(int i = 0; i < selection.length; i++){
        modelIndexes[i] = tableau.getRowSorter().convertRowIndexToModel(selection[i]);
    }

    Arrays.sort(modelIndexes);

    for(int i = modelIndexes.length - 1; i >= 0; i--){
        modele.removeClient(modelIndexes[i]);
    }
 }
	

}

class FilterAction extends AbstractAction {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;



private FilterAction() {
    super("Filtrer");
}


public void actionPerformed(ActionEvent e) {
    String regex = JOptionPane.showInputDialog("Regex de filtre : ");
    

    sorter.setRowFilter(RowFilter.regexFilter(regex,0,1,2,3 ));
}
}
class RetourAction extends AbstractAction {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private RetourAction() {
		super("Retour");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		dispose();
		
	}	
	}

private class InformationsAction extends AbstractAction {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private InformationsAction() {
        super("Informations");
    }

 public void actionPerformed(ActionEvent e) {
    int[] selection = tableau.getSelectedRows();
    int[] modelIndexes = new int[selection.length];

    for(int i = 0; i < selection.length; i++){
        modelIndexes[i] = tableau.getRowSorter().convertRowIndexToModel(selection[i]);
    }

    Arrays.sort(modelIndexes);

    for (Client c : ListeClient.getClients()) {
    	if (c.Personne.getPrenom().equals(tableau.getModel().getValueAt(modelIndexes[0], 0))){
    		JOptionPane.showMessageDialog(null, "Voici les informations :" + c.toString());
    	}
    }
}
}
}