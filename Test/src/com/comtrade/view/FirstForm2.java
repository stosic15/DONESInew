package com.comtrade.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

import com.comtrade.domen.ConstantesBL;
import com.comtrade.domen.ConstantesFC;
import com.comtrade.domen.HomeAdress;
import com.comtrade.domen.TransferObject;
import com.comtrade.frontcontroller.FrontController;
import javax.swing.JComboBox;
import javax.swing.JLayeredPane;

public class FirstForm2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtAdress;
	private JComboBox comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstForm frame = new FirstForm();
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
	public FirstForm2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 767, 429);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtAdress = new JTextField();
		txtAdress.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 txtAdress.setText("");
			}
		});
		txtAdress.setText("Insert your adress");
		txtAdress.setBounds(12, 265, 368, 50);
		contentPane.add(txtAdress);
		txtAdress.setColumns(10);
		
		JButton btnOrder= new JButton("Order");
		btnOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				String adress = txtAdress.getText();
				HomeAdress homeAdress = new HomeAdress(adress);
				TransferObject tr = TransferObject.create(txtAdress, ConstantesFC.HOME_ADRESS, ConstantesBL.POST);
				try {
					FrontController.getInstance().execute(tr);
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnOrder.setBounds(379, 265, 89, 50);
		contentPane.add(btnOrder);
		
		JTextPane txtpnOrderDeliveryIn = new JTextPane();
		txtpnOrderDeliveryIn.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtpnOrderDeliveryIn.setForeground(Color.BLACK);
		txtpnOrderDeliveryIn.setText("Order delivery \r\n\r\nin less than 1 minute!");
		txtpnOrderDeliveryIn.setBounds(33, 162, 315, 77);
		contentPane.add(txtpnOrderDeliveryIn);
		
		comboBox = new JComboBox();
		comboBox.setBounds(593, 32, 89, 44);
		contentPane.add(comboBox);
	}
}
