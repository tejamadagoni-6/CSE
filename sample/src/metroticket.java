import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class metroticket {

	private JFrame frame;
	private JTextField tb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					metroticket window = new metroticket();
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
	public metroticket() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(58, 190, 197));
		frame.setBounds(100, 100, 385, 370);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("METRO TICKET BOOKING");
		lblNewLabel.setBackground(new Color(240, 240, 240));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(46, 28, 240, 27);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME: ");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setToolTipText("");
		lblNewLabel_1.setBounds(57, 83, 63, 27);
		frame.getContentPane().add(lblNewLabel_1);
		
		tb1 = new JTextField();
		tb1.setBounds(146, 85, 140, 24);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("SOURCE:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(46, 132, 63, 29);
		frame.getContentPane().add(lblNewLabel_2);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "KPHB", "JNTU", "MIYAPUR", "MGBS", "UPPAL", "SECUNDRABAD", "GANDHI BHAVAN", "SULTHAN BAZAR"}));
		cb1.setBounds(146, 136, 140, 22);
		frame.getContentPane().add(cb1);
		
		JLabel lblNewLabel_3 = new JLabel("DESTINATION:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(22, 185, 89, 24);
		frame.getContentPane().add(lblNewLabel_3);
		
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "KPHB", "JNTU", "MIYAPUR", "MGBS", "UPPAL", "SECUNDRABAD", "GANDHI BHAVAN", "SULTHAN BAZAR"}));
		cb2.setBounds(146, 187, 140, 22);
		frame.getContentPane().add(cb2);
		
		JLabel lblNewLabel_4 = new JLabel("NOOF TICKETS:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(22, 236, 97, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JComboBox cb3 = new JComboBox();
		cb3.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		cb3.setBounds(146, 233, 140, 22);
		frame.getContentPane().add(cb3);
		
		JButton btnNewButton = new JButton("BOOK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String user = (String)  tb1.getText();
				String source =  (String) cb1.getSelectedItem();
				String destination =  (String) cb2.getSelectedItem();
				String tickets  =  (String) cb3.getSelectedItem();
				int not = Integer.parseInt(tickets);
				int bill = 0;
				
				if(source == destination) {
					JOptionPane.showMessageDialog(btnNewButton, "SOURCE AND DESTINATION SHOULD NOT BE EQUAL");
					
				}
				
				else{
					bill = not * 45;
					int res = 0;
					int dist = 0;
					/*if(source == "KPHB" && destination == "MIYAPUR")
					/{
						dist = 3;
						bill = bill + (3 * (not * 45));
					}*/
					
					
					res = JOptionPane.showConfirmDialog(btnNewButton, "\nName: "+ user + "\n\nSOURCE: " + source+ "\n\nDESTINATION: " + destination+ "\n\nNO. OF TICKETS: " + tickets + "\n\nBILL: " + bill);
					if(res  == JOptionPane.YES_OPTION) {
						JOptionPane.showMessageDialog(btnNewButton,"BOOKING CONFIRMED");
						tb1.setText("");
						cb1.setSelectedItem("");
					}
					
					else {
						JOptionPane.showMessageDialog(btnNewButton,"BOOKING CANCELLED");
					}
				}
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.setBounds(79, 280, 89, 40);
		frame.getContentPane().add(btnNewButton);
	}

}
