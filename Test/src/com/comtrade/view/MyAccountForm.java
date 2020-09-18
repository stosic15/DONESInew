package com.comtrade.view;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

import com.comtrade.domen.ConstantesBL;
import com.comtrade.domen.ConstantesFC;
import com.comtrade.domen.TransferObject;
import com.comtrade.domen.User;
import com.comtrade.frontcontroller.FrontController;

public class MyAccountForm extends JFrame {

	private JPanel contentPane;
	private JTextField tfName;
	private JTextField tfUserName;
	private JTextField tfEmail;
	private JTextField tfMobileNo;
	private JTextField tfLastName;
	private JPanel panel_7;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JPanel panel_4;
	private JPanel panel_5;
	private JPanel panel_6;
	private JLayeredPane layeredPane;
	private FirstForm firstFrom;
	public JPanel panelSecond;
	public FirstForm firstForm ;
	private User loginUser;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyAccountForm frame = new MyAccountForm();
					FirstForm firstForm = new FirstForm();
					frame.setFirstForm(firstForm);
					firstForm.setAccountForm(frame);
					
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	

	
	public void setFirstForm(FirstForm f)
	{
		firstFrom = f;
	}
	public void switchPanel2(JPanel panel) {
		layeredPane.removeAll();
		layeredPane.add(panel);
		layeredPane.repaint();
		layeredPane.revalidate();
	}

