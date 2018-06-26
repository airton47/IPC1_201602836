package practicaUno;

public class NodoEscritorio {
	
	int id;
	NodoPasajero pasajero;
	public NodoEscritorio siguiente;
	
	
	
	public NodoEscritorio(int id, NodoPasajero pasajero) {
		super();
		this.id = id;
		this.pasajero = pasajero;
		this.siguiente = null;
	}

	public NodoEscritorio(int id) {
		this.id = id;
		this.siguiente = null;
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
	
	
	
}
