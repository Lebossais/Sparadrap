package principal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import people.Client;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

public class InformationsClient {

	JFrame InformationsClient;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InformationsClient window = new InformationsClient();
					window.InformationsClient.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public InformationsClient() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		InformationsClient = new JFrame();
		InformationsClient.setTitle("Informations Client");
		InformationsClient.setBounds(100, 100, 491, 393);
		InformationsClient.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JPanel panel = new JPanel();
		InformationsClient.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
	}
}
