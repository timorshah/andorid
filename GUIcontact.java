package PhoneContact;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class GUIcontact extends JFrame {

	private JPanel contentPane;
	public static mobilePhone mob;
	public static ShowContact show;
	private JTextField nametex;
	private JTextField numtex;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIcontact frame = new GUIcontact();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUIcontact() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 194, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton add = new JButton("ADD");
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				mob.add(nametex.getText(), Integer.parseInt(numtex.getText()));
			
				
				
			}
		});
		add.setBounds(0, 11, 89, 23);
		contentPane.add(add);
		
		JButton remove = new JButton("Remove");
		remove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		remove.setBounds(0, 45, 89, 23);
		contentPane.add(remove);
		
		JButton edit = new JButton("Edit");
		edit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		edit.setBounds(99, 11, 69, 23);
		contentPane.add(edit);
		
		JButton print = new JButton("print");
		print.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		print.setBounds(99, 45, 69, 23);
		contentPane.add(print);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnExit.setBounds(56, 76, 69, 23);
		contentPane.add(btnExit);
		
		nametex = new JTextField();
		nametex.setBounds(0, 122, 86, 40);
		contentPane.add(nametex);
		nametex.setColumns(10);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(0, 110, 46, 14);
		contentPane.add(lblName);
		
		JLabel lblNumber = new JLabel("Number");
		lblNumber.setBounds(109, 110, 59, 14);
		contentPane.add(lblNumber);
		
		numtex = new JTextField();
		numtex.setBounds(84, 122, 101, 40);
		contentPane.add(numtex);
		numtex.setColumns(10);
	}
}
