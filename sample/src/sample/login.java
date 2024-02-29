package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class login {

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
					login window = new login();
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
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(23, 160, 168));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		tb1 = 
				new JTextField();
		tb1.setBounds(212, 93, 109, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("LOGIN HERE");
		lblNewLabel.setForeground(new Color(128, 255, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(142, 21, 136, 30);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("USERNAME :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(80, 95, 92, 17);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("PASSWORD :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(80, 151, 92, 17);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user = tb1.getText();
				String password = p1.getText();
				//JOptionPane.showMessageDialog(btnNewButton, "hello "+user );
				if(user.equals("neha") && password.equals("1234")) {
					JOptionPane.showMessageDialog(btnNewButton, "Valid user");
				}
				else {
					JOptionPane.showMessageDialog(btnNewButton, "Invalid user");
				}
			}
			
		});
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(232, 207, 89, 30);
		frame.getContentPane().add(btnNewButton);
		
		p1 = new JPasswordField();
		p1.setBounds(212, 151, 109, 20);
		frame.getContentPane().add(p1);
		frame.getContentPane().setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{tb1, lblNewLabel, lblNewLabel_1, lblNewLabel_2, btnNewButton, p1}));
	}
}