	/**
	 * Create the frame.
	 */
	public MyAccountForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 889, 972);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Profil");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanel2(panel_7);
			}
		});
		btnNewButton_1.setBounds(22, 84, 73, 25);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Li\u010Dni podaci");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanel2(panel_1);
			}
		});
		btnNewButton_1_1.setBounds(122, 84, 121, 25);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("Onlajn pla\u0107anja");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanel2(panel_2);
			}
		});
		btnNewButton_1_2.setBounds(261, 84, 121, 25);
		contentPane.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("Narudzbine");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanel2(panel_3);
			}
		});
		btnNewButton_1_3.setBounds(394, 84, 97, 25);
		contentPane.add(btnNewButton_1_3);
		
		JButton btnNewButton_1_4 = new JButton("Adrese");
		btnNewButton_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanel2(panel_4);
			}
		});
		btnNewButton_1_4.setBounds(503, 84, 73, 25);
		contentPane.add(btnNewButton_1_4);
		
		JButton btnNewButton_1_5 = new JButton("Omiljeni restorani ");
		btnNewButton_1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanel2(panel_5);
			}
		});
		btnNewButton_1_5.setBounds(601, 84, 139, 25);
		contentPane.add(btnNewButton_1_5);
		
		JButton btnNewButton_1_6 = new JButton("Utisci");
		btnNewButton_1_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanel2(panel_6);
			}
		});
		btnNewButton_1_6.setBounds(771, 84, 63, 25);
		contentPane.add(btnNewButton_1_6);
		
		JLabel lblNewLabel = new JLabel("     donesi");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(22, 0, 249, 60);
		contentPane.add(lblNewLabel);
		
		layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 117, 872, 808);
		contentPane.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		panel_7 = new JPanel();
		layeredPane.add(panel_7, "name_82622487169000");
		panel_7.setLayout(null);
		
		JLabel lblName = new JLabel("Ime");
		lblName.setBounds(374, 44, 109, 23);
		panel_7.add(lblName);
		
		tfName = new JTextField();
		tfName.setColumns(10);
		tfName.setBounds(373, 76, 190, 30);
		panel_7.add(tfName);
		
		JLabel lblUserName = new JLabel("Korisni\u010Dko ime");
		lblUserName.setBounds(374, 139, 109, 23);
		panel_7.add(lblUserName);
		
		tfUserName = new JTextField();
		tfUserName.setColumns(10);
		tfUserName.setBounds(374, 180, 190, 30);
		panel_7.add(tfUserName);
		
		JLabel lblEmail = new JLabel("elektronska po\u0161ta");
		lblEmail.setBounds(374, 239, 109, 23);
		panel_7.add(lblEmail);
		
		tfEmail = new JTextField();
		tfEmail.setColumns(10);
		tfEmail.setBounds(374, 285, 190, 30);
		panel_7.add(tfEmail);
		
		JLabel lblMobileNumber = new JLabel("Mobile number");
		lblMobileNumber.setBounds(374, 351, 109, 23);
		panel_7.add(lblMobileNumber);
		
		tfMobileNo = new JTextField();
		tfMobileNo.setColumns(10);
		tfMobileNo.setBounds(374, 397, 190, 30);
		panel_7.add(tfMobileNo);
		
		JButton btnNewButton = new JButton("Sa\u010Duvaj izmene");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name  = tfName.getText();
				String lastName = tfLastName.getText();
				String userName = tfUserName.getText();
				String email = tfEmail.getText();
				String mobileNo = tfMobileNo.getText();
				TransferObject object = TransferObject.create(new User(email,userName,name,lastName,mobileNo), ConstantesFC.USER , ConstantesBL.PUT);
				try {
					TransferObject tO= FrontController.getInstance().execute(object);	
				} catch (ClassNotFoundException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(374, 490, 189, 36);
		panel_7.add(btnNewButton);
		
		JLabel lblLastName = new JLabel("Prezime");
		lblLastName.setBounds(626, 44, 109, 23);
		panel_7.add(lblLastName);
		
		tfLastName = new JTextField();
		tfLastName.setColumns(10);
		tfLastName.setBounds(626, 76, 190, 30);
		panel_7.add(tfLastName);
		
		panel_1 = new JPanel();
		layeredPane.add(panel_1, "name_82626506603700");
		panel_1.setLayout(null);
		
		panel_2 = new JPanel();
		layeredPane.add(panel_2, "name_82629927783700");
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("            Da li \u017Eelite da platite onlajn?");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(-56, 13, 821, 41);
		panel_2.add(lblNewLabel_1);
		
		JTextPane txtpnPlaanjeOnlineMoe = new JTextPane();
		txtpnPlaanjeOnlineMoe.setText(" Pla\u0107anje online mo\u017Ee u\u010Diniti va\u0161e naru\u010Divanje lak\u0161im, pa \u010Dak i br\u017Eim. Ono \u0161to \u017Eelimo da znate je da su podaci sa va\u0161e kartice sa\u010Duvani i donesi ne mo\u017Ee obra\u0111ivati te podatke ili ih obrisati, zato \u0161to nemamo pristup tim podacima.");
		txtpnPlaanjeOnlineMoe.setEnabled(false);
		txtpnPlaanjeOnlineMoe.setEditable(false);
		txtpnPlaanjeOnlineMoe.setBounds(-3, 56, 925, 41);
		panel_2.add(txtpnPlaanjeOnlineMoe);
		
		JLabel lblNewLabel_1_1 = new JLabel("                 Nema sa\u010Duvanih kartica");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1_1.setBounds(204, 256, 429, 41);
		panel_2.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nemate gotovine? Dodajte svoju karticu i u\u010Dinite va\u0161e naru\u010Divanje jo\u0161 br\u017Eim i lak\u0161im");
		lblNewLabel_2.setBounds(154, 302, 503, 33);
		panel_2.add(lblNewLabel_2);
		
		JButton btnNewButton_2 = new JButton("Po\u010Detna strana");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				firstFrom.setVisible(true);
				firstFrom.switchPanel(firstFrom.panelSecond);

			}
		});
		btnNewButton_2.setBounds(303, 392, 180, 33);
		panel_2.add(btnNewButton_2);
		
		panel_3 = new JPanel();
		layeredPane.add(panel_3, "name_82644924714200");
		panel_3.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane((Component) null);
		scrollPane.setBounds(17, 249, 856, 190);
		panel_3.add(scrollPane);
		
		JLabel lblNewLabel_3 = new JLabel("\r\n\r\n\u0160ta \u017Eelite da jedete? Da li biste \u017Eeleli \u0161olju kafe? Mi imamo re\u0161enje! Jedino \u0161to nam treba od vas je va\u0161a adresa.");
		lblNewLabel_3.setToolTipText("");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(0, 29, 792, 109);
		panel_3.add(lblNewLabel_3);
		
		panel_4 = new JPanel();
		layeredPane.add(panel_4, "name_82649912346200");
		panel_4.setLayout(null);
		
		panel_5 = new JPanel();
		layeredPane.add(panel_5, "name_82653764953600");
		panel_5.setLayout(null);
		
		panel_6 = new JPanel();
		layeredPane.add(panel_6, "name_82657421999600");
		panel_6.setLayout(null);
	}
}
