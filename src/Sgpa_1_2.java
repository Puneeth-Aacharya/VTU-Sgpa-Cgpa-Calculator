import java.awt.EventQueue;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.TitledBorder;

public class Sgpa_1_2 {
	
	/**
	 * @author Puneeth K S 
	 */

	public JFrame frmSgpa_1;
	private JTextField text18MAT;
	private JTextField textChe_Phy;
	private JTextField textCps_Ele;
	private JTextField textEln_Civ;
	private JTextField textMe;
	private JTextField textChe_phy_LAB;
	private JTextField textCpl_Ele_LAB;
	private JTextField textCAED;
	private JTextField textENG;
	private JTextField textSGPA;
	private JTextField textPercentage;

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
					Sgpa_1_2 window = new Sgpa_1_2();
					window.frmSgpa_1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Sgpa_1_2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize() {
		frmSgpa_1 = new JFrame();
		frmSgpa_1.setResizable(false);
		frmSgpa_1.getContentPane().setBackground(Color.BLACK);
		frmSgpa_1.setTitle("Welcome >> Scheme >> 1st/2nd sem sgpa");
		frmSgpa_1.setBounds(100, 100, 834, 770);
		frmSgpa_1.setLocationRelativeTo(null);
		frmSgpa_1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSgpa_1.getContentPane().setLayout(null);
		
		JLabel lblEnterTheMarks = new JLabel("Enter the marks obtained out of 100");
		lblEnterTheMarks.setForeground(Color.WHITE);
		lblEnterTheMarks.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblEnterTheMarks.setBounds(17, 22, 365, 29);
		frmSgpa_1.getContentPane().add(lblEnterTheMarks);
		
		JLabel lblmat = new JLabel("18MAT11/21");
		lblmat.setForeground(Color.WHITE);
		lblmat.setFont(new Font("Arial Black", Font.BOLD, 22));
		lblmat.setBounds(27, 126, 178, 29);
		frmSgpa_1.getContentPane().add(lblmat);
		
		JLabel lblchephy = new JLabel("18CHE / PHY 12/22");
		lblchephy.setForeground(Color.WHITE);
		lblchephy.setFont(new Font("Arial Black", Font.BOLD, 22));
		lblchephy.setBounds(27, 181, 243, 29);
		frmSgpa_1.getContentPane().add(lblchephy);
		
		JLabel lblcps = new JLabel("18CPS / ELE 13/23");
		lblcps.setForeground(Color.WHITE);
		lblcps.setFont(new Font("Arial Black", Font.BOLD, 22));
		lblcps.setBounds(27, 236, 236, 29);
		frmSgpa_1.getContentPane().add(lblcps);
		
		JLabel lbleln = new JLabel("18ELN / CIV 14/24");
		lbleln.setForeground(Color.WHITE);
		lbleln.setFont(new Font("Arial Black", Font.BOLD, 22));
		lbleln.setBounds(27, 291, 236, 29);
		frmSgpa_1.getContentPane().add(lbleln);
		
		JLabel lblme = new JLabel("18ME 15/25");
		lblme.setForeground(Color.WHITE);
		lblme.setFont(new Font("Arial Black", Font.PLAIN, 22));
		lblme.setBounds(27, 345, 236, 29);
		frmSgpa_1.getContentPane().add(lblme);
		
		JLabel lblchel = new JLabel("18CHEL  / PHYL 16/26");
		lblchel.setForeground(Color.WHITE);
		lblchel.setFont(new Font("Arial Black", Font.PLAIN, 22));
		lblchel.setBounds(27, 401, 277, 29);
		frmSgpa_1.getContentPane().add(lblchel);
		
		JLabel lblcpl = new JLabel("18CPL / ELEL 17/27");
		lblcpl.setForeground(Color.WHITE);
		lblcpl.setFont(new Font("Arial Black", Font.PLAIN, 22));
		lblcpl.setBounds(27, 456, 250, 29);
		frmSgpa_1.getContentPane().add(lblcpl);
		
		JLabel lblegdl = new JLabel("18EGDL15/25");
		lblegdl.setForeground(Color.WHITE);
		lblegdl.setFont(new Font("Arial Black", Font.PLAIN, 22));
		lblegdl.setBounds(27, 511, 196, 29);
		frmSgpa_1.getContentPane().add(lblegdl);
		
		JLabel lblegh = new JLabel("18EGH18/28");
		lblegh.setForeground(Color.WHITE);
		lblegh.setFont(new Font("Arial Black", Font.PLAIN, 22));
		lblegh.setBounds(27, 572, 172, 29);
		frmSgpa_1.getContentPane().add(lblegh);
		
		text18MAT = new JTextField();
		text18MAT.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				text18MAT.setText("");
			}
		});
		text18MAT.setText("0");
		text18MAT.setFont(new Font("SansSerif", Font.BOLD, 26));
		text18MAT.setBounds(402, 117, 122, 43);
		frmSgpa_1.getContentPane().add(text18MAT);
		text18MAT.setColumns(10);
		
		
		textChe_Phy = new JTextField();
		textChe_Phy.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textChe_Phy.setText("");
			}
		});
		textChe_Phy.setText("0");
		textChe_Phy.setFont(new Font("SansSerif", Font.BOLD, 26));
		textChe_Phy.setColumns(10);
		textChe_Phy.setBounds(402, 172, 122, 43);
		frmSgpa_1.getContentPane().add(textChe_Phy);
		
		
		textCps_Ele = new JTextField();
		textCps_Ele.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textCps_Ele.setText("");
			}
		});
		textCps_Ele.setText("0");
		textCps_Ele.setFont(new Font("SansSerif", Font.BOLD, 26));
		textCps_Ele.setColumns(10);
		textCps_Ele.setBounds(402, 227, 122, 43);
		frmSgpa_1.getContentPane().add(textCps_Ele);
		
		
		textEln_Civ = new JTextField();
		textEln_Civ.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textEln_Civ.setText("");
			}
		});
		textEln_Civ.setText("0");
		textEln_Civ.setFont(new Font("SansSerif", Font.BOLD, 26));
		textEln_Civ.setColumns(10);
		textEln_Civ.setBounds(402, 282, 122, 43);
		frmSgpa_1.getContentPane().add(textEln_Civ);
		
		
		textMe = new JTextField();
		textMe.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textMe.setText("");
			}
		});
		textMe.setText("0");
		textMe.setFont(new Font("SansSerif", Font.BOLD, 26));
		textMe.setColumns(10);
		textMe.setBounds(402, 336, 122, 43);
		frmSgpa_1.getContentPane().add(textMe);
		
		
		textChe_phy_LAB = new JTextField();
		textChe_phy_LAB.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textChe_phy_LAB.setText("");
			}
		});
		textChe_phy_LAB.setText("0");
		textChe_phy_LAB.setFont(new Font("SansSerif", Font.BOLD, 26));
		textChe_phy_LAB.setColumns(10);
		textChe_phy_LAB.setBounds(402, 392, 122, 43);
		frmSgpa_1.getContentPane().add(textChe_phy_LAB);
		
		
		textCpl_Ele_LAB = new JTextField();
		textCpl_Ele_LAB.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textCpl_Ele_LAB.setText("");
			}
		});
		textCpl_Ele_LAB.setText("0");
		textCpl_Ele_LAB.setFont(new Font("SansSerif", Font.BOLD, 26));
		textCpl_Ele_LAB.setColumns(10);
		textCpl_Ele_LAB.setBounds(402, 447, 122, 43);
		frmSgpa_1.getContentPane().add(textCpl_Ele_LAB);
		
		
		textCAED = new JTextField();
		textCAED.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textCAED.setText("");
			}
		});
		textCAED.setText("0");
		textCAED.setFont(new Font("SansSerif", Font.BOLD, 26));
		textCAED.setColumns(10);
		textCAED.setBounds(402, 502, 122, 43);
		frmSgpa_1.getContentPane().add(textCAED);
		
		
		textENG = new JTextField();
		textENG.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textENG.setText("");
			}
		});
		textENG.setText("0");
		textENG.setFont(new Font("SansSerif", Font.BOLD, 26));
		textENG.setColumns(10);
		textENG.setBounds(402, 563, 122, 43);
		frmSgpa_1.getContentPane().add(textENG);
		
		JLabel label = new JLabel("-------");
		label.setForeground(Color.YELLOW);
		label.setFont(new Font("Arial Black", Font.PLAIN, 22));
		label.setBounds(316, 407, 54, 16);
		frmSgpa_1.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("-------");
		label_1.setForeground(Color.YELLOW);
		label_1.setFont(new Font("Arial Black", Font.PLAIN, 22));
		label_1.setBounds(316, 351, 54, 16);
		frmSgpa_1.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("-------");
		label_2.setForeground(Color.YELLOW);
		label_2.setFont(new Font("Arial Black", Font.PLAIN, 22));
		label_2.setBounds(316, 297, 54, 16);
		frmSgpa_1.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("-------");
		label_3.setForeground(Color.YELLOW);
		label_3.setFont(new Font("Arial Black", Font.PLAIN, 22));
		label_3.setBounds(316, 242, 54, 16);
		frmSgpa_1.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("-------");
		label_4.setForeground(Color.YELLOW);
		label_4.setFont(new Font("Arial Black", Font.PLAIN, 22));
		label_4.setBounds(316, 187, 54, 16);
		frmSgpa_1.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("-------");
		label_5.setForeground(Color.YELLOW);
		label_5.setFont(new Font("Arial Black", Font.PLAIN, 22));
		label_5.setBounds(316, 132, 54, 16);
		frmSgpa_1.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("-------");
		label_6.setForeground(Color.YELLOW);
		label_6.setFont(new Font("Arial Black", Font.PLAIN, 22));
		label_6.setBounds(316, 462, 54, 16);
		frmSgpa_1.getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("-------");
		label_7.setForeground(Color.YELLOW);
		label_7.setFont(new Font("Arial Black", Font.PLAIN, 22));
		label_7.setBounds(316, 517, 54, 16);
		frmSgpa_1.getContentPane().add(label_7);
		
		JLabel label_8 = new JLabel("-------");
		label_8.setForeground(Color.YELLOW);
		label_8.setFont(new Font("Arial Black", Font.PLAIN, 22));
		label_8.setBounds(316, 578, 54, 16);
		frmSgpa_1.getContentPane().add(label_8);
		
		JLabel label_9 = new JLabel("%");
		label_9.setFont(new Font("SansSerif", Font.BOLD, 30));
		label_9.setBounds(684, 658, 42, 55);
		frmSgpa_1.getContentPane().add(label_9);
		
		JLabel lblNoteEnter = new JLabel("note : Enter '0' for subjects that you don't have");
		lblNoteEnter.setForeground(new Color(205, 92, 92));
		lblNoteEnter.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblNoteEnter.setBounds(17, 63, 492, 29);
		frmSgpa_1.getContentPane().add(lblNoteEnter);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBackground(new Color(0, 0, 153));
		btnBack.setForeground(new Color(255, 255, 255));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmSgpa_1.dispose();
				Scheme window = new Scheme();
				window.frmScheme.setVisible(true);
			}
		});
		btnBack.setFont(new Font("SansSerif", Font.BOLD, 20));
		btnBack.setBounds(710, 25, 86, 43);
		frmSgpa_1.getContentPane().add(btnBack);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 255), new Color(0, 0, 255), new Color(255, 255, 0), new Color(255, 255, 0)));
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(553, 143, 243, 435);
		frmSgpa_1.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblSgpa = new JLabel("SGPA");
		lblSgpa.setBounds(78, 44, 93, 29);
		panel.add(lblSgpa);
		lblSgpa.setForeground(new Color(51, 0, 255));
		lblSgpa.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		
		textPercentage = new JTextField();
		textPercentage.setBounds(28, 294, 191, 62);
		panel.add(textPercentage);
		textPercentage.setEditable(false);
		textPercentage.setText("0");
		textPercentage.setFont(new Font("SansSerif", Font.BOLD, 35));
		textPercentage.setColumns(10);
		
		JLabel lblPercentage = new JLabel("Percentage");
		lblPercentage.setBounds(42, 227, 166, 55);
		panel.add(lblPercentage);
		lblPercentage.setForeground(new Color(199, 21, 133));
		lblPercentage.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		
		
		textSGPA = new JTextField();
		textSGPA.setForeground(new Color(0, 102, 51));
		textSGPA.setBounds(28, 98, 191, 62);
		panel.add(textSGPA);
		textSGPA.setEditable(false);
		textSGPA.setFont(new Font("SansSerif", Font.BOLD, 35));
		textSGPA.setText("0");
		textSGPA.setColumns(10);
		
		
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.setBounds(199, 660, 196, 55);
		frmSgpa_1.getContentPane().add(btnCalculate);
		btnCalculate.setBackground(new Color(148, 0, 211));
		btnCalculate.setForeground(new Color(0, 0, 0));
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalculateActionPerformed(e);				
			}
		});
		btnCalculate.setFont(new Font("Tahoma", Font.BOLD, 25));
		
		
	}
	public int Check(float n)
	{

		if(n>=90 && n<=100)			
			return 10;
		else if(n>=80 && n<90)
			return 9;
		else if(n>=70 && n<80)
			return 8;
		else if(n>=60 && n<70)
			return 7;
		else if(n>=45 && n<60)
			return 6;
		else if(n>=40 && n<45)
			return 4;
		else
			return 0;
	}
	private void btnCalculateActionPerformed(ActionEvent evt)
	{
		
		float MATHS=Float.parseFloat(text18MAT.getText());
		float CHEM=Float.parseFloat(textChe_Phy.getText());
		float CPPS=Float.parseFloat(textCps_Ele.getText());
		float ELN=Float.parseFloat(textEln_Civ.getText());
		float ME=Float.parseFloat(textMe.getText());
		float CHEMLAB=Float.parseFloat(textChe_phy_LAB.getText());
		float CPPS_LAB=Float.parseFloat(textCpl_Ele_LAB.getText());
		float CAD=Float.parseFloat(textCAED.getText());
		float ENGLISH=Float.parseFloat(textENG.getText());

		
		float MATHS_1=Check(MATHS);
		float CHEM_1=Check(CHEM);
		float CPPS_1=Check(CPPS);
		float ELN_1=Check(ELN);
		float ME_1=Check(ME);
		float CHEMLAB_1=Check(CHEMLAB);
		float CPPS_LAB_1=Check(CPPS_LAB);
		float CAD_1=Check(CAD);
		float ENGLISH_1=Check(ENGLISH);
		
		
		
		float Sgpa=((4*MATHS_1)+(4*CHEM_1)+(3*CPPS_1)+(3*ELN_1)+(3*ME_1)+(1*CHEMLAB_1)+(1*CPPS_LAB_1)+(3*CAD_1)+(1*ENGLISH_1))/20;
		float percentage=(float) ((Sgpa-0.75)*10);
		
		if(Sgpa==0)
		{
			 percentage=0;
		}
		String GRAND_SGPA=String.valueOf(Sgpa);
		String Grand_Percentage=String.valueOf(percentage);
		
		textSGPA.setText(GRAND_SGPA);
		textPercentage.setText(Grand_Percentage);
		
		if(MATHS>100 || CHEM>100 || CPPS>100 || ELN>100 || ME>100 || CHEMLAB>100 || CPPS_LAB>100 || CAD>100 || ENGLISH>100)
		{	
			
			JOptionPane.showMessageDialog(null,"Marks should be <= 100");
			textSGPA.setText("0.0");
			textPercentage.setText("0.0");
	    }
		
		if(ME_1!=0 && CAD_1!=0)
		{
			JOptionPane.showMessageDialog(null,"Single Sem cannot have both 'ME' and 'CAED' subjects");
			textSGPA.setText("0.0");
			textPercentage.setText("0.0");
		}
		
		
		
	}
}
