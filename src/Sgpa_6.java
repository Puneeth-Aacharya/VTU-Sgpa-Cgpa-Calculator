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

public class Sgpa_6 {
	
	/**
	 * @author Puneeth K S 
	 */

	public JFrame frmSgpa_6;
	private JTextField text61;
	private JTextField text62;
	private JTextField text63;
	private JTextField text64__;
	private JTextField text65__;
	private JTextField text66;
	private JTextField text67;
	private JTextField text68;
	private JTextField text69;
	private JTextField textSGPA;
	private JTextField textPercentage;

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
					Sgpa_6 window = new Sgpa_6();
					window.frmSgpa_6.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Sgpa_6() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSgpa_6 = new JFrame();
		frmSgpa_6.setResizable(false);
		frmSgpa_6.getContentPane().setBackground(Color.BLACK);
		frmSgpa_6.setTitle("Welcome >> Scheme >> 6th sem Sgpa");
		frmSgpa_6.setBounds(100, 100, 834, 770);
		frmSgpa_6.setLocationRelativeTo(null);
		frmSgpa_6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSgpa_6.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 255), new Color(0, 0, 255), new Color(255, 255, 0), new Color(255, 255, 0)));
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(553, 143, 243, 435);
		frmSgpa_6.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblEnterTheMarks = new JLabel("Enter the marks obtained out of 100");
		lblEnterTheMarks.setForeground(Color.WHITE);
		lblEnterTheMarks.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblEnterTheMarks.setBounds(17, 22, 365, 29);
		frmSgpa_6.getContentPane().add(lblEnterTheMarks);
		
		JLabel lbl31 = new JLabel("18**61");
		lbl31.setForeground(Color.WHITE);
		lbl31.setFont(new Font("Arial Black", Font.BOLD, 22));
		lbl31.setBounds(43, 126, 154, 29);
		frmSgpa_6.getContentPane().add(lbl31);
		
		JLabel lbl32 = new JLabel("18**62");
		lbl32.setForeground(Color.WHITE);
		lbl32.setFont(new Font("Arial Black", Font.BOLD, 22));
		lbl32.setBounds(43, 181, 154, 29);
		frmSgpa_6.getContentPane().add(lbl32);
		
		JLabel lbl33 = new JLabel("18**63");
		lbl33.setForeground(Color.WHITE);
		lbl33.setFont(new Font("Arial Black", Font.BOLD, 22));
		lbl33.setBounds(43, 236, 154, 29);
		frmSgpa_6.getContentPane().add(lbl33);
		
		JLabel lbl34 = new JLabel("18**64*");
		lbl34.setForeground(Color.WHITE);
		lbl34.setFont(new Font("Arial Black", Font.BOLD, 22));
		lbl34.setBounds(43, 291, 154, 29);
		frmSgpa_6.getContentPane().add(lbl34);
		
		JLabel lbl35 = new JLabel("18**65*");
		lbl35.setForeground(Color.WHITE);
		lbl35.setFont(new Font("Arial Black", Font.PLAIN, 22));
		lbl35.setBounds(43, 346, 154, 29);
		frmSgpa_6.getContentPane().add(lbl35);
		
		JLabel lbl36 = new JLabel("18**66");
		lbl36.setForeground(Color.WHITE);
		lbl36.setFont(new Font("Arial Black", Font.PLAIN, 22));
		lbl36.setBounds(43, 401, 156, 29);
		frmSgpa_6.getContentPane().add(lbl36);
		
		JLabel lbl37 = new JLabel("18**67");
		lbl37.setForeground(Color.WHITE);
		lbl37.setFont(new Font("Arial Black", Font.PLAIN, 22));
		lbl37.setBounds(43, 456, 154, 29);
		frmSgpa_6.getContentPane().add(lbl37);
		
		JLabel lbl38 = new JLabel("18**68");
		lbl38.setForeground(Color.WHITE);
		lbl38.setFont(new Font("Arial Black", Font.PLAIN, 22));
		lbl38.setBounds(43, 511, 154, 29);
		frmSgpa_6.getContentPane().add(lbl38);
		
		JLabel lb39 = new JLabel("18**69");
		lb39.setForeground(Color.WHITE);
		lb39.setFont(new Font("Arial Black", Font.PLAIN, 22));
		lb39.setBounds(43, 566, 154, 29);
		frmSgpa_6.getContentPane().add(lb39);
		
		JLabel lblSgpa = new JLabel("SGPA");
		lblSgpa.setBounds(78, 44, 93, 29);
		panel.add(lblSgpa);
		lblSgpa.setForeground(new Color(0, 102, 204));
		lblSgpa.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		
		
		JLabel lblPercentage = new JLabel("Percentage");
		lblPercentage.setBounds(42, 227, 166, 55);
		panel.add(lblPercentage);
		lblPercentage.setForeground(new Color(199, 21, 133));
		lblPercentage.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		
		
		text61 = new JTextField();
		text61.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				text61.setText("");
			}
		});
		text61.setText("0");
		text61.setFont(new Font("SansSerif", Font.BOLD, 26));
		text61.setBounds(378, 117, 122, 43);
		frmSgpa_6.getContentPane().add(text61);
		text61.setColumns(10);
		
		
		text62 = new JTextField();
		text62.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				text62.setText("");
			}
		});
		text62.setText("0");
		text62.setFont(new Font("SansSerif", Font.BOLD, 26));
		text62.setColumns(10);
		text62.setBounds(378, 172, 122, 43);
		frmSgpa_6.getContentPane().add(text62);
		
		
		text63 = new JTextField();
		text63.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				text63.setText("");
			}
		});
		text63.setText("0");
		text63.setFont(new Font("SansSerif", Font.BOLD, 26));
		text63.setColumns(10);
		text63.setBounds(378, 227, 122, 43);
		frmSgpa_6.getContentPane().add(text63);
		
		
		text64__ = new JTextField();
		text64__.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				text64__.setText("");
			}
		});
		text64__.setText("0");
		text64__.setFont(new Font("SansSerif", Font.BOLD, 26));
		text64__.setColumns(10);
		text64__.setBounds(378, 282, 122, 43);
		frmSgpa_6.getContentPane().add(text64__);
		
		
		text65__ = new JTextField();
		text65__.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				text65__.setText("");
			}
		});
		text65__.setText("0");
		text65__.setFont(new Font("SansSerif", Font.BOLD, 26));
		text65__.setColumns(10);
		text65__.setBounds(378, 337, 122, 43);
		frmSgpa_6.getContentPane().add(text65__);
		
		
		text66 = new JTextField();
		text66.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				text66.setText("");
			}
		});
		text66.setText("0");
		text66.setFont(new Font("SansSerif", Font.BOLD, 26));
		text66.setColumns(10);
		text66.setBounds(378, 392, 122, 43);
		frmSgpa_6.getContentPane().add(text66);
		
		
		text67 = new JTextField();
		text67.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				text67.setText("");
			}
		});
		text67.setText("0");
		text67.setFont(new Font("SansSerif", Font.BOLD, 26));
		text67.setColumns(10);
		text67.setBounds(378, 447, 122, 43);
		frmSgpa_6.getContentPane().add(text67);
		
		
		text68 = new JTextField();
		text68.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				text68.setText("");
			}
		});
		text68.setText("0");
		text68.setFont(new Font("SansSerif", Font.BOLD, 26));
		text68.setColumns(10);
		text68.setBounds(378, 502, 122, 43);
		frmSgpa_6.getContentPane().add(text68);
		
		
		text69 = new JTextField();
		text69.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				text69.setText("");
			}
		});
		text69.setText("0");
		text69.setFont(new Font("SansSerif", Font.BOLD, 26));
		text69.setColumns(10);
		text69.setBounds(378, 557, 122, 43);
		frmSgpa_6.getContentPane().add(text69);
		
		
		textSGPA = new JTextField();
		textSGPA.setForeground(new Color(0, 102, 51));
		textSGPA.setBounds(28, 98, 191, 62);
		panel.add(textSGPA);
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
		btnCalculate.setBounds(165, 660, 196, 55);
		frmSgpa_6.getContentPane().add(btnCalculate);
		
		JLabel label = new JLabel("-------");
		label.setForeground(Color.YELLOW);
		label.setFont(new Font("Arial Black", Font.PLAIN, 22));
		label.setBounds(267, 407, 54, 16);
		frmSgpa_6.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("-------");
		label_1.setForeground(Color.YELLOW);
		label_1.setFont(new Font("Arial Black", Font.PLAIN, 22));
		label_1.setBounds(267, 352, 54, 16);
		frmSgpa_6.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("-------");
		label_2.setForeground(Color.YELLOW);
		label_2.setFont(new Font("Arial Black", Font.PLAIN, 22));
		label_2.setBounds(267, 297, 54, 16);
		frmSgpa_6.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("-------");
		label_3.setForeground(Color.YELLOW);
		label_3.setFont(new Font("Arial Black", Font.PLAIN, 22));
		label_3.setBounds(267, 242, 54, 16);
		frmSgpa_6.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("-------");
		label_4.setForeground(Color.YELLOW);
		label_4.setFont(new Font("Arial Black", Font.PLAIN, 22));
		label_4.setBounds(267, 187, 54, 16);
		frmSgpa_6.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("-------");
		label_5.setForeground(Color.YELLOW);
		label_5.setFont(new Font("Arial Black", Font.PLAIN, 22));
		label_5.setBounds(267, 132, 54, 16);
		frmSgpa_6.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("-------");
		label_6.setForeground(Color.YELLOW);
		label_6.setFont(new Font("Arial Black", Font.PLAIN, 22));
		label_6.setBounds(267, 462, 54, 16);
		frmSgpa_6.getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("-------");
		label_7.setForeground(Color.YELLOW);
		label_7.setFont(new Font("Arial Black", Font.PLAIN, 22));
		label_7.setBounds(267, 517, 54, 16);
		frmSgpa_6.getContentPane().add(label_7);
		
		JLabel label_8 = new JLabel("-------");
		label_8.setForeground(Color.YELLOW);
		label_8.setFont(new Font("Arial Black", Font.PLAIN, 22));
		label_8.setBounds(267, 572, 54, 16);
		frmSgpa_6.getContentPane().add(label_8);
		
		JLabel label_9 = new JLabel("%");
		label_9.setFont(new Font("SansSerif", Font.BOLD, 30));
		label_9.setBounds(700, 658, 26, 55);
		frmSgpa_6.getContentPane().add(label_9);
		
		JLabel lblNoteEnter = new JLabel("note : Enter '0' for subjects tha you don't have");
		lblNoteEnter.setForeground(new Color(205, 92, 92));
		lblNoteEnter.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblNoteEnter.setBounds(17, 63, 516, 29);
		frmSgpa_6.getContentPane().add(lblNoteEnter);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBackground(new Color(0, 0, 153));
		btnBack.setForeground(new Color(255, 255, 255));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmSgpa_6.dispose();
				Scheme window = new Scheme();
				window.frmScheme.setVisible(true);
			}
		});
		btnBack.setFont(new Font("SansSerif", Font.BOLD, 20));
		btnBack.setBounds(710, 15, 86, 43);
		frmSgpa_6.getContentPane().add(btnBack);
		
		
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
		float _61=Float.parseFloat(text61.getText());
		float _62=Float.parseFloat(text62.getText());
		float _63=Float.parseFloat(text63.getText());
		float _64_=Float.parseFloat(text64__.getText());
		float _65_=Float.parseFloat(text65__.getText());
		float _66=Float.parseFloat(text66.getText());
		float _67=Float.parseFloat(text67.getText());
		float _68=Float.parseFloat(text68.getText());
		float _69=Float.parseFloat(text69.getText());
		
		
		float _61_1=Check(_61);
		float _62_1=Check(_62);
		float _63_1=Check(_63);
		float _64_1_=Check(_64_);
		float _65_1_=Check(_65_);
		float _66_1=Check(_66);
		float _67_1=Check(_67);
		float _68_1=Check(_68);
		float _69_1=Check(_69);
		
		float Sgpa=((4*_61_1)+(4*_62_1)+(4*_63_1)+(3*_64_1_)+(3*_65_1_)+(2*_66_1)+(2*_67_1)+(2*_68_1))/24;
		float percentage=(float) ((Sgpa-0.75)*10);
		
		if(Sgpa==0)
		{
			 percentage=0;
		}
		
		String GRAND_SGPA=String.valueOf(Sgpa);
		String Grand_Percentage=String.valueOf(percentage);
		
		textSGPA.setText(GRAND_SGPA);
		textPercentage.setText(Grand_Percentage);
		
		if(_61>100 ||_62>100 || _63>100 || _64_>100 || _65_>100 || _66>100 || _67>100 || _68>100 || _69>100)
		{
			JOptionPane.showMessageDialog(null,"Marks should be <= 100");
			textSGPA.setText("0.0");
			textPercentage.setText("0.0");
		}
	}
}


