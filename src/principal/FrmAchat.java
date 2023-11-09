package principal;

import javax.swing.*;
import java.awt.*;
import DAO.*;
import Frame.ListePanier;
import gestion.Medicament;
import gestion.Ordonnance;
import gestion.Panier;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.table.*;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.util.Arrays;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class FrmAchat {
	JFrame Achat;
	private JTextField txtDateOrdonnance;
	private JTextField txtNumOrdonnance;
	private JTextField txtDate;
	boolean b = false;
	JComboBox comboBoxCategorie;
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
	private DAOCategorie daoCategorie = new DAOCategorie();
	private DAOMedicament daoMedicament = new DAOMedicament();
	public JFrame frame;
	public static ListePanier modele = new ListePanier();
	private JTable tableau = new JTable(modele);
	TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(tableau.getModel());
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
		Achat.setBounds(100, 100, 639, 641);
		Achat.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel_1 = new JPanel();
		Achat.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);

		JRadioButton IfOrdonnance = new JRadioButton("Avec Ordonnance");
		IfOrdonnance.setFont(new Font("Tahoma", Font.PLAIN, 13));
		IfOrdonnance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AfficherOrdonnance(e);
			}
		});
		IfOrdonnance.setBounds(25, 427, 130, 23);
		panel_1.add(IfOrdonnance);

		JLabel Client = new JLabel("Prenom Client :");
		Client.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Client.setBounds(25, 11, 103, 20);
		panel_1.add(Client);

		JLabel Mutuelle = new JLabel("Mutuelle :");
		Mutuelle.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Mutuelle.setBounds(246, 11, 84, 20);
		panel_1.add(Mutuelle);

		JLabel nomMedecin = new JLabel("Medecin :\r\n");
		nomMedecin.setFont(new Font("Tahoma", Font.PLAIN, 13));
		nomMedecin.setBounds(25, 478, 151, 29);
		panel_1.add(nomMedecin);

		JLabel NomSpecialiste = new JLabel("Specialiste :");
		NomSpecialiste.setFont(new Font("Tahoma", Font.PLAIN, 13));
		NomSpecialiste.setBounds(246, 478, 151, 29);
		panel_1.add(NomSpecialiste);

		txtDateOrdonnance = new JTextField();
		txtDateOrdonnance.setText("AAAA-MM-JJ");
		txtDateOrdonnance.setEnabled(false);
		txtDateOrdonnance.setColumns(10);
		txtDateOrdonnance.setBounds(445, 509, 151, 29);
		panel_1.add(txtDateOrdonnance);

		JLabel DateOrdonnance = new JLabel("Date de l'ordonnance :");
		DateOrdonnance.setFont(new Font("Tahoma", Font.PLAIN, 13));
		DateOrdonnance.setBounds(445, 478, 151, 29);
		panel_1.add(DateOrdonnance);

		txtNumOrdonnance = new JTextField();
		txtNumOrdonnance.setText("XXX");
		txtNumOrdonnance.setEnabled(false);
		txtNumOrdonnance.setColumns(10);
		txtNumOrdonnance.setBounds(418, 425, 151, 29);
		panel_1.add(txtNumOrdonnance);

		JLabel NumOrdonnance = new JLabel("Numéro Ordonnance :");
		NumOrdonnance.setFont(new Font("Tahoma", Font.PLAIN, 13));
		NumOrdonnance.setBounds(269, 428, 139, 20);
		panel_1.add(NumOrdonnance);

		txtDate = new JTextField();
		txtDate.setText("Now()");
		txtDate.setColumns(10);
		txtDate.setBounds(462, 40, 151, 29);
		panel_1.add(txtDate);

		JLabel Date = new JLabel("Date :");
		Date.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Date.setBounds(462, 11, 84, 20);
		panel_1.add(Date);

		comboBoxMutuelle = new JComboBox();
		comboBoxMutuelle.setBounds(244, 40, 151, 29);
		panel_1.add(comboBoxMutuelle);
		for (int i = 1; i < daoMutuelle.findALL().size() + 1; i++) {
			comboBoxMutuelle.addItem(daoMutuelle.find(i).getEntreprise().getEnt_Raison_Sociale());
		}

		comboBoxMed = new JComboBox();
		comboBoxMed.setEnabled(false);
		comboBoxMed.setBounds(25, 509, 151, 29);
		panel_1.add(comboBoxMed);
		for (int i = 1; i < daoMedecin.findALL().size() + 1; i++) {
			comboBoxMed.addItem(daoMedecin.find(i).getPersonne().getPrenom());
		}

		comboBoxSpe = new JComboBox();
		comboBoxSpe.setEnabled(false);
		comboBoxSpe.setBounds(246, 508, 151, 30);
		panel_1.add(comboBoxSpe);
		for (int i = 1; i < daoSpecialiste.findALL().size() + 1; i++) {
			comboBoxSpe.addItem(daoSpecialiste.find(i).getPersonne().getPrenom());
		}
		comboBoxSpe.addItem(null);

		comboBoxClient = new JComboBox();
		comboBoxClient.setBounds(25, 39, 151, 29);
		panel_1.add(comboBoxClient);
		for (int i = 1; i < daoClient.findALL().size() + 1; i++) {
			comboBoxClient.addItem(daoClient.find(i).getPersonne().getPrenom());
		}

		comboBoxMedicament = new JComboBox();
		comboBoxMedicament.setBounds(245, 125, 130, 29);
		panel_1.add(comboBoxMedicament);

		comboBoxCategorie = new JComboBox();
		comboBoxCategorie.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				comboBoxMedicament.removeAllItems();
				for (int i = 1; i < daoMedicament.findALL().size() + 1; i++) {
					if (comboBoxCategorie.getSelectedItem().equals(daoMedicament.find(i).getCategorie().getCat_Categorie())) {
						comboBoxMedicament.addItem(daoMedicament.find(i).getNom());
					}
				}
			}
		});
		comboBoxCategorie.setBounds(25, 125, 130, 29);
		panel_1.add(comboBoxCategorie);
		for (int i = 1; i < daoCategorie.findALL().size() + 1; i++) {
			comboBoxCategorie.addItem(daoCategorie.find(i).getCat_Categorie());
		}

		JLabel lblCategorie = new JLabel("Catégorie :");
		lblCategorie.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCategorie.setBounds(26, 94, 84, 20);
		panel_1.add(lblCategorie);

		txtQuantite = new JTextField();
		txtQuantite.setColumns(10);
		txtQuantite.setBounds(430, 127, 97, 24);
		panel_1.add(txtQuantite);

		JLabel lblMedicament = new JLabel("Medicament :");
		lblMedicament.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblMedicament.setBounds(246, 94, 84, 20);
		panel_1.add(lblMedicament);

		JLabel lblQuantit = new JLabel("Quantité :");
		lblQuantit.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblQuantit.setBounds(430, 94, 84, 20);
		panel_1.add(lblQuantit);

		JPanel panel = new JPanel();
		panel.setBounds(0, 569, 623, 33);
		panel_1.add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JButton btnReinitialiser = new JButton("Reinitialiser Achat");
		panel.add(btnReinitialiser);
		btnReinitialiser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		JButton ValideButton = new JButton("Valider");
		panel.add(ValideButton);
		ValideButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Valider(e);
			}
		});

		JButton RetourButton = new JButton("Retour");
		panel.add(RetourButton);
		RetourButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Retour(e);
			}
		});

		JButton QuitterButton = new JButton("Quitter");
		panel.add(QuitterButton);
		QuitterButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Quitter(e);
			}
		});

		JButton btnAjouter = new JButton("Ajouter");
		btnAjouter.setBounds(507, 166, 89, 23);
		panel_1.add(btnAjouter);

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(25, 200, 571, 196);
		panel_1.add(panel_2);

		JPanel panel_3 = new JPanel();
		panel_3.setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 5));

		JButton btnReinitialiserPanier = new JButton("Réinitialiser");
		btnReinitialiserPanier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reinitPanier(e);
			}
		});
		panel_3.add(btnReinitialiserPanier);

		JButton btnInformations = new JButton("Informations");
		btnInformations.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnInformations(e);
			}
		});
		panel_3.add(btnInformations);

		JButton Retirer = new JButton("Retirer");
		Retirer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Retirer(e);
			}
		});
		panel_3.add(Retirer);
		
		JScrollPane jScrollPane1 = new JScrollPane();
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)
				.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		jScrollPane1.setViewportView(tableau);
		panel_2.setLayout(gl_panel_2);
	}

	private void AfficherOrdonnance(ActionEvent e) {
		if (b == false) {
			b = true;
		} else if (b == true) {
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

	private void btnInformations(ActionEvent e) {
			int[] selection = tableau.getSelectedRows();
			int[] modelIndexes = new int[selection.length];

			for(int i = 0; i < selection.length; i++){
				modelIndexes[i] = tableau.getRowSorter().convertRowIndexToModel(selection[i]);
			}

			Arrays.sort(modelIndexes);

			for (Medicament m: daoMedicament.findALL()) {
				if (m.getNom().equals(tableau.getModel().getValueAt(modelIndexes[0], 0))){
					JOptionPane.showMessageDialog(null, "Voici les informations :" + m.toString());
				}
			}
		}

		private void reinitPanier(ActionEvent e){

		}

		private void Retirer(ActionEvent e) {
			int[] selection = tableau.getSelectedRows();
			int[] modelIndexes = new int[selection.length];

			for(int i = 0; i < selection.length; i++){
				modelIndexes[i] = tableau.getRowSorter().convertRowIndexToModel(selection[i]);
			}

			Arrays.sort(modelIndexes);

			for(int i = modelIndexes.length - 1; i >= 0; i--){
				//daoclient.deletebyID(modelIndexes[i]);
				// modele.removePanier(modelIndexes[i]);
			}
			tableau.revalidate();
		}


	private void Retour(ActionEvent e) {
		Achat.dispose();
	}

	private void Quitter(ActionEvent e) {
		System.out.println(e.getActionCommand().toString());
		System.out.println(e.getSource().toString());

		int sortie = JOptionPane.showConfirmDialog(frame, "Etes-vous sûr ?",
				"Quitter", JOptionPane.YES_NO_OPTION);

		if (sortie == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
	}

	/*private void Valider(ActionEvent e) {
		DAOClient daoClient = new DAOClient();
		DAOOrdonnance daoOrdonnance = new DAOOrdonnance();
		int i;
		Client client = null;
		Ordonnance ord = null;
		Specialiste spe = null;
		Mutuelle mut = null;
		String Date = null;
		String Secu = null;
		Medecin med = null;
		Medicament medi = null;

		try {
			for(i = 0; i < comboBoxClient.getItemCount();i++) {
				 Object p = comboBoxClient.getSelectedItem();
			if (p.equals(daoClient.find(i).getPersonne().getPrenom())) {
				client = daoClient.find(i);
			Secu = daoClient.find(i).getNumero_Secu();
		break;
		}
		}
			for(i = 0; i < comboBoxMutuelle.getItemCount();i++) {
				 Object p = comboBoxMutuelle.getSelectedItem();
			if (p.equals(daoMutuelle.find(i).getEntreprise().getEnt_Raison_Sociale())) {
			mut = daoMutuelle.find(i);
			break;
		}
		}
			Date = txtDate.getText();

		if(b == true) {
			for(i =0; i<comboBoxMed.getItemCount();i++) {
				Object p = comboBoxMed.getSelectedItem();
				if (p.equals(daoMedecin.find(i).getPersonne().getPrenom())) {
				med = daoMedecin.find(i);
				break;
				}
			}
			for(i =0; i<comboBoxSpe.getItemCount();i++) {
				Object p = comboBoxSpe.getSelectedItem();
				 if (p == null) {
					spe = null;
					break;
				 }else if (p.equals(daoSpecialiste.find(i).getPersonne().getPrenom())) {
						spe = daoSpecialiste.find(i);
				break;
				}
			}
			daoOrdonnance.create(new Ordonnance(1,txtNumOrdonnance.getText(),client,med, spe, Date));
		}

		for (i = 0; i<comboBoxMedicament.getItemCount();i++) {
			Object p = comboBoxMedicament.getSelectedItem();
			if (p.equals(daoMedicament.find(i).getNom()));
			medi = daoMedicament.find(i);
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


	}*/
}