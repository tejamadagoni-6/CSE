import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class registration {

	private JFrame frame;
	private JTextField tb1;
	private JPasswordField p1;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registration window = new registration();
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
	public registration() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(64, 128, 128));
		frame.setBounds(100, 100, 340, 334);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("REGISTRATION");
		lblNewLabel_1.setForeground(new Color(0, 0, 64));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(98, 24, 141, 31);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("USERNAME :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(23, 66, 75, 31);
		frame.getContentPane().add(lblNewLabel_2);
		
		tb1 = new JTextField();
		tb1.setBounds(132, 72, 121, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("BRANCH :");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(23, 145, 75, 21);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("PASSWORD :");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(23, 108, 75, 26);
		frame.getContentPane().add(lblNewLabel_4);
		
		p1 = new JPasswordField();
		p1.setBounds(132, 112, 121, 20);
		frame.getContentPane().add(p1);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"CSE", "IT", "EEE", "ECE", "CSC", "CSD", "CSM", "CIVIL", "MECH"}));
		cb1.setBounds(132, 145, 121, 22);
		frame.getContentPane().add(cb1);
		
		JLabel lblNewLabel_5 = new JLabel("GENDER :");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_5.setBounds(23, 181, 58, 20);
		frame.getContentPane().add(lblNewLabel_5);
		
		JRadioButton r1 = new JRadioButton("MALE");
		r1.setBounds(132, 178, 58, 23);
		frame.getContentPane().add(r1);
		
		JRadioButton r2 = new JRadioButton("FEMALE");
		r2.setBounds(201, 181, 81, 23);
		frame.getContentPane().add(r2);
		
		ButtonGroup rgb = new ButtonGroup();
		rgb.add(r1);
		rgb.add(r2);
		
		JLabel lblNewLabel_6 = new JLabel("CITY :");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_6.setBounds(23, 221, 46, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"HYDERABAD", "WARANGAL", "NIZAMBAD", "NIRMAL", "WANAPARTHY", "ADILABAD"}));
		cb2.setBounds(132, 218, 121, 22);
		frame.getContentPane().add(cb2);
		
		JButton b1 = new JButton("REGISTER");
		b1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		b1.setForeground(new Color(0, 0, 0));
		b1.setBackground(new Color(0, 128, 128));
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user = tb1.getText();
				//String password = p1.getText();
				String branch = (String) cb1.getSelectedItem();
				String city = (String) cb2.getSelectedItem();
				
				String gender = " ";
				if(r1.isSelected()) {
					gender = "male";
				}
				
				if(r2.isSelected()) {
					gender = "female";
				}
				JOptionPane.showMessageDialog(b1, "\nName : "+ user +"\n\n Branch : " + branch  +"\n\n Gender : " + gender +"\n\n City : " + city  );
				
			}
		});
		b1.setBounds(91, 251, 99, 33);
		frame.getContentPane().add(b1);
	}
}
