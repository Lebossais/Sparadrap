package principal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.SwingConstants;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

import gestion.Ordonnance;
import people.Achats;
import people.ListeAchat;
import people.ListeOrdonnance;
import people.Medecin;
import people.Mutuelle;
import people.Specialiste;
import utilitaire.Personne;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JComboBox;

public class Achat {

	JFrame Achat;
	private JTextField txtNsecu;
	private JTextField txtDateOrdonnance;
	private JTextField txtNumOrdonnance;
	private JTextField txtDate;
	boolean b = false;
	JComboBox comboBoxClient;
	JComboBox comboBoxMutuelle;
	JComboBox comboBoxSpe;
	JComboBox comboBoxMed;
	/**
	 * Create the application.
	 */
	public Achat() {
		initialize();
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Achat = new JFrame();
		Achat.setTitle("Achat");
		Achat.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\PROJET\\JAVA\\Sparadrap\\bin\\swing\\bank\\Logo-removebg-preview.png"));
		Achat.setBounds(100, 100, 438, 500);
		Achat.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel_1 = new JPanel();
		Achat.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);
		
		JRadioButton IfOrdonnance = new JRadioButton("Avec Ordonnance");
		IfOrdonnance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AfficherOrdonnance(e);
			}
		});
		IfOrdonnance.setBounds(25, 277, 130, 23);
		panel_1.add(IfOrdonnance);
		
		JLabel Client = new JLabel("Prenom Client :");
		Client.setBounds(25, 11, 103, 20);
		panel_1.add(Client);
		
		JLabel Mutuelle = new JLabel("Mutuelle :");
		Mutuelle.setBounds(27, 79, 84, 20);
		panel_1.add(Mutuelle);
		
		txtNsecu = new JTextField();
		txtNsecu.setColumns(10);
		txtNsecu.setBounds(171, 104, 86, 20);
		panel_1.add(txtNsecu);
		
		JLabel Nsecu = new JLabel("N° Secu :");
		Nsecu.setBounds(173, 79, 84, 20);
		panel_1.add(Nsecu);
		
		JLabel nomMedecin = new JLabel("Medecin Traitant :");
		nomMedecin.setBounds(25, 326, 103, 20);
		panel_1.add(nomMedecin);
		
		JLabel NomSpecialiste = new JLabel("Specialiste :");
		NomSpecialiste.setBounds(153, 326, 65, 20);
		panel_1.add(NomSpecialiste);
		
		txtDateOrdonnance = new JTextField();
		txtDateOrdonnance.setEnabled(false);
		txtDateOrdonnance.setColumns(10);
		txtDateOrdonnance.setBounds(265, 351, 132, 20);
		panel_1.add(txtDateOrdonnance);
		
		JLabel DateOrdonnance = new JLabel("Date de l'ordonnance :");
		DateOrdonnance.setBounds(267, 326, 130, 20);
		panel_1.add(DateOrdonnance);
		
		txtNumOrdonnance = new JTextField();
		txtNumOrdonnance.setEnabled(false);
		txtNumOrdonnance.setColumns(10);
		txtNumOrdonnance.setBounds(313, 278, 98, 20);
		panel_1.add(txtNumOrdonnance);
		
		JLabel NumOrdonnance = new JLabel("Numéro Ordonnance :");
		NumOrdonnance.setBounds(175, 278, 139, 20);
		panel_1.add(NumOrdonnance);
		
		txtDate = new JTextField();
		txtDate.setColumns(10);
		txtDate.setBounds(171, 43, 84, 20);
		panel_1.add(txtDate);
		
		JLabel Date = new JLabel("Date :");
		Date.setBounds(175, 11, 39, 20);
		panel_1.add(Date);
		
		JButton btnNewButton = new JButton("Valider");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Validation(e);
			}
		});
		btnNewButton.setBounds(154, 397, 114, 29);
		panel_1.add(btnNewButton);
		
		JButton btnReinitialiser = new JButton("Reinitialiser");
		btnReinitialiser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnReinitialiser.setBounds(17, 397, 114, 29);
		panel_1.add(btnReinitialiser);
		
		JLabel lblNewLabel_2 = new JLabel("MEDICAMEEEEEEEEEEEEEEEENTS");
		lblNewLabel_2.setBounds(82, 172, 257, 47);
		panel_1.add(lblNewLabel_2);
		
		JButton btnRetour = new JButton("Retour");
		btnRetour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				retour(e);
			}
		});
		btnRetour.setBounds(292, 397, 114, 29);
		panel_1.add(btnRetour);
		
		comboBoxMutuelle = new JComboBox();
		comboBoxMutuelle.setBounds(25, 103, 92, 22);
		panel_1.add(comboBoxMutuelle);
		comboBoxMutuelle.addItem(people.Mutuelle.getMutuelle(0).getPersonne().getPrenom());
		comboBoxMutuelle.addItem(people.Mutuelle.getMutuelle(1).getPersonne().getPrenom());
		comboBoxMutuelle.addItem(null);
		
		comboBoxMed = new JComboBox ();
		comboBoxMed.setEnabled(false);
		comboBoxMed.setBounds(25, 350, 92, 22);
		panel_1.add(comboBoxMed);
		comboBoxMed.addItem(people.Medecin.getMedecin(0).getPersonne().getPrenom());
		comboBoxMed.addItem(people.Medecin.getMedecin(1).getPersonne().getPrenom());

		comboBoxSpe = new JComboBox();
		comboBoxSpe.setEnabled(false);
		comboBoxSpe.setBounds(146, 350, 92, 22);
		panel_1.add(comboBoxSpe);
		comboBoxSpe.addItem(people.Specialiste.getSpecialiste(0).getPersonne().getPrenom());
		comboBoxSpe.addItem(people.Specialiste.getSpecialiste(1).getPersonne().getPrenom());
		comboBoxSpe.addItem(null);
		
		comboBoxClient = new JComboBox();
		comboBoxClient.setBounds(25, 42, 92, 22);
		panel_1.add(comboBoxClient);
		comboBoxClient.addItem(utilitaire.Personne.getPersonne(0).getPrenom());
		comboBoxClient.addItem(utilitaire.Personne.getPersonne(1).getPrenom());
		comboBoxClient.addItem(utilitaire.Personne.getPersonne(2).getPrenom());
	}
	
	private void AfficherOrdonnance(ActionEvent e) {
		if (b == false) {
			b = true;
		}else if (b == true) {
			b = false;
		}
		InitializeOrdonnance(b);
	}
	private void InitializeOrdonnance(boolean b) {
		if (b == true) {
			txtNumOrdonnance.setEnabled(true);
			txtDateOrdonnance.setEnabled(true);
			comboBoxSpe.setEnabled(true);
			comboBoxMed.setEnabled(true);
		} else if (b == false) {
			txtNumOrdonnance.setEnabled(false);
			txtDateOrdonnance.setEnabled(false);
			comboBoxSpe.setEnabled(false);
			comboBoxMed.setEnabled(false);
			
		}
	}
	private void retour(ActionEvent e) {
		Achat.dispose();
	}
	private void Validation(ActionEvent e) {
		int i;
		Personne c = null;
		Mutuelle a = null;
		String t = null;
		String n = null;
		Medecin o = null;
		Specialiste s = null;
		
		for(i = 0; i < comboBoxClient.getItemCount();i++) {
			 Object p = comboBoxClient.getSelectedItem();
		if (p.equals(utilitaire.Personne.getPersonne(i).getPrenom())) {
		c = utilitaire.Personne.getPersonne(i);
		break;
		}
		}
		for(i = 0; i < comboBoxMutuelle.getItemCount();i++) {
			 Object p = comboBoxMutuelle.getSelectedItem();
		if (p.equals(people.Mutuelle.getMutuelle(i).getPersonne().getPrenom())) {
		a = people.Mutuelle.getMutuelle(i);
		}
		break;
		}
		t = txtDate.getText();
		n = txtNsecu.getText();
		
		if( b == true) {
			for(i =0; i<comboBoxMed.getItemCount();i++) {
				Object p = comboBoxMed.getSelectedItem();
				if (p.equals(people.Medecin.getMedecin(i).getPersonne().getPrenom())) {
				o = people.Medecin.getMedecin(i);
				break;
				}
			}
			for(i =0; i<comboBoxSpe.getItemCount();i++) {
				Object p = comboBoxSpe.getSelectedItem();
				if (p.equals(people.Specialiste.getSpecialiste(i).getPersonne().getPrenom())) {
				s = people.Specialiste.getSpecialiste(i);
				break;
				}
			}
		ListeOrdonnance.ordonnances.add(new Ordonnance(txtNumOrdonnance.getText(),o,s, txtDateOrdonnance.getText()));
		}
		if (b == false) {
		ListeAchat.achats.add(new Achats(c, a ,n , t, null));
		} else if ( b == true ) {
			ListeAchat.achats.add(new Achats(c, a ,n , t, ListeOrdonnance.getOrdonnance(ListeOrdonnance.ordonnances.size()-1)));	
		}
	}
}