package principal;

import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;

import gestion.Ordonnance;
import people.ListeOrdonnance;
import people.Medecin;
import people.Mutuelle;
import people.Specialiste;
import utilitaire.Adresse;
import utilitaire.Personne;

import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Outil_Gestion {

	int i = 0;
	int l = 0;
	int m = 0;
	Liste liste = null;
	HistoriqueOrdonnances listed = null;
	HistoriqueAchat listeds = null;
	
	private JFrame PageDacceuil;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Outil_Gestion window = new Outil_Gestion();
					window.PageDacceuil.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the application.
	 */
	public Outil_Gestion() {
		Adresse adr = new Adresse();
		Personne test = new Personne();
		Mutuelle mut = new Mutuelle();
		Specialiste spe = new Specialiste();
		Medecin med = new Medecin();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		PageDacceuil = new JFrame();
		PageDacceuil.setTitle("Page d'acceuil");
		PageDacceuil.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\PROJET\\JAVA\\Sparadrap\\src\\swing\\bank\\Logo-removebg-preview.png"));
		PageDacceuil.setBounds(100, 100, 437, 288);
		PageDacceuil.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		PageDacceuil.getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(0, 0));
		
		JMenuBar menuBar = new JMenuBar();
		panel.add(menuBar, BorderLayout.NORTH);
		
		JMenu mnMenu = new JMenu("Menu");
		mnMenu.setHorizontalAlignment(SwingConstants.LEFT);
		menuBar.add(mnMenu);
		
		JMenuItem Sauvegarder = new JMenuItem("Sauvegarder_nodev");
		mnMenu.add(Sauvegarder);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Effectuer un Achat");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Achat(e);
			}
		});
		mnMenu.add(mntmNewMenuItem_1);
		
		JMenuItem Quitter = new JMenuItem("Quitter");
		Quitter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Quitter(e);
			}
		});
		mnMenu.add(Quitter);
		
		JMenu Menu_Historique = new JMenu("Historique");
		Menu_Historique.setHorizontalAlignment(SwingConstants.LEFT);
		menuBar.add(Menu_Historique);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Historique Ordonnances");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AfficherHistoOrdo(e);
			}
		});
		mntmNewMenuItem.setHorizontalAlignment(SwingConstants.LEFT);
		Menu_Historique.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Historique Achat");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AfficherHistoAchat(e);
			}
		});
		mntmNewMenuItem_2.setHorizontalAlignment(SwingConstants.LEFT);
		Menu_Historique.add(mntmNewMenuItem_2);
		
		JMenu Menu_Client = new JMenu("Client");
		menuBar.add(Menu_Client);
		
		JMenuItem Liste_Client = new JMenuItem("Afficher Liste Client");
		Liste_Client.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AfficherListe(e);
			}
		});
		Menu_Client.add(Liste_Client);
	}
	
	private void Achat (ActionEvent e) {
		Achat achat = new Achat();
		achat.Achat.setVisible(true);
	}
	private void Quitter(ActionEvent e) {
			System.out.println(e.getActionCommand().toString());
			System.out.println(e.getSource().toString());
			
			int sortie = JOptionPane.showConfirmDialog(PageDacceuil, "Etes-vous sûr ?", 
					"Quitter", JOptionPane.YES_NO_OPTION);
			
			if (sortie == JOptionPane.YES_OPTION) {
				System.exit(0);
			}
		}
	private void AfficherListe(ActionEvent e) {
			if (i == 0) {
				liste = new Liste();
				liste.setVisible(true);
				i = 1;
			}else if (i == 1) {
				liste.setVisible(true);
			}
		}
		

	private void AfficherHistoOrdo(ActionEvent e) {
		if (l == 0 ) {
			listed = new HistoriqueOrdonnances();
			listed.setVisible(true);
			l = 1;
		} else if (l == 1) {
			listed.setVisible(true);
		}

	}
	private void AfficherHistoAchat(ActionEvent e) {
		if ( m == 0) {
			listeds = new HistoriqueAchat();
			listeds.setVisible(true);
			m = 1;
		} else if ( m == 1) {
			listeds.setVisible(true);
		}
	}
}