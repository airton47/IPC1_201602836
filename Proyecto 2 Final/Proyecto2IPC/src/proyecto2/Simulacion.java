package proyecto2;



public class Simulacion {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				//Ventana v = new Ventana();
				//v.setVisible(true);
				NodoAvion nv = new NodoAvion(1);
				//System.out.println("El tama�o es "+nv.getTipo()+" su numero de mantenimiento es: "+nv.getNumberM()+" y su numero de pasajeros es: "+nv.getNumberP());
				//ystem.out.println("Ademas su numero de desabordajes es: "+nv.getNumberD());
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
				lm.insertarInicio(new NodoMaleta(1));
				lm.insertarInicio(new NodoMaleta(2));
				lm.insertarInicio(new NodoMaleta(3));
				lm.insertarInicio(new NodoMaleta(4));
				lm.insertarInicio(new NodoMaleta(5));
				lm.insertarInicio(new NodoMaleta(6));
				lm.insertarInicio(new NodoMaleta(7));
				lm.insertarInicio(new NodoMaleta(8));
				System.out.println(lm.recorrer());*/
				//System.out.println(lm.contar());
				
				/*System.out.println(lm.primero.siguiente.getId());
				System.out.println(lm.primero.siguiente.siguiente.siguiente.siguiente.siguiente.siguiente.siguiente.getId());
				System.out.println(lm.primero.anterior.getId());
				Graficador gen = new Graficador();
				gen.crearDot("lista", lm.primero,lm.contar());
				gen.generarImagen("lista.dot", "lista.jpg");
				*/
				ColaPasajero cp = new ColaPasajero();
				for(int a = 1;a<=7;a++) {
					cp.insertar(new NodoPasajero(a));
				}
		                System.out.println(cp.recorrer());
		                cp.eliminar();
		                System.out.println("");
		                System.out.println("");
		                System.out.println(cp.recorrer());
		                //System.out.println(cp.recorrer());
		                //cp.recorrer();
		                
				//cp.recorrer();
				//int j = cp.contarMaletas();
				//int b = cp.buscar(1).getDocumentos();
				//System.out.println(b);
				/*ListaMaleta lm = new ListaMaleta();
				
				for(int m = 1;m<=j;m++) {
					lm.insertarFinal(new NodoMaleta(m));
				}*/
				//System.out.println(cp.recorrer());
				//System.out.print(lm.recorrer());
				
				
				
				//
				//ce.buscar(1).setPasajero(cp.buscar(1));
				/*ce.insertar(new NodoEscritorio(2));
				ce.insertar(new NodoEscritorio(3));
				ce.insertar(new NodoEscritorio(4));
				ce.insertar(new NodoEscritorio(5));
				ce.buscar(1).setPasajero(cp.buscar(1));
				int a = ce.buscar(1).getPasajero().getDocumentos();
				*/
				//System.out.println(ce.recorrer());
				//System.out.println(a);
				ColaReg cr = new ColaReg();
				cr.insertar(new NodoPasajero(1));
				cr.insertar(new NodoPasajero(2));
				cr.insertar(new NodoPasajero(3));
				cr.insertar(new NodoPasajero(4));
				cr.insertar(new NodoPasajero(5));
				
				System.out.println(cr.cola[0].getId());
				System.out.println(cr.cola[1].getId());
				System.out.println(cr.cola[2].getId());
				System.out.println(cr.cola[3].getId());
		        System.out.println(cr.cola[4].getId());
		        System.out.println(cr.cola[5].getId());
		        System.out.println(cr.cola[6].getId());
		        System.out.println("");
		        System.out.println(""); System.out.println("");
		        System.out.println(cr.cola[3].siguiente);
		        //System.out.println(cr.cola[6]);
		        cr.eliminar();
		        cr.eliminar();
		        cr.eliminar();
		                System.out.println(cr.cola[0].getId());
				System.out.println(cr.cola[1].getId());
				System.out.println(cr.cola[2].getId());
				System.out.println(cr.cola[3].getId());
		         System.out.println(""); System.out.println("");
		         System.out.println(cr.cola[1].siguiente);
		         
