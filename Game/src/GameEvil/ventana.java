package GameEvil;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Panel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

public class ventana extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	
	
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventana frame = new ventana();
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
	public ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1250,750);
		//setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(176, 196, 222));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Tablero tablero = new Tablero();
		tablero.setBackground(null);
		contentPane.add(tablero);
		
		JLabel lblTurnosDe = new JLabel("Turno de ");
		lblTurnosDe.setBounds(22, 69, 69, 14);
		contentPane.add(lblTurnosDe);
		
		JLabel paisaje = new JLabel("New label");
		
		ImageIcon back =  new ImageIcon(Tablero.class.getResource("/images/fondo.jpg"));
		Image back1 = back.getImage();
		Image backtam=back1.getScaledInstance(726, 684, Image.SCALE_SMOOTH);
		back= new ImageIcon(backtam);		
		paisaje.setIcon(back);
		//paisaje.setIcon(new ImageIcon(ventana.class.getResource("/images/fondo.jpg")));
		paisaje.setBounds(260, 27, 726, 684);
		contentPane.add(paisaje);
		
		JLabel label = new JLabel("Jugador 1");
		label.setBounds(83, 111, 69, 14);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(83, 136, 104, 20);
		contentPane.add(textField);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Mago", "Guerrero", "Princesa"}));
		comboBox.setSelectedIndex(0);
		comboBox.setBounds(105, 167, 82, 20);
		contentPane.add(comboBox);
		
		JLabel label_1 = new JLabel("Turno 1");
		label_1.setBounds(49, 170, 46, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("Turno 2");
		label_2.setBounds(49, 204, 46, 14);
		contentPane.add(label_2);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Mago", "Guerrero", "Princesa"}));
		comboBox_1.setSelectedIndex(1);
		comboBox_1.setEditable(true);
		comboBox_1.setBounds(105, 201, 82, 20);
		contentPane.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Mago", "Guerrero", "Princesa"}));
		comboBox_2.setSelectedIndex(2);
		comboBox_2.setEditable(true);
		comboBox_2.setBounds(105, 235, 82, 20);
		contentPane.add(comboBox_2);
		
		JLabel label_3 = new JLabel("Turno 3");
		label_3.setBounds(49, 235, 46, 14);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("Tus Vidas:");
		label_4.setBounds(49, 266, 69, 14);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("Jugador 2");
		label_5.setBounds(1070, 111, 69, 14);
		contentPane.add(label_5);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(1070, 136, 104, 20);
		contentPane.add(textField_1);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Mago", "Guerrero", "Princesa"}));
		comboBox_3.setSelectedIndex(0);
		comboBox_3.setEditable(true);
		comboBox_3.setBounds(1092, 167, 82, 20);
		contentPane.add(comboBox_3);
		
		JLabel label_6 = new JLabel("Turno 1");
		label_6.setBounds(1036, 170, 46, 14);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("Turno 2");
		label_7.setBounds(1036, 204, 46, 14);
		contentPane.add(label_7);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"Mago", "Guerrero", "Princesa"}));
		comboBox_4.setSelectedIndex(1);
		comboBox_4.setEditable(true);
		comboBox_4.setBounds(1092, 201, 82, 20);
		contentPane.add(comboBox_4);
		
		JLabel label_8 = new JLabel("Turno 3");
		label_8.setBounds(1036, 235, 46, 14);
		contentPane.add(label_8);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"Mago", "Guerrero", "Princesa"}));
		comboBox_5.setSelectedIndex(2);
		comboBox_5.setEditable(true);
		comboBox_5.setBounds(1092, 235, 82, 20);
		contentPane.add(comboBox_5);
		
		JLabel label_9 = new JLabel("Tus Vidas:");
		label_9.setBounds(1036, 266, 69, 14);
		contentPane.add(label_9);
		
		JLabel label_10 = new JLabel("Ataque de Mago/Gerrero");
		label_10.setBounds(102, 446, 148, 14);
		contentPane.add(label_10);
		
		JButton button_1 = new JButton();
		ImageIcon flechaA =  new ImageIcon(Tablero.class.getResource("/images/flechaA.jpg"));
		Image flechaA1 = flechaA.getImage();
		Image flechaAtam=flechaA1.getScaledInstance(69, 69, Image.SCALE_SMOOTH);
		flechaA= new ImageIcon(flechaAtam);
		button_1.setIcon(flechaA);
		button_1.setBounds(101, 471, 69, 69);
		contentPane.add(button_1);
		
		JButton button_3 = new JButton();
		ImageIcon flecha =  new ImageIcon(Tablero.class.getResource("/images/flecha1.png"));
		Image flecha1 = flecha.getImage();
		Image flechatam=flecha1.getScaledInstance(69, 69, Image.SCALE_SMOOTH);
		flecha= new ImageIcon(flechatam);
		button_3.setIcon(flecha);
		button_3.setBounds(101, 631, 69, 69);
		contentPane.add(button_3);
		
		JButton button = new JButton();
		button.setBounds(180, 551, 69, 69);
		ImageIcon flechaD =  new ImageIcon(Tablero.class.getResource("/images/flechaD.jpg"));
		Image flechaD1 = flechaD.getImage();
		Image flechaDtam=flechaD1.getScaledInstance(69, 69, Image.SCALE_SMOOTH);
		flechaD= new ImageIcon(flechaDtam);
		button.setIcon(flechaD);
		contentPane.add(button);
		
		JButton button_2 = new JButton();
		ImageIcon flechaI =  new ImageIcon(Tablero.class.getResource("/images/flechaI.jpg"));
		Image flechaI1 = flechaI.getImage();
		Image flechaItam=flechaI1.getScaledInstance(69, 69, Image.SCALE_SMOOTH);
		flechaI= new ImageIcon(flechaItam);
		button_2.setIcon(flechaI);
		button_2.setBounds(22, 551, 69, 69);
		contentPane.add(button_2);
		
		JButton button_5 = new JButton();
		button_5.setBounds(997, 551, 69, 69);
		button_5.setIcon(flechaI);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("");
		button_6.setIcon(flecha);
		button_6.setBounds(1076, 631, 69, 69);
		contentPane.add(button_6);
		
		JButton button_9 = new JButton();
		button_9.setIcon(flechaA);
		button_9.setBounds(1076, 471, 69, 69);
		contentPane.add(button_9);
		
		JLabel panelDirection = new JLabel("New label");
		ImageIcon direction =  new ImageIcon(Tablero.class.getResource("/images/compas.png"));
		Image direction1 = direction.getImage();
		Image directinotam=direction1.getScaledInstance(69, 69, Image.SCALE_SMOOTH);
		direction= new ImageIcon(directinotam);		
		panelDirection.setIcon(direction);
		panelDirection.setBounds(101, 551, 69, 69);
		contentPane.add(panelDirection);
		
		JLabel label_11 = new JLabel("New label");
		label_11.setIcon(direction);
		label_11.setBounds(1076, 551, 69, 69);
		contentPane.add(label_11);
		
		JLabel label_14 = new JLabel("");
		label_14.setBounds(124, 418, 46, 14);
		contentPane.add(label_14);
		
		JButton button_4 = new JButton();
		button_4.setIcon(flechaD);
		button_4.setBounds(1155, 551, 69, 69);
		contentPane.add(button_4);
		
		JButton button_7 = new JButton();
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int numRam = (int)(Math.random()*6)+1;
				label_14.setText("que pasa!");
			}
		});
		button_7.setBounds(22, 361, 51, 51);
		button_7.setContentAreaFilled(false);
		//button_7.setBorder(null);
		ImageIcon boton =  new ImageIcon(Tablero.class.getResource("/images/boton.png"));
		Image boton1 = boton.getImage();
		Image botontam=boton1.getScaledInstance(51, 51, Image.SCALE_SMOOTH);
		boton= new ImageIcon(botontam);	
		button_7.setIcon(boton);
		contentPane.add(button_7);
		
		JLabel label_12 = new JLabel("Ataque de Mago/Gerrero");
		label_12.setBounds(1076, 446, 148, 14);
		contentPane.add(label_12);
		button_7.setContentAreaFilled(false);
		JButton button_10 = new JButton();
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
			int numRandom = (int)(Math.random()*6)+1;
			
		});
		button_10.setIcon(boton);	
		button_10.setContentAreaFilled(false);
		button_10.setBounds(1008, 361, 51, 51);
		contentPane.add(button_10);
		
		JLabel lblNewLabel = new JLabel("Lanzar");
		lblNewLabel.setBounds(27, 346, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel label_13 = new JLabel("Lanzar");
		label_13.setBounds(1012, 346, 46, 14);
		contentPane.add(label_13);
		
		JLabel lblNewLabel_1 = new JLabel("No. Movimientos :");
		lblNewLabel_1.setBounds(10, 418, 108, 14);
		contentPane.add(lblNewLabel_1);
		
		
		JLabel label_16 = new JLabel("No. Movimientos :");
		label_16.setBounds(996, 418, 109, 14);
		contentPane.add(label_16);
		
		JLabel label_15 = new JLabel("");
		label_15.setBounds(1109, 418, 46, 14);
		contentPane.add(label_15);
	}
}
