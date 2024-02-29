import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class banklogin {

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
					banklogin window = new banklogin();
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
	public banklogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 13));
		frame.getContentPane().setBackground(new Color(64, 128, 128));
		frame.setBounds(100, 100, 381, 311);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LOGIN HERE");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setForeground(new Color(0, 255, 64));
		lblNewLabel.setBounds(98, 21, 151, 38);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("USERNAME  :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(54, 97, 89, 26);
		frame.getContentPane().add(lblNewLabel_1);
		
		tb1 = new JTextField();
		tb1.setBounds(163, 94, 126, 26);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("PASSWORD :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(54, 157, 84, 26);
		frame.getContentPane().add(lblNewLabel_2);
		WELCOME h1 = new WELCOME();
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String user = tb1.getText();
				String password = p1.getText();
				if(user.equals("abc") && password.equals("1234")) {
					h1.setVisible(true);
					frame.setVisible(false);
				}
				else {
					JOptionPane.showMessageDialog(btnNewButton, "InValid User");
				}
			}
		});
		btnNewButton.setBackground(new Color(240, 240, 240));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(98, 220, 99, 41);
		frame.getContentPane().add(btnNewButton);
		
		p1 = new JPasswordField();
		p1.setBounds(163, 155, 126, 26);
		frame.getContentPane().add(p1);
	}
}
