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

import DAO.DAOOrdonnance;
import gestion.Ordonnance;
import Frame.ListeOrdonnance;

public class HistoriqueOrdonnances extends JFrame {

private static final long serialVersionUID = 1L;
private ListeOrdonnance modele = new ListeOrdonnance();
private JTable tableau = new JTable(modele);; 
public JFrame frame;
private DAOOrdonnance daoOrdonnance = new DAOOrdonnance();
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
    boutons.add(new JButton(new QuitterAction()));

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
	try {
    String regex = JOptionPane.showInputDialog("Indiquer le Prénom du Medecin : ");
    

    sorter.setRowFilter(RowFilter.regexFilter(regex, 0, 1));
	// capture sur le Boutton annuler
	}catch (NullPointerException e2) {	}
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

    for (Ordonnance c : daoOrdonnance.findALL()) {
    	if (c.getOrd_Num().equals(tableau.getModel().getValueAt(modelIndexes[0], 0))){
    		JOptionPane.showMessageDialog(null, "Voici les informations :" + c.toString());
    	}
    }
}
}
class QuitterAction extends AbstractAction {
	
	private static final long serialVersionUID = 1L;
	
	private QuitterAction() {
		super("Quitter");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getActionCommand().toString());
		System.out.println(e.getSource().toString());
		
		int sortie = JOptionPane.showConfirmDialog(frame, "Etes-vous sûr ?", 
				"Quitter", JOptionPane.YES_NO_OPTION);
		
		if (sortie == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
	}
	
}
}