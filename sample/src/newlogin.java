import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class newlogin {

	private JFrame frame;
	private JTextField tb1;
	private JPasswordField P1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					newlogin window = new newlogin();
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
	public newlogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(192, 192, 192));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LOGIN PAGE WITH DB CONNECTION");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel.setBounds(84, 24, 196, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("USERNAME");
		lblNewLabel_1.setBounds(48, 66, 78, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		tb1 = new JTextField();
		tb1.setBounds(155, 63, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("PASSWORD");
		lblNewLabel_2.setBounds(48, 117, 63, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		P1 = new JPasswordField();
		P1.setBounds(155, 114, 86, 20);
		frame.getContentPane().add(P1);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user =tb1.getText();
				String password =p1.getText();
				try {
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306:mydb","root","mrec");
							PreparedStatement stn =con.prepareStatement("select name, password from users where name=? and password=?");
							stn.setString(1, name);	
							stn.setString(2, password);	
							ResultSet rs=stn.executeQuery();
							if(rs.next())
							{
								JOptionPane .showMessageDialog(btnNewButton, "VALID USER");
							}
							else
							{
								JOptionPane .showMessageDialog(btnNewButton, "INVALID USER");
							}
				}
				catch(SQLException e1)
				{
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(102, 181, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
