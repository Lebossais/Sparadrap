package principal;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import gestion.Client;
import gestion.Declaration;
import gestion.Medecin;
import gestion.Mutuelle;
import gestion.Specialiste;
import utilitaire.Adresse;
import utilitaire.Personne;

import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Template_Client {

	static JFrame template_frame;
	private JTextField txtNum;
	private JTextField txtRue;
	private JTextField TxtCode;
	private JTextField TxtVille;
	private JTextField txtPrenom;
	private JTextField txtNom;
	private JTextField txtPhone;
	private JTextField txtMail;
	private JTextField txtSecu;
	JComboBox comboBoxMutuelle;
	JComboBox comboBoxSpe;
	JComboBox comboBoxMed;
	public JFrame frame;
	private JTextField txtDateNaissance;


	/**
	 * Create the application.
	 */
	public Template_Client() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		template_frame = new JFrame();
		template_frame.setTitle("Nouveau Client");
		template_frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Template_Client.class.getResource("/swing/bank/Logo-removebg-preview.png")));
		template_frame.setBounds(100, 100, 578, 458);
		template_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		template_frame.getContentPane().setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		template_frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JLabel Ville = new JLabel("Code Postal : ");
		Ville.setBounds(279, 42, 114, 14);
		panel.add(Ville);

		JLabel lblNomDeRue = new JLabel("Nom de Rue :");
		lblNomDeRue.setBounds(134, 42, 120, 14);
		panel.add(lblNomDeRue);

		txtNum = new JTextField();
		txtNum.setBounds(10, 68, 114, 20);
		txtNum.setColumns(10);
		panel.add(txtNum);

		JLabel lblAdresse = new JLabel("ADRESSE");
		lblAdresse.setBounds(240, 11, 65, 20);
		panel.add(lblAdresse);

		JLabel lblNewLabel = new JLabel("N° d'habitation :");
		lblNewLabel.setBounds(10, 43, 114, 14);
		panel.add(lblNewLabel);

		JLabel Client_1 = new JLabel("Ville :");
		Client_1.setBounds(416, 42, 109, 14);
		panel.add(Client_1);

		txtRue = new JTextField();
		txtRue.setText("Rue ...");
		txtRue.setColumns(10);
		txtRue.setBounds(134, 67, 120, 20);
		panel.add(txtRue);

		TxtCode = new JTextField();
		TxtCode.setColumns(10);
		TxtCode.setBounds(279, 67, 114, 20);
		panel.add(TxtCode);

		TxtVille = new JTextField();
		TxtVille.setColumns(10);
		TxtVille.setBounds(416, 67, 109, 20);
		panel.add(TxtVille);

		txtPrenom = new JTextField();
		txtPrenom.setColumns(10);
		txtPrenom.setBounds(10, 175, 114, 20);
		panel.add(txtPrenom);

		JLabel lblPrnom = new JLabel("Prénom :");
		lblPrnom.setBounds(10, 150, 114, 14);
		panel.add(lblPrnom);

		txtNom = new JTextField();
		txtNom.setColumns(10);
		txtNom.setBounds(134, 174, 120, 20);
		panel.add(txtNom);

		JLabel lblNom = new JLabel("Nom :");
		lblNom.setBounds(134, 149, 120, 14);
		panel.add(lblNom);

		JLabel lblPersonne = new JLabel("Personne");
		lblPersonne.setBounds(240, 118, 53, 20);
		panel.add(lblPersonne);

		JLabel lblNTelephone = new JLabel("N° Telephone :");
		lblNTelephone.setBounds(279, 149, 114, 14);
		panel.add(lblNTelephone);

		txtPhone = new JTextField();
		txtPhone.setText("XX.XX.XX.XX.XX");
		txtPhone.setColumns(10);
		txtPhone.setBounds(279, 174, 114, 20);
		panel.add(txtPhone);

		txtMail = new JTextField();
		txtMail.setColumns(10);
		txtMail.setBounds(416, 174, 109, 20);
		panel.add(txtMail);

		JLabel Client_1_1 = new JLabel("Email :");
		Client_1_1.setBounds(416, 149, 109, 14);
		panel.add(Client_1_1);

		txtSecu = new JTextField();
		txtSecu.setColumns(10);
		txtSecu.setBounds(411, 235, 114, 20);
		panel.add(txtSecu);

		JLabel lblNScurit = new JLabel("N° Sécurité Sociale :");
		lblNScurit.setBounds(279, 238, 114, 14);
		panel.add(lblNScurit);

		JLabel lblMutuelle = new JLabel("Mutuelle :");
		lblMutuelle.setBounds(77, 294, 120, 14);
		panel.add(lblMutuelle);

		JLabel lblMedecinTraitant = new JLabel("Medecin Traitant :");
		lblMedecinTraitant.setBounds(222, 294, 114, 14);
		panel.add(lblMedecinTraitant);

		JLabel Client_1_2 = new JLabel("Specialiste :");
		Client_1_2.setBounds(359, 294, 109, 14);
		panel.add(Client_1_2);

		comboBoxMed = new JComboBox();
		comboBoxMed.setBounds(222, 318, 114, 22);
		panel.add(comboBoxMed);
		comboBoxMed.addItem(Declaration.getMedecin(0).getPersonne().getPrenom());
		comboBoxMed.addItem(Declaration.getMedecin(1).getPersonne().getPrenom());

		comboBoxSpe = new JComboBox();
		comboBoxSpe.setBounds(359, 318, 109, 22);
		panel.add(comboBoxSpe);
		comboBoxSpe.addItem(Declaration.getSpecialiste(0).getPersonne().getPrenom());
		comboBoxSpe.addItem(Declaration.getSpecialiste(1).getPersonne().getPrenom());


		comboBoxMutuelle = new JComboBox();
		comboBoxMutuelle.setBounds(77, 318, 120, 22);
		panel.add(comboBoxMutuelle);
		comboBoxMutuelle.addItem(Declaration.getMutuelle(0).getPersonne().getPrenom());
		comboBoxMutuelle.addItem(Declaration.getMutuelle(1).getPersonne().getPrenom());

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 386, 562, 33);
		panel.add(panel_1);

		JButton ValideButton = new JButton("Valider");
		ValideButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Valider(e);
			}
		});
		panel_1.add(ValideButton);

		JButton RetourButton = new JButton("Retour");
		RetourButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Retour(e);
			}
		});
		panel_1.add(RetourButton);

		JButton QuitterButton = new JButton("Quitter");
		QuitterButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Quitter(e);
			}
		});
		panel_1.add(QuitterButton);

		txtDateNaissance = new JTextField();
		txtDateNaissance.setText("JJ/MM/AAAA");
		txtDateNaissance.setColumns(10);
		txtDateNaissance.setBounds(134, 235, 114, 20);
		panel.add(txtDateNaissance);

		JLabel Date = new JLabel("Date de Naissance :");
		Date.setBounds(10, 238, 114, 14);
		panel.add(Date);
	}

	private void Retour(ActionEvent e) {
		template_frame.dispose();
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

	private void Valider(ActionEvent e) {
		int i;
		Mutuelle mut = null;
		Medecin med = null;
		Specialiste spe = null;
			try {
				Integer numRue = Integer.valueOf(txtNum.getText());
				Integer CodePostal = Integer.valueOf(TxtCode.getText());
				Declaration.adresse.add(new Adresse(numRue, txtRue.getText(), CodePostal, TxtVille.getText()));

				Declaration.personne.add(new Personne(txtPrenom.getText(), txtNom.getText(), Declaration.adresse.get(Declaration.adresse.size() - 1), txtPhone.getText(), txtMail.getText()));

				for (i = 0; i < comboBoxMutuelle.getItemCount(); i++) {
					Object p = comboBoxMutuelle.getSelectedItem();
					if (p.equals(Declaration.getMutuelle(i).getPersonne().getPrenom())) {
						mut = Declaration.getMutuelle(i);
						break;
					}
				}
				for (i = 0; i < comboBoxMed.getItemCount(); i++) {
					Object p = comboBoxMed.getSelectedItem();
					if (p.equals(Declaration.getMedecin(i).getPersonne().getPrenom())) {
						med = Declaration.getMedecin(i);
						break;
					}
				}
				for (i = 0; i < comboBoxSpe.getItemCount(); i++) {
					Object p = comboBoxSpe.getSelectedItem();
					if (p == null) {
						spe = null;
						break;
					} else if (p.equals(Declaration.getSpecialiste(i).getPersonne().getPrenom())) {
						spe = Declaration.getSpecialiste(i);
					}
				}
				Declaration.getClients().add(new Client(Declaration.personne.get(Declaration.personne.size() - 1), txtDateNaissance.getText(), txtSecu.getText(), mut, med, spe));
				//Client.getModel.ajouter(Client);
				JOptionPane.showConfirmDialog(null, "Enregistrement  effectué ", "Validation - Création", JOptionPane.DEFAULT_OPTION);
			} catch (Exception e2) {
				JOptionPane.showConfirmDialog(null, "Enregistrement non effectué ", "Erreur - Client", JOptionPane.DEFAULT_OPTION);
			}
		}
	}