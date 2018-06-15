package GameEvil;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Tablero extends JLabel {
	
	JLabel [][] bMatriz;
	JPanel panel;
	int matriz[];

	
	public int tamMatriz() {
		int tam = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de filas y conlumnas"));
		while(tam<8||tam>18) {		
			JOptionPane.showMessageDialog(this,"Porvator ingresa un numero desde 8 hasta 18");
			tam = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de filas y conlumnas"));
		} 
		return tam;
		}
	
	
		
		public JPanel getjpanel(){
			JPanel panel = new JPanel();
			panel.setOpaque(false);
			panel.setBackground(null);
			
			int tam= tamMatriz();
			bMatriz= new JLabel[tam][tam];
			panel.setLayout(new GridLayout(tam,tam));
			
			
			int numBomb =(int)((tam*tam*10)/100);
			int numVidas =(int)((tam*tam*5)/100);
			//int randomX = (int)(Math.random()*tam);
			//int randomY = (int)(Math.random()*tam);
			
			ImageIcon bomba =  new ImageIcon(Tablero.class.getResource("/images/bomb.png"));
			Image bomba1 = bomba.getImage();
			Image bombatam=bomba1.getScaledInstance(600/tam, 600/tam, Image.SCALE_SMOOTH);
			bomba= new ImageIcon(bombatam);
			
			ImageIcon heart =  new ImageIcon(Tablero.class.getResource("/images/heart.png"));
			Image heart1 = heart.getImage();
			Image hearttam=heart1.getScaledInstance(600/tam, 600/tam, Image.SCALE_SMOOTH);
			heart= new ImageIcon(hearttam);
			
			//int numr= (int)Math.random()*10;
			
			panel.setBounds(300,40,650,650);
			//panel.setSize(600,600);
			
			//ESTE FOR SE ENCARGAR DE RELLENAR TODA LA MATRIZ QUE CONTIENE JJlabel ADEMAS DE QUITAR EL FONDO A LOS LABELS
			for(int i=0;i<tam;i++) {
				for(int j=0;j<tam;j++) {
					
					bMatriz[i][j]=new JLabel(/*String.valueOf(numr)*/);
					Border border = BorderFactory.createLineBorder(Color.BLACK, 1);					
					bMatriz[i][j].setBorder(border);
					//bMatriz.setContentAreaFilled(false);
					bMatriz[i][j].setOpaque(false);
					panel.add(bMatriz[i][j]);			
					
				}				
								
			}
			
			//ESTE FOR SE ENCARGA DE LLENAR EN ESPACION ALETORIOS EL NUMERO DE BOMBAS EN FUNCION DEL NUMERO DE CUADROS EN EL TABLERO
			for(int a = 0;a<=numBomb;a++) {				
			
				int randomX = (int)(Math.random()*tam);
				int randomY = (int)(Math.random()*tam);
				//ventana.class.getResource("/images/bomb.pgn"))			
				bMatriz[randomX][randomY].setIcon(bomba);
				//bMatriz[randomX][randomY].setOpaque(true);
				
			}
			
			//ESTE FOR SE ENCARGA DE LLENAR EN ESPACIOS ALEATORIAMENTE CON EL NUMERO DE VIDAS EN FUNCION DEL TAMAÑO DEL TABLERO
			for(int b = 0;b<=numVidas;b++) {				
				
				int randomX = (int)(Math.random()*tam);
				int randomY = (int)(Math.random()*tam);
				//ventana.class.getResource("/images/bomb.pgn"))			
				bMatriz[randomX][randomY].setIcon(heart);
				//bMatriz[randomX][randomY].setOpaque(true);
				
			}
			
			
			
			return panel;
			
			
			
		}
		
		
		
		public void Inicializar() {
			setLayout(null);
			setSize(1000,690);
			setVisible(true);

		}
		
		public Tablero() {
			add(getjpanel());	
			this.setBackground(null);
			Inicializar();
		}

}
