import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class studentdetails {

	private JFrame frame;
	private JTextField tb1;
	private JTextField tb2;
	private JTextField tb3;
	private JTextField tb4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					studentdetails window = new studentdetails();
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
	public studentdetails() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(180, 175, 16));
		frame.setBounds(100, 100, 362, 360);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("STUDENT DETAILS ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(62, 20, 190, 38);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME : ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(52, 69, 72, 20);
		frame.getContentPane().add(lblNewLabel_1);
		
	
		
		
		tb1 = new JTextField();
		tb1.setBounds(134, 70, 139, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("ID : ");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(62, 120, 46, 28);
		frame.getContentPane().add(lblNewLabel_2);
		
		tb2 = new JTextField();
		tb2.setBounds(134, 125, 139, 20);
		frame.getContentPane().add(tb2);
		tb2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("ADDRESS : ");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(38, 178, 64, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		tb3 = new JTextField();
		tb3.setBounds(134, 178, 139, 20);
		frame.getContentPane().add(tb3);
		tb3.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("MARKS :");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(48, 219, 60, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		tb4 = new JTextField();
		tb4.setBounds(134, 217, 139, 20);
		frame.getContentPane().add(tb4);
		tb4.setColumns(10);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String name = tb1.getText();
				String id = tb2.getText();
				String address = tb3.getText();
				String marks = tb4.getText();
				
				int m = Integer.parseInt(marks);
				try {
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/CSEC","root","mrec");
					String q ="insert into students values('"+name+"','"+id+"','"+address+"','"+m+"')";
				    Statement sta=con.createStatement();
					sta.executeUpdate(q);
					con.close();
					JOptionPane.showMessageDialog(btnNewButton,"successful");
				}
				
				catch(SQLException e1)
				{
					e1.printStackTrace();
				}
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(83, 270, 89, 40);
		frame.getContentPane().add(btnNewButton);
		
			}
		
	
	

