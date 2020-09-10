package com.comtrade.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyAccountForm extends JFrame {

	private JPanel contentPane;
	private JTextField tfName;
	private JTextField tfLastName;
	private JTextField tfUserName;
	private JTextField tfEmail;
	private JTextField tfMobileNo;

	

	/**
	 * Create the frame.
	 */
	public MyAccountForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 891, 769);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("Ime");
		lblName.setBounds(419, 117, 109, 23);
		contentPane.add(lblName);
		
		JLabel lblLastName = new JLabel("Prezime");
		lblLastName.setBounds(671, 117, 109, 23);
		contentPane.add(lblLastName);
		
		tfName = new JTextField();
		tfName.setBounds(418, 149, 190, 30);
		contentPane.add(tfName);
		tfName.setColumns(10);
		
		tfLastName = new JTextField();
		tfLastName.setColumns(10);
		tfLastName.setBounds(671, 149, 190, 30);
		contentPane.add(tfLastName);
		
		JLabel lblUserName = new JLabel("Korisni\u010Dko ime");
		lblUserName.setBounds(419, 212, 109, 23);
		contentPane.add(lblUserName);
		
		tfUserName = new JTextField();
		tfUserName.setColumns(10);
		tfUserName.setBounds(419, 253, 190, 30);
		contentPane.add(tfUserName);
		
		JLabel lblEmail = new JLabel("elektronska po\u0161ta");
		lblEmail.setBounds(419, 312, 109, 23);
		contentPane.add(lblEmail);
		
		tfEmail = new JTextField();
		tfEmail.setColumns(10);
		tfEmail.setBounds(419, 358, 190, 30);
		contentPane.add(tfEmail);
		
		JLabel lblMobileNumber = new JLabel("Mobile number");
		lblMobileNumber.setBounds(419, 424, 109, 23);
		contentPane.add(lblMobileNumber);
		
		tfMobileNo = new JTextField();
		tfMobileNo.setColumns(10);
		tfMobileNo.setBounds(419, 470, 190, 30);
		contentPane.add(tfMobileNo);
		
		JButton btnNewButton = new JButton("Sa\u010Duvaj izmene");
		btnNewButton.setBounds(419, 563, 189, 36);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("     donesi");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				dispose();
				FirstForm form = new FirstForm();
				form.setVisible(true);
			}
		});
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(12, 0, 249, 60);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("Profil");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(12, 61, 97, 25);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Li\u010Dni podaci");
		btnNewButton_1_1.setBounds(121, 61, 101, 25);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("Onlajn pla\u0107anja");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OnlinePayments oP = new OnlinePayments();
				oP.setVisible(true);
				
			}
		});
		btnNewButton_1_2.setBounds(234, 61, 127, 25);
		contentPane.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("Narudzbine");
		btnNewButton_1_3.setBounds(373, 61, 97, 25);
		contentPane.add(btnNewButton_1_3);
		
		JButton btnNewButton_1_4 = new JButton("Adrese");
		btnNewButton_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdressForm adress = new AdressForm();
				adress.setVisible(true);
			}
		});
		btnNewButton_1_4.setBounds(482, 61, 97, 25);
		contentPane.add(btnNewButton_1_4);
		
		JButton btnNewButton_1_5 = new JButton("Omiljeni restorani ");
		btnNewButton_1_5.setBounds(591, 61, 139, 25);
		contentPane.add(btnNewButton_1_5);
		
		JButton btnNewButton_1_6 = new JButton("Utisci");
		btnNewButton_1_6.setBounds(742, 61, 97, 25);
		contentPane.add(btnNewButton_1_6);
	}
}
