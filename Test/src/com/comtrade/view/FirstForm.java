package com.comtrade.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.comtrade.domen.ConstantesBL;
import com.comtrade.domen.ConstantesFC;
import com.comtrade.domen.HomeAdress;
import com.comtrade.domen.TransferObject;
import com.comtrade.domen.User;
import com.comtrade.frontcontroller.FrontController;
import com.sun.javafx.embed.swing.Disposer;

import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

import java.awt.CardLayout;
import javax.swing.JTextPane;
import javax.swing.Timer;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FirstForm extends JFrame {

	private static JPanel contentPane;
	private JPanel panelFirst;
	public JPanel panelSecond;
	private JLayeredPane layeredPane;
	private JTextField textField;
	private JTextField textField_1;
	private LoginRegisterForm form2;
	private JLabel lblNewLabel_1;
	private MyAccountForm myAcc;
	private JPanel panel_7;
	private User loginUser;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstForm frame = new FirstForm();
					LoginRegisterForm form2 = new LoginRegisterForm();
					MyAccountForm myAcc = new MyAccountForm();
					frame.setForm(form2);
					form2.setForm(frame);
					frame.setAccountForm(myAcc);
					myAcc.setFirstForm(frame);
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});
		
	}
	public void switchPanel(JPanel panel) {
		layeredPane.removeAll();
		layeredPane.add(panel);
		layeredPane.repaint();
		layeredPane.revalidate();
	
	}
	
	public void setForm(LoginRegisterForm f){
		form2 = f;
	}
	public void setAccountForm(MyAccountForm f){
		myAcc = f;
	}
	
	
	public FirstForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 770, 559);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 752, 377);
		contentPane.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		panelFirst = new JPanel();
		layeredPane.add(panelFirst, "name_827587355551800");
		panelFirst.setLayout(null);
		
		JTextPane txtpnOrderDeliveryIn = new JTextPane();
		txtpnOrderDeliveryIn.setEnabled(false);
		txtpnOrderDeliveryIn.setEditable(false);
		txtpnOrderDeliveryIn.setText("Order delivery \r\n\r\nin less than 1 minute!");
		txtpnOrderDeliveryIn.setForeground(Color.BLACK);
		txtpnOrderDeliveryIn.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtpnOrderDeliveryIn.setBounds(22, 164, 315, 77);
		panelFirst.add(txtpnOrderDeliveryIn);
		
		textField = new JTextField();
		textField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText("");
			}
		});
		textField.setText("Insert your adress");
		textField.setColumns(10);
		textField.setBounds(22, 261, 368, 50);
		panelFirst.add(textField);
		
		JButton btnOrder = new JButton("Naru\u010Dite");
		btnOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String adress = textField.getText();
				TransferObject tObject = TransferObject.create(new HomeAdress(adress), ConstantesFC.HOME_ADRESS, ConstantesBL.POST);
				try {
					TransferObject tr1 = FrontController.getInstance().execute(tObject);
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				dispose();
				FoodForm foodFoorm = new FoodForm();
			}
			
		});
		btnOrder.setBounds(383, 261, 89, 50);
		panelFirst.add(btnOrder);
		
		JButton btnLoginRegister = new JButton("Prijavite se/Registruj");
		btnLoginRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				form2.setVisible(true);
			}
		});
		btnLoginRegister.setBounds(545, 34, 171, 25);
		panelFirst.add(btnLoginRegister);
		
		JLabel lblNewLabel = new JLabel("     donesi");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				dispose();
				FirstForm form = new FirstForm();
				form.setVisible(true);
				
			}
		});
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBounds(12, 13, 249, 77);
		panelFirst.add(lblNewLabel);
		
		panelSecond = new JPanel();
		layeredPane.add(panelSecond, "name_827590184905600");
		panelSecond.setLayout(null);
		
		JTextPane txtpnOrderDeliveryIn_1 = new JTextPane();
		txtpnOrderDeliveryIn_1.setEnabled(false);
		txtpnOrderDeliveryIn_1.setEditable(false);
		txtpnOrderDeliveryIn_1.setText("Order delivery \r\n\r\nin less than 1 minute!");
		txtpnOrderDeliveryIn_1.setForeground(Color.BLACK);
		txtpnOrderDeliveryIn_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtpnOrderDeliveryIn_1.setBounds(29, 165, 315, 77);
		panelSecond.add(txtpnOrderDeliveryIn_1);
		
		textField_1 = new JTextField();
		textField_1.setText("Insert your adress");
		textField_1.setColumns(10);
		textField_1.setBounds(29, 254, 368, 50);
		panelSecond.add(textField_1);
		
		JButton btnOrder_1 = new JButton("Order");
		btnOrder_1.setBounds(395, 254, 89, 50);
		panelSecond.add(btnOrder_1);
		
		lblNewLabel_1 = new JLabel("     donesi");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				dispose();
				FirstForm form = new FirstForm();
				form.setVisible(true);
				
			}
		});
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(12, 13, 249, 77);
		panelSecond.add(lblNewLabel_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(624, 45, 116, 32);
		panelSecond.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Moj nalog");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				myAcc.setVisible(true);		
				
				
			}
		});
		btnNewButton_1.setBounds(0, 38, 116, 34);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(0, 76, 116, 34);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_1_1 = new JButton("New button");
		btnNewButton_1_1.setBounds(0, 114, 116, 34);
		panel.add(btnNewButton_1_1);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBounds(0, 150, 116, 34);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_1_2 = new JButton("New button");
		btnNewButton_1_2.setBounds(0, 186, 116, 34);
		panel.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_2_1 = new JButton("New button");
		btnNewButton_1_2_1.setBounds(0, 244, 116, 34);
		panel.add(btnNewButton_1_2_1);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel.setSize(160,300);
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(624, 0, 97, 47);
		panelSecond.add(btnNewButton);
		
		
	}
	
}
