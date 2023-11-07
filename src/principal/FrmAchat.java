package principal;



import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JPanel;
import java.awt.BorderLayout;


import DAO.*;
import gestion.*;
import gestion.Compose;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;

import javax.swing.JComboBox;

public class FrmAchat {

	JFrame Achat;
	private JTextField txtDateOrdonnance;
	private JTextField txtNumOrdonnance;
	private JTextField txtDate;
	boolean b = false;
	JComboBox comboBoxClient;
	JComboBox comboBoxMutuelle;
	JComboBox comboBoxSpe;
	JComboBox comboBoxMed;
	JComboBox comboBoxMedicament;
	private JTextField txtQuantite;
	private DAOMedecin daoMedecin = new DAOMedecin();
	private DAOSpecialiste daoSpecialiste = new DAOSpecialiste();
	private DAOClient daoClient = new DAOClient();
	private DAOMutuelle daoMutuelle = new DAOMutuelle();
	private DAOMedicament daoMedicament = new DAOMedicament();

	/**
	 * Create the application.
	 */
	public FrmAchat() {
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
		
		JLabel nomMedecin = new JLabel("Medecin Traitant :");
		nomMedecin.setBounds(25, 326, 103, 20);
		panel_1.add(nomMedecin);
		
		JLabel NomSpecialiste = new JLabel("Specialiste :");
		NomSpecialiste.setBounds(153, 326, 65, 20);
		panel_1.add(NomSpecialiste);
		
		txtDateOrdonnance = new JTextField();
		txtDateOrdonnance.setText("JJ/MM/AAAA");
		txtDateOrdonnance.setEnabled(false);
		txtDateOrdonnance.setColumns(10);
		txtDateOrdonnance.setBounds(265, 351, 132, 20);
		panel_1.add(txtDateOrdonnance);
		
		JLabel DateOrdonnance = new JLabel("Date de l'ordonnance :");
		DateOrdonnance.setBounds(267, 326, 130, 20);
		panel_1.add(DateOrdonnance);
		
		txtNumOrdonnance = new JTextField();
		txtNumOrdonnance.setText("XXX");
		txtNumOrdonnance.setEnabled(false);
		txtNumOrdonnance.setColumns(10);
		txtNumOrdonnance.setBounds(313, 278, 98, 20);
		panel_1.add(txtNumOrdonnance);
		
		JLabel NumOrdonnance = new JLabel("Numéro Ordonnance :");
		NumOrdonnance.setBounds(175, 278, 139, 20);
		panel_1.add(NumOrdonnance);
		
		txtDate = new JTextField();
		txtDate.setText("JJ/MM/AAAA");
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
		for(int i=1; i<daoMutuelle.findALL().size()+1; i++){
			comboBoxMutuelle.addItem(daoMutuelle.find(i).getEntreprise().getEnt_Raison_Sociale());
		};
		
		comboBoxMed = new JComboBox ();
		comboBoxMed.setEnabled(false);
		comboBoxMed.setBounds(25, 350, 92, 22);
		panel_1.add(comboBoxMed);
		for(int i =1; i<daoMedecin.findALL().size()+1; i++){
			comboBoxMed.addItem(daoMedecin.find(i).getPersonne().getPrenom());
		}

		comboBoxSpe = new JComboBox();
		comboBoxSpe.setEnabled(false);
		comboBoxSpe.setBounds(146, 350, 92, 22);
		panel_1.add(comboBoxSpe);
		for(int i =1; i<daoSpecialiste.findALL().size()+1; i++){
			comboBoxSpe.addItem(daoSpecialiste.find(i).getPersonne().getPrenom());
		}
		comboBoxSpe.addItem(null);
		
		comboBoxClient = new JComboBox();
		comboBoxClient.setBounds(25, 42, 92, 22);
		panel_1.add(comboBoxClient);
		for(int i =1; i<daoClient.findALL().size()+1; i++){
			comboBoxClient.addItem(daoClient.find(i).getPersonne().getPrenom());
		}
		
		comboBoxMedicament = new JComboBox();
		comboBoxMedicament.setBounds(46, 191, 130, 29);
		panel_1.add(comboBoxMedicament);
		for(int i =1; i<daoMedicament.findALL().size()+1; i++){
			comboBoxMedicament.addItem(daoMedicament.find(i).getNom());
		}
		
		
		txtQuantite = new JTextField();
		txtQuantite.setColumns(10);
		txtQuantite.setBounds(201, 193, 97, 24);
		panel_1.add(txtQuantite);
		
		JLabel lblMedicament = new JLabel("Medicament :");
		lblMedicament.setBounds(46, 162, 84, 20);
		panel_1.add(lblMedicament);
		
		JLabel lblQuantit = new JLabel("Quantité :");
		lblQuantit.setBounds(197, 162, 84, 20);
		panel_1.add(lblQuantit);
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
/*
		int i;
		Specialiste c = null;
		Mutuelle a = null;
		String t = null;
		String n = null;
		Medecin o = null;
		Specialiste s = null;
		Medicament m = null;

		try {
			for(i = 0; i < comboBoxClient.getItemCount();i++) {
				 Object p = comboBoxClient.getSelectedItem();
			if (p.equals(Declaration.getClient(i).getPersonne().getPrenom())) {
			c = Declaration.getClient(i).getPersonne();
			n = Declaration.getClient(i).getNumero_Secu();
		break;
		}
		}
			for(i = 0; i < comboBoxMutuelle.getItemCount();i++) {
				 Object p = comboBoxMutuelle.getSelectedItem();
			if (p.equals(Declaration.getMutuelle(i).getPersonne().getPrenom())) {
			a = Declaration.getMutuelle(i);
			break;
		}
		}
			t = txtDate.getText();
		
		if(b == true) {
			for(i =0; i<comboBoxMed.getItemCount();i++) {
				Object p = comboBoxMed.getSelectedItem();
				if (p.equals(Declaration.getMedecin(i).getPersonne().getPrenom())) {
				o = Declaration.getMedecin(i);
				break;
				}
			}
			for(i =0; i<comboBoxSpe.getItemCount();i++) {
				Object p = comboBoxSpe.getSelectedItem();
				 if (p == null) {
					s = null;
					break;
				 }else if (p.equals(Declaration.getSpecialiste(i).getPersonne().getPrenom())) {
						s = Declaration.getSpecialiste(i);
				break;
				}
			}
			Declaration.ordonnances.add(new Ordonnance(txtNumOrdonnance.getText(),o,s, txtDateOrdonnance.getText()));
		}
		
		for (i = 0; i<comboBoxMedicament.getItemCount();i++) {
			Object p = comboBoxMedicament.getSelectedItem();
			if (p.equals(Declaration.getMedicament(i).getNom()));
			m = Declaration.getMedicament(i);
		}
		Integer nombre = Integer.valueOf(txtQuantite.getText());
		Declaration.achatMedicament.add(new Achat(m, nombre));
		
		if (b == false) {
		Declaration.achats.add(new Compose(c, a ,n , t, null, Declaration.getAchatMedicament(Declaration.achatMedicament.size()-1)));
		} else if ( b == true ) {
			Declaration.achats.add(new Compose(c, a ,n , t, Declaration.getOrdonnance(Declaration.ordonnances.size()-1),Declaration.getAchatMedicament(Declaration.achatMedicament.size()-1) ));
		}
	Achat.dispose();
	int input = JOptionPane.showConfirmDialog(null, 
            "Nouvel achat effectué", "Validation", JOptionPane.DEFAULT_OPTION);
		}catch (java.lang.NumberFormatException e2){
			JOptionPane.showConfirmDialog(null, "Achat non effectué ","Erreur",JOptionPane.DEFAULT_OPTION);
		}
	*/
		
	}
	}