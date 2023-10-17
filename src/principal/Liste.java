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
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import gestion.Client;
import gestion.Declaration;
import people.ListeClient;
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
    boutons.add(new JButton(new NouveauAction()));
    boutons.add(new JButton(new RemoveAction()));
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




private class RemoveAction extends AbstractAction {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private RemoveAction() {
        super("Supprimmer");
    }
 public void actionPerformed(ActionEvent e) {
    int[] selection = tableau.getSelectedRows();
    int[] modelIndexes = new int[selection.length];

    for(int i = 0; i < selection.length; i++){
        modelIndexes[i] = tableau.getRowSorter().convertRowIndexToModel(selection[i]);
    }

    Arrays.sort(modelIndexes);

    for(int i = modelIndexes.length - 1; i >= 0; i--){
        modele.removeClient(modelIndexes[i]);
        revalidate();
        repaint();
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
	try {
    String regex = JOptionPane.showInputDialog("Regex de filtre : ");
    
    sorter.setRowFilter(RowFilter.regexFilter(regex,0,1,2,3 ));
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

    for (Client c : Declaration.getClients()) {
    	if (c.Personne.getPrenom().equals(tableau.getModel().getValueAt(modelIndexes[0], 0))){
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
class NouveauAction extends AbstractAction {
	private static final long serialVersionUID = 1L;
	private NouveauAction() {
		super("Nouveau Client");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Template_Client template_client = new Template_Client();
		Template_Client.template_frame.setVisible(true);
		
	}
}
}