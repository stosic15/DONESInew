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
import com.comtrade.frontcontroller.FrontController;

import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

import java.awt.CardLayout;
import javax.swing.JTextPane;
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
	private JComboBox comboBox;
	private JPanel panelFirst;
	public JPanel panelSecond;
	private JLayeredPane layeredPane;
	private JTextField textField;
	private JTextField textField_1;
	private LoginRegisterForm form2;
	private JLabel lblNewLabel_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstForm frame = new FirstForm();
					LoginRegisterForm form2 = new LoginRegisterForm();
					frame.setForm(form2);
					form2.setForm(frame);
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
	public void setTextOnTextFile1(String text)
	{
		textField_1.setText(text);
	}
	public void setForm(LoginRegisterForm f)
	{
		form2 = f;
	}

	/**
	 * Create the frame.
	 * @param panelSecond 
	 */
	public FirstForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 770, 437);
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
		textField.setBounds(-29, 280, 368, 50);
		panelFirst.add(textField);
		
		JButton btnOrder = new JButton("Naru\u010Dite");
		btnOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String adress = textField.getText();
				HomeAdress homeAdress = new HomeAdress();
				homeAdress.setAdress(adress);
				TransferObject tObject = TransferObject.create(homeAdress, ConstantesFC.HOME_ADRESS, ConstantesBL.POST);
				System.out.println();
				try {
					TransferObject tr1 = FrontController.getInstance().execute(tObject);
					System.out.println();
					String message1 = tr1.getMessage();
					JOptionPane.showMessageDialog(null, message1);
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnOrder.setBounds(383, 261, 89, 50);
		panelFirst.add(btnOrder);
		
		JButton btnLoginRegister = new JButton("Prijavite se/Registruj");
		btnLoginRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//LoginRegisterForm loginRegister = new LoginRegisterForm();
			//	loginRegister.setVisible(true);
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
		
		 comboBox = new JComboBox();
		 comboBox.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 	}
		 });
		comboBox.setBounds(552, 31, 150, 44);
		panelSecond.add(comboBox);
		
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
	}
}
