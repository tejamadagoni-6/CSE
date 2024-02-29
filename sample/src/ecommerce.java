import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ecommerce {

	private JFrame frame;
	int items = 0;
	int bill = 0;
	String bn =" ";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ecommerce window = new ecommerce();
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
	public ecommerce() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 455, 397);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("E COMMERCE APP");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(85, 24, 191, 38);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_3 = new JLabel("RS: 290");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(45, 321, 82, 26);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("RS:800");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(237, 324, 63, 21);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel l1 = new JLabel("CART : 0");
		l1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		l1.setHorizontalAlignment(SwingConstants.CENTER);
		l1.setBounds(338, 31, 63, 29);
		frame.getContentPane().add(l1);
		
		JButton b1 = new JButton("");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
					items = items +1;
					l1.setText("CART : "+items);
					bill = bill + 290 ;
					if(bn.contains("THE POWER OF TRUTH"
							+ "")) {
						bn =    "THE POWER OF TRUTH\n\t";
						}
						else {
							bn = bn+   "THE POWER OF TRUTH\n\t";
						}
					
				
			}
		});
		b1.setIcon(new ImageIcon("C:\\Users\\online lab\\Desktop\\images\\img4"));
		b1.setBounds(19, 84, 149, 214);
		frame.getContentPane().add(b1);
		
		JButton b2 = new JButton("");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				items = items +1;
				l1.setText("CART : "+items);
				bill = bill + 800 ;
				if(bn.contains("THE CREATIVE PROCESS")) {
				bn =    "THE CREATIVE PROCESS\n\t";
				}
				else {
					bn = bn+   "THE CREATIVE PROCESS\n\t";
				}
			}
		});
		b2.setIcon(new ImageIcon("C:\\Users\\online lab\\Desktop\\images\\img1.jfif"));
		b2.setBounds(178, 84, 157, 214);
		frame.getContentPane().add(b2);
		
		JButton b3 = new JButton("BUY");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				JOptionPane.showMessageDialog(b3,  "\n\n Items : "+ items+"\n\nTotal Bill : " + bill + "\n\nBOOKS : " + bn);
			}
		});
		b3.setFont(new Font("Tahoma", Font.BOLD, 12));
		b3.setBounds(353, 309, 76, 38);
		frame.getContentPane().add(b3);
	}
}
