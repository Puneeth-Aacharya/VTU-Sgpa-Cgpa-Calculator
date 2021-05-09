import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.border.BevelBorder;

public class Scheme {
	
	/**
	 * @author Puneeth K S 
	 */

	public JFrame frmScheme;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			  UIManager.setLookAndFeel(new NimbusLookAndFeel());
		}
		catch(Exception e)
		{ 
			e.printStackTrace();
		}
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Scheme window = new Scheme();
					window.frmScheme.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Scheme() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmScheme = new JFrame();
		frmScheme.setResizable(false);
		frmScheme.getContentPane().setBackground(Color.BLACK);
		frmScheme.setTitle("Welcome >> Scheme");
		frmScheme.setBounds(100, 100, 617, 738);
		frmScheme.setLocationRelativeTo(null);
		frmScheme.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmScheme.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CBCS 2018 SCHEME");
		lblNewLabel.setForeground(new Color(255, 0, 204));
		lblNewLabel.setFont(new Font("Century Schoolbook", Font.BOLD, 30));
		lblNewLabel.setBounds(135, 16, 373, 61);
		frmScheme.getContentPane().add(lblNewLabel);
		
		JButton btnstSem_2 = new JButton("2nd Sem");
		btnstSem_2.setBackground(new Color(255, 153, 51));
		btnstSem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmScheme.dispose();
				Sgpa_1_2 window = new Sgpa_1_2();
				window.frmSgpa_1.setVisible(true);
			}
		});
		btnstSem_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnstSem_2.setBounds(218, 187, 168, 33);
		frmScheme.getContentPane().add(btnstSem_2);
		
		JButton btnstSem_3 = new JButton("3rd Sem");
		btnstSem_3.setBackground(new Color(255, 153, 51));
		btnstSem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmScheme.dispose();
				Sgpa_3_4 window = new Sgpa_3_4();
				window.frmSgpa_3.setVisible(true);
			}
		});
		btnstSem_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnstSem_3.setBounds(218, 249, 168, 33);
		frmScheme.getContentPane().add(btnstSem_3);
		
		JButton btnstSem_4 = new JButton("4th Sem");
		btnstSem_4.setBackground(new Color(255, 153, 51));
		btnstSem_4.setForeground(new Color(0, 0, 0));
		btnstSem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmScheme.dispose();
				Sgpa_3_4 window = new Sgpa_3_4();
				window.frmSgpa_3.setVisible(true);
			}
		});
		btnstSem_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnstSem_4.setBounds(218, 318, 168, 33);
		frmScheme.getContentPane().add(btnstSem_4);
		
		JButton btnstSem_5 = new JButton("5th Sem");
		btnstSem_5.setBackground(new Color(255, 153, 51));
		btnstSem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmScheme.dispose();
				Sgpa_5 window = new Sgpa_5();
				window.frmSgpa_5.setVisible(true);
			}
		});
		btnstSem_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnstSem_5.setBounds(218, 390, 168, 33);
		frmScheme.getContentPane().add(btnstSem_5);
		
		JButton btnstSem_6 = new JButton("6th Sem");
		btnstSem_6.setBackground(new Color(255, 153, 51));
		btnstSem_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmScheme.dispose();
				Sgpa_6 window = new Sgpa_6();
				window.frmSgpa_6.setVisible(true);
			}
		});
		btnstSem_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnstSem_6.setBounds(218, 465, 168, 33);
		frmScheme.getContentPane().add(btnstSem_6);
		
		JButton btnstSem_7 = new JButton("7th Sem");
		btnstSem_7.setBackground(new Color(255, 153, 51));
		btnstSem_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmScheme.dispose();
				Sgpa_7 window = new Sgpa_7();
				window.frmSgpa_7.setVisible(true);
			}
		});
		btnstSem_7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnstSem_7.setBounds(218, 545, 168, 33);
		frmScheme.getContentPane().add(btnstSem_7);
		
		JButton btnstSem_8 = new JButton("8th Sem");
		btnstSem_8.setBackground(new Color(255, 153, 51));
		btnstSem_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmScheme.dispose();
				Sgpa_8 window = new Sgpa_8();
				window.frmSgpa_8.setVisible(true);
			}
		});
		btnstSem_8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnstSem_8.setBounds(218, 624, 168, 33);
		frmScheme.getContentPane().add(btnstSem_8);
		
		JButton btnstSem_1 = new JButton("1st Sem");
		btnstSem_1.setBackground(new Color(255, 153, 51));
		btnstSem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmScheme.dispose();
				Sgpa_1_2 window = new Sgpa_1_2();
				window.frmSgpa_1.setVisible(true);
			}
		});
		btnstSem_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnstSem_1.setBounds(218, 123, 168, 33);
		frmScheme.getContentPane().add(btnstSem_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 255, 0), new Color(255, 0, 153), new Color(255, 0, 153), new Color(255, 0, 204)));
		panel.setBounds(494, 286, 88, 162);
		frmScheme.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.setForeground(new Color(204, 51, 255));
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setBounds(0, 13, 88, 137);
		panel.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmScheme.dispose();
				Front_page window = new Front_page();
				window.Front_frame.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 25));
		
		JLabel lblBeta = new JLabel("(Beta)");
		lblBeta.setForeground(new Color(102, 153, 0));
		lblBeta.setFont(new Font("SansSerif", Font.ITALIC, 15));
		lblBeta.setBounds(393, 553, 48, 20);
		frmScheme.getContentPane().add(lblBeta);
		
		JLabel lblBeta_1 = new JLabel("(Beta)");
		lblBeta_1.setForeground(new Color(102, 153, 0));
		lblBeta_1.setFont(new Font("SansSerif", Font.ITALIC, 15));
		lblBeta_1.setBounds(393, 632, 48, 20);
		frmScheme.getContentPane().add(lblBeta_1);
	}
}
