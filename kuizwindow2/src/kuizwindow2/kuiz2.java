package kuizwindow2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class kuiz2 {

	private JFrame frame;
	private JTextField textFieldnum1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					kuiz2 window = new kuiz2();
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
	public kuiz2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButtonAns = new JButton("Tell me");
		btnNewButtonAns.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int weight;
				double w;
				
				try {
					
					AbstractButton textField;
					weight=Integer.parseInt(textFieldnum1.getText());
					
					w=weight*50;
		JOptionPane.showMessageDialog(null, "Buddy, you should drink " + w + " ml water a day!!");
				}catch (Exception e1) {
					AbstractButton textField;
		JOptionPane.showMessageDialog(null, "Please Enter Valid Number");
					
				}
				
				
			}
		});
		btnNewButtonAns.setBounds(165, 158, 116, 42);
		frame.getContentPane().add(btnNewButtonAns);
		
		JLabel lblNewLabel = new JLabel("how much you should drink?");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel.setBounds(33, 11, 322, 57);
		frame.getContentPane().add(lblNewLabel);
		
		textFieldnum1 = new JTextField();
		textFieldnum1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		textFieldnum1.setBounds(238, 95, 116, 36);
		frame.getContentPane().add(textFieldnum1);
		textFieldnum1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("My weight(kg):");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(57, 87, 155, 44);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