		         cr.insertar(new NodoPasajero(123));
		        System.out.println("");
		        System.out.println(cr.cola[0].getId());
				System.out.println(cr.cola[1].getId());
				System.out.println(cr.cola[2].getId());
				System.out.println(cr.cola[3].getId());
		         cr.insertar(new NodoPasajero(970));
		          System.out.println("");
		        System.out.println(cr.cola[0].getId());
				System.out.println(cr.cola[1].getId());
				System.out.println(cr.cola[2].getId());
				System.out.println(cr.cola[3].getId());
		         cr.insertar(new NodoPasajero(456));
		          System.out.println("");
		        System.out.println(cr.cola[0].getId());
				System.out.println(cr.cola[1].getId());
				System.out.println(cr.cola[2].getId());
				System.out.println(cr.cola[3].getId());
		        System.out.println(cr.cola[4].getId());
		         System.out.println(""); System.out.println("");
		        System.out.println(cr.cola[4].siguiente);
		        /*cr.eliminar();
		        cr.eliminar();
		        cr.eliminar();
		                
		                System.out.println(cr.cola[0].getId());
				System.out.println(cr.cola[1].getId());
				System.out.println(cr.cola[2].getId());
				System.out.println(cr.cola[3].getId());
		        System.out.println("");
		        System.out.println(cr.cola[0].siguiente);*/
		         
		                
				//System.out.println(cr.cola[5].getId());
				//System.out.println(cr.cola[6].getId());
				
		        
		        ListaEscritorio ce = new ListaEscritorio();
				ce.insertarFinal(1,'A');
				ce.insertarFinal(2,'B');
				ce.insertarFinal(3,'C');
				ce.insertarFinal(4,'D');
				ce.insertarFinal(5,'E');
				ce.insertarFinal(6,'F');
				ce.insertarFinal(6, 'G');
				ce.primero.setPasajero(new NodoPasajero(9));
				
				//System.out.println(ce.recorrer());
				//System.out.println(ce.primero.getLetter());
				
				//ce.primero.setCola(new ColaReg());
				/*ce.buscar(1).setCola(new ColaReg());
				ce.buscar(2).setCola(new ColaReg());
				ce.buscar(3).setCola(new ColaReg());
				ce.buscar(4).setCola(new ColaReg());*/
				
				ce.primero.setPasajero(new NodoPasajero(123));
				System.out.println(ce.recorrer());
				ce.buscar(1).cola.insertar(new NodoPasajero(1));
				ce.buscar(1).cola.insertar(new NodoPasajero(11));
				ce.buscar(1).cola.insertar(new NodoPasajero(111));
				ce.buscar(1).cola.insertar(new NodoPasajero(1111));
				ce.buscar(1).cola.insertar(new NodoPasajero(11111));
				ce.buscar(1).cola.insertar(new NodoPasajero(1111110));
				ce.buscar(1).cola.insertar(new NodoPasajero(1111110));
				ce.buscar(1).cola.insertar(new NodoPasajero(1111110));
				ce.buscar(1).cola.insertar(new NodoPasajero(1111110));
				System.out.println(ce.recorrer());
				
				ce.buscar(2).cola.insertar(new NodoPasajero(2));
				ce.buscar(2).cola.insertar(new NodoPasajero(22));
				ce.buscar(2).cola.insertar(new NodoPasajero(222));
				ce.buscar(2).cola.insertar(new NodoPasajero(2222));
				ce.buscar(2).cola.insertar(new NodoPasajero(22222));
				ce.buscar(2).cola.insertar(new NodoPasajero(222222));
				ce.buscar(2).cola.insertar(new NodoPasajero(2222222));
				ce.buscar(2).cola.eliminar();
				ce.buscar(2).cola.eliminar();
				ce.buscar(2).cola.eliminar();
				ce.buscar(2).cola.insertar(new NodoPasajero(220));
				
				ce.buscar(3).cola.insertar(new NodoPasajero(3));
				ce.buscar(3).cola.insertar(new NodoPasajero(33));
				ce.buscar(3).cola.insertar(new NodoPasajero(333));
				ce.buscar(3).cola.insertar(new NodoPasajero(3333));
				ce.buscar(3).cola.insertar(new NodoPasajero(33333));
				ce.buscar(3).cola.insertar(new NodoPasajero(333333));
				

				ce.buscar(4).cola.insertar(new NodoPasajero(4));
				ce.buscar(4).cola.insertar(new NodoPasajero(44));
				ce.buscar(4).cola.insertar(new NodoPasajero(444));
				ce.buscar(4).cola.insertar(new NodoPasajero(4444));
				ce.buscar(4).cola.insertar(new NodoPasajero(44444));
				ce.buscar(4).cola.insertar(new NodoPasajero(444444));
				ce.buscar(4).cola.insertar(new NodoPasajero(4444440));
				System.out.println(ce.buscar(4).cola.lleno());
				
				Graficador gr1 = new Graficador();
				gr1.crearDot("prueba", ce.primero);
				gr1.generarImagen("prueba.dot", "prueba.jpg");
				
				ListaEstacion listaE = new ListaEstacion();
				listaE.insertarInicio(new NodoEstacion(1));
				listaE.insertarFinal(new NodoEstacion(2));
				listaE.insertarFinal(new NodoEstacion(3));
				listaE.insertarFinal(new NodoEstacion(4));
				listaE.buscar(1).setAvion(new NodoAvion(1));
				System.out.println(listaE.recorrer());
				
				Pila p = new Pila();
				p.insertar(1);
				p.insertar(2);
				p.insertar(3);
				p.insertar(4);
				p.insertar(5);
				p.recorrer();
				System.out.println(p.contar());
				
				//Graficador gr1 = new Graficador();
				//gr1.("colaReg", cr.primero);
				//gr1.generarImagen("colaReg.dot", "colaReg.jpg");
	}
	
}
