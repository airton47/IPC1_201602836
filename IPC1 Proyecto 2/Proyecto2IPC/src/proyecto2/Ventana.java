package proyecto2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;



public class Ventana extends JFrame {

	private JPanel contentPane;
	private JTextField cantidadA;
	private JTextField cantidadE;

	static int aux;
	static int b=1;
	static int c = 1;
	int z = 1;
	static boolean fase1 = false;
	static boolean fase2 = false;
	static boolean fase3 = false;
	static boolean fase4 = false;
	static int pasajeros = 1;
	private JTextField numeroE;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Ventana() {
		setTitle("SIMULADOR DE OPERACIONES");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(50, 50, 1250, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label1 = new JLabel("Cantidad de Aviones");
		label1.setBounds(30, 37, 131, 14);
		contentPane.add(label1);
		
		JLabel label2 = new JLabel("Cantidad de Estaciones");
		label2.setBounds(267, 39, 141, 14);
		contentPane.add(label2);
		
		
		
		
		cantidadA = new JTextField();
		cantidadA.setBounds(171, 37, 86, 20);
		contentPane.add(cantidadA);
		cantidadA.setColumns(10);
		
		cantidadE = new JTextField();
		cantidadE.setColumns(10);
		cantidadE.setBounds(418, 39, 76, 20);
		contentPane.add(cantidadE);
		
		numeroE = new JTextField();
		numeroE.setBounds(418, 82, 76, 20);
		contentPane.add(numeroE);
		numeroE.setColumns(10);

		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setAutoscrolls(false);
		scrollPane.setBounds(30, 128, 464, 472);
		contentPane.add(scrollPane);
		
		JLabel label3 = new JLabel("Cantidad de Escritorios");
		label3.setBounds(267, 85, 141, 14);
		contentPane.add(label3);
		
		
		JLabel lblGraficoDelSistema = new JLabel("Grafico del Sistema");
		lblGraficoDelSistema.setBounds(865, 11, 131, 14);
		contentPane.add(lblGraficoDelSistema);
		//Image im = new Image();
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"General", "Arrivo de Aviones", "Desabordaje", "Registro (Escritorios)", "Mantenimiento", "Equipaje"}));
		comboBox.setSelectedIndex(0);
		comboBox.setBounds(1093, 8, 131, 20);
		contentPane.add(comboBox);
		
		JLabel lblView = new JLabel("View");
		lblView.setBounds(1037, 11, 46, 14);
		contentPane.add(lblView);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(504, 31, 720, 569);
		contentPane.add(tabbedPane);
		
		JScrollPane scrGeneral = new JScrollPane();
		tabbedPane.addTab("General", null, scrGeneral, null);
		
		JLabel lbGeneral = new JLabel();
		scrGeneral.setViewportView(lbGeneral);
		
		JScrollPane scrAvion = new JScrollPane();
		tabbedPane.addTab("Arrivo de Aviones", null, scrAvion, null);
		
		JLabel lbAvion = new JLabel();
		scrAvion.setViewportView(lbAvion);
		
		
		JScrollPane scrDesabor = new JScrollPane();
		tabbedPane.addTab("Desabordaje", null, scrDesabor, null);
		
		JLabel lbDesabor = new JLabel();
		scrDesabor.setViewportView(lbDesabor);
		
		JScrollPane scrMaleta = new JScrollPane();
		tabbedPane.addTab("Maletas", null, scrMaleta, null);
		
		JLabel lbMaleta = new JLabel();
		scrMaleta.setViewportView(lbMaleta);
		
		JScrollPane scrEstacion = new JScrollPane();
		tabbedPane.addTab("Estaciones", null, scrEstacion, null);
		
		JLabel lbEstacion = new JLabel();
		scrEstacion.setViewportView(lbEstacion);		
		
		JScrollPane scrDesk = new JScrollPane();
		tabbedPane.addTab("Escritorios (registro)", null, scrDesk, null);
		
		JLabel lbDesk = new JLabel();
		scrDesk.setViewportView(lbDesk);
	
		JTextArea textArea = new JTextArea();
		textArea.setAutoscrolls(false);
		textArea.setEditable(false);
		textArea.setForeground(Color.WHITE);
		textArea.setCaretColor(Color.WHITE);
		textArea.setBackground(Color.BLACK);
		scrollPane.setViewportView(textArea);
		
		//CREACION DE LAS LISTAS Y COLAS NECESARIAS PARA LA SIMULACION
		ListaAvion la = new ListaAvion();
		ListaEstacion le = new ListaEstacion();
		ListaMaleta lm = new ListaMaleta();
		ColaPasajero cp = new ColaPasajero();
		ListaEscritorio les = new ListaEscritorio();
		
		
		
		
		JButton btnEmpezar = new JButton("Empezar");
		//AQUI SE ESTA AGREGANDO EL ACTION LISTENER DEL BOTON ENMPEZAR QUE ASIGNA DE FORMA ALEATORIA LOS ESTADOS DE LA CANTIDAD DE AVIONES
		btnEmpezar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				textArea.setText(null);
				textArea.getText().equals("");
				aux = 0;
				
				if(cantidadA.getText().equals("")||cantidadE.getText().equals("")||numeroE.getText().equals("")) {
					JOptionPane.showMessageDialog(null,"POR FAVOR INGRESA NUMERO DE ESTACIONES Y AVIONES");
				}
				else {
					lbGeneral.setIcon(null);
					lbAvion.setIcon(null);
					lbDesabor.setIcon(null);
					lbMaleta.setIcon(null);
					lbDesk.setIcon(null);
					lbEstacion.setIcon(null);
					
					la.primero = null;
					le.primero = null;
					lm.primero = null;
					cp.primero = null;
					les.primero = null;
					
					textArea.setText("	Se iniciara ahora con la simulacion de:"+"\n");
					textArea.append("	Numero de aviones: "+cantidadA.getText()+"\n");
					textArea.append("	Numero de Escritorios: "+numeroE.getText()+"\n");
					textArea.append("	Numero de estaciones: "+cantidadE.getText()+"\n");
					textArea.append("      PULSA EL BOTON -- Pasar Turno -- PARA EMPEZAR CON EL ARRIVO DE LOS AVIONES."+"\n"+"\n");
					
					int ne = Integer.parseInt(numeroE.getText());
					for(char u = 65,  p = 1;u<=(65+ne)&&p<=ne;u++,p++) {
						les.insertarFinal(p,u);
						les.buscar(p).setCola(new ColaReg());
					}
					
					int es = Integer.parseInt(cantidadE.getText());
					for(int k = 1;k<=es;k++) {
						le.insertarFinal(new NodoEstacion(k));
						
					}
					
					
				}
				
				
				//textArea.append("	"+new String(Integer.toString(la.contar())));
			}
		});//AQUI TERMINA EL ACTION LISTENER DEL BOTON EMPEZAR
		btnEmpezar.setBounds(30, 79, 89, 23);
		contentPane.add(btnEmpezar);
		
		
		
		JButton btnPasarTurno = new JButton("Pasar Turno");
		btnPasarTurno.setAutoscrolls(true);
		//AQUI SE ESTA AGREGANDO EL ACTION LISTENER PARA QUE LOS TURNOS ARRANQUEN UNO A UNO
		btnPasarTurno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				int av = Integer.parseInt(cantidadA.getText());
				
				
				aux++;
				textArea.append("************************TURNO "+aux+"************************"+"||"+
				"************************TURNO "+aux+"************************"+"\n"+"\n");
				
				//PRIMERA FASE DE ATERRIZAJE DE LOS AVIONES
				int a;
				a = Integer.parseInt(cantidadA.getText());
				while(la.contar()!=a) {
					textArea.append("	******** ATERRIZAJE AVIONES ********"+"\n"+"\n");
					
						textArea.append("	====== AVIONES EN PISTA ======");
						la.insertarFinal(b);
						textArea.append(la.recorrer()+"\n"+"\n");
						b++;
						if(la.contar()==a ) {
							fase1 = true;
							textArea.append("========AQUI TERMINA LA SIMULACION DE LOS AVIONES ATERRIZANDO"+"==========="+"\n");
							textArea.append("========AHORA SE PROCEDERA CON EL DESABORDAJE DE LOS PASAJEROS"+"==========="+"\n"+"\n");
						}
					break;
				}
				if(la.totalDes()!=0 && fase1==true) {
					int m = 1;
					int g = 1;
						while(la.buscar(z).getNumberD()!=0) {
							textArea.append("	======= DESABORDAJE DE PASAJEROS ======"+"\n"+"\n");
							la.buscar(z).setNumberD(la.buscar(z).getNumberD()-1);
							
							textArea.append(la.recorrer2());//esto esta aqui como prueba si caus algun problema remover
							textArea.append("++++++++ TURNO "+aux+"+++++++++++++++PASAJERO FUERA DE AVIONES ESPERANDO REGISTRO EN SU COLA+++++++"+ "\n");
							
							if(la.buscar(z).getTipo()=="GRANDE") {
								for(int n = 1;n<=la.buscar(z).getNumberP();n++) {
									cp.insertar(new NodoPasajero());
								}
								la.buscar(z).setNumberP(0);
							}
							if(la.buscar(z).getTipo()=="MEDIANO") {
								for(int n = 1;n<=la.buscar(z).getNumberP();n++) {
									cp.insertar(new NodoPasajero());
								}
								la.buscar(z).setNumberP(0);
							}
							if(la.buscar(z).getTipo()=="PEQUENIO") {
								for(int n = 1;n<=la.buscar(z).getNumberP();n++) {
									cp.insertar(new NodoPasajero());
								}
								la.buscar(z).setNumberP(0);
							}
							textArea.append(cp.recorrer());
							}
							if(la.totalDes()==0) {
								
							textArea.append("========== AQUI TERMINA LA SIMULACION DE DESABORDAJE =========="+"\n"+"\n");
							fase2 = true;
						}
							
					z++;
				}
				
				
				//SEGUND FASE DEL DESABORDO PARA LOS AVIONES DE LOS PASAJEROS ASIGNACION DE ID, MALESTAS Y DOCUMENTOS
				
				
				
				//TERCER FASE DEL REGISTRO EN DONDE SE SACAN A 5 PASAJEROS POR TURNO JUNTO CON LA CANTIDAD DE MALETAS ASIGNADAS A CADA UNO
				int i = cp.contarMaletas();
				if(fase2 ==true && i!=lm.contar()) {
					for(int j = 1;j<=i;j++) {
					lm.insertarFinal(new NodoMaleta(j));
					}
					textArea.append("	=======TURNO "+aux+"=====MALETAS DE PASAJEROS QUE HAN DESABORDADO =========" + "\n"+ "\n");
					textArea.append("	INCIO 1"+ "\n");
					textArea.append("	FINAL "+ i+ "\n");
					textArea.append(lm.recorrer());
					textArea.append("	========== AQUI TERMINA LA SIMULACION DE LAS MALETA DE LOS PASAJEROS ========="+"\n"+"\n");
					if(i==lm.contar()) {
						if(i==lm.contar()) {
							fase3=true;
							
						}
					}
				}
				
				
				
				
				//REGISTRO DE LOS PASAJEROS EN LAS TERMINALES Y SU SALIDA DEL SISTEMA JUNTO CON LAS MALETAS.
				if(fase3==true && cp.contar()!=0) {
					
					
					
					if(cp.contar()==0) {
						
						fase4 = true;
					}
				}
				//LLEGADA DE LOS AVINOES A LAS ESTACIONES DE SERVICIO PARA SABER SI ESTAS ESTAN DESOCUPADAS Y QUITAR AVIONES POR TURNOS.
				if(fase4==true && la.contar()!=0) {
					
					if(la.contar()==0) {
						textArea.append("======== AQUI TERMINA LA SIMULACION DEL PROGRAMA, GRACIAS POR USAR ESTE SOFTWARE =========");
					}
				}
				
				
				
				
				
				
				
				
				
				
				//ESTA SECCION DE CODIGO ESTA CREANTO EL DOCUMENTO Y AL IMAGEN DE LOS NODOS
				Graficador g = new Graficador();
				g.crearDot("lista", la.primero);
		        g.generarImagen("lista.dot","listaDoble.jpg");
				
				Graficador h = new Graficador();
				h.crearDot("cola", cp.primero);
				h.generarImagen("cola.dot","colaPasajeros.jpg");
				
				Graficador i1 = new Graficador();
				i1.crearDot("listaMaleta", lm.primero,lm.contar());
				i1.generarImagen("listaMaleta.dot","listaMalesta.jpg");
				
				Graficador lem = new Graficador();
				lem.crearDot("listaDesk", les.primero);
				lem.generarImagen("listaDesk.dot", "listaDesk.jpg");
				
				Graficador leg = new Graficador();
				leg.crearDot("listaEstacion", le.primero);
				leg.generarImagen("listaEstacion.dot", "listaEstacion.jpg");
				
				Graficador general = new Graficador();
				general.crearDot("general",cp.primero,la.primero,les.primero,le.primero,lm.primero,lm.contar());
				general.generarImagen("general.dot","general.jpg");
				
				ImageIcon image = new ImageIcon("C:\\Users\\aiyel\\eclipse-workspace\\Proyecto2IPC\\listaDoble.jpg");
				image.getImage().flush();
				lbAvion.setIcon(image);
				
				ImageIcon image2 = new ImageIcon("C:\\Users\\aiyel\\eclipse-workspace\\Proyecto2IPC\\colaPasajeros.jpg");
				image2.getImage().flush();
				lbDesabor.setIcon(image2);
				
				ImageIcon image3 = new ImageIcon("C:\\Users\\aiyel\\eclipse-workspace\\Proyecto2IPC\\listaMalesta.jpg");
				image2.getImage().flush();
				lbMaleta.setIcon(image3);
				
				ImageIcon image4 = new ImageIcon("C:\\Users\\aiyel\\eclipse-workspace\\Proyecto2IPC\\listaEstacion.jpg");
				image4.getImage().flush();
				lbEstacion.setIcon(image4);
				
				ImageIcon image5 = new ImageIcon("C:\\Users\\aiyel\\eclipse-workspace\\Proyecto2IPC\\listaDesk.jpg");
				image5.getImage().flush();
				lbDesk.setIcon(image5);
				
				ImageIcon image6 = new ImageIcon("C:\\Users\\aiyel\\eclipse-workspace\\Proyecto2IPC\\general.jpg");
				image6.getImage().flush();
				lbGeneral.setIcon(image6);
				
			}
		});
		btnPasarTurno.setBounds(144, 79, 107, 23);
		contentPane.add(btnPasarTurno);
		
		JButton btnGenActualizar = new JButton("Gen / Actualizar Grafico");
		btnGenActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				ImageIcon image = new ImageIcon("C:\\Users\\aiyel\\eclipse-workspace\\Proyecto2IPC\\listaDoble.jpg");
				image.getImage().flush();
				lbAvion.setIcon(image);
				
				ImageIcon image2 = new ImageIcon("C:\\Users\\aiyel\\eclipse-workspace\\Proyecto2IPC\\colaPasajeros.jpg");
				image2.getImage().flush();
				lbDesabor.setIcon(image2);
				
				ImageIcon image3 = new ImageIcon("C:\\Users\\aiyel\\eclipse-workspace\\Proyecto2IPC\\listaMalesta.jpg");
				image3.getImage().flush();
				lbMaleta.setIcon(image3);
				
				ImageIcon image4 = new ImageIcon("C:\\Users\\aiyel\\eclipse-workspace\\Proyecto2IPC\\listaEstacion.jpg");
				image4.getImage().flush();
				lbEstacion.setIcon(image4);
				
				ImageIcon image5 = new ImageIcon("C:\\Users\\aiyel\\eclipse-workspace\\Proyecto2IPC\\listaDesk.jpg");
				image5.getImage().flush();
				lbDesk.setIcon(image5);
				
				ImageIcon image6 = new ImageIcon("C:\\Users\\aiyel\\eclipse-workspace\\Proyecto2IPC\\general.jpg");
				image6.getImage().flush();
				lbGeneral.setIcon(image6);
				
			}
		});
		btnGenActualizar.setBounds(504, 7, 180, 23);
		contentPane.add(btnGenActualizar);
		
			

	}
	
	public void imprimir(JTextArea tx) {
			String s = "	Hola que es lo que estas haciendo aqui?"+"\n";
			tx.append("\n");
		 for(int a =0 ;a<7;a++) {
			 tx.append(s);
		 }
	}
	
	public void graficar() {
		
	}
}
