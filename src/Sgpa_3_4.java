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

public class Sgpa_3_4 {
	
	/**
	 * @author Puneeth K S 
	 */

	private static final int _74_ = 0;
	private static final int _75_ = 0;
	public JFrame frmSgpa_3;
	private JTextField text31;
	private JTextField text32;
	private JTextField text33;
	private JTextField text34;
	private JTextField text35;
	private JTextField text36;
	private JTextField text37;
	private JTextField text38;
	private JTextField text39;
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
					Sgpa_3_4 window = new Sgpa_3_4();
					window.frmSgpa_3.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Sgpa_3_4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSgpa_3 = new JFrame();
		frmSgpa_3.setResizable(false);
		frmSgpa_3.getContentPane().setBackground(Color.BLACK);
		frmSgpa_3.setTitle("Welcome >> Scheme >> 3rd/4th sem Sgpa");
		frmSgpa_3.setBounds(100, 100, 834,770);
		frmSgpa_3.setLocationRelativeTo(null);
		frmSgpa_3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSgpa_3.getContentPane().setLayout(null);
		
		JLabel lblEnterTheMarks = new JLabel("Enter the marks obtained out of 100");
		lblEnterTheMarks.setForeground(Color.WHITE);
		lblEnterTheMarks.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblEnterTheMarks.setBounds(17, 22, 365, 29);
		frmSgpa_3.getContentPane().add(lblEnterTheMarks);
		
		JLabel lbl31 = new JLabel("18**31/ 41");
		lbl31.setForeground(Color.WHITE);
		lbl31.setFont(new Font("Arial Black", Font.BOLD, 22));
		lbl31.setBounds(30, 126, 154, 29);
		frmSgpa_3.getContentPane().add(lbl31);
		
		JLabel lbl32 = new JLabel("18**32/ 42");
		lbl32.setForeground(Color.WHITE);
		lbl32.setFont(new Font("Arial Black", Font.BOLD, 22));
		lbl32.setBounds(30, 181, 154, 29);
		frmSgpa_3.getContentPane().add(lbl32);
		
		JLabel lbl33 = new JLabel("18**33/ 43");
		lbl33.setForeground(Color.WHITE);
		lbl33.setFont(new Font("Arial Black", Font.BOLD, 22));
		lbl33.setBounds(30, 236, 154, 29);
		frmSgpa_3.getContentPane().add(lbl33);
		
		JLabel lbl34 = new JLabel("18**34/ 44");
		lbl34.setForeground(Color.WHITE);
		lbl34.setFont(new Font("Arial Black", Font.BOLD, 22));
		lbl34.setBounds(30, 291, 154, 29);
		frmSgpa_3.getContentPane().add(lbl34);
		
		JLabel lbl35 = new JLabel("18**35/ 45");
		lbl35.setForeground(Color.WHITE);
		lbl35.setFont(new Font("Arial Black", Font.PLAIN, 22));
		lbl35.setBounds(30, 346, 154, 29);
		frmSgpa_3.getContentPane().add(lbl35);
		
		JLabel lbl36 = new JLabel("18**36/ 46");
		lbl36.setForeground(Color.WHITE);
		lbl36.setFont(new Font("Arial Black", Font.PLAIN, 22));
		lbl36.setBounds(30, 401, 156, 29);
		frmSgpa_3.getContentPane().add(lbl36);
		
		JLabel lbl37 = new JLabel("18**37/ 47");
		lbl37.setForeground(Color.WHITE);
		lbl37.setFont(new Font("Arial Black", Font.PLAIN, 22));
		lbl37.setBounds(30, 456, 154, 29);
		frmSgpa_3.getContentPane().add(lbl37);
		
		JLabel lbl38 = new JLabel("18**38/ 48");
		lbl38.setForeground(Color.WHITE);
		lbl38.setFont(new Font("Arial Black", Font.PLAIN, 22));
		lbl38.setBounds(30, 511, 154, 29);
		frmSgpa_3.getContentPane().add(lbl38);
		
		JLabel lb39 = new JLabel("KAK /  CPC");
		lb39.setForeground(Color.WHITE);
		lb39.setFont(new Font("Arial Black", Font.PLAIN, 22));
		lb39.setBounds(30, 566, 154, 29);
		frmSgpa_3.getContentPane().add(lb39);
		
