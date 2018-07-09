package proyecto2;



public class NodoEscritorio {
	
	private int id;
	private char letter;
	private String estado;
	private static String state;
	NodoPasajero pasajero;
	public NodoEscritorio siguiente;
	public NodoEscritorio anterior;
	public ColaReg cola;
	
	public NodoEscritorio() {
		
	}
	
	public NodoEscritorio(int id,char letter, NodoPasajero pasajero) {
		super();
		this.id = id;
		this.letter = letter;
		this.pasajero = null;
		this.siguiente = null;
		this.anterior = null;
		setEstado(estado);
		setCola(cola);
	}
	
	public NodoEscritorio(int id,char letter) {
		super();
		this.id = id;
		this.letter = letter;
		this.pasajero = null;
		this.siguiente = null;
		this.anterior = null;
		setEstado(estado);
		setCola(cola);
	}

	public NodoEscritorio(int id) {
		this.id = id;
		this.siguiente = null;
		this.anterior = null;
		this.pasajero = null;
		setEstado(estado);
		setCola(cola);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public NodoPasajero getPasajero() {
		return pasajero;
	}

	public void setPasajero(NodoPasajero pasajero) {
		if(pasajero!=null) {
			this.estado = "OCUPADO";
		}else {
			this.estado = "LIBRE";
		}
		this.pasajero = pasajero;
	}

	public NodoEscritorio getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(NodoEscritorio siguiente) {
		this.siguiente = siguiente;
	}

	public NodoEscritorio getAnterior() {
		return anterior;
	}

	public void setAnterior(NodoEscritorio anterior) {
		this.anterior = anterior;
	}

	public char getLetter() {
		return letter;
	}

	public void setLetter(char letter) {
		this.letter = letter;
	}

	public ColaReg getCola() {
		return cola;
	}

	public void setCola(ColaReg colaDesk) {
		colaDesk = new ColaReg();
		this.cola = colaDesk;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		NodoPasajero aux = this.pasajero;
		if(aux==null) {
			estado = "LIBRE";
		}else {
			estado = "OCUPADO";
		}
		this.estado = estado;
		
	}

	
	
	
	
}
