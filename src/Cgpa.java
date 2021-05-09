import java.awt.EventQueue;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Cgpa {
	
	/**
	 * @author Puneeth K S 
	 */

	public JFrame frmCgpa;
	private JTextField textsem_1;
	private JTextField textsem_2;
	private JTextField textsem_3;
	private JTextField textsem_4;
	private JTextField textsem_5;
	private JTextField textsem_6;
	private JTextField textsem_7;
	private JTextField textsem_8;
	private JTextField textCGPA;
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
					Cgpa window = new Cgpa();
					window.frmCgpa.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	 
	
	/**
	 * Create the application.
	 */
	public Cgpa() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize() {
		frmCgpa = new JFrame();
		frmCgpa.setResizable(false);
		frmCgpa.getContentPane().setBackground(Color.BLACK);
		frmCgpa.setTitle("Welcome >> Scheme >> CGPA");
		frmCgpa.setBounds(100, 100, 834, 770);
		frmCgpa.setLocationRelativeTo(null);
		frmCgpa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCgpa.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 255), new Color(0, 0, 255), new Color(255, 255, 0), new Color(255, 255, 0)));
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(553, 143, 243, 435);
		frmCgpa.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblEnterTheSgpa = new JLabel("Enter the Sgpa ");
		lblEnterTheSgpa.setForeground(Color.GREEN);
		lblEnterTheSgpa.setFont(new Font("Comic Sans MS", Font.BOLD, 26));
		lblEnterTheSgpa.setBounds(17, 6, 367, 48);
		frmCgpa.getContentPane().add(lblEnterTheSgpa);
		
		JLabel lblmat = new JLabel("SEM 1");
		lblmat.setForeground(Color.WHITE);
		lblmat.setFont(new Font("Arial Black", Font.BOLD, 22));
		lblmat.setBounds(35, 126, 95, 29);
		frmCgpa.getContentPane().add(lblmat);
		
		JLabel lblchephy = new JLabel("SEM 2");
		lblchephy.setForeground(Color.WHITE);
		lblchephy.setFont(new Font("Arial Black", Font.BOLD, 22));
		lblchephy.setBounds(35, 194, 101, 29);
		frmCgpa.getContentPane().add(lblchephy);
		
		JLabel lblcps = new JLabel("SEM 3");
		lblcps.setForeground(Color.WHITE);
		lblcps.setFont(new Font("Arial Black", Font.BOLD, 22));
		lblcps.setBounds(35, 256, 108, 29);
		frmCgpa.getContentPane().add(lblcps);
		
		JLabel lbleln = new JLabel("SEM 4");
		lbleln.setForeground(Color.WHITE);
		lbleln.setFont(new Font("Arial Black", Font.BOLD, 22));
		lbleln.setBounds(35, 323, 101, 29);
		frmCgpa.getContentPane().add(lbleln);
		
		JLabel lblme = new JLabel("SEM 5");
		lblme.setForeground(Color.WHITE);
		lblme.setFont(new Font("Arial Black", Font.PLAIN, 22));
		lblme.setBounds(35, 389, 108, 29);
		frmCgpa.getContentPane().add(lblme);
		
		JLabel lblchel = new JLabel("SEM 6");
		lblchel.setForeground(Color.WHITE);
		lblchel.setFont(new Font("Arial Black", Font.PLAIN, 22));
		lblchel.setBounds(35, 451, 108, 29);
		frmCgpa.getContentPane().add(lblchel);
		
		JLabel lblcpl = new JLabel("SEM 7");
		lblcpl.setForeground(Color.WHITE);
		lblcpl.setFont(new Font("Arial Black", Font.PLAIN, 22));
		lblcpl.setBounds(35, 511, 101, 29);
		frmCgpa.getContentPane().add(lblcpl);
		
		JLabel lblegdl = new JLabel("SEM 8");
		lblegdl.setForeground(Color.WHITE);
		lblegdl.setFont(new Font("Arial Black", Font.PLAIN, 22));
		lblegdl.setBounds(35, 579, 108, 29);
		frmCgpa.getContentPane().add(lblegdl);
		
		JLabel lblSgpa = new JLabel("CGPA");
		lblSgpa.setBounds(78, 44, 93, 29);
		panel.add(lblSgpa);
		lblSgpa.setForeground(new Color(0, 0, 255));
		lblSgpa.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		
		
		JLabel lblPercentage = new JLabel("Percentage");
		lblPercentage.setBounds(42, 227, 166, 55);
		panel.add(lblPercentage);
		lblPercentage.setForeground(new Color(255, 0, 204));
		lblPercentage.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		
		
		textsem_1 = new JTextField();
		textsem_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textsem_1.setText("");
			}
		});
		textsem_1.setText("0");
		textsem_1.setFont(new Font("SansSerif", Font.BOLD, 26));
		textsem_1.setBounds(356, 117, 122, 43);
		frmCgpa.getContentPane().add(textsem_1);
		textsem_1.setColumns(10);
		
		
		textsem_2 = new JTextField();
		textsem_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textsem_2.setText("");
			}
		});
		textsem_2.setText("0");
		textsem_2.setFont(new Font("SansSerif", Font.BOLD, 26));
		textsem_2.setColumns(10);
		textsem_2.setBounds(356, 181, 122, 43);
		frmCgpa.getContentPane().add(textsem_2);
		
		
		textsem_3 = new JTextField();
		textsem_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textsem_3.setText("");
			}
		});
		textsem_3.setText("0");
		textsem_3.setFont(new Font("SansSerif", Font.BOLD, 26));
		textsem_3.setColumns(10);
		textsem_3.setBounds(356, 247, 122, 43);
		frmCgpa.getContentPane().add(textsem_3);
		
		
		textsem_4 = new JTextField();
		textsem_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textsem_4.setText("");
			}
		});
		textsem_4.setText("0");
		textsem_4.setFont(new Font("SansSerif", Font.BOLD, 26));
		textsem_4.setColumns(10);
		textsem_4.setBounds(356, 314, 122, 43);
		frmCgpa.getContentPane().add(textsem_4);
		
		
		textsem_5 = new JTextField();
		textsem_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textsem_5.setText("");
			}
		});
		textsem_5.setText("0");
		textsem_5.setFont(new Font("SansSerif", Font.BOLD, 26));
		textsem_5.setColumns(10);
		textsem_5.setBounds(356, 380, 122, 43);
		frmCgpa.getContentPane().add(textsem_5);
		
		
		textsem_6 = new JTextField();
		textsem_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textsem_6.setText("");
			}
		});
		textsem_6.setText("0");
		textsem_6.setFont(new Font("SansSerif", Font.BOLD, 26));
		textsem_6.setColumns(10);
		textsem_6.setBounds(356, 442, 122, 43);
		frmCgpa.getContentPane().add(textsem_6);
		
		
		textsem_7 = new JTextField();
		textsem_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textsem_7.setText("");
			}
		});
		textsem_7.setText("0");
		textsem_7.setFont(new Font("SansSerif", Font.BOLD, 26));
		textsem_7.setColumns(10);
		textsem_7.setBounds(356, 502, 122, 43);
		frmCgpa.getContentPane().add(textsem_7);
		
		
		textsem_8 = new JTextField();
		textsem_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textsem_8.setText("");
			}
		});
		textsem_8.setText("0");
		textsem_8.setFont(new Font("SansSerif", Font.BOLD, 26));
		textsem_8.setColumns(10);
		textsem_8.setBounds(356, 570, 122, 43);
		frmCgpa.getContentPane().add(textsem_8);
		
		
		textCGPA = new JTextField();
		textCGPA.setForeground(new Color(0, 102, 51));
		textCGPA.setBounds(28, 98, 191, 62);
		panel.add(textCGPA);
		textCGPA.setEditable(false);
		textCGPA.setFont(new Font("SansSerif", Font.BOLD, 35));
		textCGPA.setText("0");
		textCGPA.setColumns(10);
		
		
		textPercentage = new JTextField();
		textPercentage.setBounds(28, 294, 191, 62);
		panel.add(textPercentage);
		textPercentage.setEditable(false);
		textPercentage.setText("0");
		textPercentage.setFont(new Font("SansSerif", Font.BOLD, 35));
		textPercentage.setColumns(10);
		
		
		
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.setBackground(new Color(148, 0, 211));
		btnCalculate.setForeground(new Color(0, 0, 0));
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalculateActionPerformed(e);				
			}
		});
		btnCalculate.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnCalculate.setBounds(150, 660, 196, 55);
		frmCgpa.getContentPane().add(btnCalculate);
		
		JLabel label = new JLabel("-------");
		label.setForeground(Color.YELLOW);
		label.setFont(new Font("Arial Black", Font.PLAIN, 22));
		label.setBounds(267, 456, 54, 16);
		frmCgpa.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("-------");
		label_1.setForeground(Color.YELLOW);
		label_1.setFont(new Font("Arial Black", Font.PLAIN, 22));
		label_1.setBounds(267, 395, 54, 16);
		frmCgpa.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("-------");
		label_2.setForeground(Color.YELLOW);
		label_2.setFont(new Font("Arial Black", Font.PLAIN, 22));
		label_2.setBounds(267, 329, 54, 16);
		frmCgpa.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("-------");
		label_3.setForeground(Color.YELLOW);
		label_3.setFont(new Font("Arial Black", Font.PLAIN, 22));
		label_3.setBounds(267, 262, 54, 16);
		frmCgpa.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("-------");
		label_4.setForeground(Color.YELLOW);
		label_4.setFont(new Font("Arial Black", Font.PLAIN, 22));
		label_4.setBounds(267, 194, 54, 16);
		frmCgpa.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("-------");
		label_5.setForeground(Color.YELLOW);
		label_5.setFont(new Font("Arial Black", Font.PLAIN, 22));
		label_5.setBounds(267, 132, 54, 16);
		frmCgpa.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("-------");
		label_6.setForeground(Color.YELLOW);
		label_6.setFont(new Font("Arial Black", Font.PLAIN, 22));
		label_6.setBounds(267, 517, 54, 16);
		frmCgpa.getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("-------");
		label_7.setForeground(Color.YELLOW);
		label_7.setFont(new Font("Arial Black", Font.PLAIN, 22));
		label_7.setBounds(267, 585, 54, 16);
		frmCgpa.getContentPane().add(label_7);
		
		JLabel label_9 = new JLabel("%");
		label_9.setFont(new Font("SansSerif", Font.BOLD, 30));
		label_9.setBounds(684, 658, 42, 55);
		frmCgpa.getContentPane().add(label_9);
		
		JLabel lblNoteEnter = new JLabel("note : Enter 0 for semesters that not completed");
		lblNoteEnter.setForeground(new Color(205, 92, 92));
		lblNoteEnter.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblNoteEnter.setBounds(17, 63, 496, 29);
		frmCgpa.getContentPane().add(lblNoteEnter);
		
		JButton btnBack = new JButton("Back");
		btnBack.setForeground(new Color(255, 255, 255));
		btnBack.setBackground(new Color(0, 0, 153));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmCgpa.dispose();
				Front_page window = new Front_page();
				window.Front_frame.setVisible(true);
			}
		});
		btnBack.setFont(new Font("SansSerif", Font.BOLD, 20));
		btnBack.setBounds(710, 27, 86, 43);
		frmCgpa.getContentPane().add(btnBack);
		
		
	}
