import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class movieticket {

	private JFrame frame;
	private JTextField tb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					movieticket window = new movieticket();
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
	public movieticket() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(34, 157, 145));
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("MOVIE TICKET BOOKING");
		label.setBackground(new Color(0, 0, 0));
		label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(86, 21, 175, 36);
		frame.getContentPane().add(label);
		
		JLabel lblNewLabel_1 = new JLabel("NAME :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(55, 82, 60, 26);
		frame.getContentPane().add(lblNewLabel_1);
		
		tb1 = new JTextField();
		tb1.setBounds(151, 82, 127, 26);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JLabel lblMovie = new JLabel(" MOVIE :");
		lblMovie.setHorizontalAlignment(SwingConstants.CENTER);
		lblMovie.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblMovie.setBounds(41, 136, 74, 26);
		frame.getContentPane().add(lblMovie);
		
		JComboBox cb1 = new JComboBox();
		cb1.setToolTipText("SELECT MOVIE\r\n");
		cb1.setModel(new DefaultComboBoxModel(new String[] {"RRR", "SALAAR", "KGF -1", "SAAHOO", "MS DHONI", "#90'S"}));
		cb1.setBounds(151, 138, 127, 25);
		frame.getContentPane().add(cb1);
		
		JLabel lblNewLabel_2 = new JLabel("NO.OF TICKETS :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_2.setBounds(24, 190, 102, 26);
		frame.getContentPane().add(lblNewLabel_2);
		
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		cb2.setBounds(151, 190, 127, 26);
		frame.getContentPane().add(cb2);
		
		JButton btnNewButton = new JButton("BOOK ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user =  (String) tb1.getText();
				String movie = (String)cb1.getSelectedItem();
				String tickets  =  (String) cb2.getSelectedItem();
				int not = Integer.parseInt(tickets);
				 int bill = 0;
				 if(movie.equals("RRR")) {
					 bill = not *150;
				 }
				 
				 if(movie.equals("SALAAR")) {
					 bill = not *300;
				 }
				 
				 if(movie.equals("KGF-1")) {
					 bill = not *200;
				 }
				 
				 if(movie.equals("SAAHOO")) {
					 bill = not *280;
				 }
				 
				 if(movie.equals("MS DHONI")) {
					 bill = not *170;
				 }
				 
				 if(movie.equals("#90'S")) {
					 bill = not *170
							 ;
				 }
				 
				int res = 0;
				res = JOptionPane.showConfirmDialog(btnNewButton, "\nName: "+ user + "\n\nMovie: " + movie + "\n\nNo.of.Tickets: " + tickets + "\n\nBill: " + bill);
				if(res  == JOptionPane.YES_OPTION) {
					JOptionPane.showMessageDialog(btnNewButton,"BOOKING CONFIRMED");
					tb1.setText("");
					cb1.setSelectedItem("");
				}
				
				else {
					JOptionPane.showMessageDialog(btnNewButton,"BOOKING CANCELLED");
				}
			
			}
		});
		btnNewButton.setBackground(new Color(0, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.setBounds(86, 246, 89, 36);
		frame.getContentPane().add(btnNewButton);
		frame.setBounds(100, 100, 382, 349);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
