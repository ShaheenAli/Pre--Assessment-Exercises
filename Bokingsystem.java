package system;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;

public class Bokingsystem {

	private JFrame frame;
	private JTextField inputstandard;
	private JTextField inputOAP;
	private JTextField inputstudent;
	private JTextField inputchild;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bokingsystem window = new Bokingsystem();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Bokingsystem() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.textHighlight);
		frame.getContentPane().setForeground(Color.WHITE);
		frame.setBounds(100, 100, 698, 506);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblPurchaseTickets = new JLabel("Purchase Cinema Tickets");
		lblPurchaseTickets.setForeground(new Color(0, 0, 0));
		lblPurchaseTickets.setFont(new Font("Arial", Font.PLAIN, 35));
		lblPurchaseTickets.setBounds(140, 13, 402, 47);
		frame.getContentPane().add(lblPurchaseTickets);
		
		JLabel lblChooseADate = new JLabel("Select A Date");
		lblChooseADate.setForeground(SystemColor.desktop);
		lblChooseADate.setFont(new Font("Arial", Font.PLAIN, 25));
		lblChooseADate.setBounds(42, 92, 181, 22);
		frame.getContentPane().add(lblChooseADate);
		
		JComboBox<String> Selectdate = new JComboBox();
		Selectdate.setFont(new Font("Arial", Font.PLAIN, 18));
		Selectdate.addItem ("Friday 20th April 2018");
		Selectdate.addItem ("Saturday 21st April 2018");
		Selectdate.addItem ("Sunday 22nd April 2018");
		Selectdate.addItem ("Monday 23rd April 2018");
		Selectdate.addItem ("Tuesday 24th April 2018");
		Selectdate.addItem ("Wenesday 25th April 2018");
		Selectdate.addItem ("Thursday 26th April 2018");
		Selectdate.addItem ("Friday 27th April 2018");
		Selectdate.addItem ("Saturday 28th April 2018");
		Selectdate.addItem ("Sunday 29th April 2018");
		Selectdate.setForeground(Color.BLACK);
		Selectdate.setBackground(Color.WHITE);
		Selectdate.setBounds(12, 119, 211, 31);
		frame.getContentPane().add(Selectdate);
		
		JLabel Time = new JLabel("Select Time");
		Time.setForeground(SystemColor.desktop);
		Time.setFont(new Font("Arial", Font.PLAIN, 25));
		Time.setBounds(279, 88, 134, 31);
		frame.getContentPane().add(Time);
		
		JLabel Movie = new JLabel("Select Movie");
		Movie.setForeground(SystemColor.desktop);
		Movie.setFont(new Font("Arial", Font.PLAIN, 25));
		Movie.setBounds(495, 88, 149, 31);
		frame.getContentPane().add(Movie);
		
		JComboBox<String> Selecttime = new JComboBox();
		Selecttime.setFont(new Font("Arial", Font.PLAIN, 18));
		Selecttime.addItem ("10 am");
		Selecttime.addItem ("11 am");
		Selecttime.addItem ("1 pm");
		Selecttime.addItem ("2 pm");
		Selecttime.addItem ("4 pm");
		Selecttime.addItem ("5 pm");
		Selecttime.addItem ("6 pm");
		Selecttime.addItem ("7 pm");
		Selecttime.addItem ("8 pm");
		Selecttime.addItem ("9 pm");
		Selecttime.addItem ("10 pm");
		Selecttime.addItem ("11 pm");
		Selecttime.addItem ("12 am");
		Selecttime.setForeground(Color.BLACK);
		Selecttime.setBackground(Color.WHITE);
		Selecttime.setBounds(238, 119, 211, 31);
		frame.getContentPane().add(Selecttime);
		
		JComboBox<String> selectmovie = new JComboBox();
		selectmovie.setFont(new Font("Arial", Font.PLAIN, 18));
		selectmovie.addItem ("Rampage");
		selectmovie.addItem ("Ready Player One");
		selectmovie.addItem ("Peter Rabbit");
		selectmovie.addItem ("A Quiet Place");
		selectmovie.addItem ("Avengers: Infinity War");
		selectmovie.addItem ("Truth Or Dare");
		selectmovie.addItem ("Duck Duck Goose");
		selectmovie.addItem ("Pacific Rim Uprising");
		selectmovie.addItem ("Ghost Stories");
		selectmovie.setForeground(Color.BLACK);
		selectmovie.setBackground(Color.WHITE);
		selectmovie.setBounds(461, 119, 211, 31);
		frame.getContentPane().add(selectmovie);
		
		JLabel lblStandard = new JLabel("Standard");
		lblStandard.setForeground(SystemColor.desktop);
		lblStandard.setFont(new Font("Arial", Font.PLAIN, 25));
		lblStandard.setBounds(42, 178, 111, 22);
		frame.getContentPane().add(lblStandard);
		
		JLabel lblNewLabel = new JLabel("OAP");
		lblNewLabel.setForeground(SystemColor.desktop);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 25));
		lblNewLabel.setBounds(42, 226, 61, 22);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblStudent = new JLabel("Student");
		lblStudent.setForeground(SystemColor.desktop);
		lblStudent.setFont(new Font("Arial", Font.PLAIN, 25));
		lblStudent.setBounds(42, 274, 100, 22);
		frame.getContentPane().add(lblStudent);
		
		JLabel lblChild = new JLabel("Child (Under 15)");
		lblChild.setForeground(SystemColor.desktop);
		lblChild.setFont(new Font("Arial", Font.PLAIN, 25));
		lblChild.setBounds(42, 321, 184, 31);
		frame.getContentPane().add(lblChild);
		
		JLabel label_£8 = new JLabel("\u00A38");
		label_£8.setForeground(SystemColor.desktop);
		label_£8.setFont(new Font("Arial", Font.PLAIN, 25));
		label_£8.setBounds(357, 178, 56, 19);
		frame.getContentPane().add(label_£8);
		
		JLabel label_£6 = new JLabel("\u00A36");
		label_£6.setForeground(SystemColor.desktop);
		label_£6.setFont(new Font("Arial", Font.PLAIN, 25));
		label_£6.setBounds(357, 228, 56, 19);
		frame.getContentPane().add(label_£6);
		
		JLabel label_£6s = new JLabel("\u00A36");
		label_£6s.setForeground(SystemColor.desktop);
		label_£6s.setFont(new Font("Arial", Font.PLAIN, 25));
		label_£6s.setBounds(357, 277, 56, 19);
		frame.getContentPane().add(label_£6s);
		
		JLabel label_£4 = new JLabel("\u00A34");
		label_£4.setForeground(SystemColor.desktop);
		label_£4.setFont(new Font("Arial", Font.PLAIN, 25));
		label_£4.setBounds(357, 327, 56, 19);
		frame.getContentPane().add(label_£4);
		
		inputstandard = new JTextField();
		inputstandard.setFont(new Font("Arial", Font.PLAIN, 25));
		inputstandard.setBounds(461, 170, 211, 31);
		frame.getContentPane().add(inputstandard);
		inputstandard.setColumns(10);
		
		inputOAP = new JTextField();
		inputOAP.setFont(new Font("Arial", Font.PLAIN, 25));
		inputOAP.setColumns(10);
		inputOAP.setBounds(461, 217, 211, 31);
		frame.getContentPane().add(inputOAP);
		
		inputstudent = new JTextField();
		inputstudent.setFont(new Font("Arial", Font.PLAIN, 25));
		inputstudent.setColumns(10);
		inputstudent.setBounds(461, 265, 211, 31);
		frame.getContentPane().add(inputstudent);
		
		inputchild = new JTextField();
		inputchild.setFont(new Font("Arial", Font.PLAIN, 25));
		inputchild.setColumns(10);
		inputchild.setBounds(461, 315, 211, 31);
		frame.getContentPane().add(inputchild);
		
		JButton Calculate_button = new JButton("Calculate");
		Calculate_button.setFont(new Font("Arial", Font.PLAIN, 25));
		Calculate_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Calculate_button.setBounds(461, 365, 211, 37);
		frame.getContentPane().add(Calculate_button);
		
		JButton exit_button = new JButton("Exit");
		exit_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				this.dispose();
			}

			private void dispose() {
				// TODO Auto-generated method stub
				
			}
		});
		exit_button.setFont(new Font("Arial", Font.PLAIN, 25));
		exit_button.setBounds(12, 365, 211, 37);
		frame.getContentPane().add(exit_button);
		
		JButton Clear_button = new JButton("Clear");
		Clear_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				inputstandard.setText (null);
				inputOAP.setText (null);
				inputstudent.setText (null);
				inputchild.setText (null);

			}
		});
		Clear_button.setFont(new Font("Arial", Font.PLAIN, 25));
		Clear_button.setBounds(238, 365, 211, 37);
		frame.getContentPane().add(Clear_button);
		
		textField_4 = new JTextField();
		textField_4.setBounds(238, 415, 211, 37);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblTotal = new JLabel("Total \u00A3");
		lblTotal.setForeground(SystemColor.desktop);
		lblTotal.setFont(new Font("Arial", Font.PLAIN, 25));
		lblTotal.setBounds(154, 415, 82, 37);
		frame.getContentPane().add(lblTotal);
		
		JButton Book_button = new JButton("Book");
		Book_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Book_button.setFont(new Font("Arial", Font.PLAIN, 25));
		Book_button.setBounds(461, 415, 211, 37);
		frame.getContentPane().add(Book_button);
	}
}
