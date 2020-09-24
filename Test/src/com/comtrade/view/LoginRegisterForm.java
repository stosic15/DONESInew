package com.comtrade.view;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GraphicsConfiguration;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.comtrade.domen.ConstantesBL;
import com.comtrade.domen.ConstantesFC;
import com.comtrade.domen.TransferObject;
import com.comtrade.domen.User;
import com.comtrade.frontcontroller.FrontController;

import jdk.nashorn.internal.scripts.JO;

import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

import java.awt.CardLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

import javax.swing.JPasswordField;

public class LoginRegisterForm extends JFrame {

	private JPanel contentPane;
	private JPanel panel1;
	private JPanel panel2;
	public JPanel panelSecond;
	private JLayeredPane layeredPane;
	private JTextField tfAdress;
	public  JTextField tfEmail;
	public JTextField tfUserName;
	private FirstForm fristForm;
	private JTextField tfPass;
	private JTextField tfPassword;
	
	private User loginUser;

	
	
	public void switchPanel(JPanel panel) {
		layeredPane.removeAll();
		layeredPane.add(panel);
		layeredPane.repaint();
		layeredPane.revalidate();
	}
	public void setForm(FirstForm f) 
	{
		fristForm = f;
	}

	/**
	 * Create the frame.
	 */
	public void setUser(User u)
	{
		loginUser = u;
	}
	public LoginRegisterForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 622);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		layeredPane = new JLayeredPane();
		layeredPane.setBounds(12, 67, 420, 508);
		contentPane.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		 panel1 = new JPanel();
		layeredPane.add(panel1, "name_85502955487400");
		panel1.setLayout(null);
		
		tfAdress = new JTextField();
		tfAdress.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tfAdress.setText("");
			}
		});
		tfAdress.setText("  E-adresa ili korisni\u010Dko ime");
		tfAdress.setBounds(24, 190, 253, 30);
		panel1.add(tfAdress);
		tfAdress.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("Prijavi se ");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = tfAdress.getText();
				String password = tfPassword.getText();
				User u = new User(username,password,username);
		     	TransferObject tObject = TransferObject.create(u, ConstantesFC.USER, ConstantesBL.SELECT_DISTINCT);
				
				try {
					TransferObject tr1 = FrontController.getInstance().execute(tObject);
					
						User login = (User) tr1.getResponse();
						if( login != null)
						{
							
							fristForm.setUser(login);
						dispose();
						fristForm.setVisible(true);		
						fristForm.switchPanel(fristForm.panelSecond);
						}
					;
					//Logoovan si i odes na drugu formu
					
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
				

			}
			
		    
		});
		btnNewButton_2.setBounds(83, 306, 175, 35);
		panel1.add(btnNewButton_2);
		
		tfPassword = new JTextField();
		tfPassword.setBounds(24, 233, 253, 22);
		panel1.add(tfPassword);
		tfPassword.setColumns(10);
		
		panel2 = new JPanel();
		layeredPane.add(panel2, "name_85506011147400");
		panel2.setLayout(null);
		
		tfEmail = new JTextField();
		tfEmail.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tfEmail.setText(null);
			}
		});
		tfEmail.setText("  Va\u0161a e -adresa");
		tfEmail.setColumns(10);
		tfEmail.setBounds(26, 100, 253, 30);
		panel2.add(tfEmail);
		
		tfUserName = new JTextField();
		tfUserName.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tfUserName.setText(null);
			}
		});
		tfUserName.setText("Korisni\u010Dko ime koje \u017Eelite da imate");
		tfUserName.setColumns(10);
		tfUserName.setBounds(26, 322, 253, 30);
		panel2.add(tfUserName);
		
		JButton brnRegistration = new JButton("Registruj se");
		brnRegistration.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String email = tfEmail.getText();
				String password = tfPass.getText();
				String userName = tfUserName.getText();
				TransferObject object = TransferObject.create(new User(email,password,userName), ConstantesFC.USER , ConstantesBL.POST);
				try {
					TransferObject tO= FrontController.getInstance().execute(object);	
				} catch (ClassNotFoundException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				dispose();
				fristForm.setVisible(true);		
				fristForm.switchPanel(fristForm.panelSecond);
				
			}
		});
		brnRegistration.setBounds(63, 413, 191, 25);
		panel2.add(brnRegistration);
		
		tfPass = new JTextField();
		tfPass.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tfPass.setText(null);
			}
		});
		tfPass.setText("Va\u0161a lozinka");
		tfPass.setBounds(26, 221, 253, 22);
		panel2.add(tfPass);
		tfPass.setColumns(10);
		
		JButton btnLogovanje = new JButton("Uloguj se");
		btnLogovanje.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				switchPanel(panel1);
			}
		});
		btnLogovanje.setBounds(12, 29, 186, 25);
		contentPane.add(btnLogovanje);
		
		JButton btnPrijava = new JButton("Prijavi se");
		btnPrijava.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanel(panel2);
				
			}
		});
		btnPrijava.setBounds(205, 29, 201, 25);
		contentPane.add(btnPrijava);
	}
}
