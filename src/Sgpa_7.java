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

public class Sgpa_7 {
	
	/**
	 * @author Puneeth K S 
	 */

	public JFrame frmSgpa_7;
	private JTextField text71;
	private JTextField text72;
	private JTextField text73;
	private JTextField text74__;
	private JTextField text75__;
	private JTextField text76;
	private JTextField text77;
	private JTextField text78;
	private JTextField text79;
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
					Sgpa_7 window = new Sgpa_7();
					window.frmSgpa_7.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Sgpa_7() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSgpa_7 = new JFrame();
		frmSgpa_7.setResizable(false);
		frmSgpa_7.getContentPane().setBackground(Color.BLACK);
		frmSgpa_7.setTitle("Welcome >> Scheme >> 7th sem Sgpa");
		frmSgpa_7.setBounds(100, 100, 834, 770);
		frmSgpa_7.setLocationRelativeTo(null);
		frmSgpa_7.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSgpa_7.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 255), new Color(0, 0, 255), new Color(255, 255, 0), new Color(255, 255, 0)));
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(553, 143, 243, 435);
		frmSgpa_7.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblEnterTheMarks = new JLabel("Enter the marks obtained out of 100");
		lblEnterTheMarks.setForeground(Color.WHITE);
		lblEnterTheMarks.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblEnterTheMarks.setBounds(17, 22, 365, 29);
		frmSgpa_7.getContentPane().add(lblEnterTheMarks);
		
		JLabel lbl31 = new JLabel("18**71");
		lbl31.setForeground(Color.WHITE);
		lbl31.setFont(new Font("Arial Black", Font.BOLD, 22));
		lbl31.setBounds(38, 126, 154, 29);
		frmSgpa_7.getContentPane().add(lbl31);
		
		JLabel lbl32 = new JLabel("18**72");
		lbl32.setForeground(Color.WHITE);
		lbl32.setFont(new Font("Arial Black", Font.BOLD, 22));
		lbl32.setBounds(38, 181, 154, 29);
		frmSgpa_7.getContentPane().add(lbl32);
		
		JLabel lbl33 = new JLabel("18**73");
		lbl33.setForeground(Color.WHITE);
		lbl33.setFont(new Font("Arial Black", Font.BOLD, 22));
		lbl33.setBounds(38, 236, 154, 29);
		frmSgpa_7.getContentPane().add(lbl33);
		
		JLabel lbl34 = new JLabel("18**74*");
		lbl34.setForeground(Color.WHITE);
		lbl34.setFont(new Font("Arial Black", Font.BOLD, 22));
		lbl34.setBounds(38, 291, 154, 29);
		frmSgpa_7.getContentPane().add(lbl34);
		
		JLabel lbl35 = new JLabel("18**75*");
		lbl35.setForeground(Color.WHITE);
		lbl35.setFont(new Font("Arial Black", Font.PLAIN, 22));
		lbl35.setBounds(38, 346, 154, 29);
		frmSgpa_7.getContentPane().add(lbl35);
		
		JLabel lbl36 = new JLabel("18**76");
		lbl36.setForeground(Color.WHITE);
		lbl36.setFont(new Font("Arial Black", Font.PLAIN, 22));
		lbl36.setBounds(38, 401, 156, 29);
		frmSgpa_7.getContentPane().add(lbl36);
		
		JLabel lbl37 = new JLabel("18**77");
		lbl37.setForeground(Color.WHITE);
		lbl37.setFont(new Font("Arial Black", Font.PLAIN, 22));
		lbl37.setBounds(38, 456, 154, 29);
		frmSgpa_7.getContentPane().add(lbl37);
		
		JLabel lbl38 = new JLabel("18**78");
		lbl38.setForeground(Color.WHITE);
		lbl38.setFont(new Font("Arial Black", Font.PLAIN, 22));
		lbl38.setBounds(38, 511, 154, 29);
		frmSgpa_7.getContentPane().add(lbl38);
		
		JLabel lb39 = new JLabel("18**79");
		lb39.setForeground(Color.WHITE);
		lb39.setFont(new Font("Arial Black", Font.PLAIN, 22));
		lb39.setBounds(38, 566, 154, 29);
		frmSgpa_7.getContentPane().add(lb39);
		
		JLabel lblSgpa = new JLabel("SGPA");
		lblSgpa.setBounds(78, 44, 93, 29);
		panel.add(lblSgpa);
		lblSgpa.setForeground(new Color(75, 0, 130));
		lblSgpa.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		
		
		JLabel lblPercentage = new JLabel("Percentage");
		lblPercentage.setBounds(42, 227, 166, 55);
		panel.add(lblPercentage);
		lblPercentage.setForeground(new Color(199, 21, 133));
		lblPercentage.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		
		
		text71 = new JTextField();
		text71.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				text71.setText("");
			}
		});
		text71.setText("0");
		text71.setFont(new Font("SansSerif", Font.BOLD, 26));
		text71.setBounds(374, 117, 122, 43);
		frmSgpa_7.getContentPane().add(text71);
		text71.setColumns(10);
		
		
		text72 = new JTextField();
		text72.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				text72.setText("");
			}
		});
		text72.setText("0");
		text72.setFont(new Font("SansSerif", Font.BOLD, 26));
		text72.setColumns(10);
		text72.setBounds(374, 172, 122, 43);
		frmSgpa_7.getContentPane().add(text72);
		
		
		text73 = new JTextField();
		text73.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				text73.setText("");
			}
		});
		text73.setText("0");
		text73.setFont(new Font("SansSerif", Font.BOLD, 26));
		text73.setColumns(10);
		text73.setBounds(374, 227, 122, 43);
		frmSgpa_7.getContentPane().add(text73);
		
		
		text74__ = new JTextField();
		text74__.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				text74__.setText("");
			}
		});
		text74__.setText("0");
		text74__.setFont(new Font("SansSerif", Font.BOLD, 26));
		text74__.setColumns(10);
		text74__.setBounds(374, 282, 122, 43);
		frmSgpa_7.getContentPane().add(text74__);
		
		
		text75__ = new JTextField();
		text75__.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				text75__.setText("");
			}
		});
		text75__.setText("0");
		text75__.setFont(new Font("SansSerif", Font.BOLD, 26));
		text75__.setColumns(10);
		text75__.setBounds(374, 337, 122, 43);
		frmSgpa_7.getContentPane().add(text75__);
		
		
		text76 = new JTextField();
		text76.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				text76.setText("");
			}
		});
		text76.setText("0");
		text76.setFont(new Font("SansSerif", Font.BOLD, 26));
		text76.setColumns(10);
		text76.setBounds(374, 392, 122, 43);
		frmSgpa_7.getContentPane().add(text76);
		
		
		text77 = new JTextField();
		text77.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				text77.setText("");
			}
		});
		text77.setText("0");
		text77.setFont(new Font("SansSerif", Font.BOLD, 26));
		text77.setColumns(10);
		text77.setBounds(374, 447, 122, 43);
		frmSgpa_7.getContentPane().add(text77);
		
		
		text78 = new JTextField();
		text78.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				text78.setText("");
			}
		});
		text78.setText("0");
		text78.setFont(new Font("SansSerif", Font.BOLD, 26));
		text78.setColumns(10);
		text78.setBounds(374, 502, 122, 43);
		frmSgpa_7.getContentPane().add(text78);
		
		
		text79 = new JTextField();
		text79.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				text79.setText("");
			}
		});
		text79.setText("0");
		text79.setFont(new Font("SansSerif", Font.BOLD, 26));
		text79.setColumns(10);
		text79.setBounds(374, 557, 122, 43);
		frmSgpa_7.getContentPane().add(text79);
		
		
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
		btnCalculate.setBounds(167, 658, 196, 55);
		frmSgpa_7.getContentPane().add(btnCalculate);
		
		JLabel label_5 = new JLabel("-------");
		label_5.setForeground(Color.YELLOW);
		label_5.setFont(new Font("Arial Black", Font.PLAIN, 22));
		label_5.setBounds(267, 132, 54, 16);
		frmSgpa_7.getContentPane().add(label_5);
		
		JLabel label_9 = new JLabel("%");
		label_9.setFont(new Font("SansSerif", Font.BOLD, 30));
		label_9.setBounds(700, 658, 26, 55);
		frmSgpa_7.getContentPane().add(label_9);
		
		JLabel lblNoteEnter = new JLabel("note : Enter '0' for subjects that you don't have");
		lblNoteEnter.setForeground(new Color(205, 92, 92));
		lblNoteEnter.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblNoteEnter.setBounds(17, 63, 530, 29);
		frmSgpa_7.getContentPane().add(lblNoteEnter);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBackground(new Color(0, 0, 153));
		btnBack.setForeground(new Color(255, 255, 255));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmSgpa_7.dispose();
				Scheme window = new Scheme();
				window.frmScheme.setVisible(true);
			}
		});
		btnBack.setFont(new Font("SansSerif", Font.BOLD, 20));
		btnBack.setBounds(710, 15, 86, 43);
		frmSgpa_7.getContentPane().add(btnBack);
		
		JLabel label_5_1 = new JLabel("-------");
		label_5_1.setForeground(Color.YELLOW);
		label_5_1.setFont(new Font("Arial Black", Font.PLAIN, 22));
		label_5_1.setBounds(267, 184, 54, 23);
		frmSgpa_7.getContentPane().add(label_5_1);
		
		JLabel label_5_2 = new JLabel("-------");
		label_5_2.setForeground(Color.YELLOW);
		label_5_2.setFont(new Font("Arial Black", Font.PLAIN, 22));
		label_5_2.setBounds(267, 241, 54, 19);
		frmSgpa_7.getContentPane().add(label_5_2);
		
		JLabel label_5_3 = new JLabel("-------");
		label_5_3.setForeground(Color.YELLOW);
		label_5_3.setFont(new Font("Arial Black", Font.PLAIN, 22));
		label_5_3.setBounds(267, 297, 54, 16);
		frmSgpa_7.getContentPane().add(label_5_3);
		
		JLabel label_5_4 = new JLabel("-------");
		label_5_4.setForeground(Color.YELLOW);
		label_5_4.setFont(new Font("Arial Black", Font.PLAIN, 22));
		label_5_4.setBounds(267, 352, 54, 16);
		frmSgpa_7.getContentPane().add(label_5_4);
		
		JLabel label_5_5 = new JLabel("-------");
		label_5_5.setForeground(Color.YELLOW);
		label_5_5.setFont(new Font("Arial Black", Font.PLAIN, 22));
		label_5_5.setBounds(267, 407, 54, 16);
		frmSgpa_7.getContentPane().add(label_5_5);
		
		JLabel label_5_6 = new JLabel("-------");
		label_5_6.setForeground(Color.YELLOW);
		label_5_6.setFont(new Font("Arial Black", Font.PLAIN, 22));
		label_5_6.setBounds(267, 462, 54, 16);
		frmSgpa_7.getContentPane().add(label_5_6);
		
		JLabel label_5_7 = new JLabel("-------");
		label_5_7.setForeground(Color.YELLOW);
		label_5_7.setFont(new Font("Arial Black", Font.PLAIN, 22));
		label_5_7.setBounds(267, 517, 54, 16);
		frmSgpa_7.getContentPane().add(label_5_7);
		
		JLabel label_5_8 = new JLabel("-------");
		label_5_8.setForeground(Color.YELLOW);
		label_5_8.setFont(new Font("Arial Black", Font.PLAIN, 22));
		label_5_8.setBounds(267, 572, 54, 16);
		frmSgpa_7.getContentPane().add(label_5_8);
		
		
		
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
		float _71=Float.parseFloat(text71.getText());
		float _72=Float.parseFloat(text72.getText());
		float _73=Float.parseFloat(text73.getText());
		float _74_=Float.parseFloat(text74__.getText());
		float _75_=Float.parseFloat(text75__.getText());
		float _76=Float.parseFloat(text76.getText());
		float _77=Float.parseFloat(text77.getText());
		float _78=Float.parseFloat(text78.getText());
		float _79=Float.parseFloat(text79.getText());
		
		
		
		float _71_1=Check(_71);
		float _72_1=Check(_72);
		float _73_1=Check(_73);
		float _74_1_=Check(_74_);
		float _75_1_=Check(_75_);
		float _76_1=Check(_76);
		float _77_1=Check(_77);
		float _78_1=Check(_78);
		float _79_1=Check(_79);
		
		float Sgpa=((4*_71_1)+(4*_72_1)+(3*_73_1)+(3*_74_1_)+(3*_75_1_)+(2*_76_1)+(1*_77_1)+(1*_78_1)+(1*_79_1))/20;
		float percentage=(float) ((Sgpa-0.75)*10);
		
		if(Sgpa==0)
		{
			 percentage=0;
		}
		
		String GRAND_SGPA=String.valueOf(Sgpa);
		String Grand_Percentage=String.valueOf(percentage);
		
		textSGPA.setText(GRAND_SGPA);
		textPercentage.setText(Grand_Percentage);
		
		if(_71>100 ||_72>100 || _73>100 || _74_>100 || _75_>100 || _76>100 || _77>100 || _78>100 || _79>100)
		{
			JOptionPane.showMessageDialog(null,"Marks should be <= 100");
			textSGPA.setText("0.0");
			textPercentage.setText("0.0");
		}
	}
}


