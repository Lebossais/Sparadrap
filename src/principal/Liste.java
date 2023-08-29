package principal;

import java.awt.BorderLayout;
import java.awt.Color;
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
import people.Client;
import people.ListeClient;
import utilitaire.Adresse;
import utilitaire.Personne;

public class Liste extends JFrame {

private static final long serialVersionUID = 1L;
private ListeClient modele = new ListeClient();
private JTable tableau;

public Liste() {
    super();

    setTitle("Liste des Clients");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    tableau = new JTable(modele);

    getContentPane().add(new JScrollPane(tableau), BorderLayout.CENTER);

    JPanel boutons = new JPanel();

    boutons.add(new JButton(new AddAction()));
    boutons.add(new JButton(new RemoveAction()));
    boutons.add(new JButton(new FilterAction()));

    getContentPane().add(boutons, BorderLayout.SOUTH);

    pack();
}

public static void main(String[] args) {
    new Liste().setVisible(true);
}

private class AddAction extends AbstractAction {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private AddAction() {
        super("Ajouter");
    }

    public void actionPerformed(ActionEvent e) {
    	Adresse adresse_Leonardo = new Adresse(48,"Rue des Musiciens", 59000,"Lille");
    	Personne Leonardo = new Personne("Leonardo","Tortueli", adresse_Leonardo, "0655998877", "Jean.Fouqueaut@gmail.com");
    	
        modele.addClient(new Client(Leonardo, "18/12/1958", "582 598 254 325 21" ));
    }
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

        for(int i = selection.length - 1; i >= 0; i--){
            modele.removeClient(selection[i]);
        }
    }
}
public void actionPerformed(ActionEvent e) {
    int[] selection = Personne.getSelectedRows();
    int[] modelIndexes = new int[selection.length];

    for(int i = 0; i < selection.length; i++){
        modelIndexes[i] = Personne.getRowSorter().convertRowIndexToModel(selection[i]);
    }

    Arrays.sort(modelIndexes);

    for(int i = modelIndexes.length - 1; i >= 0; i--){
    //    Roman.removeRoman(modelIndexes[i]);
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

  //  sorter.setRowFilter(RowFilter.regexFilter(regex, 0, 1));
}
}
}