package com.comtrade.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JCheckBox;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import java.awt.CardLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JSeparator;
import javax.swing.JProgressBar;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.ScrollPane;
import java.awt.Choice;
import javax.swing.JTextPane;
import java.awt.event.AdjustmentListener;
import java.awt.event.AdjustmentEvent;
import javax.swing.JTextField;
import java.awt.TextArea;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;

public class FoodForm extends JFrame {

	private JPanel contentPane;
	private JScrollPane scrollPane;
	
	private DefaultTableModel dtm = new DefaultTableModel();
    
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FoodForm frame = new FoodForm();
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
	public FoodForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1148, 771);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("     donesi");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(23, 13, 121, 62);
		contentPane.add(lblNewLabel_1);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(930, 75, 128, 1);
		contentPane.add(panel);
		
		JButton btnNewButton_1 = new JButton("Moj nalog");
		btnNewButton_1.setBounds(0, 27, 127, 34);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Moje narudzbine");
		btnNewButton_2.setBounds(0, 66, 127, 34);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_1_1 = new JButton("Online pla\u0107anja");
		btnNewButton_1_1.setBounds(0, 103, 127, 34);
		panel.add(btnNewButton_1_1);
		
		JButton btnNewButton_3 = new JButton("Moje adrese");
		btnNewButton_3.setBounds(0, 143, 127, 34);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_1_2 = new JButton("Omiljeni objekti");
		btnNewButton_1_2.setBounds(0, 220, 127, 34);
		panel.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_2_1 = new JButton("Moji utisci");
		btnNewButton_1_2_1.setBounds(0, 182, 127, 34);
		panel.add(btnNewButton_1_2_1);
		
		JButton btnNewButton_1_2_2 = new JButton("Izloguj se");
		btnNewButton_1_2_2.setBounds(0, 285, 127, 34);
		panel.add(btnNewButton_1_2_2);
		
		JButton btnNewButton = new JButton();
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setSize(160,330);
			}
		});
		btnNewButton.setBounds(930, 28, 97, 47);
		contentPane.add(btnNewButton);
		
		 scrollPane = new JScrollPane();
		scrollPane.setBounds(398, 405, 139, 200);
		contentPane.add(scrollPane);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.addAdjustmentListener(new AdjustmentListener() {
			public void adjustmentValueChanged(AdjustmentEvent e) {
				scrollPane.size();
			}
		});
		scrollBar.setBounds(835, 198, 21, 200);
		contentPane.add(scrollBar);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(51, 162, 174, 454);
		contentPane.add(textPane);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBounds(437, 28, 6, 22);
		contentPane.add(textPane_1);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent event) {
				scrollPane_1.add(scrollBar);
			}
			public void ancestorMoved(AncestorEvent event) {
			}
			public void ancestorRemoved(AncestorEvent event) {
			}
		});
		scrollPane_1.setBounds(681, 28, 139, 159);
		contentPane.add(scrollPane_1);
		
		JPanel panel_1 = new JPanel();
		scrollPane_1.setViewportView(panel_1);
		panel_1.setLayout(null);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		chckbxNewCheckBox.setBounds(0, 0, 113, 25);
		panel_1.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("New check box");
		chckbxNewCheckBox_1.setBounds(0, 30, 113, 25);
		panel_1.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("New check box");
		chckbxNewCheckBox_2.setBounds(0, 56, 113, 25);
		panel_1.add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_1_1 = new JCheckBox("New check box");
		chckbxNewCheckBox_1_1.setBounds(0, 86, 113, 25);
		panel_1.add(chckbxNewCheckBox_1_1);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("New check box");
		chckbxNewCheckBox_3.setBounds(0, 116, 113, 25);
		panel_1.add(chckbxNewCheckBox_3);
		
		JCheckBox chckbxNewCheckBox_1_2 = new JCheckBox("New check box");
		chckbxNewCheckBox_1_2.setBounds(0, 142, 113, 25);
		panel_1.add(chckbxNewCheckBox_1_2);
		
		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("New check box");
		chckbxNewCheckBox_4.setBounds(0, 172, 113, 25);
		panel_1.add(chckbxNewCheckBox_4);
		
		JCheckBox chckbxNewCheckBox_1_3 = new JCheckBox("New check box");
		chckbxNewCheckBox_1_3.setBounds(0, 198, 113, 25);
		panel_1.add(chckbxNewCheckBox_1_3);
		
		JCheckBox chckbxNewCheckBox_2_1 = new JCheckBox("New check box");
		chckbxNewCheckBox_2_1.setBounds(0, 228, 113, 25);
		panel_1.add(chckbxNewCheckBox_2_1);
		
		JCheckBox chckbxNewCheckBox_1_1_1 = new JCheckBox("New check box");
		chckbxNewCheckBox_1_1_1.setBounds(0, 254, 113, 25);
		panel_1.add(chckbxNewCheckBox_1_1_1);
		
		JCheckBox chckbxNewCheckBox_3_1 = new JCheckBox("New check box");
		chckbxNewCheckBox_3_1.setBounds(0, 284, 113, 25);
		panel_1.add(chckbxNewCheckBox_3_1);
		
		JCheckBox chckbxNewCheckBox_1_2_1 = new JCheckBox("New check box");
		chckbxNewCheckBox_1_2_1.setBounds(0, 310, 113, 25);
		panel_1.add(chckbxNewCheckBox_1_2_1);
		
		JCheckBox chckbxNewCheckBox_5 = new JCheckBox("New check box");
		chckbxNewCheckBox_5.setBounds(0, 0, 113, 25);
		panel_1.add(chckbxNewCheckBox_5);
		
		JCheckBox chckbxNewCheckBox_6 = new JCheckBox("New check box");
		chckbxNewCheckBox_6.setBounds(0, 0, 113, 25);
		panel_1.add(chckbxNewCheckBox_6);
		
		ScrollPane scrollPane_2 = new ScrollPane();
		scrollPane_2.setBounds(268, 96, 180, 220);
		contentPane.add(scrollPane_2);
		
		Choice choice = new Choice();
		choice.setBounds(610, 376, 200, 273);
		contentPane.add(choice);
		
		JScrollBar scrollBar_1 = new JScrollBar();
		scrollBar_1.setBounds(886, 45, 21, 190);
		contentPane.add(scrollBar_1);
		Object[]collumn= {"Restoran","Vreme dostave","Minimalna narudzbina"};
		dtm.addColumn(collumn[0]);
		dtm.addColumn(collumn[1]);
		dtm.addColumn(collumn[2]);
		
		
		
		
		
		
		
	}
}