		text31 = new JTextField();
		text31.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				text31.setText("");
			}
		});
		text31.setText("0");
		text31.setFont(new Font("SansSerif", Font.BOLD, 26));
		text31.setBounds(363, 117, 122, 43);
		frmSgpa_3.getContentPane().add(text31);
		text31.setColumns(10);
		
		
		text32 = new JTextField();
		text32.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				text32.setText("");
			}
		});
		text32.setText("0");
		text32.setFont(new Font("SansSerif", Font.BOLD, 26));
		text32.setColumns(10);
		text32.setBounds(363, 172, 122, 43);
		frmSgpa_3.getContentPane().add(text32);
		
		
		text33 = new JTextField();
		text33.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				text33.setText("");
			}
		});
		text33.setText("0");
		text33.setFont(new Font("SansSerif", Font.BOLD, 26));
		text33.setColumns(10);
		text33.setBounds(363, 227, 122, 43);
		frmSgpa_3.getContentPane().add(text33);
		
		
		text34 = new JTextField();
		text34.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				text34.setText("");
			}
		});
		text34.setText("0");
		text34.setFont(new Font("SansSerif", Font.BOLD, 26));
		text34.setColumns(10);
		text34.setBounds(363, 282, 122, 43);
		frmSgpa_3.getContentPane().add(text34);
		
		
		text35 = new JTextField();
		text35.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				text35.setText("");
			}
		});
		text35.setText("0");
		text35.setFont(new Font("SansSerif", Font.BOLD, 26));
		text35.setColumns(10);
		text35.setBounds(363, 337, 122, 43);
		frmSgpa_3.getContentPane().add(text35);
		
		
		text36 = new JTextField();
		text36.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				text36.setText("");
			}
		});
		text36.setText("0");
		text36.setFont(new Font("SansSerif", Font.BOLD, 26));
		text36.setColumns(10);
		text36.setBounds(363, 392, 122, 43);
		frmSgpa_3.getContentPane().add(text36);
		
		
		text37 = new JTextField();
		text37.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				text37.setText("");
			}
		});
		text37.setText("0");
		text37.setFont(new Font("SansSerif", Font.BOLD, 26));
		text37.setColumns(10);
		text37.setBounds(363, 447, 122, 43);
		frmSgpa_3.getContentPane().add(text37);
		
		
		text38 = new JTextField();
		text38.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				text38.setText("");
			}
		});
		text38.setText("0");
		text38.setFont(new Font("SansSerif", Font.BOLD, 26));
		text38.setColumns(10);
		text38.setBounds(363, 502, 122, 43);
		frmSgpa_3.getContentPane().add(text38);
		
		
		text39 = new JTextField();
		text39.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				text39.setText("");
			}
		});
		text39.setText("0");
		text39.setFont(new Font("SansSerif", Font.BOLD, 26));
		text39.setColumns(10);
		text39.setBounds(363, 557, 122, 43);
		frmSgpa_3.getContentPane().add(text39);
		
		
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.setBackground(new Color(148, 0, 211));
		btnCalculate.setForeground(new Color(0, 0, 0));
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalculateActionPerformed(e);				
			}
		});
		btnCalculate.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnCalculate.setBounds(145, 660, 196, 55);
		frmSgpa_3.getContentPane().add(btnCalculate);
		
		JLabel label = new JLabel("-------");
		label.setForeground(Color.YELLOW);
		label.setFont(new Font("Arial Black", Font.PLAIN, 22));
		label.setBounds(247, 407, 54, 16);
		frmSgpa_3.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("-------");
		label_1.setForeground(Color.YELLOW);
		label_1.setFont(new Font("Arial Black", Font.PLAIN, 22));
		label_1.setBounds(247, 352, 54, 16);
		frmSgpa_3.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("-------");
		label_2.setForeground(Color.YELLOW);
		label_2.setFont(new Font("Arial Black", Font.PLAIN, 22));
		label_2.setBounds(247, 297, 54, 16);
		frmSgpa_3.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("-------");
		label_3.setForeground(Color.YELLOW);
		label_3.setFont(new Font("Arial Black", Font.PLAIN, 22));
		label_3.setBounds(247, 242, 54, 16);
		frmSgpa_3.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("-------");
		label_4.setForeground(Color.YELLOW);
		label_4.setFont(new Font("Arial Black", Font.PLAIN, 22));
		label_4.setBounds(247, 187, 54, 16);
		frmSgpa_3.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("-------");
		label_5.setForeground(Color.YELLOW);
		label_5.setFont(new Font("Arial Black", Font.PLAIN, 22));
		label_5.setBounds(247, 132, 54, 16);
		frmSgpa_3.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("-------");
		label_6.setForeground(Color.YELLOW);
		label_6.setFont(new Font("Arial Black", Font.PLAIN, 22));
		label_6.setBounds(247, 462, 54, 16);
		frmSgpa_3.getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("-------");
		label_7.setForeground(Color.YELLOW);
		label_7.setFont(new Font("Arial Black", Font.PLAIN, 22));
		label_7.setBounds(247, 517, 54, 16);
		frmSgpa_3.getContentPane().add(label_7);
		
		JLabel label_8 = new JLabel("-------");
		label_8.setForeground(Color.YELLOW);
		label_8.setFont(new Font("Arial Black", Font.PLAIN, 22));
		label_8.setBounds(247, 572, 54, 16);
		frmSgpa_3.getContentPane().add(label_8);
		
		JLabel label_9 = new JLabel("%");
		label_9.setFont(new Font("SansSerif", Font.BOLD, 30));
		label_9.setBounds(700, 658, 26, 55);
		frmSgpa_3.getContentPane().add(label_9);
		
		JLabel lblNoteEnter = new JLabel("note : Enter '0' for subjects that you don't have");
		lblNoteEnter.setForeground(new Color(205, 92, 92));
		lblNoteEnter.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblNoteEnter.setBounds(17, 63, 525, 29);
		frmSgpa_3.getContentPane().add(lblNoteEnter);
		
		JButton btnBack = new JButton("Back");
		btnBack.setForeground(new Color(255, 255, 255));
		btnBack.setBackground(new Color(0, 0, 153));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmSgpa_3.dispose();
				Scheme window = new Scheme();
				window.frmScheme.setVisible(true);
			}
		});
		btnBack.setFont(new Font("SansSerif", Font.BOLD, 20));
		btnBack.setBounds(710, 30, 86, 43);
		frmSgpa_3.getContentPane().add(btnBack);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 255), new Color(0, 0, 255), new Color(255, 255, 0), new Color(255, 255, 0)));
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(553, 143, 243, 435);
		frmSgpa_3.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblSgpa = new JLabel("SGPA");
		lblSgpa.setBounds(78, 44, 93, 29);
		panel.add(lblSgpa);
		lblSgpa.setForeground(new Color(51, 0, 255));
		lblSgpa.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		
		
		textSGPA = new JTextField();
		textSGPA.setForeground(new Color(0, 102, 51));
		textSGPA.setBounds(28, 98, 191, 62);
		panel.add(textSGPA);
		textSGPA.setEditable(false);
		textSGPA.setFont(new Font("SansSerif", Font.BOLD, 35));
		textSGPA.setText("0");
		textSGPA.setColumns(10);
		
		JLabel lblPercentage = new JLabel("Percentage");
		lblPercentage.setBounds(42, 227, 166, 55);
		panel.add(lblPercentage);
		lblPercentage.setForeground(new Color(199, 21, 133));
		lblPercentage.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		
		textPercentage = new JTextField();
		textPercentage.setBounds(28, 294, 191, 62);
		panel.add(textPercentage);
		textPercentage.setEditable(false);
		textPercentage.setText("0");
		textPercentage.setFont(new Font("SansSerif", Font.BOLD, 35));
		textPercentage.setColumns(10);
		
		
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
		float _31=Float.parseFloat(text31.getText());
		float _32=Float.parseFloat(text32.getText());
		float _33=Float.parseFloat(text33.getText());
		float _34=Float.parseFloat(text34.getText());
		float _35=Float.parseFloat(text35.getText());
		float _36=Float.parseFloat(text36.getText());
		float _37=Float.parseFloat(text37.getText());
		float _38=Float.parseFloat(text38.getText());
		float _39=Float.parseFloat(text39.getText());
		
		
		float _31_1=Check(_31);
		float _32_1=Check(_32);
		float _33_1=Check(_33);
		float _34_1=Check(_34);
		float _35_1=Check(_35);
		float _36_1=Check(_36);
		float _37_1=Check(_37);
		float _38_1=Check(_38);
		float _39_1=Check(_39);
		
		float Sgpa=((3*_31_1)+(4*_32_1)+(3*_33_1)+(3*_34_1)+(3*_35_1)+(3*_36_1)+(2*_37_1)+(2*_38_1)+(1*_39_1))/24;
		float percentage=(float) ((Sgpa-0.75)*10);
		
		if(Sgpa==0)
		{
			 percentage=0;
		}
		
		String GRAND_SGPA=String.valueOf(Sgpa);
		String Grand_Percentage=String.valueOf(percentage);
		
		textSGPA.setText(GRAND_SGPA);
		textPercentage.setText(Grand_Percentage);
		
		if(_31>100 ||_32>100 || _33>100 || _34>100 || _35>100 || _36>100 || _37>100 || _38>100 || _39>100)
		{
			JOptionPane.showMessageDialog(null,"Marks should be <= 100");
			textSGPA.setText("0.0");
			textPercentage.setText("0.0");
		}
	}
}


