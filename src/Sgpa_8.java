import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.SystemColor;

public class Sgpa_8 {
	
	/**
	 * @author Puneeth K S 
	 */

	public JFrame frmSgpa_8;
	private JTextField text81;
	private JTextField text82;
	private JTextField text83;
	private JTextField text84__;
	private JTextField text85__;
	private JTextField text86;
	private JTextField textSGPA;
	private JTextField textPercentage;
	private JTextField textC_81;
	private JTextField textC_82;
	private JTextField textC_83;
	private JTextField textC_84;
	private JTextField textC_85;
	private JTextField textC_86;

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
					Sgpa_8 window = new Sgpa_8();
					window.frmSgpa_8.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Sgpa_8() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSgpa_8 = new JFrame();
		frmSgpa_8.setResizable(false);
		frmSgpa_8.getContentPane().setBackground(Color.BLACK);
		frmSgpa_8.setTitle("Welcome >> Scheme >> 8th sem Sgpa");
		frmSgpa_8.setBounds(100, 100, 834, 770);
		frmSgpa_8.setLocationRelativeTo(null);
		frmSgpa_8.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSgpa_8.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 255), new Color(0, 0, 255), new Color(255, 255, 0), new Color(255, 255, 0)));
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(553, 143, 243, 435);
		frmSgpa_8.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblEnterTheMarks = new JLabel("Enter the marks obtained out of 100");
		lblEnterTheMarks.setForeground(Color.WHITE);
		lblEnterTheMarks.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblEnterTheMarks.setBounds(17, 6, 365, 29);
		frmSgpa_8.getContentPane().add(lblEnterTheMarks);
		
		JLabel lbl81 = new JLabel("18**81");
		lbl81.setForeground(Color.WHITE);
		lbl81.setFont(new Font("Arial Black", Font.BOLD, 22));
		lbl81.setBounds(30, 150, 154, 29);
		frmSgpa_8.getContentPane().add(lbl81);
		
		JLabel lbl82 = new JLabel("18**82");
		lbl82.setForeground(Color.WHITE);
		lbl82.setFont(new Font("Arial Black", Font.BOLD, 22));
		lbl82.setBounds(30, 231, 154, 29);
		frmSgpa_8.getContentPane().add(lbl82);
		
		JLabel lbl33 = new JLabel("18**83");
		lbl33.setForeground(Color.WHITE);
		lbl33.setFont(new Font("Arial Black", Font.BOLD, 22));
		lbl33.setBounds(30, 311, 154, 29);
		frmSgpa_8.getContentPane().add(lbl33);
		
		JLabel lbl34 = new JLabel("18**84*");
		lbl34.setForeground(Color.WHITE);
		lbl34.setFont(new Font("Arial Black", Font.BOLD, 22));
		lbl34.setBounds(30, 387, 154, 29);
		frmSgpa_8.getContentPane().add(lbl34);
		
		JLabel lbl35 = new JLabel("18**85*");
		lbl35.setForeground(Color.WHITE);
		lbl35.setFont(new Font("Arial Black", Font.PLAIN, 22));
		lbl35.setBounds(30, 465, 154, 29);
		frmSgpa_8.getContentPane().add(lbl35);
		
		JLabel lbl36 = new JLabel("18**86");
		lbl36.setForeground(Color.WHITE);
		lbl36.setFont(new Font("Arial Black", Font.PLAIN, 22));
		lbl36.setBounds(30, 544, 156, 29);
		frmSgpa_8.getContentPane().add(lbl36);
		
	
		
		JLabel lblSgpa = new JLabel("SGPA");
		lblSgpa.setBounds(78, 44, 93, 29);
		panel.add(lblSgpa);
		lblSgpa.setBackground(new Color(51, 0, 153));
		lblSgpa.setForeground(Color.BLUE);
		lblSgpa.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		
		
		JLabel lblPercentage = new JLabel("Percentage");
		lblPercentage.setBounds(42, 227, 166, 55);
		panel.add(lblPercentage);
		lblPercentage.setForeground(new Color(199, 21, 133));
		lblPercentage.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		
		
		text81 = new JTextField();
		text81.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				text81.setText("");
			}
		});
		text81.setText("0");
		text81.setFont(new Font("SansSerif", Font.BOLD, 26));
		text81.setBounds(234, 141, 122, 43);
		frmSgpa_8.getContentPane().add(text81);
		text81.setColumns(10);
		
		
		text82 = new JTextField();
		text82.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				text82.setText("");
			}
		});
		text82.setText("0");
		text82.setFont(new Font("SansSerif", Font.BOLD, 26));
		text82.setColumns(10);
		text82.setBounds(234, 222, 122, 43);
		frmSgpa_8.getContentPane().add(text82);
		
		
		text83 = new JTextField();
		text83.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				text83.setText("");
			}
		});
		text83.setText("0");
		text83.setFont(new Font("SansSerif", Font.BOLD, 26));
		text83.setColumns(10);
		text83.setBounds(234, 302, 122, 43);
		frmSgpa_8.getContentPane().add(text83);
		
		
		text84__ = new JTextField();
		text84__.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				text84__.setText("");
			}
		});
		text84__.setText("0");
		text84__.setFont(new Font("SansSerif", Font.BOLD, 26));
		text84__.setColumns(10);
		text84__.setBounds(234, 378, 122, 43);
		frmSgpa_8.getContentPane().add(text84__);
		
		
		text85__ = new JTextField();
		text85__.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				text85__.setText("");
			}
		});
		text85__.setText("0");
		text85__.setFont(new Font("SansSerif", Font.BOLD, 26));
		text85__.setColumns(10);
		text85__.setBounds(234, 456, 122, 43);
		frmSgpa_8.getContentPane().add(text85__);
		
		
		text86 = new JTextField();
		text86.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				text86.setText("");
			}
		});
		text86.setText("0");
		text86.setFont(new Font("SansSerif", Font.BOLD, 26));
		text86.setColumns(10);
		text86.setBounds(234, 535, 122, 43);
		frmSgpa_8.getContentPane().add(text86);

		
		
		textSGPA = new JTextField();
		textSGPA.setForeground(new Color(0, 102, 51));
		textSGPA.setBounds(28, 98, 191, 62);
		panel.add(textSGPA);
		textSGPA.setForeground(new Color(0, 100, 0));
		textSGPA.setEditable(false);
		textSGPA.setFont(new Font("SansSerif", Font.BOLD, 35));
		textSGPA.setText("0");
		textSGPA.setColumns(10);
		
		
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
		btnCalculate.setBounds(216, 645, 196, 55);
		frmSgpa_8.getContentPane().add(btnCalculate);
		
		JLabel label_9 = new JLabel("%");
		label_9.setFont(new Font("SansSerif", Font.BOLD, 30));
		label_9.setBounds(700, 658, 26, 55);
		frmSgpa_8.getContentPane().add(label_9);
	
	
		JLabel lblNoteEnter = new JLabel("note : Enter '0' for subjects that you don't have");
		lblNoteEnter.setForeground(new Color(205, 92, 92));
		lblNoteEnter.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblNoteEnter.setBounds(17, 33, 538, 29);
		frmSgpa_8.getContentPane().add(lblNoteEnter);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBackground(new Color(0, 0, 153));
		btnBack.setForeground(new Color(255, 255, 255));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmSgpa_8.dispose();
				Scheme window = new Scheme();
				window.frmScheme.setVisible(true);
			}
		});
		btnBack.setFont(new Font("SansSerif", Font.BOLD, 20));
		btnBack.setBounds(711, 26, 86, 43);
		frmSgpa_8.getContentPane().add(btnBack);
		
		JLabel label_8_1_1 = new JLabel("-------");
		label_8_1_1.setForeground(Color.YELLOW);
		label_8_1_1.setFont(new Font("Arial Black", Font.PLAIN, 22));
		label_8_1_1.setBounds(149, 156, 54, 16);
		frmSgpa_8.getContentPane().add(label_8_1_1);
		
		JLabel label_8_1_2 = new JLabel("-------");
		label_8_1_2.setForeground(Color.YELLOW);
		label_8_1_2.setFont(new Font("Arial Black", Font.PLAIN, 22));
		label_8_1_2.setBounds(149, 237, 54, 16);
		frmSgpa_8.getContentPane().add(label_8_1_2);
		
		JLabel label_8_1_3 = new JLabel("-------");
		label_8_1_3.setForeground(Color.YELLOW);
		label_8_1_3.setFont(new Font("Arial Black", Font.PLAIN, 22));
		label_8_1_3.setBounds(149, 317, 54, 16);
		frmSgpa_8.getContentPane().add(label_8_1_3);
		
		JLabel label_8_1_4 = new JLabel("-------");
		label_8_1_4.setForeground(Color.YELLOW);
		label_8_1_4.setFont(new Font("Arial Black", Font.PLAIN, 22));
		label_8_1_4.setBounds(149, 391, 54, 21);
		frmSgpa_8.getContentPane().add(label_8_1_4);
		
		JLabel label_8_1_5 = new JLabel("-------");
		label_8_1_5.setForeground(Color.YELLOW);
		label_8_1_5.setFont(new Font("Arial Black", Font.PLAIN, 22));
		label_8_1_5.setBounds(149, 471, 54, 16);
		frmSgpa_8.getContentPane().add(label_8_1_5);
		
		JLabel label_8_1_6 = new JLabel("-------");
		label_8_1_6.setForeground(Color.YELLOW);
		label_8_1_6.setFont(new Font("Arial Black", Font.PLAIN, 22));
		label_8_1_6.setBounds(149, 550, 54, 16);
		frmSgpa_8.getContentPane().add(label_8_1_6);
		
		textC_81 = new JTextField();
		textC_81.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textC_81.setText("");
			}
		});
		textC_81.setText("0");
		textC_81.setFont(new Font("SansSerif", Font.BOLD, 26));
		textC_81.setColumns(10);
		textC_81.setBounds(399, 141, 122, 43);
		frmSgpa_8.getContentPane().add(textC_81);
		
		textC_82 = new JTextField();
		textC_82.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textC_82.setText("");
			}
		});
		textC_82.setText("0");
		textC_82.setFont(new Font("SansSerif", Font.BOLD, 26));
		textC_82.setColumns(10);
		textC_82.setBounds(399, 222, 122, 43);
		frmSgpa_8.getContentPane().add(textC_82);
		
		textC_83 = new JTextField();
		textC_83.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textC_83.setText("");
			}
		});
		textC_83.setText("0");
		textC_83.setFont(new Font("SansSerif", Font.BOLD, 26));
		textC_83.setColumns(10);
		textC_83.setBounds(399, 302, 122, 43);
		frmSgpa_8.getContentPane().add(textC_83);
		
		textC_84 = new JTextField();
		textC_84.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textC_84.setText("");
			}
		});
		textC_84.setText("0");
		textC_84.setFont(new Font("SansSerif", Font.BOLD, 26));
		textC_84.setColumns(10);
		textC_84.setBounds(399, 378, 122, 43);
		frmSgpa_8.getContentPane().add(textC_84);
		
		textC_85 = new JTextField();
		textC_85.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textC_85.setText("");
			}
		});
		textC_85.setText("0");
		textC_85.setFont(new Font("SansSerif", Font.BOLD, 26));
		textC_85.setColumns(10);
		textC_85.setBounds(399, 456, 122, 43);
		frmSgpa_8.getContentPane().add(textC_85);
		
		textC_86 = new JTextField();
		textC_86.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textC_86.setText("");
			}
		});
		textC_86.setText("0");
		textC_86.setFont(new Font("SansSerif", Font.BOLD, 26));
		textC_86.setColumns(10);
		textC_86.setBounds(399, 535, 122, 43);
		frmSgpa_8.getContentPane().add(textC_86);
		
		JLabel lblEnterTheCredits = new JLabel("Enter the Credits");
		lblEnterTheCredits.setForeground(new Color(0, 255, 255));
		lblEnterTheCredits.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 20));
		lblEnterTheCredits.setBounds(382, 83, 173, 29);
		frmSgpa_8.getContentPane().add(lblEnterTheCredits);
		
		
		
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
	
	private void btnCalculateActionPerformed(ActionEvent e)
	{
		float _81=Float.parseFloat(text81.getText());
		float _82=Float.parseFloat(text82.getText());
		float _83=Float.parseFloat(text83.getText());
		float _84_=Float.parseFloat(text84__.getText());
		float _85_=Float.parseFloat(text85__.getText());
		float _86=Float.parseFloat(text86.getText());
		
		float C_81=Float.parseFloat(textC_81.getText());
		float C_82=Float.parseFloat(textC_82.getText());
		float C_83=Float.parseFloat(textC_83.getText());
		float C_84=Float.parseFloat(textC_84.getText());
		float C_85=Float.parseFloat(textC_85.getText());
		float C_86=Float.parseFloat(textC_86.getText());
		
		
		float _81_1=Check(_81);
		float _82_1=Check(_82);
		float _83_1=Check(_83);
		float _84_1_=Check(_84_);
		float _85_1_=Check(_85_);
		float _86_1=Check(_86);

		try {
		
		float Sgpa=((C_81*_81_1)+(C_82*_82_1)+(C_83*_83_1)+(C_84*_84_1_)+(C_85*_85_1_)+(C_86*_86_1))/(C_81+ C_82+C_83 +C_84+ C_85+ C_86);
		float percentage=(float) ((Sgpa-0.75)*10);
		
		if(Sgpa==0)
		{
			 percentage=0;
		}
		
		String GRAND_SGPA=String.valueOf(Sgpa);
		String Grand_Percentage=String.valueOf(percentage);
		
		textSGPA.setText(GRAND_SGPA);
		textPercentage.setText(Grand_Percentage);
		
		}
		catch(ArithmeticException ecp)
		{
			JOptionPane.showMessageDialog(null,ecp);
		}
		
		if(_81>100 || _82>100 ||_83>100 ||_84_>100 || _85_>100 || _86>100)
		{
			JOptionPane.showMessageDialog(null,"Marks should be <= 100");
			textSGPA.setText("0.0");
			textPercentage.setText("0.0");
		}
		
		if(C_81>10 || C_82>10 ||C_83>10 ||C_84>10 || C_85>10 || C_86>10)
		{
			JOptionPane.showMessageDialog(null,"Credits should be less than 10");
			textSGPA.setText("0.0");
			textPercentage.setText("0.0");
		}
		
		
	}
}


