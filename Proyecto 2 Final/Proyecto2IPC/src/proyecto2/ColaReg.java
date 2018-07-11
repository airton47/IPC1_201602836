package proyecto2;

public class ColaReg {
	
	private final int limite = 7;
	public NodoPasajero primero;
	public NodoPasajero pasajero;	
	public NodoPasajero [] cola;
	
	public ColaReg() {
		this.primero = null;
		this.pasajero = null;
		this.cola =  new NodoPasajero[limite];
		for(int a = 0 ;a<limite;a++) {
			cola[a] = new NodoPasajero();
		}
	}
	
	public void insertar(NodoPasajero nuevo) {
		NodoPasajero aux = primero;
		if(primero == null) {
			primero = nuevo;
			cola[0] = primero;		
		}else {
			int b = 1;
			while(aux.siguiente!=null) {
				aux = aux.siguiente;
				b++;	
			}
			if(b<7) {
				aux.siguiente = nuevo;
				cola[b] = nuevo;
			}
			if(b == limite-1) {
				System.out.println("La cola de escritorios esta llena!");
			}
		}
	}
	
	public void eliminar() {
		
		if(primero == null) {
			System.out.println("La cola de Registro de Pasajeros esta actualmente vacia");
		}else {
			primero = primero.siguiente;
			for(int i = 0;i<limite-1;i++) {
                cola[i]=null;
				cola[i]=cola[i+1];
				if(i == 5) {
					cola[6]=null;
				}
			}
		}
		
	}
	
	public boolean lleno() {
		NodoPasajero aux = primero;		
		int b = 1;
		if(aux==null) {
			return false;
		}else {
			while(aux.siguiente!=null) {
				aux = aux.siguiente;
				b++;	
			}
			if(b == limite||primero == null) {
				System.out.println("La cola de escritorios esta llena!");
				return true;
			}else {
				return false;
			}
		}
		
	}
	
	public String recorrer() {
		String cadena = "";
		StringBuffer s = new StringBuffer();
		s.setLength(0);
		s.append("\n");
		NodoPasajero aux = primero;
		/*if(aux==null){
	    	s.append("LISTA VACIA"+"\n") ;
	    	cadena = s.toString();
	    }else{*/
		s.append("	PASAJEROS EN COLA");
	    	while(aux!=null) {
	    		
				s.append("\n"+"	PASAJERO ID "+aux.getId()+"\n"+"	TURNOS "+aux.getTurnos()+"\n");
				cadena = s.toString();
				aux = aux.siguiente;
	    	}
	    //}
		
		return cadena;
	}
	
	public void verificar() {
		
	}

	public NodoPasajero getPrimero() {
		return primero;
	}

	public void setPrimero(NodoPasajero primero) {
		this.primero = primero;
	}

	public NodoPasajero getPasajero() {
		return pasajero;
	}

	public void setPasajero(NodoPasajero pasajero) {
		this.pasajero = pasajero;
	}

	public NodoPasajero[] getCola() {
		return cola;
	}

	public void setCola(NodoPasajero[] cola) {
		this.cola = cola;
	}

	public int getLimite() {
		return limite;
	}
	
	
	
}