/*	public int Check(float n)
	{

		if(n>0)			
			return 20;
		else if(n>0)
			return 9;
		else if(n>0)
			return 8;
		else if(n>=60 && n<70)
			return 7;
		else if(n>=45 && n<60)
			return 6;
		else if(n>=40 && n<45)
			return 4;
		else
			return 0;
	}*/
	private void btnCalculateActionPerformed(ActionEvent evt)
	{
		int Sem_1=20, Sem_2=20, Sem_3=24, Sem_4=24, Sem_5=25, Sem_6=24,Sem_7=20,Sem_8=18;
		
		float sem1=Float.parseFloat(textsem_1.getText());
		float sem2=Float.parseFloat(textsem_2.getText());
		float sem3=Float.parseFloat(textsem_3.getText());
		float sem4=Float.parseFloat(textsem_4.getText());
		float sem5=Float.parseFloat(textsem_5.getText());
		float sem6=Float.parseFloat(textsem_6.getText());
		float sem7=Float.parseFloat(textsem_7.getText());
		float sem8=Float.parseFloat(textsem_8.getText());
		
		float Sgpa1=Sem_1*sem1;
		float Sgpa2=Sem_2*sem2;
		float Sgpa3=Sem_3*sem3;
		float Sgpa4=Sem_4*sem4;
		float Sgpa5=Sem_5*sem5;
		float Sgpa6=Sem_6*sem6;
		float Sgpa7=Sem_7*sem7;
		float Sgpa8=Sem_8*sem8;
		
		
		if(Sgpa1!=0)
			Sem_1=20;
		else
			Sem_1=0;
		
		if(Sgpa2!=0)
			Sem_2=20;
		else
			Sem_2=0;
		
		
		if(Sgpa3!=0)
			Sem_3=24;
		else
			Sem_3=0;
		
		if(Sgpa4!=0)
			Sem_4=24;
		else
			Sem_4=0;
		
		if(Sgpa5!=0)
			Sem_5=25;
		else
			Sem_5=0;
		
		if(Sgpa6!=0)
			Sem_6=24;
		else
			Sem_6=0;
		
		if(Sgpa7!=0)
			Sem_7=20;
		else
			Sem_7=0;
		
		if(Sgpa8!=0)
			Sem_8=6;
		else
			Sem_8=0;
		
		
		
		float CGPA=((Sgpa1+Sgpa2+Sgpa3+Sgpa4+Sgpa5+Sgpa6+Sgpa7+Sgpa8)/(Sem_1+Sem_2+Sem_3+Sem_4+Sem_5+Sem_6+Sem_7+Sem_8));
		float percentage=(float) ((CGPA-0.75)*10);
		
		
		
		if(CGPA==0)
		{
			 percentage=0;
		}
		String GRAND_CGPA=String.valueOf(CGPA);
		String Grand_Percentage=String.valueOf(percentage);
		
		textCGPA.setText(GRAND_CGPA);
		textPercentage.setText(Grand_Percentage);
		
		
		
	}
}
