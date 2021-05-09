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

public class Sgpa_5 {
	
	/**
	 * @author Puneeth K S 
	 */

	private static final int _74_ = 0;
	private static final int _75_ = 0;
	public JFrame frmSgpa_5;
	private JTextField text51;
	private JTextField text52;
	private JTextField text53;
	private JTextField text54;
	private JTextField text55;
	private JTextField text56;
	private JTextField text57;
	private JTextField text58;
	private JTextField text59;
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
					Sgpa_5 window = new Sgpa_5();
					window.frmSgpa_5.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Sgpa_5() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSgpa_5 = new JFrame();
		frmSgpa_5.setResizable(false);
		frmSgpa_5.getContentPane().setBackground(Color.BLACK);
		frmSgpa_5.setTitle("Welcome >> Scheme >> 5th sem Sgpa");
		frmSgpa_5.setBounds(100, 100, 834, 770);
		frmSgpa_5.setLocationRelativeTo(null);
		frmSgpa_5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSgpa_5.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 255), new Color(0, 0, 255), new Color(255, 255, 0), new Color(255, 255, 0)));
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(553, 143, 243, 435);
		frmSgpa_5.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblEnterTheMarks = new JLabel("Enter the marks obtained out of 100");
		lblEnterTheMarks.setForeground(Color.WHITE);
		lblEnterTheMarks.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblEnterTheMarks.setBounds(17, 22, 365, 29);
		frmSgpa_5.getContentPane().add(lblEnterTheMarks);
		
		JLabel lbl31 = new JLabel("18**51");
		lbl31.setForeground(Color.WHITE);
		lbl31.setFont(new Font("Arial Black", Font.BOLD, 22));
		lbl31.setBounds(44, 126, 154, 29);
		frmSgpa_5.getContentPane().add(lbl31);
		
		JLabel lbl32 = new JLabel("18**52");
		lbl32.setForeground(Color.WHITE);
		lbl32.setFont(new Font("Arial Black", Font.BOLD, 22));
		lbl32.setBounds(44, 181, 154, 29);
		frmSgpa_5.getContentPane().add(lbl32);
		
		JLabel lbl33 = new JLabel("18**53");
		lbl33.setForeground(Color.WHITE);
		lbl33.setFont(new Font("Arial Black", Font.BOLD, 22));
		lbl33.setBounds(44, 236, 154, 29);
		frmSgpa_5.getContentPane().add(lbl33);
		
		JLabel lbl34 = new JLabel("18**54");
		lbl34.setForeground(Color.WHITE);
		lbl34.setFont(new Font("Arial Black", Font.BOLD, 22));
		lbl34.setBounds(44, 291, 154, 29);
		frmSgpa_5.getContentPane().add(lbl34);
		
		JLabel lbl35 = new JLabel("18**55");
		lbl35.setForeground(Color.WHITE);
		lbl35.setFont(new Font("Arial Black", Font.PLAIN, 22));
		lbl35.setBounds(44, 346, 154, 29);
		frmSgpa_5.getContentPane().add(lbl35);
		
		JLabel lbl36 = new JLabel("18**56");
		lbl36.setForeground(Color.WHITE);
		lbl36.setFont(new Font("Arial Black", Font.PLAIN, 22));
		lbl36.setBounds(44, 401, 156, 29);
		frmSgpa_5.getContentPane().add(lbl36);
		
		JLabel lbl37 = new JLabel("18**57");
		lbl37.setForeground(Color.WHITE);
		lbl37.setFont(new Font("Arial Black", Font.PLAIN, 22));
		lbl37.setBounds(44, 456, 154, 29);
		frmSgpa_5.getContentPane().add(lbl37);
		
		JLabel lbl38 = new JLabel("18**58");
		lbl38.setForeground(Color.WHITE);
		lbl38.setFont(new Font("Arial Black", Font.PLAIN, 22));
		lbl38.setBounds(44, 511, 154, 29);
		frmSgpa_5.getContentPane().add(lbl38);
		
		JLabel lb39 = new JLabel("ENV");
		lb39.setForeground(Color.WHITE);
		lb39.setFont(new Font("Arial Black", Font.PLAIN, 22));
		lb39.setBounds(44, 566, 154, 29);
		frmSgpa_5.getContentPane().add(lb39);
		
		JLabel lblSgpa = new JLabel("SGPA");
		lblSgpa.setBounds(78, 44, 93, 29);
		panel.add(lblSgpa);
		lblSgpa.setForeground(new Color(51, 0, 255));
		lblSgpa.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		
		
		JLabel lblPercentage = new JLabel("Percentage");
		lblPercentage.setBounds(42, 227, 166, 55);
		panel.add(lblPercentage);
		lblPercentage.setForeground(new Color(199, 21, 133));
		lblPercentage.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		
		
		text51 = new JTextField();
		text51.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				text51.setText("");
			}
		});
		text51.setText("0");
		text51.setFont(new Font("SansSerif", Font.BOLD, 26));
		text51.setBounds(382, 117, 122, 43);
		frmSgpa_5.getContentPane().add(text51);
		text51.setColumns(10);
		
		
		text52 = new JTextField();
		text52.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				text52.setText("");
			}
		});
		text52.setText("0");
		text52.setFont(new Font("SansSerif", Font.BOLD, 26));
		text52.setColumns(10);
		text52.setBounds(382, 172, 122, 43);
		frmSgpa_5.getContentPane().add(text52);
		
		
		text53 = new JTextField();
		text53.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				text53.setText("");
			}
		});
		text53.setText("0");
		text53.setFont(new Font("SansSerif", Font.BOLD, 26));
		text53.setColumns(10);
		text53.setBounds(382, 227, 122, 43);
		frmSgpa_5.getContentPane().add(text53);
		
		
		text54 = new JTextField();
		text54.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				text54.setText("");
			}
		});
		text54.setText("0");
		text54.setFont(new Font("SansSerif", Font.BOLD, 26));
		text54.setColumns(10);
		text54.setBounds(382, 282, 122, 43);
		frmSgpa_5.getContentPane().add(text54);
		
		
		text55 = new JTextField();
		text55.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				text55.setText("");
			}
		});
		text55.setText("0");
		text55.setFont(new Font("SansSerif", Font.BOLD, 26));
		text55.setColumns(10);
		text55.setBounds(382, 337, 122, 43);
		frmSgpa_5.getContentPane().add(text55);
		
		
		text56 = new JTextField();
		text56.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				text56.setText("");
			}
		});
		text56.setText("0");
		text56.setFont(new Font("SansSerif", Font.BOLD, 26));
		text56.setColumns(10);
		text56.setBounds(382, 392, 122, 43);
		frmSgpa_5.getContentPane().add(text56);
		
		
		text57 = new JTextField();
		text57.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				text57.setText("");
			}
		});
		text57.setText("0");
		text57.setFont(new Font("SansSerif", Font.BOLD, 26));
		text57.setColumns(10);
		text57.setBounds(382, 447, 122, 43);
		frmSgpa_5.getContentPane().add(text57);
		
		
		text58 = new JTextField();
		text58.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				text58.setText("");
			}
		});
		text58.setText("0");
		text58.setFont(new Font("SansSerif", Font.BOLD, 26));
		text58.setColumns(10);
		text58.setBounds(382, 502, 122, 43);
		frmSgpa_5.getContentPane().add(text58);
		
		
		text59 = new JTextField();
		text59.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				text59.setText("");
			}
		});
		text59.setText("0");
		text59.setFont(new Font("SansSerif", Font.BOLD, 26));
		text59.setColumns(10);
		text59.setBounds(382, 557, 122, 43);
		frmSgpa_5.getContentPane().add(text59);
		
		
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
		btnCalculate.setBounds(166, 660, 196, 55);
		frmSgpa_5.getContentPane().add(btnCalculate);
		
		JLabel label = new JLabel("-------");
		label.setForeground(Color.YELLOW);
		label.setFont(new Font("Arial Black", Font.PLAIN, 22));
		label.setBounds(267, 407, 54, 16);
		frmSgpa_5.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("-------");
		label_1.setForeground(Color.YELLOW);
		label_1.setFont(new Font("Arial Black", Font.PLAIN, 22));
		label_1.setBounds(267, 352, 54, 16);
		frmSgpa_5.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("-------");
		label_2.setForeground(Color.YELLOW);
		label_2.setFont(new Font("Arial Black", Font.PLAIN, 22));
		label_2.setBounds(267, 297, 54, 16);
		frmSgpa_5.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("-------");
		label_3.setForeground(Color.YELLOW);
		label_3.setFont(new Font("Arial Black", Font.PLAIN, 22));
		label_3.setBounds(267, 242, 54, 16);
		frmSgpa_5.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("-------");
		label_4.setForeground(Color.YELLOW);
		label_4.setFont(new Font("Arial Black", Font.PLAIN, 22));
		label_4.setBounds(267, 187, 54, 16);
		frmSgpa_5.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("-------");
		label_5.setForeground(Color.YELLOW);
		label_5.setFont(new Font("Arial Black", Font.PLAIN, 22));
		label_5.setBounds(267, 132, 54, 16);
		frmSgpa_5.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("-------");
		label_6.setForeground(Color.YELLOW);
		label_6.setFont(new Font("Arial Black", Font.PLAIN, 22));
		label_6.setBounds(267, 462, 54, 16);
		frmSgpa_5.getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("-------");
		label_7.setForeground(Color.YELLOW);
		label_7.setFont(new Font("Arial Black", Font.PLAIN, 22));
		label_7.setBounds(267, 517, 54, 16);
		frmSgpa_5.getContentPane().add(label_7);
		
		JLabel label_8 = new JLabel("-------");
		label_8.setForeground(Color.YELLOW);
		label_8.setFont(new Font("Arial Black", Font.PLAIN, 22));
		label_8.setBounds(267, 572, 54, 16);
		frmSgpa_5.getContentPane().add(label_8);
		
		JLabel label_9 = new JLabel("%");
		label_9.setFont(new Font("SansSerif", Font.BOLD, 30));
		label_9.setBounds(700, 658, 26, 55);
		frmSgpa_5.getContentPane().add(label_9);
		
		JLabel lblNoteEnter = new JLabel("note : Enter '0' for subjects that you don't have");
		lblNoteEnter.setForeground(new Color(205, 92, 92));
		lblNoteEnter.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblNoteEnter.setBounds(17, 63, 507, 29);
		frmSgpa_5.getContentPane().add(lblNoteEnter);
		
		JButton btnBack = new JButton("Back");
		btnBack.setForeground(new Color(255, 255, 255));
		btnBack.setBackground(new Color(0, 0, 153));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmSgpa_5.dispose();
				Scheme window = new Scheme();
				window.frmScheme.setVisible(true);
			}
		});
		btnBack.setFont(new Font("SansSerif", Font.BOLD, 20));
		btnBack.setBounds(710, 22, 86, 43);
		frmSgpa_5.getContentPane().add(btnBack);
		
		
		
		
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
		float _51=Float.parseFloat(text51.getText());
		float _52=Float.parseFloat(text52.getText());
		float _53=Float.parseFloat(text53.getText());
		float _54=Float.parseFloat(text54.getText());
		float _55=Float.parseFloat(text55.getText());
		float _56=Float.parseFloat(text56.getText());
		float _57=Float.parseFloat(text57.getText());
		float _58=Float.parseFloat(text58.getText());
		float _59=Float.parseFloat(text59.getText());
		
		
		float _51_1=Check(_51);
		float _52_1=Check(_52);
		float _53_1=Check(_53);
		float _54_1=Check(_54);
		float _55_1=Check(_55);
		float _56_1=Check(_56);
		float _57_1=Check(_57);
		float _58_1=Check(_58);
		float _59_1=Check(_59);
		
		float Sgpa=((3*_51_1)+(4*_52_1)+(4*_53_1)+(3*_54_1)+(3*_55_1)+(3*_56_1)+(2*_57_1)+(2*_58_1)+(1*_59_1))/25;
		float percentage=(float) ((Sgpa-0.75)*10);
		
		if(Sgpa==0)
		{
			 percentage=0;
		}
		
		String GRAND_SGPA=String.valueOf(Sgpa);
		String Grand_Percentage=String.valueOf(percentage);
		
		textSGPA.setText(GRAND_SGPA);
		textPercentage.setText(Grand_Percentage);
		
		if(_51>100 ||_52>100 || _53>100 || _74_>100 || _75_>100 || _56>100 || _57>100 || _58>100 || _59>100)
		{
			JOptionPane.showMessageDialog(null,"Marks should be <= 100");
			textSGPA.setText("0.0");
			textPercentage.setText("0.0");
		}
	}
}


