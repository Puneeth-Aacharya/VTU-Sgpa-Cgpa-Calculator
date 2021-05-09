import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.border.BevelBorder;

public class Front_page {
	
	/**
	 * @author Puneeth K S 
	 */

	public JFrame Front_frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		try
		{
			UIManager.setLookAndFeel(new NimbusLookAndFeel());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Front_page window = new Front_page();
					window.Front_frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Front_page() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Front_frame = new JFrame();
		Front_frame.setResizable(false);
		Front_frame.getContentPane().setBackground(Color.BLACK);
		Front_frame.setTitle("Welcome ");
		Front_frame.setBounds(100, 100, 764, 683);
		Front_frame.setLocationRelativeTo(null);
		Front_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Front_frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 0, 0), new Color(255, 255, 51), new Color(255, 255, 51), null));
		panel.setBounds(220, 237, 304, 79);
		Front_frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnSgpa = new JButton("SGPA Calculation ");
		btnSgpa.setBounds(6, 6, 292, 67);
		panel.add(btnSgpa);
		btnSgpa.setBackground(new Color(0, 0, 0));
		btnSgpa.setForeground(new Color(255, 0, 204));
		btnSgpa.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				Front_frame.dispose();
				Scheme window = new Scheme();
				window.frmScheme.setVisible(true);
			}
		});
		btnSgpa.setFont(new Font("Tahoma", Font.BOLD, 28));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 0));
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 0), new Color(51, 0, 204), new Color(51, 0, 204), null));
		panel_1.setBounds(220, 397, 304, 79);
		Front_frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnCgpa = new JButton("CGPA Calculation ");
		btnCgpa.setBounds(6, 6, 292, 67);
		panel_1.add(btnCgpa);
		btnCgpa.setBackground(Color.BLACK);
		btnCgpa.setForeground(new Color(255, 51, 102));
		btnCgpa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Front_frame.dispose();
				Cgpa window = new Cgpa();
				window.frmCgpa.setVisible(true);
			}
		});
		btnCgpa.setFont(new Font("Tahoma", Font.BOLD, 28));
		
		JLabel lblVtuSgpaAnd = new JLabel("VTU SGPA AND CGPA CALCULATOR");
		lblVtuSgpaAnd.setForeground(new Color(255, 0, 0));
		lblVtuSgpaAnd.setBounds(15, 67, 715, 79);
		Front_frame.getContentPane().add(lblVtuSgpaAnd);
		lblVtuSgpaAnd.setFont(new Font("SansSerif", Font.BOLD, 40));
		
		JLabel lblBy = new JLabel("PUNEETH K S");
		lblBy.setForeground(new Color(0, 0, 128));
		lblBy.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblBy.setBounds(285, 596, 171, 42);
		Front_frame.getContentPane().add(lblBy);
		
		JLabel lblBy_1 = new JLabel("by ,");
		lblBy_1.setFont(new Font("SansSerif", Font.BOLD, 19));
		lblBy_1.setForeground(new Color(0, 0, 128));
		lblBy_1.setBounds(351, 565, 84, 32);
		Front_frame.getContentPane().add(lblBy_1);
	}
}
