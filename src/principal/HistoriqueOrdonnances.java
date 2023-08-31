package principal;

import java.awt.BorderLayout;
import java.awt.Toolkit;
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
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import gestion.Ordonnance;
import people.ListeOrdonnance;

public class HistoriqueOrdonnances extends JFrame {

private static final long serialVersionUID = 1L;
private ListeOrdonnance modele = new ListeOrdonnance();
private JTable tableau = new JTable(modele);; 
public JFrame frame;

TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(tableau.getModel());

public HistoriqueOrdonnances() {
    setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\PROJET\\JAVA\\Sparadrap\\bin\\swing\\bank\\Logo-removebg-preview.png"));

    setTitle("Historique des Ordonnances");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    getContentPane().add(new JScrollPane(tableau), BorderLayout.CENTER);
    JPanel boutons = new JPanel();

    boutons.add(new JButton(new InformationsAction()));
    boutons.add(new JButton(new FilterAction()));
    boutons.add(new JButton(new RetourAction()));

    getContentPane().add(boutons, BorderLayout.SOUTH);
    tableau.setAutoCreateRowSorter(true); 
    tableau.setRowSorter(sorter);
    sorter.setSortable(2, false);
    sorter.setSortsOnUpdates(true);
  
    pack();
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
    String regex = JOptionPane.showInputDialog("Indiquer le Prénom du Medecin : ");
    

    sorter.setRowFilter(RowFilter.regexFilter(regex, 0, 1));
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

    for (Ordonnance c : ListeOrdonnance.getOrdonnances()) {
    	if (c.Medecin.Personne.getPrenom().equals(tableau.getModel().getValueAt(modelIndexes[0], 0))){
    		JOptionPane.showMessageDialog(null, "Voici les informations :" + c.toString());
    	}
    }
}
}
}