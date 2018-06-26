package practicaUno;

public class Simulacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ventana v = new Ventana();
		//v.setVisible(true);
		NodoAvion nv = new NodoAvion(1);
		System.out.println("El tamaño es "+nv.getTipo()+" su numero de mantenimiento es: "+nv.getNumberM()+" y su numero de pasajeros es: "+nv.getNumberP());
		System.out.println("Ademas su numero de desabordajes es: "+nv.getNumberD());
		ListaAvion la = new ListaAvion();
		la.insertarInicio(2);
		la.insertarFinal(3);
		la.insertarFinal(4);
		la.insertarFinal(5);
		la.insertarFinal(6);

		/*System.out.println(la.recorrer());
		System.out.println(la.recorrer());
		System.out.println(la.totalDes());
		System.out.println(la.contar());
		*/
		
		/*ListaMaleta lm = new ListaMaleta();
		lm.insertarInicio(new NodoMaleta());
		lm.insertarInicio(new NodoMaleta());
		lm.insertarInicio(new NodoMaleta());
		lm.insertarInicio(new NodoMaleta());
		lm.insertarInicio(new NodoMaleta());
		lm.insertarInicio(new NodoMaleta());
		lm.insertarInicio(new NodoMaleta());
		lm.insertarInicio(new NodoMaleta());
		System.out.println(lm.recorrer());
		System.out.println(lm.contar());
		*/
		
		ColaPasajero cp = new ColaPasajero();
		for(int a = 1;a<=7;a++) {
			cp.insertar(new NodoPasajero(a));
		}
		//cp.recorrer();
		int j = cp.contarMaletas();
		int b = cp.buscar(1).getDocumentos();
		System.out.println(b);
		ListaMaleta lm = new ListaMaleta();
		
		for(int m = 1;m<=j;m++) {
			lm.insertarFinal(new NodoMaleta(m));
		}
		//System.out.println(cp.recorrer());
		//System.out.print(lm.recorrer());
		
		
		ColaEscritorio ce = new ColaEscritorio();
		ce.insertar(new NodoEscritorio(1));
		ce.buscar(1).setPasajero(cp.buscar(1));
		/*ce.insertar(new NodoEscritorio(2));
		ce.insertar(new NodoEscritorio(3));
		ce.insertar(new NodoEscritorio(4));
		ce.insertar(new NodoEscritorio(5));
		ce.buscar(1).setPasajero(cp.buscar(1));
		int a = ce.buscar(1).getPasajero().getDocumentos();
		*/
		System.out.println(ce.recorrer());
		//System.out.println(a);
	}

}
