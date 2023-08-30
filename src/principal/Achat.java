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
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Achat {

	JFrame Achat;
	private JTextField txtPrenomClient;
	private JTextField txtNomClient;
	private JTextField txtMutuelle;
	private JTextField txtNsecu;
	private JTextField txtNomSpecialiste;
	private JTextField txtDateOrdonnance;
	private JTextField txtNumOrdonnance;
	private JTextField txtDate;
	private JTextField txtNomMedecin;
	boolean b = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Achat window = new Achat();
					window.Achat.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

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
		
		txtPrenomClient = new JTextField();
		txtPrenomClient.setBounds(25, 36, 92, 20);
		panel_1.add(txtPrenomClient);
		txtPrenomClient.setColumns(10);
		
		JLabel PrenomClient = new JLabel("Prenom Client :");
		PrenomClient.setBounds(27, 11, 103, 20);
		panel_1.add(PrenomClient);
		
		txtNomClient = new JTextField();
		txtNomClient.setColumns(10);
		txtNomClient.setBounds(171, 36, 86, 20);
		panel_1.add(txtNomClient);
		
		JLabel NomClient = new JLabel("Nom Client :");
		NomClient.setBounds(173, 11, 84, 20);
		panel_1.add(NomClient);
		
		txtMutuelle = new JTextField();
		txtMutuelle.setColumns(10);
		txtMutuelle.setBounds(25, 104, 92, 20);
		panel_1.add(txtMutuelle);
		
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
		
		JLabel NomMedecin = new JLabel("Nom Medecin :");
		NomMedecin.setBounds(27, 326, 84, 20);
		panel_1.add(NomMedecin);
		
		txtNomSpecialiste = new JTextField();
		txtNomSpecialiste.setEnabled(false);
		txtNomSpecialiste.setColumns(10);
		txtNomSpecialiste.setBounds(138, 351, 100, 20);
		panel_1.add(txtNomSpecialiste);
		
		JLabel NomSpecialiste = new JLabel("Nom Specialiste :");
		NomSpecialiste.setBounds(140, 326, 98, 20);
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
		txtDate.setBounds(292, 79, 84, 20);
		panel_1.add(txtDate);
		
		JLabel Date = new JLabel("Date :");
		Date.setBounds(320, 56, 39, 20);
		panel_1.add(Date);
		
		JButton btnNewButton = new JButton("Valider");
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
		lblNewLabel_2.setBounds(75, 168, 257, 47);
		panel_1.add(lblNewLabel_2);
		
		txtNomMedecin = new JTextField();
		txtNomMedecin.setEnabled(false);
		txtNomMedecin.setColumns(10);
		txtNomMedecin.setBounds(17, 351, 100, 20);
		panel_1.add(txtNomMedecin);
		
		JButton btnRetour = new JButton("Retour");
		btnRetour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				retour(e);
			}
		});
		btnRetour.setBounds(292, 397, 114, 29);
		panel_1.add(btnRetour);
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
			txtNomMedecin.setEnabled(true);
			txtNumOrdonnance.setEnabled(true);
			txtDateOrdonnance.setEnabled(true);
			txtNomSpecialiste.setEnabled(true);
		} else if (b == false) {
			txtNomMedecin.setEnabled(false);
			txtNumOrdonnance.setEnabled(false);
			txtDateOrdonnance.setEnabled(false);
			txtNomSpecialiste.setEnabled(false);
			
		}
	}
	private void retour(ActionEvent e) {
		Achat.dispose();
	}
}

