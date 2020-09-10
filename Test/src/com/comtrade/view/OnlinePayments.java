package com.comtrade.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.Normalizer.Form;
import java.awt.event.ActionEvent;

public class OnlinePayments extends JFrame {

	private JPanel contentPane;
	private FirstForm form;
	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OnlinePayments frame = new OnlinePayments();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	
	/**
	 * Create the frame.
	 * 
	 * 
	 */
	public void setForm2(FirstForm f) {
		form = f;
		
	}
	
	
	
	public OnlinePayments() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1008, 532);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("            Da li \u017Eelite da platite onlajn?");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(0, 0, 821, 41);
		contentPane.add(lblNewLabel);
		
		JTextPane txtpnPlaanjeOnlineMoe = new JTextPane();
		txtpnPlaanjeOnlineMoe.setText(" Pla\u0107anje online mo\u017Ee u\u010Diniti va\u0161e naru\u010Divanje lak\u0161im, pa \u010Dak i br\u017Eim. Ono \u0161to \u017Eelimo da znate je da su podaci sa va\u0161e kartice sa\u010Duvani i donesi ne mo\u017Ee obra\u0111ivati te podatke ili ih obrisati, zato \u0161to nemamo pristup tim podacima.");
		txtpnPlaanjeOnlineMoe.setEnabled(false);
		txtpnPlaanjeOnlineMoe.setEditable(false);
		txtpnPlaanjeOnlineMoe.setBounds(53, 43, 925, 41);
		contentPane.add(txtpnPlaanjeOnlineMoe);
		
		JLabel lblNewLabel_1 = new JLabel("                 Nema sa\u010Duvanih kartica");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1.setBounds(260, 243, 429, 41);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nemate gotovine? Dodajte svoju karticu i u\u010Dinite va\u0161e naru\u010Divanje jo\u0161 br\u017Eim i lak\u0161im");
		lblNewLabel_2.setBounds(210, 289, 503, 33);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Po\u010Detna strana");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();

				form.switchPanel(form.panelSecond);
				form.setVisible(true);
				
				
			}
		});
		btnNewButton.setBounds(359, 379, 180, 33);
		contentPane.add(btnNewButton);
	}
}
