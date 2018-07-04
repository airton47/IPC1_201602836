package proyecto2;



public class NodoEscritorio {
	
	private int id;
	private char letter;
	NodoPasajero pasajero;
	public NodoEscritorio siguiente;
	public NodoEscritorio anterior;
	
	public NodoEscritorio() {
		
	}
	
	public NodoEscritorio(int id,char letter, NodoPasajero pasajero) {
		super();
		this.id = id;
		this.letter = letter;
		this.pasajero = pasajero;
		this.siguiente = null;
		this.anterior = null;
	}
	
	public NodoEscritorio(int id,char letter) {
		super();
		this.id = id;
		this.letter = letter;
		this.pasajero = pasajero;
		this.siguiente = null;
		this.anterior = null;
	}

	public NodoEscritorio(int id) {
		this.id = id;
		this.siguiente = null;
		this.anterior = null;
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
	
	
	
}
